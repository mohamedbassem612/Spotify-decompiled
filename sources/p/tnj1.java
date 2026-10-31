package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tnj1 extends d3p1 {
    public final int c;

    public tnj1(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnj1) && this.c == ((tnj1) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
