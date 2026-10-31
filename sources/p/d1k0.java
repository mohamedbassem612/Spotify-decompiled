package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d1k0 implements k1k0 {
    public final v3u a;

    public d1k0(v3u v3uVar) {
        this.a = v3uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1k0) && this.a.equals(((d1k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
