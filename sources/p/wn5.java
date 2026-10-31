package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wn5 implements xn5 {
    public final int a;

    public wn5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn5) && this.a == ((wn5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + 644280799;
    }
}
