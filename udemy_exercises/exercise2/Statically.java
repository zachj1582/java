package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private String glue = "Epoxy";
    String jello = "Jello";
    public static void main(String[] args){
        Statically stats = new Statically();
        stats.moveAndShake();
        stats.stubborn();
        stats.explain();
        System.out.println(stats.getGlue());
        System.out.println(stats.jello);
    }
    String getGlue (){
        return this.glue;
    }

    public void moveAndShake(){
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }
    private static void stubborn(){
        System.out.println("Please don't make me change... I just don't like it...");
    }
    static void explain(){
        stubborn();
        System.out.println("It seems to me that they work very similarly, I cannot tell you the difference...   As for changes made, added Hash to console and made a getter. took static away from things. It should be pretty clear if you compare the code.");
    }
}
