package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lob1 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;

    public lob1(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lob1)) {
            return false;
        }
        lob1 lob1Var = (lob1) obj;
        return this.a == lob1Var.a && u890.j(this.b, lob1Var.b) && this.c.equals(lob1Var.c) && this.d.equals(lob1Var.d) && u890.j(this.e, lob1Var.e) && this.f == lob1Var.f && this.g == lob1Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + ab80.k(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
