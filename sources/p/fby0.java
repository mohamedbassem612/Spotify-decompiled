package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fby0 extends hby0 {
    public final wkt a;

    public fby0(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fby0) && this.a.equals(((fby0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
