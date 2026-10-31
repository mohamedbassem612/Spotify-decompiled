package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hf5 {
    public final a2i a;
    public final km61 b;

    public hf5(a2i a2iVar, km61 km61Var) {
        this.a = a2iVar;
        this.b = km61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hf5) {
            hf5 hf5Var = (hf5) obj;
            return u890.j(this.a, hf5Var.a) && this.b == hf5Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
