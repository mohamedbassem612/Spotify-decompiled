package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k460 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public k460(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k460)) {
            return false;
        }
        k460 k460Var = (k460) obj;
        return u890.j(this.a, k460Var.a) && u890.j(this.b, k460Var.b) && this.c.equals(k460Var.c) && this.d == k460Var.d && u890.j(this.e, k460Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
