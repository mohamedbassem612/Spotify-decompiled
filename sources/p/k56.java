package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k56 {
    public final long a;
    public final vmd b;

    public k56(long j, vmd vmdVar) {
        this.a = j;
        this.b = vmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k56)) {
            return false;
        }
        k56 k56Var = (k56) obj;
        return this.a == k56Var.a && this.b.equals(k56Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
