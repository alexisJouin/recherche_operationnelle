package ro;

import java.util.Random;

/**
 *
 * @author Alexis
 */
public class HillClimberBest extends Search {

    private final int maxNbEval;
    private final int maxFitness;
    private final Random random;
    private final RandomInit randInit;

    public HillClimberBest(Random random, Eval eval, int maxEval, int max) {
        super(eval);
        this.maxNbEval = maxEval;
        this.maxFitness = max;
        this.random = random;
        randInit = new RandomInit(random, eval.size());
    }

    public void calculClimberBest() {
        solution = new Solution();
        randInit.init(this.solution);
        this.eval.apply(this.solution);
        this.nbEval = 1;
        int i;
        int currentFitness;
        int bestVoisin = -1;
        int iBest;

        while (this.nbEval < this.maxNbEval && this.solution.fitness() < this.maxFitness) {
            iBest = -1;
            currentFitness = (int)solution.fitness();
            for (i = 0; i < eval.size(); i++) {
                solution.bitString[i] = !solution.bitString[i];

                eval.apply(solution);
                nbEval++;
                
                if(bestVoisin < currentFitness){
                    bestVoisin = currentFitness;
                    System.out.println("Best : " + bestVoisin );
                    
                }
                if (bestVoisin > currentFitness){
                    solution.fitness(bestVoisin);
                    System.out.println("Best : " + solution.fitness() );
                }          
            }

        }
        
    }

    @Override
    void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
