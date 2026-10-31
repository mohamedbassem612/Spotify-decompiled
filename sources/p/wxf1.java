package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wxf1 implements ayf1 {
    public final long a;

    public wxf1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxf1) && this.a == ((wxf1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
