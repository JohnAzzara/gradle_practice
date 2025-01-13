public class Dice{
    public int roll(int sides){
        int min = 1;
        int max = sides;
        Random random = new Random();
        int randomNumber = ranadom.nextInt(max - min + 1)+ min;
    return randomNumber;
    }
}
