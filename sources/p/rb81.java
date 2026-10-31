package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rb81 extends zb81 {
    public final String a;
    public final String b;
    public final String c;
    public final h290 d;
    public final eb81 e;
    public final eb81 f;
    public final db81 g;

    public rb81(String str, String str2, String str3, h290 h290Var, eb81 eb81Var, eb81 eb81Var2, db81 db81Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = h290Var;
        this.e = eb81Var;
        this.f = eb81Var2;
        this.g = db81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb81)) {
            return false;
        }
        rb81 rb81Var = (rb81) obj;
        return this.a.equals(rb81Var.a) && this.b.equals(rb81Var.b) && u890.j(this.c, rb81Var.c) && this.d.equals(rb81Var.d) && u890.j(this.e, rb81Var.e) && u890.j(this.f, rb81Var.f) && u890.j(this.g, rb81Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = kk0.g(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        eb81 eb81Var = this.e;
        int iHashCode = (iG + (eb81Var == null ? 0 : eb81Var.hashCode())) * 31;
        eb81 eb81Var2 = this.f;
        int iHashCode2 = (iHashCode + (eb81Var2 == null ? 0 : eb81Var2.hashCode())) * 31;
        db81 db81Var = this.g;
        return iHashCode2 + (db81Var != null ? db81Var.hashCode() : 0);
    }
}
