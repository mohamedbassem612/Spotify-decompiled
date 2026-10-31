package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b6o0 extends jv91 {
    public final iu30 e;
    public final jv91 f;

    public b6o0(long j, nv91 nv91Var, iu30 iu30Var, jv91 jv91Var) {
        super(j, nv91Var);
        this.e = iu30Var;
        this.f = jv91Var;
        jv91Var.k();
    }

    public final void c() {
        jv91 jv91Var = this.f;
        if (((jv91) this).c) {
            return;
        }
        if (((jv91) this).b != jv91Var.g()) {
            a();
        }
        jv91Var.l();
        ((jv91) this).c = true;
        synchronized (pv91.c) {
            o();
        }
    }

    public final iu30 e() {
        return this.e;
    }

    public final boolean f() {
        return true;
    }

    public final jv91 u(iu30 iu30Var) {
        return new b6o0(((jv91) this).b, ((jv91) this).a, pv91.i(iu30Var, this.e, true), this.f);
    }
}
