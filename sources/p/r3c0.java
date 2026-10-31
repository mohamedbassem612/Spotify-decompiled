package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r3c0 extends y3c0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public r3c0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3c0)) {
            return false;
        }
        r3c0 r3c0Var = (r3c0) obj;
        return this.a == r3c0Var.a && this.b == r3c0Var.b && this.c == r3c0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
