package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hbu0 extends ibu0 {
    public final gjf1 a;
    public final j5u0 b;

    public hbu0(gjf1 gjf1Var, j5u0 j5u0Var) {
        this.a = gjf1Var;
        this.b = j5u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbu0)) {
            return false;
        }
        hbu0 hbu0Var = (hbu0) obj;
        return this.a.equals(hbu0Var.a) && this.b.equals(hbu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
