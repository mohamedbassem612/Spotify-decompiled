package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kxd1 implements i6a1 {
    public final boolean b;
    public final ynb0 c;
    public final ynb0 d;

    public kxd1(boolean z, ynb0 ynb0Var, ynb0 ynb0Var2) {
        this.b = z;
        this.c = ynb0Var;
        this.d = ynb0Var2;
    }

    public final void a(Throwable th) {
        if (this.b) {
            ((cxd1) this.d.get()).a();
            ((jxd1) this.c.get()).c(th);
        }
    }
}
