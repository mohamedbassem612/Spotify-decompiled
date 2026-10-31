package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fq61 implements hq61 {
    public final iu30 a;
    public final vu30 b;

    public fq61(iu30 iu30Var, vu30 vu30Var) {
        this.a = iu30Var;
        this.b = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq61)) {
            return false;
        }
        fq61 fq61Var = (fq61) obj;
        return this.a.equals(fq61Var.a) && this.b.equals(fq61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
