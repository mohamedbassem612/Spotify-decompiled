package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n81 extends u4p1 {
    public final String c;
    public final String d;
    public final String e;
    public final flr0 f;

    public n81(String str, String str2, String str3, flr0 flr0Var) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = flr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n81)) {
            return false;
        }
        n81 n81Var = (n81) obj;
        return u890.j(this.c, n81Var.c) && u890.j(this.d, n81Var.d) && u890.j(this.e, n81Var.e) && u890.j(this.f, n81Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }
}
