package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k581 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public k581(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k581)) {
            return false;
        }
        k581 k581Var = (k581) obj;
        return this.a.equals(k581Var.a) && this.b.equals(k581Var.b) && u890.j(this.c, k581Var.c) && u890.j(this.d, k581Var.d) && this.e == k581Var.e && this.f == k581Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iK = ab80.k(this.e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        int i = this.f;
        return iK + (i != 0 ? l1d.C(i) : 0);
    }
}
