package exercisesLib;

import java.util.BitSet;
public class BitSetDemo {

    public static void main(String args[]) {
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();

        // assign values to bs1 using set()
        bs1.set(7);
        bs1.set(1);
        bs1.set(2);
        bs1.set(4);
        bs1.set(3);
        bs1.set(6);

        // assign values to bs2
        bs2.set(4);
        bs2.set(6);
        bs2.set(3);
        bs2.set(9);
        bs2.set(2);

        // Printing the Bitsets
        System.out.println("bs1 : " + bs1);
        System.out.println("bs2 : " + bs2);

        // use of length() method
        System.out.println("use of length() : " + bs1.length());

        // use of xor() to perform logical Xor operation
        bs1.xor(bs2);
        System.out.println("Use of xor() : " + bs1);
        bs2.xor(bs1);
        System.out.println("Use of xor() : " + bs2);
        System.out.println("\n end pattern in bits1: ");
        System.out.println(bs1);
        System.out.println("\n end pattern in bits2: ");
        System.out.println(bs2);
    }
}
