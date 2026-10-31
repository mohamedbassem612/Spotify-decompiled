package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g6r0 extends x2s {
    public final moy0 b;
    public final i6r0 c;

    public g6r0(moy0 moy0Var, i6r0 i6r0Var) {
        super(bj20.V0);
        this.b = moy0Var;
        this.c = i6r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6r0)) {
            return false;
        }
        g6r0 g6r0Var = (g6r0) obj;
        return u890.j(this.b, g6r0Var.b) && u890.j(this.c, g6r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public /* synthetic */ g6r0(moy0 moy0Var) {
        this(moy0Var, new toy0(moy0Var));
    }
}
