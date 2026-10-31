package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class od60 implements pd60 {
    public final long a;

    public od60(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od60) && this.a == ((od60) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
