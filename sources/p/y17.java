package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y17 implements b27 {
    public final int a;

    public y17(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y17) && this.a == ((y17) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
