import java.util.Base64;

public class EncodingAndDecoding {
    public static void main(String[] args) {
        String oriString="StaticAndDefault";
        String EncodedString=Base64.getUrlEncoder().encodeToString(oriString.getBytes());
        System.out.println("Encoded String : "+EncodedString);
        byte[] DecodedString=Base64.getUrlDecoder().decode(EncodedString);
        String Result=new String(DecodedString);
        System.out.println("Decoded String : "+Result);
    }
}
