package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xje0 extends e9p1 {
    public final int c;

    public xje0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xje0) && this.c == ((xje0) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
