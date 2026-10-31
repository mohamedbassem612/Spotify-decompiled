package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n281 extends e6p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final j281 j;
    public final boolean k;

    public n281(String str, String str2, String str3, String str4, String str5, String str6, String str7, j281 j281Var, boolean z) {
        super(0);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = j281Var;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n281)) {
            return false;
        }
        n281 n281Var = (n281) obj;
        return this.c.equals(n281Var.c) && this.d.equals(n281Var.d) && this.e.equals(n281Var.e) && this.f.equals(n281Var.f) && this.g.equals(n281Var.g) && u890.j(this.h, n281Var.h) && u890.j(this.i, n281Var.i) && u890.j(this.j, n281Var.j) && this.k == n281Var.k;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        j281 j281Var = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode2 + (j281Var != null ? j281Var.hashCode() : 0)) * 31);
    }
}
