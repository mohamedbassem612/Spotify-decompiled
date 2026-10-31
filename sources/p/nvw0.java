package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nvw0 extends qvw0 {
    public final long a;

    public nvw0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvw0) && this.a == ((nvw0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
