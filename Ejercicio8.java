  package Clase02;
  import javax.swing.*; 
 
public class Ejercicio8 {
     
    private int matriz[][]; 
    private int j; 
    private int i;
    private int valor;
    private int transpuesta[][];
    public Ejercicio8 ()
    {
       i=Integer.parseInt(JOptionPane.showInputDialog("Ingresar catidad  Fila para la matriz")); 
       j=Integer.parseInt(JOptionPane.showInputDialog("Ingresar catidad columna para la matriz")); 
       matriz= new int[i][j];
       transpuesta= new int[j][i];
    }
    void establecerMatriz()
    {
        for (int i=0; i < this.matriz.length; i++)
        {
            for (int j=0; j< this.matriz[i].length; j++)
            {
                this.valor = Integer.parseInt(JOptionPane.showInputDialog("valor de la matriz original"));
                this.matriz[i][j] = this.valor;
            }
        }
    }
    public void conseguirMatriz()
    {
        System.out.println("matriz ");                             
        for(int i=0; i < this.matriz.length; i++)          
        {
            for(int j=0; j < this.matriz[i].length; j++)
            {
                System.out.printf("%d ", this.matriz[i][j]);
            }
            
            System.out.println();
        }
    }
    public void transMa()
    {
        System.out.println("Transpuesta");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                transpuesta[i][j] = matriz[j][i];
                System.out.printf("%d ", transpuesta[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Ejercicio8 matriz = new Ejercicio8();

        matriz.establecerMatriz();
        matriz.conseguirMatriz();
        matriz.transMa();

}


}