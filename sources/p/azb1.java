package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class azb1 {
    public final boolean a;
    public final ub10 b;
    public final boolean c;

    public azb1(boolean z, ub10 ub10Var, boolean z2) {
        this.a = z;
        this.b = ub10Var;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azb1)) {
            return false;
        }
        azb1 azb1Var = (azb1) obj;
        return this.a == azb1Var.a && this.b.equals(azb1Var.b) && this.c == azb1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
