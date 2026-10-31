package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class smt extends umt {
    public final o571 a;
    public final p371 b;
    public final n3o1 c;
    public final String d;
    public final bkc0 e;
    public final ou80 f;

    public smt(o571 o571Var, p371 p371Var, n3o1 n3o1Var, String str, bkc0 bkc0Var, ou80 ou80Var) {
        this.a = o571Var;
        this.b = p371Var;
        this.c = n3o1Var;
        this.d = str;
        this.e = bkc0Var;
        this.f = ou80Var;
    }

    @Override // p.umt
    public final o571 a() {
        return this.a;
    }

    @Override // p.umt
    public final p371 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smt)) {
            return false;
        }
        smt smtVar = (smt) obj;
        return u890.j(this.a, smtVar.a) && u890.j(this.b, smtVar.b) && u890.j(this.c, smtVar.c) && u890.j(this.d, smtVar.d) && u890.j(this.e, smtVar.e) && u890.j(this.f, smtVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        p371 p371Var = this.b;
        int iD = cy30.d((this.c.hashCode() + ((iHashCode + (p371Var == null ? 0 : p371Var.hashCode())) * 31)) * 31, 31, this.d);
        bkc0 bkc0Var = this.e;
        int iHashCode2 = (iD + (bkc0Var == null ? 0 : bkc0Var.hashCode())) * 31;
        ou80 ou80Var = this.f;
        return iHashCode2 + (ou80Var != null ? ou80Var.a.hashCode() : 0);
    }
}
