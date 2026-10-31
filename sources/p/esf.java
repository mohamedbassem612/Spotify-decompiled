package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class esf implements gsf {
    public final pp90 a;

    public esf(pp90 pp90Var) {
        this.a = pp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esf) && this.a.equals(((esf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
