package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class db71 extends j0p1 {
    public final int c;

    public db71(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db71) && this.c == ((db71) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
