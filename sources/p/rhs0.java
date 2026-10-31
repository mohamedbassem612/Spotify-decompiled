package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rhs0 {
    public final boolean a;
    public final boolean b;

    public rhs0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhs0)) {
            return false;
        }
        rhs0 rhs0Var = (rhs0) obj;
        return this.a == rhs0Var.a && this.b == rhs0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
