package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bst0 {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final int d;

    public bst0(int i, long j, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bst0)) {
            return false;
        }
        bst0 bst0Var = (bst0) obj;
        return this.a == bst0Var.a && this.b == bst0Var.b && this.c == bst0Var.c && this.d == bst0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + cy30.f(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }
}
