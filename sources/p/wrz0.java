package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wrz0 {
    public final xrz0 a;
    public final g07 b;
    public final boolean c;
    public final Boolean d;
    public final Boolean e;

    public wrz0(xrz0 xrz0Var, g07 g07Var, boolean z, Boolean bool, Boolean bool2) {
        this.a = xrz0Var;
        this.b = g07Var;
        this.c = z;
        this.d = bool;
        this.e = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrz0)) {
            return false;
        }
        wrz0 wrz0Var = (wrz0) obj;
        return this.a.equals(wrz0Var.a) && this.b.equals(wrz0Var.b) && this.c == wrz0Var.c && u890.j(this.d, wrz0Var.d) && this.e.equals(wrz0Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31, 31, this.c);
        Boolean bool = this.d;
        return this.e.hashCode() + ((iG + (bool == null ? 0 : bool.hashCode())) * 31);
    }
}
