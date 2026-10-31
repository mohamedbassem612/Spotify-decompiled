package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u77 {
    public final yrd a;
    public final boolean b;
    public final List c;
    public final axq0 d;

    public u77(yrd yrdVar, boolean z, smc0 smc0Var, axq0 axq0Var) {
        this.a = yrdVar;
        this.b = z;
        this.c = smc0Var;
        this.d = axq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u77)) {
            return false;
        }
        u77 u77Var = (u77) obj;
        return u890.j(this.a, u77Var.a) && this.b == u77Var.b && this.c.equals(u77Var.c) && this.d.equals(u77Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
