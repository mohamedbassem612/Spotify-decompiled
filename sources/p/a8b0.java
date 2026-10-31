package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class a8b0 implements ve5, e8b0 {
    public int a;

    public zpi0 E() {
        return bkz.a(1, true, new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8b0)) {
            return false;
        }
        a8b0 a8b0Var = (a8b0) obj;
        if (u0() == a8b0Var.u0()) {
            return sto1.q(c4x0.N0, w0(), a8b0Var.w0());
        }
        return false;
    }

    public final fg5 getAnnotations() {
        fg5 fg5Var;
        ig5 ig5Var = (ig5) jg5.b.p(s0(), jg5.a[0]);
        return (ig5Var == null || (fg5Var = ig5Var.a) == null) ? rzs0.g : fg5Var;
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.a;
        if (i != 0) {
            return i;
        }
        if (d4o1.i(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (u0() ? 1 : 0) + ((r0().hashCode() + (t0().hashCode() * 31)) * 31);
        }
        this.a = iHashCode;
        return iHashCode;
    }

    public List r0() {
        return z6x.a;
    }

    public e0h1 s0() {
        e0h1.b.getClass();
        return e0h1.c;
    }

    public abstract h0h1 t0();

    public abstract boolean u0();

    public abstract gmh1 w0();

    public a8b0 v0(g8b0 g8b0Var) {
        return this;
    }
}
