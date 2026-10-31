package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zw6 implements dx6 {
    public final long a;

    public zw6(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zw6) && this.a == ((zw6) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
