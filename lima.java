public class lima {
    public static void main(String[] args) {
        System.out.println("Deretan Angka");
        int pertama=1;
        int terakhir=10;
        System.out.println("Angka Pertama yang Muncul:");
        System.out.println("Angka Akhir yang Muncul:");
        System.out.print("Nilai Deretan:");

       while(pertama<=terakhir){

           System.out.print(+pertama);
           if(pertama<terakhir){
               System.out.print(",");
           }
           pertama++;
       }
    }
}