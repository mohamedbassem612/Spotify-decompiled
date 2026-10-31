package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t5n0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final l5n0 e;
    public final String f;
    public final int g;
    public final String h;
    public final int i;

    public t5n0(String str, String str2, String str3, String str4, l5n0 l5n0Var, String str5, int i, String str6, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l5n0Var;
        this.f = str5;
        this.g = i;
        this.h = str6;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5n0)) {
            return false;
        }
        t5n0 t5n0Var = (t5n0) obj;
        return this.a.equals(t5n0Var.a) && this.b.equals(t5n0Var.b) && this.c.equals(t5n0Var.c) && this.d.equals(t5n0Var.d) && this.e.equals(t5n0Var.e) && u890.j(this.f, t5n0Var.f) && this.g == t5n0Var.g && u890.j(this.h, t5n0Var.h) && this.i == t5n0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int iK = ab80.k(this.g, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.h;
        int iHashCode2 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = this.i;
        return iHashCode2 + (i != 0 ? l1d.C(i) : 0);
    }
}
