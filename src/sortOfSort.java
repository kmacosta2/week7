public class sortOfSort {
    int[] arr;
    //
    public sortOfSort(){

    }
    public sortOfSort(int[] ar){
        arr=ar;
    }

    public void sortOfSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        reSort();
    }

    //Now I rearrange the elements
    private void reSort() {
        int[] arr2 = arr.clone();
        int ending = arr.length - 1;
        int begin = 0;
        //to help me continue where I left off "i"-wise.
        int q = 0;
        for (int i = ending; i >= 4; i = i - 4) {
            while (ending > begin) {
                for (int j = 0; j < 2 && (ending>=begin); j++) {
                    System.out.println("First For loop");
                    arr[ending] = arr2[i - q];
                    ending--;
                    q++;
                }
                for (int p = 1; p >= 0&& (ending>=begin); p--) {
                    System.out.println("Second for");
                    arr[begin] = arr2[i - q];
                    begin ++;
                    q++;
                }
            }
        }
    }
    public void twoDprinter(int[] a){
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
}
