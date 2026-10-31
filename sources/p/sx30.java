package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sx30 {
    public final String a;
    public final hux b;
    public final int c;

    public sx30(String str, hux huxVar, int i) {
        this.a = str;
        this.b = huxVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx30)) {
            return false;
        }
        sx30 sx30Var = (sx30) obj;
        return this.a.equals(sx30Var.a) && u890.j(this.b, sx30Var.b) && this.c == sx30Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + eqq.k(this.a.hashCode() * 31, 31, this.b);
    }
}
