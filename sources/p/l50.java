package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l50 extends czo1 {
    public final int c;

    public l50(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l50) && this.c == ((l50) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
