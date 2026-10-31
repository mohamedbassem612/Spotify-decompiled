package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z2e1 {
    public final u771 a;
    public final int b;
    public final c3e1 c;

    public z2e1(u771 u771Var, int i, c3e1 c3e1Var) {
        this.a = u771Var;
        this.b = i;
        this.c = c3e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2e1)) {
            return false;
        }
        z2e1 z2e1Var = (z2e1) obj;
        return u890.j(this.a, z2e1Var.a) && this.b == z2e1Var.b && u890.j(this.c, z2e1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
