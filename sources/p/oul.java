package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oul implements cwl {
    public final z39 a;

    public oul(z39 z39Var) {
        this.a = z39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oul) && this.a.equals(((oul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
