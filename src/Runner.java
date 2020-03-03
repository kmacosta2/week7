public class Runner extends sortOfSort{
    public static void main (String[] args){
        System.out.println("does this work?");
        int[] a= {2, 67, 8, 96, 0, 17, -3, 0};
        int[] expect={17, 8, 0, -3,		2, 8, 67,96};
        sortOfSort attempt= new sortOfSort(a);
        attempt.sortOfSort();
        attempt.twoDprinter(a);
    }
}
