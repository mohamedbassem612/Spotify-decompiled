package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eie1 implements rij0 {
    public final long a;

    public eie1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && eie1.class == obj.getClass() && this.a == ((eie1) obj).a;
    }

    public final int hashCode() {
        return anm1.z(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
