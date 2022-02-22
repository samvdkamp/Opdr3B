public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}

//als je de try-catch blok weghaalt, stopt hij tijdens uitvoering
//de applicatie wordt nog wel uitgevoerd want je krijgt geen error, dus hij wordt sowieso gecompileerd. Maar hij
//voert de toString method niet meer uit
