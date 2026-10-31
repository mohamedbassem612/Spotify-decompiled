package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sm81 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public sm81(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm81)) {
            return false;
        }
        sm81 sm81Var = (sm81) obj;
        return this.a == sm81Var.a && this.b == sm81Var.b && this.c == sm81Var.c && this.d == sm81Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
