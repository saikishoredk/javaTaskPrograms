import java.io.*;

public class FileEncryptionDecryption {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String encryptedFile = "encrypted.txt";
        String decryptedFile = "decrypted.txt";
        String key = "MySecretKey";

        encryptFile(inputFile, encryptedFile, key);
        decryptFile(encryptedFile, decryptedFile, key);
    }

    public static void encryptFile(String inputFile, String outputFile, String key) {
        try {
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    buffer[i] = (byte) (buffer[i] ^ key.charAt(i % key.length()));
                }
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();
            System.out.println("File encrypted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void decryptFile(String inputFile, String outputFile, String key) {
        encryptFile(inputFile, outputFile, key); // Same logic for decryption
        System.out.println("File decrypted successfully.");
    }
}
//The provided Java code demonstrates a basic file encryption and decryption program. It uses XOR-based encryption //to encrypt a file and then decrypt it using the same key. XOR encryption is a simple technique that applies a //bitwise XOR operation between each byte of the file and a corresponding byte from the encryption key. This //process modifies the bytes in a reversible manner, making it possible to retrieve the original file by applying //the same XOR operation with the same key. The program reads the input file in chunks, performs the XOR //encryption or decryption on each byte, and writes the modified bytes to the output file. By calling the //encryptFile and decryptFile methods with the appropriate parameters, users can encrypt and decrypt files using //this XOR-based encryption algorithm.




