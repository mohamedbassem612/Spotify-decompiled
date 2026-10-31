package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zoo extends dxo1 {
    public double b;
    public double[] c;

    @Override // p.dxo1
    public final double m(double d) {
        return this.c[0];
    }

    @Override // p.dxo1
    public final void n(double d, double[] dArr) {
        double[] dArr2 = this.c;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // p.dxo1
    public final void o(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.c;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // p.dxo1
    public final void p(double d, double[] dArr) {
        for (int i = 0; i < this.c.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // p.dxo1
    public final double[] q() {
        return new double[]{this.b};
    }
}
