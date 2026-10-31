package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class db30 {
    public final String a;
    public final hux b;
    public final String c;
    public final String d;
    public final long e;
    public final cb30 f;
    public final String g;

    public db30(String str, hux huxVar, String str2, String str3, long j, cb30 cb30Var, String str4) {
        this.a = str;
        this.b = huxVar;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = cb30Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db30)) {
            return false;
        }
        db30 db30Var = (db30) obj;
        if (!this.a.equals(db30Var.a) || !u890.j(this.b, db30Var.b) || !this.c.equals(db30Var.c) || !this.d.equals(db30Var.d)) {
            return false;
        }
        long j = db30Var.e;
        int i = u7h.l;
        return z4h1.b(this.e, j) && u890.j(this.f, db30Var.f) && this.g.equals(db30Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hux huxVar = this.b;
        int iD = cy30.d(cy30.d((iHashCode + (huxVar == null ? 0 : huxVar.hashCode())) * 31, 31, this.c), 31, this.d);
        int i = u7h.l;
        int iF = cy30.f(iD, this.e, 31);
        cb30 cb30Var = this.f;
        return this.g.hashCode() + ((iF + (cb30Var != null ? cb30Var.hashCode() : 0)) * 31);
    }
}
