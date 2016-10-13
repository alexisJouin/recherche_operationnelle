package ro;

import java.util.Random;

/**
 *
 * @author Alexis
 */
public class HillClimberFirst extends Search {

    private final int maxNbEval;
    private final int maxFitness;
    private final Random random;
    private final RandomInit randInit;

    public HillClimberFirst(Random random, Eval eval, int maxEval, int max) {
        super(eval);
        
        this.maxNbEval = maxEval;
        this.maxFitness = max;
        this.random = random;
        randInit = new RandomInit(random, eval.size());
    }

    @Override
    void run() {
        System.out.println("test");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
