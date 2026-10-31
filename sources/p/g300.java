package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g300 implements t600 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public g300(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g300)) {
            return false;
        }
        g300 g300Var = (g300) obj;
        return u890.j(this.a, g300Var.a) && this.b == g300Var.b && this.c == g300Var.c && u890.j(this.d, g300Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
