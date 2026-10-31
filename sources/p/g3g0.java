package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g3g0 implements mfv0 {
    public final rim a;
    public yr80 b;
    public flb0 c;
    public yr80 d;
    public qr80 e;

    public g3g0(rim rimVar) {
        this.a = rimVar;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        qr80 qr80Var = this.e;
        if (qr80Var != null) {
            yr80 yr80Var = this.b;
            if ((yr80Var == null ? false : yr80.b(yr80Var.a, j)) && this.c == flb0Var) {
                yr80 yr80Var2 = this.d;
                if (yr80Var2 != null ? yr80.b(yr80Var2.a, j2) : false) {
                    return qr80Var.a;
                }
            }
        }
        long jA = this.a.a(ur80Var, j, flb0Var, j2);
        this.b = new yr80(j);
        this.c = flb0Var;
        this.d = new yr80(j2);
        this.e = new qr80(jA);
        return jA;
    }
}
