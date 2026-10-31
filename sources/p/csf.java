package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class csf implements gsf {
    public final pp90 a;

    public csf(pp90 pp90Var) {
        this.a = pp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csf) && this.a.equals(((csf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
