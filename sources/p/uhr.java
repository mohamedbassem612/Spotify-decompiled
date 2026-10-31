package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uhr extends r6p1 {
    public final int c;

    public uhr(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhr) && this.c == ((uhr) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
