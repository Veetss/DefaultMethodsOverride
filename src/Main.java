public class Main {
    public static void main(String[] args) {

        SmartphonePrice smartphonePriceP1 = new SmartphonePrice("Producer", 1000);
        SmartphonePrice smartphonePriceP2 = new SmartphonePrice("Producer", 5000);
        SmartphonePrice smartphonePriceR1 = new SmartphonePrice("Retail", 1500);
        SmartphonePrice smartphonePriceR2 = new SmartphonePrice("Retail", 7000);

        Smartphone smartphone1 = new Smartphone("Apple", "X", 3, smartphonePriceP1, smartphonePriceR1);
        Smartphone smartphone2 = new Smartphone("Samsung", "GamingPRO", 10, smartphonePriceP2, smartphonePriceR2);

        boolean trueOrFalse = smartphone1.equals(smartphone2);
        System.out.println("Is smartphone 1 equals to smartphone 2? " + trueOrFalse);

        try{
            System.out.println("Stiamo clonando un telefono.");
            Smartphone cloneSmart = smartphone2.clone();
            trueOrFalse = smartphone2.equals(cloneSmart);

            System.out.println("Is smartphone 2 equals to cloned smartphone? " + trueOrFalse);
        } catch (Exception exception){
            System.out.println("Error 404 brain not found.");
        }

        System.out.println(smartphone1);
        System.out.println(smartphone1.hashCode());

        System.out.println(smartphone2);
        System.out.println(smartphone2.hashCode());
    }
}
