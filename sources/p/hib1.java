package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hib1 implements chu {
    public final fq0 a;
    public final int b;

    public hib1(fq0 fq0Var, int i) {
        this.a = fq0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hib1)) {
            return false;
        }
        hib1 hib1Var = (hib1) obj;
        return this.a.equals(hib1Var.a) && this.b == hib1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
