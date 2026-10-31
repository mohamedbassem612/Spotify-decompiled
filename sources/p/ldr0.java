package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ldr0 extends prn1 {
    public final le20 b;
    public final bnv0 c;

    public ldr0(le20 le20Var, bnv0 bnv0Var) {
        this.b = le20Var;
        this.c = bnv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldr0)) {
            return false;
        }
        ldr0 ldr0Var = (ldr0) obj;
        return this.b.equals(ldr0Var.b) && this.c.equals(ldr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
