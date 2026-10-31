package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g2k0 implements k4k0 {
    public final jez a;

    public g2k0(jez jezVar) {
        this.a = jezVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2k0) && this.a == ((g2k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
