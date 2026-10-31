package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ya0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public ya0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya0)) {
            return false;
        }
        ya0 ya0Var = (ya0) obj;
        return u890.j(this.a, ya0Var.a) && this.b.equals(ya0Var.b) && this.c == ya0Var.c && u890.j(this.d, ya0Var.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
