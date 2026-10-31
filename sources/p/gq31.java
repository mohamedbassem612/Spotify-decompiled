package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gq31 {
    public final String a;
    public final String b;
    public final vp31 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final iu30 g;
    public final iu30 h;

    public gq31(String str, String str2, vp31 vp31Var, boolean z, boolean z2, boolean z3, iu30 iu30Var, iu30 iu30Var2) {
        this.a = str;
        this.b = str2;
        this.c = vp31Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = iu30Var;
        this.h = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq31)) {
            return false;
        }
        gq31 gq31Var = (gq31) obj;
        return u890.j(this.a, gq31Var.a) && u890.j(this.b, gq31Var.b) && u890.j(this.c, gq31Var.c) && this.d == gq31Var.d && this.e == gq31Var.e && this.f == gq31Var.f && u890.j(this.g, gq31Var.g) && u890.j(this.h, gq31Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.h.hashCode() + ktd.g(this.g, xcg1.g(xcg1.g(xcg1.g((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31);
    }
}
