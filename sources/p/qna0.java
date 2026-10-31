package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qna0 implements rna0 {
    public final long a;

    public qna0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qna0) && this.a == ((qna0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
