package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i460 implements x360 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public i460(String str, int i, String str2, String str3, boolean z, String str4) {
        str3 = (i & 4) != 0 ? "" : str3;
        z = (i & 8) != 0 ? false : z;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i460)) {
            return false;
        }
        i460 i460Var = (i460) obj;
        return u890.j(this.a, i460Var.a) && u890.j(this.b, i460Var.b) && this.c.equals(i460Var.c) && this.d == i460Var.d && u890.j(this.e, i460Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
