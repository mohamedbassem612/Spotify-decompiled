package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xdp0 {
    public final avz0 a;

    public xdp0(avz0 avz0Var) {
        this.a = avz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdp0) && this.a == ((xdp0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrackFingerprint(callback=" + this.a + ")";
    }
}
