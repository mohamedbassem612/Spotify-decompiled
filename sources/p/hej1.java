package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hej1 extends iej1 {
    public final int a;

    public hej1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hej1) && this.a == ((hej1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
