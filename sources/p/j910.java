package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j910 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public j910(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j910)) {
            return false;
        }
        j910 j910Var = (j910) obj;
        return this.a == j910Var.a && this.b == j910Var.b && this.c == j910Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
