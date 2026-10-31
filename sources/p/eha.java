package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eha extends fha {
    public final long a;

    public eha(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eha) && this.a == ((eha) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
