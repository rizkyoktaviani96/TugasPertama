public class tujuh {
    public static void main(String[] args) {

        int pertama=2;
        int terakhir=30;
        int jumlah=0;
        int rata;
        System.out.println("nilai dari "+pertama+" hingga "+terakhir+":");

        while (pertama<=terakhir){
            jumlah=jumlah+pertama;
            pertama++;
        }
        System.out.println("jumlah="+jumlah);
        rata=jumlah/terakhir;
        System.out.println("rata-rata="+rata);
    }
}
