package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s0b {
    public final xcg a;

    public s0b(xcg xcgVar) {
        this.a = xcgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0b) && this.a.equals(((s0b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
