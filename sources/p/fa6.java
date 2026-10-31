package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fa6 {
    public final y86 a;
    public final psk b;
    public final chr0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;

    public fa6(y86 y86Var, psk pskVar, chr0 chr0Var, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, String str3, String str4) {
        this.a = y86Var;
        this.b = pskVar;
        this.c = chr0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = z4;
        this.j = str3;
        this.k = str4;
    }

    public static fa6 a(fa6 fa6Var, y86 y86Var, boolean z, boolean z2, String str, String str2, boolean z3, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            y86Var = fa6Var.a;
        }
        y86 y86Var2 = y86Var;
        psk pskVar = fa6Var.b;
        chr0 chr0Var = fa6Var.c;
        boolean z4 = fa6Var.d;
        boolean z5 = (i & 16) != 0 ? fa6Var.e : z;
        boolean z6 = (i & 32) != 0 ? fa6Var.f : z2;
        String str5 = (i & 64) != 0 ? fa6Var.g : str;
        String str6 = (i & 128) != 0 ? fa6Var.h : str2;
        boolean z7 = (i & 256) != 0 ? fa6Var.i : z3;
        String str7 = (i & 512) != 0 ? fa6Var.j : str3;
        String str8 = (i & 1024) != 0 ? fa6Var.k : str4;
        fa6Var.getClass();
        return new fa6(y86Var2, pskVar, chr0Var, z4, z5, z6, str5, str6, z7, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa6)) {
            return false;
        }
        fa6 fa6Var = (fa6) obj;
        return u890.j(this.a, fa6Var.a) && this.b == fa6Var.b && this.c == fa6Var.c && this.d == fa6Var.d && this.e == fa6Var.e && this.f == fa6Var.f && u890.j(this.g, fa6Var.g) && u890.j(this.h, fa6Var.h) && this.i == fa6Var.i && u890.j(this.j, fa6Var.j) && u890.j(this.k, fa6Var.k);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iG2 = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        String str3 = this.j;
        int iHashCode2 = (iG2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ fa6(y86 y86Var, psk pskVar, chr0 chr0Var, boolean z, int i) {
        this(y86Var, pskVar, chr0Var, (i & 8) != 0 ? false : z, false, false, null, null, false, null, null);
    }
}
