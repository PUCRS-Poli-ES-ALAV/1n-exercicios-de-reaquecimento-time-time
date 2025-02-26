public class Recursao {
    public int multiplica(int n1, int n2, int i) {
        if (i == 1) {
            return n2;
        }

        return multiplica(n1, n2 + n1, i - 1);
    }

    public int soma(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }

        return soma(n1 - 1, n2 + 1);
    }

    public double divide(double n, double r, double i) {

        if (i == -1) {
            return r;
        }
        return divide(n, r + (1 / (n - i)), i - 1);
    }

    public String inverte(String s , int i){
        
        if (i == 0){
            return s;
        } 
        s.substring()
        return inverte(s , i - 1);
    }
}
