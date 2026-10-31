package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vn5 implements xn5 {
    public final int a;

    public vn5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn5) && this.a == ((vn5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + 644280799;
    }
}
