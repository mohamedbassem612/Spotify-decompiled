package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o1k extends fjs0 {
    public final nfa0 e;
    public int f;

    public o1k(o490 o490Var, nfa0 nfa0Var) {
        super(o490Var);
        this.e = nfa0Var;
    }

    public final void b() {
        ((fjs0) this).a = true;
        this.f++;
    }

    public final void c() {
        ((fjs0) this).a = false;
        i("\n");
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            i(this.e.a.g);
        }
    }

    public final void d() {
        if (((fjs0) this).a) {
            ((fjs0) this).a = false;
        } else {
            c();
        }
    }

    public final void l() {
        f(' ');
    }

    public final void m() {
        this.f--;
    }
}
