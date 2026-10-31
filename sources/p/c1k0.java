package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c1k0 implements k1k0 {
    public final azb a;

    public c1k0(azb azbVar) {
        this.a = azbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1k0) && this.a.equals(((c1k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
