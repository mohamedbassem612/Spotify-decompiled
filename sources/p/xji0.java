package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xji0 {
    public final String a;
    public final String b;
    public final nji0 c;

    public xji0(String str, String str2, nji0 nji0Var) {
        this.a = str;
        this.b = str2;
        this.c = nji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xji0)) {
            return false;
        }
        xji0 xji0Var = (xji0) obj;
        return u890.j(this.a, xji0Var.a) && u890.j(this.b, xji0Var.b) && u890.j(this.c, xji0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
