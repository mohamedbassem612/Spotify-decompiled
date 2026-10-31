package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u4z {
    public final mdz a;
    public final xkk1 b;
    public final jo70 c;
    public final zoy0 d;

    public u4z(mdz mdzVar, xkk1 xkk1Var, jo70 jo70Var, zoy0 zoy0Var) {
        this.a = mdzVar;
        this.b = xkk1Var;
        this.c = jo70Var;
        this.d = zoy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4z)) {
            return false;
        }
        u4z u4zVar = (u4z) obj;
        return this.a.equals(u4zVar.a) && u890.j(this.b, u4zVar.b) && u890.j(this.c, u4zVar.c) && u890.j(this.d, u4zVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        jo70 jo70Var = this.c;
        int iHashCode3 = (iHashCode2 + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        zoy0 zoy0Var = this.d;
        return iHashCode3 + (zoy0Var != null ? zoy0Var.hashCode() : 0);
    }
}
