package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s8o {
    public final dma1 a;
    public final yqg b;
    public final v8o c;
    public final nf90 d;

    public s8o(dma1 dma1Var, yqg yqgVar, v8o v8oVar, nf90 nf90Var, y75 y75Var, kt91 kt91Var) {
        this.a = dma1Var;
        this.b = yqgVar;
        this.c = v8oVar;
        this.d = nf90Var;
    }

    public final Object a(lgl1 lgl1Var) {
        long jB = this.b.b();
        bma1 bma1Var = t8o.a;
        dma1 dma1Var = this.a;
        long jG = dma1Var.g(bma1Var, Long.MIN_VALUE);
        if (jG == Long.MIN_VALUE || jB - jG >= 604800000) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.c(bma1Var, jB);
            hma1VarEdit.g();
            this.d.getClass();
            Object objA = this.c.a(lgl1Var);
            if (objA == d9n.a) {
                return objA;
            }
        }
        return rih1.a;
    }
}
