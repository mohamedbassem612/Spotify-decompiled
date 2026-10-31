package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s3k0 implements k4k0 {
    public final azb a;

    public s3k0(azb azbVar) {
        this.a = azbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3k0) && this.a.equals(((s3k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
