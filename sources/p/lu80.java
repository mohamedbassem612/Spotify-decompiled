package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lu80 extends jm5 {
    public final int d;

    public lu80(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu80) && this.d == ((lu80) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }
}
