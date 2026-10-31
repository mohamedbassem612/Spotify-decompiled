package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oqu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Integer f;
    public final boolean g;

    public oqu0(Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = num;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqu0)) {
            return false;
        }
        oqu0 oqu0Var = (oqu0) obj;
        return this.a.equals(oqu0Var.a) && u890.j(this.b, oqu0Var.b) && this.c.equals(oqu0Var.c) && u890.j(this.d, oqu0Var.d) && this.e == oqu0Var.e && u890.j(this.f, oqu0Var.f) && this.g == oqu0Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.g) + ((iG + (num != null ? num.hashCode() : 0)) * 31);
    }
}
