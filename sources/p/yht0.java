package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yht0 implements eit0 {
    public final int a;

    public yht0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yht0) && this.a == ((yht0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
