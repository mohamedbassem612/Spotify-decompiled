package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qbn0 {
    public final jo70 a;
    public final xkk1 b;
    public final pjw0 c;

    public qbn0(jo70 jo70Var, xkk1 xkk1Var, pjw0 pjw0Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = pjw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbn0)) {
            return false;
        }
        qbn0 qbn0Var = (qbn0) obj;
        return this.a.equals(qbn0Var.a) && u890.j(this.b, qbn0Var.b) && this.c.equals(qbn0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return this.c.hashCode() + ((iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31);
    }
}
