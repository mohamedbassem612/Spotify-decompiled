package p;

import com.spotify.mobius.Init;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n7e0 {
    public final vu30 a;
    public final vu30 b;
    public final Init c;
    public final iu30 d;

    public n7e0(vu30 vu30Var, vu30 vu30Var2, Init init, iu30 iu30Var) {
        this.a = vu30Var;
        this.b = vu30Var2;
        this.c = init;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7e0)) {
            return false;
        }
        n7e0 n7e0Var = (n7e0) obj;
        return u890.j(this.a, n7e0Var.a) && u890.j(this.b, n7e0Var.b) && u890.j(this.c, n7e0Var.c) && u890.j(this.d, n7e0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + hrt.g(this.a.hashCode() * 31, 31, this.b)) * 31;
        iu30 iu30Var = this.d;
        return iHashCode + (iu30Var == null ? 0 : iu30Var.hashCode());
    }

    public /* synthetic */ n7e0(vu30 vu30Var, vu30 vu30Var2, Init init) {
        this(vu30Var, vu30Var2, init, null);
    }
}
