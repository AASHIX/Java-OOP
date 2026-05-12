//Ashish Ajay
//Date: 12-05-2026
//Program for Pizza Area

public class PizzaSlice{
    public static void main(String[] args) {
        //Variables and Consents
        final double MEDIUM_PIZZA_DIAMETER=14;
        final int NUMBER_SLICES=8;
        double pizza_radius, pizza_area, slice_area;
        //Process
        pizza_radius=MEDIUM_PIZZA_DIAMETER/2;
        pizza_area= Math.PI*Math.pow(pizza_radius,2);
        slice_area= Math.round(pizza_area/NUMBER_SLICES);
        //Output
        System.out.println("The Area of Medium Pizza ="+pizza_area);
        System.out.println("The Area of a Medium Pizza Slice ="+slice_area);
    }
}