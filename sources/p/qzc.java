package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qzc implements Runnable {
    public final /* synthetic */ dn81 a;
    public final /* synthetic */ int b;

    public qzc(dn81 dn81Var, int i) {
        this.a = dn81Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h(this.b);
    }
}
