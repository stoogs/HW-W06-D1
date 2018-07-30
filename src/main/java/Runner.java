public class Runner {
        public static void main(String[] args) {

                WaterBottle bottle = new WaterBottle(100);
                System.out.println("Bottle is full " + bottle.getVolume ());
                bottle.drink();
                System.out.println("A swig has been taken " + bottle.getVolume ());
                bottle.empty();
                System.out.println("Someone drank the lot " + bottle.getVolume());
                bottle.fill();
                System.out.println("Full again " + bottle.getVolume());
        }
}

