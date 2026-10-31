package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zl1 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public zl1(boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, int i) {
        str = (i & 8) != 0 ? "" : str;
        str2 = (i & 16) != 0 ? "" : str2;
        z3 = (i & 32) != 0 ? false : z3;
        z4 = (i & 64) != 0 ? true : z4;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl1)) {
            return false;
        }
        zl1 zl1Var = (zl1) obj;
        return this.a == zl1Var.a && this.b == zl1Var.b && this.c.equals(zl1Var.c) && this.d.equals(zl1Var.d) && this.e == zl1Var.e && this.f == zl1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(cy30.d(cy30.d(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, false), 31, this.c), 31, this.d), 31, this.e);
    }
}
