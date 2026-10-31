package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cz6 {
    public final jo70 a;
    public final xkk1 b;
    public final qxc0 c;
    public final qxc0 d;

    public cz6(jo70 jo70Var, xkk1 xkk1Var, qxc0 qxc0Var, qxc0 qxc0Var2) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = qxc0Var;
        this.d = qxc0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz6)) {
            return false;
        }
        cz6 cz6Var = (cz6) obj;
        return u890.j(this.a, cz6Var.a) && u890.j(this.b, cz6Var.b) && u890.j(this.c, cz6Var.c) && u890.j(this.d, cz6Var.d);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        qxc0 qxc0Var = this.c;
        int iHashCode3 = (iHashCode2 + (qxc0Var == null ? 0 : qxc0Var.hashCode())) * 31;
        qxc0 qxc0Var2 = this.d;
        return iHashCode3 + (qxc0Var2 != null ? qxc0Var2.hashCode() : 0);
    }
}
