package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ln81 extends nn81 {
    public final int a;

    public ln81(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln81) && this.a == ((ln81) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
