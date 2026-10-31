package p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class ijm1 implements v3h1, c4h1, xku {
    public tr80 b;
    public int c;
    public nlx0 d;
    public List e;
    public int f;
    public boolean h;
    public final LinkedHashSet a = new LinkedHashSet();
    public boolean g = true;
    public int i = -1;

    public abstract y3h1 A(int i);

    public boolean C() {
        return true;
    }

    public final void D() {
        if (this.h) {
            return;
        }
        boolean z = this.g;
        if (z || this.i != hqn1.b) {
            if (!z && !t()) {
                this.i = hqn1.b;
                return;
            }
            this.i = hqn1.b;
            this.g = false;
            this.h = true;
            try {
                nlx0 nlx0VarX = x();
                if (u890.j(nlx0VarX, this.d)) {
                    return;
                }
                this.d = nlx0VarX;
                if (C()) {
                    this.c++;
                    B();
                }
            } finally {
                this.h = false;
            }
        }
    }

    public final int a() {
        D();
        return w();
    }

    public final void b(c4h1 c4h1Var) {
        this.a.remove(c4h1Var);
    }

    public final int g() {
        D();
        List listV = v();
        if (!u890.j(listV, this.e)) {
            this.e = listV;
            this.f++;
        }
        return this.f;
    }

    public final y3h1 i(int i) {
        D();
        return A(i);
    }

    public final void n(c4h1 c4h1Var) {
        this.a.add(c4h1Var);
    }

    public final void p(tr80 tr80Var) {
        if (tr80Var.equals(this.b)) {
            return;
        }
        this.b = tr80Var;
        D();
        r();
    }

    public final int q() {
        D();
        return this.c;
    }

    public abstract void r();

    public final tr80 s() {
        tr80 tr80Var = this.b;
        if (tr80Var != null) {
            return tr80Var;
        }
        tr80 tr80Var2 = tr80.d;
        return tr80.d;
    }

    public boolean t() {
        return true;
    }

    public final boolean u() {
        return this.b != null;
    }

    public abstract List v();

    public abstract int w();

    public abstract nlx0 x();

    public final void y() {
        this.g = true;
    }

    public final void z() {
        Iterator it = o7h.l1(this.a).iterator();
        while (it.hasNext()) {
            ((c4h1) it.next()).e(this);
        }
    }

    public void B() {
    }
}
