package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xh9 implements zh9 {
    public final int a;

    public xh9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh9) && this.a == ((xh9) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
