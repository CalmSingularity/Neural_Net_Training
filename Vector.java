public class Vector {
    private double[] x; // массив входных весов
    private double[] desireOutputs; // массив желаемых значений

    // конструктор вектора
    public Vector(double[] x, double[] desireOutputs) {
        this.x = new double[x.length +1];
        x[0] = 1;
        for (int i = 1; i < x.length; i++) {
            this.x[i] = x[i - 1];
        }
        this.desireOutputs = desireOutputs;
    }

    public double[] getX() {
        return x;
    }

    public double[] getDesireOutputs() {
        return desireOutputs;
    }
}
