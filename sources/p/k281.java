package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k281 extends e6p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public k281(int i, String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
    }

    public static k281 s(k281 k281Var, String str) {
        String str2 = k281Var.c;
        String str3 = k281Var.e;
        String str4 = k281Var.f;
        int i = k281Var.g;
        k281Var.getClass();
        return new k281(i, str2, str, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k281)) {
            return false;
        }
        k281 k281Var = (k281) obj;
        return u890.j(this.c, k281Var.c) && u890.j(this.d, k281Var.d) && u890.j(this.e, k281Var.e) && u890.j(this.f, k281Var.f) && this.g == k281Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.g;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }

    public final String t() {
        return this.d;
    }

    public final String u() {
        return this.e;
    }

    public final int v() {
        return this.g;
    }

    public final String w() {
        return this.c;
    }

    public final String x() {
        return this.f;
    }
}
