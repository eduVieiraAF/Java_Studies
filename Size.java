public enum Size {

    //enum constants
    SMALL, MEDIUM, LARGE, XLARGE;

    public String getSize(){

        return switch (this) {
            case SMALL -> "small";
            case MEDIUM -> "medium";
            case LARGE -> "large";
            case XLARGE -> "extra large";
        };
    }

    public static void main(String[] args){

        System.out.println("Your coffee order is " + Size.SMALL.getSize());
        System.out.println("Your coffee order is " + Size.LARGE.getSize());
        System.out.println("Your latte order is " + Size.MEDIUM.getSize());
        System.out.println("Your cappuccino order is " + Size.XLARGE.getSize());
    }
}
