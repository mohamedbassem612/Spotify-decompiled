package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g6h0 {
    public final c380 a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final Map f;
    public final boolean g;
    public final lpu h;
    public final boolean i;

    public g6h0(c380 c380Var, String str, boolean z, String str2, String str3, Map map, boolean z2, lpu lpuVar, boolean z3) {
        this.a = c380Var;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = map;
        this.g = z2;
        this.h = lpuVar;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6h0)) {
            return false;
        }
        g6h0 g6h0Var = (g6h0) obj;
        return u890.j(this.a, g6h0Var.a) && this.b.equals(g6h0Var.b) && this.c == g6h0Var.c && u890.j(this.d, g6h0Var.d) && u890.j(this.e, g6h0Var.e) && u890.j(this.f, g6h0Var.f) && this.g == g6h0Var.g && this.h.equals(g6h0Var.h) && this.i == g6h0Var.i;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + xcg1.g(cy30.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g)) * 31);
    }
}
