package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xuc0 {
    public final int a;
    public final String b;
    public final String c;

    public xuc0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuc0)) {
            return false;
        }
        xuc0 xuc0Var = (xuc0) obj;
        return this.a == xuc0Var.a && u890.j(this.b, xuc0Var.b) && u890.j(this.c, xuc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
