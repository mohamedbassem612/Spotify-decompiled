package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uzz implements q600 {
    public final pp90 a;

    public uzz(pp90 pp90Var) {
        this.a = pp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzz) && this.a.equals(((uzz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
