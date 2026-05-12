public class VeryBadCode { private String readFile(String fileName){
BufferedReader br; try {
br = new BufferedReader(new FileReader(fileName));final StringBuilder sb = new StringBuilder();
String line = br.readLine();while (line != null) {sb.append(line);sb.append(System.lineSeparator());
line = br.readLine(); } br.close();return sb.toString();
} catch (IOException e) {e.printStackTrace();} return "";}}
