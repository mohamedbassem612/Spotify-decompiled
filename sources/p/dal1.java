package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dal1 implements eal1 {
    public final int a;

    public dal1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dal1) && this.a == ((dal1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
