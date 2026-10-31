package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o480 extends x3p1 {
    public final int c;

    public o480(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o480) && this.c == ((o480) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
