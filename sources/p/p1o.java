package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p1o {
    public final o2o a;
    public final xkk1 b;
    public final jo70 c;

    public p1o(o2o o2oVar, xkk1 xkk1Var, jo70 jo70Var) {
        this.a = o2oVar;
        this.b = xkk1Var;
        this.c = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1o)) {
            return false;
        }
        p1o p1oVar = (p1o) obj;
        return u890.j(this.a, p1oVar.a) && u890.j(this.b, p1oVar.b) && u890.j(this.c, p1oVar.c);
    }

    public final int hashCode() {
        o2o o2oVar = this.a;
        int iHashCode = (o2oVar == null ? 0 : o2oVar.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        jo70 jo70Var = this.c;
        return iHashCode2 + (jo70Var != null ? jo70Var.hashCode() : 0);
    }
}
