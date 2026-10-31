package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hvq0 {
    public final ivq0 a;
    public final boolean b;

    public hvq0(ivq0 ivq0Var, boolean z) {
        this.a = ivq0Var;
        this.b = z;
    }

    public final ivq0 a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvq0)) {
            return false;
        }
        hvq0 hvq0Var = (hvq0) obj;
        return this.a == hvq0Var.a && this.b == hvq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
