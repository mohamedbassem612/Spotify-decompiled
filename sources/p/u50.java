package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u50 extends v50 {
    public final int c;

    public u50(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u50) && this.c == ((u50) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
