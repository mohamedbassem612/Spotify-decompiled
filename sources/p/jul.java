package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jul implements cwl {
    public final jx6 a;

    public jul(jx6 jx6Var) {
        this.a = jx6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jul) && this.a.equals(((jul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
