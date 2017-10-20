public class RSA
{
    /**
     * Encryption/Decryption Algorithm
     *
     * @param key     Public key or private key
     * @param message Message data
     */

    public static long rsa(int baseNum, int key, long message)
    {
        if (baseNum < 1 || key < 1)
        {
            return 0L;
        }
        //Data after encryption or decryption
        long rsaMessage = 0L;

        //Core encryption algorithm
        rsaMessage = Math.round(Math.pow(message, key)) % baseNum;
        System.out.println("Math.pow(message, key): " + Math.pow(message, key));
        return rsaMessage;
    }


    public static void main(String[] args)
    {
        // Test Case 1:
        //base number
        int baseNum = 3 * 11;
        //public key
        int keyE = 3;
        //private key
        int keyD = 7;
        //data before encryption
        long msg = 24L;
        //data after encryption
        long encodeMsg = rsa(baseNum, keyE, msg);
        //data after decryption
        long decodeMsg = rsa(baseNum, keyD, encodeMsg);
        System.out.println("Test Case 1: ");
        System.out.println("Before encryption: " + msg);
        System.out.println("After encryption: " + encodeMsg);
        System.out.println("After decryption: " + decodeMsg);
        System.out.println("Correct!");

        // Test Case 2:
        baseNum = 11 * 13;
        keyE = 7;
        keyD = 103;
        msg = 10L;
        //data after encryption
        encodeMsg = rsa(baseNum, keyE, msg);
        //data after decryption
        decodeMsg = rsa(baseNum, keyD, encodeMsg);
        System.out.println("Test Case 2: ");
        System.out.println("Before encryption: " + msg);
        System.out.println("After encryption: " + encodeMsg);
        System.out.println("After decryption: " + decodeMsg);
        System.out.println("Test Case 2 is not correct. I guess it is due to 'line 20: rsaMessage = Math.round(Math.pow(message, key)) % baseNum;' ");
    }
}