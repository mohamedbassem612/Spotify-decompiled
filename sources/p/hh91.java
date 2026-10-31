package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hh91 {
    public final cvg1 a;
    public final nh91 b;

    public hh91(cvg1 cvg1Var, nh91 nh91Var) {
        this.a = cvg1Var;
        this.b = nh91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh91)) {
            return false;
        }
        hh91 hh91Var = (hh91) obj;
        return this.a.equals(hh91Var.a) && this.b.equals(hh91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
