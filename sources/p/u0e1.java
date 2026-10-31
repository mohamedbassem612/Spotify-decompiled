package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u0e1 {
    public final chf0 a;
    public final int b;
    public final boolean c;

    public u0e1(chf0 chf0Var, int i, boolean z) {
        this.a = chf0Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0e1)) {
            return false;
        }
        u0e1 u0e1Var = (u0e1) obj;
        return this.a == u0e1Var.a && this.b == u0e1Var.b && this.c == u0e1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
