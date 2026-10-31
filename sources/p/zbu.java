package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zbu implements dcu {
    public final long a;

    public zbu(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zbu) && this.a == ((zbu) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
