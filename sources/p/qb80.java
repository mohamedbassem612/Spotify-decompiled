package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qb80 {
    public final pb80 a;

    public qb80(pb80 pb80Var) {
        this.a = pb80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb80) && this.a.equals(((qb80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
