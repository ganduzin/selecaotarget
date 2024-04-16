
public class PerguntaCinco {
    public static void main(String[] args) {
        String aSerInvertida = "Otorrinolaringo";
        char[] arrayDeChar = aSerInvertida.toCharArray();
        char[] arrayDeCharInvertida = new char[arrayDeChar.length + 1];
        

        for (int i = 0; i < arrayDeChar.length; i++) {
            arrayDeCharInvertida[i] = arrayDeChar[(arrayDeChar.length - 1) - i]; 
        }
        System.out.println(arrayDeCharInvertida);


    }

}
