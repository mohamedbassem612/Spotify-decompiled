package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oir0 implements ky11 {
    public final jir0 a;
    public final n36 b = new n36();
    public nir0 c;
    public boolean d;

    public oir0(jir0 jir0Var) {
        this.a = jir0Var;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        nir0 nir0Var = this.c;
        if (nir0Var == null) {
            eg.m("Required value was null.");
            return;
        }
        jir0 jir0Var = this.a;
        if (jir0Var.c != this) {
            return;
        }
        jir0Var.b = nir0Var;
        jir0Var.c = null;
        while (true) {
            n36 n36Var = this.b;
            if (n36Var.isEmpty()) {
                return;
            }
            xnn0 xnn0Var = jir0Var.a;
            x9r0 x9r0VarA = (car0) n36Var.removeFirst();
            if (x9r0VarA instanceof x9r0) {
                x9r0 x9r0Var = x9r0VarA;
                if (x9r0Var.c == null) {
                    x9r0VarA = x9r0.a(x9r0Var, nir0Var.c());
                }
            }
            xnn0Var.a(x9r0VarA);
        }
    }

    public final void f() {
        jir0 jir0Var = this.a;
        if (jir0Var.c != this) {
            return;
        }
        jir0Var.c = null;
        this.b.clear();
    }

    public final void h() {
        jir0 jir0Var = this.a;
        if (jir0Var.c != this) {
            return;
        }
        jir0Var.c = null;
        this.b.clear();
    }
}
