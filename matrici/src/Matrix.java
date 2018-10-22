import com.sun.istack.internal.Nullable;
import org.jetbrains.annotations.Contract;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Matrix {
    private double[][] mat;

    Matrix() {
    }

    private double[][] getMat() {
        return this.mat;
    }

    private void setMat(double[][] mat) {
        this.mat = mat;
    }

    void read() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер кол-во строк матрицы ");
        int sizeN = in.nextInt();
        System.out.println("Введите размер кол-во столбцов матрицы ");
        int sizeM = in.nextInt();
        System.out.println("Введите элементы матрицы a");
        double[][] matA = new double[sizeN][sizeM];
        for (int i = 0; i < sizeN; i++) {
            for (int j = 0; j < sizeM; j++) {
                matA[i][j] = in.nextDouble();
            }
        }
        this.setMat(matA);
    }

    Matrix mulptiply(Matrix b) {
        int an = this.mat.length;
        int am = this.mat[0].length;
        int bn = b.getMat().length;
        int bm = b.getMat()[0].length;
        double[][] res = new double[an][bm];
        if (am == bn) {
            for (int i = 0; i < an; i++) {
                for (int j = 0; j < bm; j++) {
                    for (int k = 0; k < bn; k++) {
                        res[i][j] += this.mat[i][k] * b.getMat()[k][j];
                    }
                }
            }
            Matrix answer = new Matrix();
            answer.setMat(res);
            return answer;
        } else {
            System.out.println("Эти матрицы нельзя умножить");
            return new Matrix();
        }
    }

    void print(String matName) {
        if (this.getMat() == null) {
            return;
        }
        System.out.println("Матрица " + matName);
        int n = this.mat.length;
        int m = this.mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(this.mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    Matrix plus(Matrix b) {
        int an = this.mat.length;
        int am = this.mat[0].length;
        int bn = b.getMat().length;
        int bm = b.getMat()[0].length;
        double[][] res = new double[an][am];
        if ((an == bn) & (am == bm)) {
            for (int i = 0; i < an; i++) {
                for (int j = 0; j < am; j++) {
                    res[i][j] = this.getMat()[i][j] + b.getMat()[i][j];
                }
            }
            Matrix answer = new Matrix();
            answer.setMat(res);
            return answer;
        } else {
            System.out.println("Эти матрицы нельзя сложить");
            return new Matrix();
        }
    }

    Matrix minus(Matrix b) {
        int an = this.mat.length;
        int am = this.mat[0].length;
        int bn = b.getMat().length;
        int bm = b.getMat()[0].length;
        double[][] res = new double[an][am];
        if ((an == bn) & (am == bm)) {
            for (int i = 0; i < an; i++) {
                for (int j = 0; j < am; j++) {
                    res[i][j] = this.getMat()[i][j] - b.getMat()[i][j];
                }
            }
            Matrix answer = new Matrix();
            answer.setMat(res);
            return answer;
        } else {
            System.out.println("Эти матрицы нельзя сложить");
            return new Matrix();
        }
    }

    void transpose() {
        int an = this.mat.length;
        int am = this.mat[0].length;
        double[][] temp = new double[am][an];
        for (int i = 0; i <am ; i++) {
            for (int j = 0; j <an ; j++) {
                temp[i][j]=this.mat[j][i];
            }
        }
        this.setMat(temp);
    }
}