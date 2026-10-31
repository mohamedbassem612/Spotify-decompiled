package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zx2 implements ay2 {
    public final long a;

    public zx2(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx2) && this.a == ((zx2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
