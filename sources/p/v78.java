package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v78 implements w78 {
    public final long a;

    public v78(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v78) && this.a == ((v78) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
