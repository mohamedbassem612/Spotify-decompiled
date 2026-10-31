package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ak11 implements ck11 {
    public final long a;

    public ak11(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak11) && this.a == ((ak11) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
