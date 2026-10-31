package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class da3 implements fa3 {
    public final int a;

    public da3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da3) && this.a == ((da3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
