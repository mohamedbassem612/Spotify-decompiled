package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fmg0 {
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final boolean h;
    public final Function0 i;
    public final boolean j;
    public final iu30 k;

    public fmg0(String str, String str2, c380 c380Var, String str3, String str4, long j, boolean z, Function0 function0, boolean z2, iu30 iu30Var) {
        uwr uwrVar = cbx.a;
        long j2 = ((yex) zex.a.d).e;
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = z;
        this.i = function0;
        this.j = z2;
        this.k = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmg0)) {
            return false;
        }
        fmg0 fmg0Var = (fmg0) obj;
        if (!u890.j(this.a, fmg0Var.a) || !u890.j(this.b, fmg0Var.b) || !u890.j(this.c, fmg0Var.c) || !u890.j(this.d, fmg0Var.d) || !u890.j(this.e, fmg0Var.e)) {
            return false;
        }
        long j = fmg0Var.f;
        int i = u7h.l;
        return z4h1.b(this.f, j) && z4h1.b(this.g, fmg0Var.g) && this.h == fmg0Var.h && this.i.equals(fmg0Var.i) && this.j == fmg0Var.j && u890.j(this.k, fmg0Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(kk0.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = u7h.l;
        int iG = xcg1.g(rjx.n(xcg1.g(cy30.f(cy30.f(iHashCode2, this.f, 31), this.g, 31), 31, this.h), 31, this.i), 31, this.j);
        iu30 iu30Var = this.k;
        return iG + (iu30Var != null ? iu30Var.hashCode() : 0);
    }
}
