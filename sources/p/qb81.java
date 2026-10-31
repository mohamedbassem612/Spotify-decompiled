package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qb81 extends zb81 {
    public final String a;
    public final String b;
    public final String c;
    public final eb81 d;

    public qb81(String str, String str2, String str3, eb81 eb81Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = eb81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb81)) {
            return false;
        }
        qb81 qb81Var = (qb81) obj;
        return this.a.equals(qb81Var.a) && this.b.equals(qb81Var.b) && this.c.equals(qb81Var.c) && u890.j(this.d, qb81Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        eb81 eb81Var = this.d;
        return iD + (eb81Var == null ? 0 : eb81Var.hashCode());
    }
}
