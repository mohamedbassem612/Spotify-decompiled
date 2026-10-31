package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yfn0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public yfn0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfn0)) {
            return false;
        }
        yfn0 yfn0Var = (yfn0) obj;
        return this.a == yfn0Var.a && this.b == yfn0Var.b && this.c == yfn0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
