package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uul implements cwl {
    public final mao a;

    public uul(mao maoVar) {
        this.a = maoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uul) && this.a.equals(((uul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
