package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v820 {
    public final pix a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public v820(pix pixVar, boolean z, String str, boolean z2) {
        this.a = pixVar;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v820)) {
            return false;
        }
        v820 v820Var = (v820) obj;
        return this.a.equals(v820Var.a) && this.b == v820Var.b && u890.j(this.c, v820Var.c) && this.d == v820Var.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
