public class NumeroUtil {
    int maiorNumero(int num1, int num2) {
        if (num1> num2) {
            return num1;
        } else {
            return num2;
        }
    }

    int maiorNumero(int num1, int num2, int num3) {
        if (num1> num2 && num1 > num3) {
            return num1;
        } else if (num2> num1 && num2 > num3) {
            return num2;
        } else if (num3 > num2 && num3> num1) {
            return num3;
        } else {
            return 0;
        }
    }

    double maiorNumero(double num1, double num2) {
        if (num1> num2) {
            return num1;
        } else {
            return num2;
        }
    }

    double maiorNumero(double num1, double num2, double num3) {
        if (num1> num2 && num1 > num3) {
            return num1;
        } else if (num2> num1 && num2 > num3) {
            return num2;
        } else if (num3 > num2 && num3> num1) {
            return num3;
        } else {
            return 0;
        }
    }
}
