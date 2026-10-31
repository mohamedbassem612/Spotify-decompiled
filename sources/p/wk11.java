package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wk11 {
    public final String a;
    public final h290 b;
    public final al11 c;

    public wk11(String str, h290 h290Var, al11 al11Var) {
        this.a = str;
        this.b = h290Var;
        this.c = al11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk11)) {
            return false;
        }
        wk11 wk11Var = (wk11) obj;
        return this.a.equals(wk11Var.a) && this.b.equals(wk11Var.b) && this.c.equals(wk11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.g(this.b, this.a.hashCode() * 31, 31);
    }
}
