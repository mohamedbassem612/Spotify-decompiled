package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rvy0 {
    public final vno0 a;
    public final ewy0 b;

    public rvy0(vno0 vno0Var, ewy0 ewy0Var) {
        this.a = vno0Var;
        this.b = ewy0Var;
    }

    public final void a(int i) {
        vno0 vno0Var = this.a;
        try {
            this.b.b(i);
        } finally {
            vno0Var.b.cancel(null, i);
        }
    }
}
