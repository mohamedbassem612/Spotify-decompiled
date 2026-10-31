package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kdr0 extends prn1 {
    public final le20 b;
    public final bnv0 c;

    public kdr0(le20 le20Var, bnv0 bnv0Var) {
        this.b = le20Var;
        this.c = bnv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdr0)) {
            return false;
        }
        kdr0 kdr0Var = (kdr0) obj;
        return this.b.equals(kdr0Var.b) && this.c.equals(kdr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
