package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q9 implements Runnable {
    public final it21 a;
    public final n8d0 b;

    public q9(it21 it21Var, n8d0 n8d0Var) {
        this.a = it21Var;
        this.b = n8d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((t9) this.a).a != this) {
            return;
        }
        if (t9.f.i(this.a, this, t9.h(this.b))) {
            t9.e(this.a);
        }
    }
}
