package src.ExO;

public class shifumi2 {

 

    int choixJ = 0;
    int choixIA = 0;
    int scoreJ = 0;
    int scoreIA = 0;
    boolean trying= false;

    public shifumi2(int scoreIA, int scoreJ) {
        this.scoreIA = scoreIA;
        this.scoreJ = scoreJ;
    }

    public void playGame(int choix) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Que voulez vous jouer ? 0:Pierre; 1: Feuille, 2 Ciseaux ");
            choixIA = (int) (Math.random() * 3);

            if ((choixJ == 0 && choixIA == 2) || (choixJ == 1 && choixIA == 0) || (choixJ == 2 && choixIA == 1)) {
                System.out.println("Win");
                scoreJ++;

            } else if (choixJ == choixIA) {
                System.out.println("egalité");

            } else {
                System.out.println("perdu");
                scoreIA++;
            }

        }
    }

    public boolean continuer(){
        return this.trying=true;
    }
    public int getScord(){
        return this.scoreJ;
    }

    public int getScore(){
        return this.scoreJ;
    }

    
}