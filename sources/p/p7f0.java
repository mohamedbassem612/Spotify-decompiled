package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p7f0 {
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final Double g;
    public final boolean h;

    public p7f0(int i, String str, int i2, String str2, String str3, String str4, Double d, boolean z, int i3) {
        i2 = (i3 & 4) != 0 ? 0 : i2;
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = d;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7f0)) {
            return false;
        }
        p7f0 p7f0Var = (p7f0) obj;
        return this.a == p7f0Var.a && u890.j(this.b, p7f0Var.b) && this.c == p7f0Var.c && this.d.equals(p7f0Var.d) && this.e.equals(p7f0Var.e) && u890.j(this.f, p7f0Var.f) && u890.j(this.g, p7f0Var.g) && this.h == p7f0Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.g;
        return Boolean.hashCode(true) + xcg1.g((iHashCode + (d != null ? d.hashCode() : 0)) * 31, 31, this.h);
    }
}
