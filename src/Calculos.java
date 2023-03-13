
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculos {
    private int[] numeros;
    public Calculos(int[] numeros) {
        this.numeros = numeros;
    }

    public Calculos() {
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public double media(){
        double m=0;
        for (int i = 0; i < this.numeros.length; i++) {
            m=m+this.numeros[i];
        }
        return m/this.numeros.length;
    }

    public int maximo(){
        int max=this.numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>max){
                max=numeros[i];
            }
        }
        return max;
    }
    public List<Integer> repetidos(){
        List<Integer> numerosReptidos=new ArrayList<Integer>();
        for (int i = 0; i < this.numeros.length; i++) {
            for (int j = i+1; j < this.numeros.length; j++) {
                if(numeros[i]==numeros[j]){
                    if(numerosReptidos.indexOf(numeros[i])==-1){
                        numerosReptidos.add(numeros[i]);
                    }
                    break;
                }
            }
        }
        return numerosReptidos;
    }
    public List<Integer> unicos(){
        List<Integer> numerosUnicos=new ArrayList<Integer>();
            for (int j = 0; j < this.numeros.length; j++) {
                if (numerosUnicos.indexOf(numeros[j]) == -1) {
                    numerosUnicos.add(numeros[j]);
                }
            }
        return numerosUnicos;
    }
    public int[] ordenarMayor(){
        int[] ordenado=this.numeros;
        int longitud=this.numeros.length;
        int temp;
        do{
            for (int i = 0; i < longitud-1; i++) {
                if(this.numeros[i]<this.numeros[i+1]){
                   temp=this.numeros[i+1];
                   numeros[i+1]=numeros[i];
                   numeros[i]=temp;
                }
            }
            longitud--;
        }while(longitud>0);
        return ordenado;
    }

    public int suma(){
        int suma_numeros=0;
        for (int i = 0; i < this.numeros.length; i++) {
            suma_numeros+=this.numeros[i];
        }
        return suma_numeros;
    }

    @Override
    public String toString() {
        return "Calculos{" +
                "numeros=" + Arrays.toString(numeros) +
                '}';
    }
}
