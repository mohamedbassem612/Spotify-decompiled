package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qb30 {
    public final int a;
    public final c380 b;

    public qb30(int i, c380 c380Var) {
        this.a = i;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb30)) {
            return false;
        }
        qb30 qb30Var = (qb30) obj;
        return this.a == qb30Var.a && this.b.equals(qb30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
