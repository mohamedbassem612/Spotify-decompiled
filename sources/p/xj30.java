package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xj30 {
    public final ie30 a;
    public final long b;

    public xj30(ie30 ie30Var, long j) {
        dm5.n(ie30Var.H != null, "format colorInfo must be set");
        int i = ie30Var.w;
        dm5.l("format width must be positive, but is: %s", i, i > 0);
        int i2 = ie30Var.x;
        dm5.l("format height must be positive, but is: %s", i2, i2 > 0);
        this.a = ie30Var;
        this.b = j;
    }
}
