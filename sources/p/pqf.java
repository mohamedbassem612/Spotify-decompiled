package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pqf extends rwo1 {
    public final zzq0 b;

    public pqf(zzq0 zzq0Var) {
        this.b = zzq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqf) && this.b.equals(((pqf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
