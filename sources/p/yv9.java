package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yv9 extends h4p1 {
    public final int c;

    public yv9(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv9) && this.c == ((yv9) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
