package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q331 {
    public final pbf0 a;
    public final pbf0 b;

    public q331(pbf0 pbf0Var, pbf0 pbf0Var2) {
        this.a = pbf0Var;
        this.b = pbf0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q331)) {
            return false;
        }
        q331 q331Var = (q331) obj;
        return this.a.equals(q331Var.a) && this.b.equals(q331Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
