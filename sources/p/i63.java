package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i63 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public i63(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i63)) {
            return false;
        }
        i63 i63Var = (i63) obj;
        return u890.j(this.a, i63Var.a) && u890.j(this.b, i63Var.b) && this.c.equals(i63Var.c) && u890.j(this.d, i63Var.d) && this.e == i63Var.e && this.f == i63Var.f && this.g == i63Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.g) + xcg1.g(xcg1.g(cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
