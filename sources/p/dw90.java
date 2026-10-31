package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dw90 implements fw90 {
    public final int a;

    public dw90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dw90) && this.a == ((dw90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
