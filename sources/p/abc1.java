package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class abc1 extends ebc1 {
    public final int a;

    public abc1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abc1) && this.a == ((abc1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
