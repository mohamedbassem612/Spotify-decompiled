package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r521 implements s521 {
    public final int a;

    public r521(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r521) && this.a == ((r521) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
