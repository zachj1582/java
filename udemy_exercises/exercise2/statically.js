class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    #glue = "Epoxy";
    jello = "Jello";

    getGlue(){
      return this.#glue
    }

    moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        this.stubborn();
        console.log('It seems to me that they work very similarly, I cannot tell you the difference...   As for changes made, added Hash to console and made a getter. took static away from things. It should be pretty clear if you compare the code.');
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

stats.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(stats.getGlue());
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
