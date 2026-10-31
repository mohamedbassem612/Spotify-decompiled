package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s87 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public s87(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s87)) {
            return false;
        }
        s87 s87Var = (s87) obj;
        return this.a == s87Var.a && this.b == s87Var.b && this.c == s87Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
