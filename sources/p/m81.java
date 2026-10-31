package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m81 extends u4p1 {
    public final String c;
    public final String d;
    public final String e;
    public final flr0 f;

    public m81(String str, String str2, String str3, flr0 flr0Var) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = flr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m81)) {
            return false;
        }
        m81 m81Var = (m81) obj;
        return u890.j(this.c, m81Var.c) && u890.j(this.d, m81Var.d) && u890.j(this.e, m81Var.e) && u890.j(this.f, m81Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }
}
