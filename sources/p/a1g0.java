package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a1g0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public a1g0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1g0)) {
            return false;
        }
        a1g0 a1g0Var = (a1g0) obj;
        return this.a == a1g0Var.a && this.b == a1g0Var.b && this.c == a1g0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
