package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wek0 {
    public final py21 a;

    public wek0(py21 py21Var) {
        this.a = py21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wek0) && u890.j(this.a, ((wek0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
