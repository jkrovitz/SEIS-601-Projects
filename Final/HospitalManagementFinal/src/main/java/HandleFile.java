import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * HandleFile.java
 * @author Jeremy Krovitz
 * 
 * Escapes special characters and counts the number of instances in each file.
 */
class HandleFile {
	
	/**
	 * Method obtained from https://www.baeldung.com/java-csv#2-handling-special-characters
	 * @param data
	 * @return escapedData
	 */
	static String escapeSpecialCharacters(String data) {
	    String escapedData = data.replaceAll("\\R", " ");
	    if (data.contains(",") || data.contains("\"") || data.contains("'")) {
	        data = data.replace("\"", "\"\"");
	        escapedData = "\"" + data + "\"";
	    }
	    return escapedData;
	}
	
	static int countFromFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String input;
        
        int count = 0;
        while((input = bufferedReader.readLine()) != null)
        {
            count++;
        }

        bufferedReader.close();
        return count;
    }

}
