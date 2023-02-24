package org.mp;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

        /*
        RSAgenerator rsa = new RSAgenerator();

        rsa.writeToFile("D:\\OneDrive\\Pulpit\\privateKey.key", rsa.getPrivateKey().getEncoded());
        rsa.writeToFile("D:\\OneDrive\\Pulpit\\publicKey.key", rsa.getPublicKey().getEncoded());

        System.out.println("\n" + Base64.getEncoder().encodeToString(rsa.getPrivateKey().getEncoded()));
        System.out.println("\n" + Base64.getEncoder().encodeToString(rsa.getPublicKey().getEncoded()));


        try {
            RSAgenerator rsAgenerator = new RSAgenerator();
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