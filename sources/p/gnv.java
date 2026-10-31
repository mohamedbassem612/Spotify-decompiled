package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gnv implements jnv {
    public final fnv a;

    public gnv(fnv fnvVar) {
        this.a = fnvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnv) && this.a.equals(((gnv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
