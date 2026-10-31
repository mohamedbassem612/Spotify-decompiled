package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class btm0 implements etm0 {
    public final long a;

    public btm0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btm0) && this.a == ((btm0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
