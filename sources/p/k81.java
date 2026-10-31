package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k81 extends u4p1 {
    public final String c;
    public final String d;
    public final flr0 e;

    public k81(String str, String str2, flr0 flr0Var) {
        this.c = str;
        this.d = str2;
        this.e = flr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k81)) {
            return false;
        }
        k81 k81Var = (k81) obj;
        return u890.j(this.c, k81Var.c) && u890.j(this.d, k81Var.d) && u890.j(this.e, k81Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }
}
