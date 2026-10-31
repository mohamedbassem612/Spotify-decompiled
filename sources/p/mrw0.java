package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mrw0 {
    public final nab1 a;
    public final gx21 b;
    public final nrw0 c;
    public final nrw0 d;
    public b3e0 e;
    public bge1 f;

    public mrw0(nab1 nab1Var, gx21 gx21Var, nrw0 nrw0Var, nrw0 nrw0Var2) {
        this.a = nab1Var;
        this.b = gx21Var;
        this.c = nrw0Var;
        this.d = nrw0Var2;
    }

    public final void a() {
        int i;
        nab1 nab1Var = this.a;
        boolean z = nab1Var.i;
        int i2 = 7;
        double[] dArr = b3e0.e;
        int i3 = 0;
        if (z) {
            double d = ((double) nab1Var.f.b) / 10.0d;
            int i4 = 0;
            while (true) {
                if (i4 >= 6) {
                    i = 7;
                    break;
                } else {
                    if (d <= dArr[i4]) {
                        i = i4 + 1;
                        break;
                    }
                    i4++;
                }
            }
        } else {
            i = 0;
        }
        if (nab1Var.j) {
            double d2 = ((double) nab1Var.g.b) / 10.0d;
            while (i3 < 6) {
                if (d2 <= dArr[i3]) {
                    i2 = i3 + 1;
                    break;
                }
                i3++;
            }
            i3 = i2;
        }
        gx21 gx21Var = this.b;
        b3e0 b3e0Var = new b3e0(i, i3, gx21Var.c, gx21Var.d);
        if (b3e0Var.equals(this.e)) {
            return;
        }
        this.e = b3e0Var;
        this.c.invoke(b3e0Var);
    }
}
