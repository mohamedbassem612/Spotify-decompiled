package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ujj0 {
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final wls0 e;
    public final tu00 f;
    public final boolean g;
    public final boolean h;
    public final List i;
    public final boolean j;
    public final String k;
    public final String l;

    public ujj0(long j, int i, boolean z, String str, wls0 wls0Var, tu00 tu00Var, boolean z2, boolean z3, List list, boolean z4, String str2, String str3) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = wls0Var;
        this.f = tu00Var;
        this.g = z2;
        this.h = z3;
        this.i = list;
        this.j = z4;
        this.k = str2;
        this.l = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujj0)) {
            return false;
        }
        ujj0 ujj0Var = (ujj0) obj;
        return this.a == ujj0Var.a && this.b == ujj0Var.b && this.c == ujj0Var.c && u890.j(this.d, ujj0Var.d) && this.e == ujj0Var.e && u890.j(this.f, ujj0Var.f) && this.g == ujj0Var.g && this.h == ujj0Var.h && this.i.equals(ujj0Var.i) && this.j == ujj0Var.j && u890.j(this.k, ujj0Var.k) && u890.j(this.l, ujj0Var.l);
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        int iG2 = xcg1.g(f4i1.b(xcg1.g(xcg1.g((this.f.hashCode() + ((this.e.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        String str2 = this.k;
        int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
