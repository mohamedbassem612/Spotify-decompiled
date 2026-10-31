package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vpg1 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final int j;

    public vpg1(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, boolean z3, int i) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = str6;
        this.i = z3;
        this.j = i;
    }

    public static vpg1 a(vpg1 vpg1Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = vpg1Var.a;
        }
        boolean z3 = z;
        String str = vpg1Var.b;
        vpg1Var.getClass();
        String str2 = vpg1Var.c;
        String str3 = vpg1Var.d;
        String str4 = vpg1Var.e;
        String str5 = vpg1Var.f;
        boolean z4 = vpg1Var.g;
        String str6 = vpg1Var.h;
        if ((i & 512) != 0) {
            z2 = vpg1Var.i;
        }
        int i2 = vpg1Var.j;
        vpg1Var.getClass();
        return new vpg1(z3, str, str2, str3, str4, str5, z4, str6, z2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpg1)) {
            return false;
        }
        vpg1 vpg1Var = (vpg1) obj;
        return this.a == vpg1Var.a && this.b.equals(vpg1Var.b) && Float.compare(0.0f, 0.0f) == 0 && this.c.equals(vpg1Var.c) && this.d.equals(vpg1Var.d) && this.e.equals(vpg1Var.e) && this.f.equals(vpg1Var.f) && this.g == vpg1Var.g && this.h.equals(vpg1Var.h) && this.i == vpg1Var.i && this.j == vpg1Var.j;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(x0d.f(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, 0.0f), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        int i = this.j;
        return iG + (i == 0 ? 0 : l1d.C(i));
    }
}
