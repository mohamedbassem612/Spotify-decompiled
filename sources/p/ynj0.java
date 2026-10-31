package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ynj0 {
    public final jo70 a;
    public final xkk1 b;
    public final zoy0 c;

    public ynj0(jo70 jo70Var, xkk1 xkk1Var, zoy0 zoy0Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = zoy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynj0)) {
            return false;
        }
        ynj0 ynj0Var = (ynj0) obj;
        return this.a.equals(ynj0Var.a) && u890.j(this.b, ynj0Var.b) && u890.j(this.c, ynj0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        zoy0 zoy0Var = this.c;
        return iHashCode2 + (zoy0Var != null ? zoy0Var.hashCode() : 0);
    }
}
