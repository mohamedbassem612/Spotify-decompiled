package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eaz implements faz {
    public final long a;

    public eaz(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaz) && this.a == ((eaz) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
