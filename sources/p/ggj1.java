package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ggj1 {
    public final jo70 a;
    public final xkk1 b;
    public final xkk1 c;

    public ggj1(jo70 jo70Var, xkk1 xkk1Var, xkk1 xkk1Var2) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = xkk1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggj1)) {
            return false;
        }
        ggj1 ggj1Var = (ggj1) obj;
        return this.a.equals(ggj1Var.a) && this.b.equals(ggj1Var.b) && u890.j(this.c, ggj1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        xkk1 xkk1Var = this.c;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
