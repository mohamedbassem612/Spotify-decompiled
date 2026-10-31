package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class cxs {
    public final int a;
    public final pnf1 b;
    public final int c;
    public final ie30 d;

    public cxs(int i, pnf1 pnf1Var, int i2) {
        this.a = i;
        this.b = pnf1Var;
        this.c = i2;
        this.d = pnf1Var.d[i2];
    }

    public abstract int a();

    public boolean b(cxs cxsVar) {
        return false;
    }
}
