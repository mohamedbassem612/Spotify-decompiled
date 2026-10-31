package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yjk1 implements ybj1 {
    public final int a;

    public yjk1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjk1) && this.a == ((yjk1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
