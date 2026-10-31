package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vet0 {
    public final qet0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public vet0(qet0 qet0Var, boolean z, boolean z2, boolean z3) {
        this.a = qet0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vet0)) {
            return false;
        }
        vet0 vet0Var = (vet0) obj;
        return this.a.equals(vet0Var.a) && this.b == vet0Var.b && this.c == vet0Var.c && this.d == vet0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
