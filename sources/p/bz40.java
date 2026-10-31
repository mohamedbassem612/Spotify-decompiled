package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bz40 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public bz40(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz40)) {
            return false;
        }
        bz40 bz40Var = (bz40) obj;
        return u890.j(this.a, bz40Var.a) && u890.j(this.b, bz40Var.b) && this.c == bz40Var.c && u890.j(this.d, bz40Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
