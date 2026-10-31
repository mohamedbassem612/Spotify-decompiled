package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwh1 {
    public final bro1 a;
    public final boolean b;
    public final String c;

    public wwh1(bro1 bro1Var, boolean z, String str) {
        this.a = bro1Var;
        this.b = z;
        this.c = str;
    }

    public static wwh1 a(wwh1 wwh1Var, bro1 bro1Var, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            bro1Var = wwh1Var.a;
        }
        if ((i & 2) != 0) {
            z = wwh1Var.b;
        }
        if ((i & 4) != 0) {
            str = wwh1Var.c;
        }
        return new wwh1(bro1Var, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwh1)) {
            return false;
        }
        wwh1 wwh1Var = (wwh1) obj;
        return u890.j(this.a, wwh1Var.a) && this.b == wwh1Var.b && u890.j(this.c, wwh1Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
