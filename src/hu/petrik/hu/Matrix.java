package hu.petrik.hu;

public class Matrix {
    protected int sorokSzama;
    protected int oszlopokSzama;
    protected int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokszama) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokszama;
        this.matrix = new int[sorokSzama][oszlopokszama];
        this.feltolt();
    }

    public Matrix() {
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
        this.matrix = new int[this.sorokSzama][this.oszlopokSzama];
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                this.matrix[i][j] = (int)(Math.random()*90)+10;
            }
        }
    }

    protected void feltolt() {
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                this.matrix[i][j] = (int)(Math.random()*90)+10;
            }
        }
    }

    public int getSorokSzama() {
        return sorokSzama;
    }

    public int getOszlopokSzama() {
        return oszlopokSzama;
    }

    public boolean isNegyzetes() {
        return this.sorokSzama == this.oszlopokSzama;
}

    public long Osszeg() {
        long sum = 0;
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public int parosakSzama() {
        int db = 0;

            for (int i = 0; i < this.sorokSzama; i++) {
                for (int j = 0; j < this.oszlopokSzama; j++) {
                   if (matrix[i][j] % 2 == 0) {
                       db++;
                   }
                }
            }

        return db;
    }

    public int legnagyobbElem() {
        int max = matrix[0][0];
        for (int i = 0; i < sorokSzama; i++) {
            for (int j = 0; j < oszlopokSzama; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                s += matrix[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}

