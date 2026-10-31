package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ko81 extends s9p1 {
    public final boolean c;

    public ko81(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko81) && this.c == ((ko81) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
