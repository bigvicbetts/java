console.log('Hello World');


class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of
    //the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";

    static getGlue() {
        return this.#glue;
    }

    static moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {
        Statically.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        Statically.stubborn();
        console.log(Statically.getGlue());
        // write an explanation for how the keyword static behaves differently in javascript vs. java.

        // In javascript, calling a static keyword (even from within the same file) requires explicitely
        // calling the class name. (i.e. Statically.stubborn())  In Java, as long as it's being called
        // inside a static method, it can be called without actually being tied to the the class name.
        // Also, I just discovered that in Java the static methods can be called on the instances of the
        // objects without erroring out.  In javascript, I cannot call stat.stubborn() if stubborn() is
        // static, but the equivalent code works in Java (but it does SUGGEST using the class name rather
        // than the instance.

        // Because non-static methods cannot call static ones, and because we were instructed not to change
        // the "static" designation of explain() (which called stubborn() which, in turn, called moveAndShake()),
        // I changed all of the methods to static so that they could call each other.  Also, since #glue was
        // being called from inside a static method, I changed it to static as well.  Finally, I created a
        // getter to return the value of #glue since it cannot be accessed directly.


    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain()
//method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

Statically.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(Statically.getGlue());
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
