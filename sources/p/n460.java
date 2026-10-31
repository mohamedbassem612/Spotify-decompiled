package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n460 {
    public final s460 a;
    public final k3h1 b;

    public n460(s460 s460Var, k3h1 k3h1Var) {
        this.a = s460Var;
        this.b = k3h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n460)) {
            return false;
        }
        n460 n460Var = (n460) obj;
        return this.a.equals(n460Var.a) && this.b.equals(n460Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.b) + ((this.a.hashCode() + 15262386) * 31);
    }
}
