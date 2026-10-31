package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class phl1 {
    public final dma1 a;
    public final yqg b;
    public final y75 c;
    public final dt71 d;

    public phl1(dma1 dma1Var, yqg yqgVar, y75 y75Var) {
        this.a = dma1Var;
        this.b = yqgVar;
        this.c = y75Var;
        dt71 dt71VarE = mgo1.e(1, 0, 2, 2);
        this.d = dt71VarE;
        if (y75Var.c()) {
            bma1 bma1Var = qhl1.b;
            if (!((ima1) dma1Var).n(bma1Var)) {
                l1d.B(yqgVar, dma1Var.edit(), bma1Var);
            }
        }
        if (yqgVar.b() - dma1Var.g(qhl1.a, Long.MAX_VALUE) > 3628800000L) {
            dt71VarE.a(ohl1.c);
        }
    }
}
