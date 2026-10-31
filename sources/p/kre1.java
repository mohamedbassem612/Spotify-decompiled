package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kre1 extends pdp1 {
    public final int c;

    public kre1(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kre1) && this.c == ((kre1) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
