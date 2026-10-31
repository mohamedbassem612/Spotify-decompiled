package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xdj0 extends ydj0 {
    public final String a;
    public final String b;
    public final wnw0 c;

    public xdj0(String str, String str2, wnw0 wnw0Var) {
        this.a = str;
        this.b = str2;
        this.c = wnw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdj0)) {
            return false;
        }
        xdj0 xdj0Var = (xdj0) obj;
        return u890.j(this.a, xdj0Var.a) && this.b.equals(xdj0Var.b) && this.c == xdj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
