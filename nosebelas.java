/**
 * Created by Rizky on 25/03/2015.
 */
public class nosebelas {
    public static void main(String args[]){

        int x;
        int y;
        int z=12;

        for(x=1;x<=z;x++){
            if(x%2==0){
                System.out.print(" ");
            }
            for(y=1;y<=z;y++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
