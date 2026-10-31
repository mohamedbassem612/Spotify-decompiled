package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ceg0 {
    public final String a;
    public final ibg0 b;
    public final boolean c;
    public final boolean d;
    public final Boolean e;

    public ceg0(String str, ibg0 ibg0Var, boolean z, boolean z2, Boolean bool) {
        this.a = str;
        this.b = ibg0Var;
        this.c = z;
        this.d = z2;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceg0)) {
            return false;
        }
        ceg0 ceg0Var = (ceg0) obj;
        return u890.j(this.a, ceg0Var.a) && this.b == ceg0Var.b && this.c == ceg0Var.c && this.d == ceg0Var.d && u890.j(this.e, ceg0Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        Boolean bool = this.e;
        return iG + (bool == null ? 0 : bool.hashCode());
    }
}
