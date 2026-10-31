package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bqd0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public bqd0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqd0)) {
            return false;
        }
        bqd0 bqd0Var = (bqd0) obj;
        return this.a == bqd0Var.a && this.b == bqd0Var.b && this.c == bqd0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
