package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p8f1 {
    public final n8f1 a;
    public final boolean b;
    public final boolean c;

    public p8f1(n8f1 n8f1Var, boolean z, boolean z2) {
        this.a = n8f1Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8f1)) {
            return false;
        }
        p8f1 p8f1Var = (p8f1) obj;
        return this.a.equals(p8f1Var.a) && this.b == p8f1Var.b && this.c == p8f1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
