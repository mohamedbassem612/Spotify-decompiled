package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sa60 implements yue1 {
    public final c380 X;
    public final String a;
    public final String b;
    public final d761 c;
    public final qc60 d;
    public final f371 e;
    public final o960 f;
    public final String g;
    public final p960 h;
    public final q960 i;
    public final String t;

    public sa60(String str, String str2, d761 d761Var, qc60 qc60Var, f371 f371Var, o960 o960Var, String str3, p960 p960Var, q960 q960Var, String str4, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = d761Var;
        this.d = qc60Var;
        this.e = f371Var;
        this.f = o960Var;
        this.g = str3;
        this.h = p960Var;
        this.i = q960Var;
        this.t = str4;
        this.X = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa60)) {
            return false;
        }
        sa60 sa60Var = (sa60) obj;
        return this.a.equals(sa60Var.a) && this.b.equals(sa60Var.b) && this.c.equals(sa60Var.c) && this.d.equals(sa60Var.d) && this.e.equals(sa60Var.e) && this.f.equals(sa60Var.f) && u890.j(this.g, sa60Var.g) && this.h.equals(sa60Var.h) && u890.j(this.i, sa60Var.i) && this.t.equals(sa60Var.t) && u890.j(this.X, sa60Var.X);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ktd.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c.a, 31)) * 31)) * 31)) * 31;
        String str = this.g;
        int iHashCode2 = (this.h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        q960 q960Var = this.i;
        return this.X.hashCode() + cy30.d((iHashCode2 + (q960Var != null ? q960Var.hashCode() : 0)) * 31, 31, this.t);
    }
}
