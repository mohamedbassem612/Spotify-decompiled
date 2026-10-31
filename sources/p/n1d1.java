package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class n1d1 implements d441 {
    public final sk30 a;
    public final String b;
    public boolean c;

    public n1d1(sk30 sk30Var, String str) {
        this.a = sk30Var;
        this.b = str;
    }

    public final void a() {
        if (this.c) {
            vby0.y(21, "statement is closed");
            throw null;
        }
    }

    @Override // p.d441
    public void reset() {
        a();
    }

    @Override // p.d441
    public void x() {
        a();
    }
}
