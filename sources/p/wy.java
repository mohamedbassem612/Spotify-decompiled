package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wy implements l10 {
    public final eln0 a;

    public wy(eln0 eln0Var) {
        this.a = eln0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy) && this.a.equals(((wy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
