package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nir0 implements lir0 {
    public final h0r0 a;
    public final c7r0 b;
    public final Observable c;

    public nir0(h0r0 h0r0Var, c7r0 c7r0Var, Observable observable) {
        this.a = h0r0Var;
        this.b = c7r0Var;
        this.c = observable;
    }

    public static mir0 a(h0r0 h0r0Var, c7r0 c7r0Var) {
        lir0 lir0Var;
        t1r0 t1r0Var = (t1r0) h0r0Var.a().b0(t1r0.class).a();
        if (t1r0Var != null) {
            if (!t1r0Var.a) {
                t1r0Var = null;
            }
            if (t1r0Var != null) {
                b8r0 b8r0Var = c7r0Var instanceof b8r0 ? (b8r0) c7r0Var : null;
                if (b8r0Var != null && (lir0Var = (lir0) b8r0Var.f(lir0.class)) != null) {
                    return lir0Var.c();
                }
            }
        }
        return null;
    }

    @Override // p.lir0
    public final mir0 c() {
        h0r0 h0r0Var = this.a;
        a6o0 a6o0Var = (a6o0) h0r0Var.a().b0(a6o0.class).a();
        mir0 mir0VarP = a6o0Var != null ? nhc.p(new myq0(a6o0Var.a, this, (byte) 4)) : null;
        return (mir0VarP == null && (mir0VarP = a(h0r0Var, this.b)) == null) ? b0o1.c(h0r0Var.a().b0(bn70.class), this.c) : mir0VarP;
    }
}
