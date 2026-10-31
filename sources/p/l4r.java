package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l4r {
    public final zjd1 a;
    public final int b;
    public final iu30 c;
    public final c4p1 d;
    public final iu30 e;

    public l4r(zjd1 zjd1Var, int i, iu30 iu30Var, c4p1 c4p1Var, iu30 iu30Var2) {
        this.a = zjd1Var;
        this.b = i;
        this.c = iu30Var;
        this.d = c4p1Var;
        this.e = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4r)) {
            return false;
        }
        l4r l4rVar = (l4r) obj;
        return u890.j(this.a, l4rVar.a) && this.b == l4rVar.b && u890.j(this.c, l4rVar.c) && this.d.equals(l4rVar.d) && u890.j(this.e, l4rVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ktd.g(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "DataStatementItem(table=" + this.a + ", outputKind=" + eqq.z(this.b) + ")";
    }
}
