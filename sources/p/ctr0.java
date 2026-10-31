package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ctr0 {
    public final mdg0 a;
    public final cww0 b;
    public final tho1 c;

    public ctr0(mdg0 mdg0Var, cww0 cww0Var, tho1 tho1Var) {
        this.a = mdg0Var;
        this.b = cww0Var;
        this.c = tho1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctr0)) {
            return false;
        }
        ctr0 ctr0Var = (ctr0) obj;
        return this.a == ctr0Var.a && this.b.equals(ctr0Var.b) && this.c.equals(ctr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
