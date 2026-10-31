package p;

import com.spotify.mobius.Init;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dx81 {
    public final iu30 a;
    public final iu30 b;
    public final Init c;
    public final iu30 d;

    public dx81(iu30 iu30Var, iu30 iu30Var2, Init init, iu30 iu30Var3) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = init;
        this.d = iu30Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx81)) {
            return false;
        }
        dx81 dx81Var = (dx81) obj;
        return u890.j(this.a, dx81Var.a) && u890.j(this.b, dx81Var.b) && u890.j(this.c, dx81Var.c) && u890.j(this.d, dx81Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31)) * 31;
        iu30 iu30Var = this.d;
        return iHashCode + (iu30Var == null ? 0 : iu30Var.hashCode());
    }

    public /* synthetic */ dx81(iu30 iu30Var, iu30 iu30Var2, Init init) {
        this(iu30Var, iu30Var2, init, null);
    }
}
