package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cy11 extends b5p1 {
    public final int c;

    public cy11(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cy11) && this.c == ((cy11) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
