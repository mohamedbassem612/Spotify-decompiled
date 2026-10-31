package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jx21 extends ryn1 {
    public final int c;

    public jx21(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx21) && this.c == ((jx21) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
