package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ilg0 {
    public final String a;
    public final String b;
    public final long c;
    public final grn1 d;
    public final boolean e;
    public final Function0 f;
    public final boolean g;
    public final iu30 h;

    public ilg0(String str, String str2, long j, grn1 grn1Var, boolean z, Function0 function0, boolean z2, iu30 iu30Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = grn1Var;
        this.e = z;
        this.f = function0;
        this.g = z2;
        this.h = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilg0)) {
            return false;
        }
        ilg0 ilg0Var = (ilg0) obj;
        if (!u890.j(this.a, ilg0Var.a) || !u890.j(this.b, ilg0Var.b)) {
            return false;
        }
        long j = ilg0Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j) && this.d.equals(ilg0Var.d) && this.e == ilg0Var.e && u890.j(this.f, ilg0Var.f) && this.g == ilg0Var.g && u890.j(this.h, ilg0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = u7h.l;
        int iG = xcg1.g(rjx.n(xcg1.g((this.d.hashCode() + cy30.f(iD, this.c, 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        iu30 iu30Var = this.h;
        return iG + (iu30Var == null ? 0 : iu30Var.hashCode());
    }
}
