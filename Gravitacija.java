public class Gravitacija{

     public static void main(String []args){
        System.out.println("OIS je zakon!");
     }
      public static double gravitacijskiPospesek (double nadmorskaVisina){
             double konstanta = 6.674 * Math.pow(10, -11);
             double masaZemlje = 5.972 * Math.pow(10, 24);
             double polmerZemlje = 6.371 * Math.pow(10, 6);
             double gravitacijskiPospesek = (konstanta * masaZemlje) / (Math.pow((polmerZemlje + nadmorskaVisina), 2));
             return gravitacijskiPospesek;
}
