// Eliazar Montemayor IV
// Your program will calculate the date Easter falls on a given year
public class Easter{
    public static void main(String[] args){
    int y = 2025;
    int a = y % 19;
    int b = y / 100;
    int c = y % 100;
    int d = b / 4;
    int e = b % 4;
    int f = b + 8 /25;
    int g = b - f + 1 / 3;
    System.out.println("a = "+ a);

}}
