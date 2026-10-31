package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wd50 {
    public final yon1 a;
    public final cpn1 b;

    public wd50(yon1 yon1Var, cpn1 cpn1Var) {
        this.a = yon1Var;
        this.b = cpn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd50)) {
            return false;
        }
        wd50 wd50Var = (wd50) obj;
        return this.a.equals(wd50Var.a) && this.b.equals(wd50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
