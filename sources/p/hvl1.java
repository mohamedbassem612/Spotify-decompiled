package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hvl1 implements x360 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final gvl1 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ hvl1(String str, int i, String str2, String str3, boolean z, String str4) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, evl1.a, (i & 32) == 0, (i & 64) != 0 ? false : z, false);
    }

    public static hvl1 c(hvl1 hvl1Var, int i) {
        String str = hvl1Var.a;
        String str2 = hvl1Var.b;
        String str3 = hvl1Var.c;
        String str4 = hvl1Var.d;
        gvl1 gvl1Var = (i & 16) != 0 ? hvl1Var.e : fvl1.a;
        boolean z = hvl1Var.f;
        boolean z2 = hvl1Var.g;
        boolean z3 = (i & 128) != 0 ? hvl1Var.h : true;
        hvl1Var.getClass();
        return new hvl1(str, str2, str3, str4, gvl1Var, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvl1)) {
            return false;
        }
        hvl1 hvl1Var = (hvl1) obj;
        return u890.j(this.a, hvl1Var.a) && u890.j(this.b, hvl1Var.b) && u890.j(this.c, hvl1Var.c) && u890.j(this.d, hvl1Var.d) && u890.j(this.e, hvl1Var.e) && this.f == hvl1Var.f && this.g == hvl1Var.g && this.h == hvl1Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g((this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f), 31, this.g);
    }

    public hvl1(String str, String str2, String str3, String str4, gvl1 gvl1Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = gvl1Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }
}
