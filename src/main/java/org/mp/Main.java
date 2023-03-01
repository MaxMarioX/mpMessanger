package org.mp;



import org.mp.Security.RSAGenerator;
import org.mp.Security.RSAUtil;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

        /*

        RSAGenerator rsa = new RSAGenerator();
        RSAGenerator r = new RSAGenerator();

        rsa.writeToFile("D:\\OneDrive\\Pulpit\\privateKey.key", rsa.getPrivateKey().getEncoded());
        rsa.writeToFile("D:\\OneDrive\\Pulpit\\publicKey.key", rsa.getPublicKey().getEncoded());

        System.out.println("\n" + Base64.getEncoder().encodeToString(rsa.getPrivateKey().getEncoded()));
        System.out.println("\n" + Base64.getEncoder().encodeToString(rsa.getPublicKey().getEncoded()));


        try {
            RSAGenerator rsAgenerator = new RSAGenerator();
            RSAUtil rsaUtil = new RSAUtil();

            byte[] encrypted_message = rsaUtil.encrypt("MARIUSZ ARTYSTA", Base64.getEncoder().encodeToString(rsAgenerator.getPublicKey().getEncoded()));

            System.out.println(Base64.getEncoder().encodeToString(encrypted_message));

            String decrypted_message = rsaUtil.decrypt(encrypted_message, Base64.getEncoder().encodeToString(rsAgenerator.getPrivateKey().getEncoded()));

            System.out.println(decrypted_message);


        } catch (NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | InvalidKeyException |
                 NoSuchPaddingException e) {
        }


         */
    }
}