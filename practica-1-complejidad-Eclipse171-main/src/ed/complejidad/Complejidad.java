
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import ed.complejidad.IComplejidad;

public class Complejidad implements IComplejidad{

public long leeContador(){
    return 0;
}


public int tPascalIt(int ren, int col) {
      if(ren == col || col == 0){
          return 1;
      }else{
        int[][] triangPasc = new int[ren+1][col+1];
        for(int i=0; i<=ren; i++){
            triangPasc[i][0] = 1;
        }  
        for(int i=0; i<=col; i++){
            triangPasc[0][i] = 1;
        }
        int contador = 0;
        int res = 0;
        for(int j=1;j<=col;j++){
            for(int i=1;i<= (ren-(j));i++){
                triangPasc[i][j]=triangPasc[i-1][j]+triangPasc[i][j-1];
                if(triangPasc[i][j] != 0){
                    res = triangPasc[i][j];
                }
            }
        }
        return res;
      }
    }

public int tPascalRec(int ren, int col) {
        if(ren == col || col == 0){
            return 1;
        }else{
            int res = tPascalRec(ren-1, col-1) + tPascalRec(ren-1,col);
            return res;
        }
    }
 

 public int fibonacciIt(int n) {
        int sig = 1;
        int act = 0;
        int temp = 0;
        for (int i=0; i<n; i++){
            temp = act;
            act = sig;
            sig = sig + temp;
        }
        return act;
    }


  public int fibonacciRec(int n){
      if(n == 0 || n == 1){

        return n;  
      }
      else{
        int res = fibonacciRec(n - 1) + fibonacciRec(n - 2);
        return res;
      }
}
}
