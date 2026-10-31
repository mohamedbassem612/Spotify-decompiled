package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9c1 extends sio1 {
    public final long c;

    public y9c1(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9c1) && this.c == ((y9c1) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }
}
