import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;


public class Main{
    public static void main(String[] args)
    {
        try{
            String jsonContent = new String(Files.readAllBytes(Paths.get("input.json")));

            // JSONObject jsonobject = new JSONObject(jsonContent);

            
            String firstName = extractValue(jsonContent, "first_name");
            String rollNumber = extractValue(jsonContent, "roll_number");

            String combined = firstName.toLowerCase().replaceALL("\\s+","") + rollNumber.toLowerCase().replaceALL("\\s+","");

            byte[] hashBytes = MessageDigest.getInstance("MD5").digest(combined.getBytes());
            for (byte b: hashBytes){
                hexString.append(String.format("%02", b));
            }
            Files.write(Paths.get("output.txt"), hexstring.toSting.getBytes());

            System.out.println("MD5:" + hexString.toString());
        } 
        catch(Exception e){
            System.err.println("Error occured:" + e.getMessage());
            e.printStackTrace();
        }

        }
    }
}