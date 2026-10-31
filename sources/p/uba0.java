package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uba0 implements vba0 {
    public final pp90 a;

    public uba0(pp90 pp90Var) {
        this.a = pp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uba0) && this.a.equals(((uba0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
