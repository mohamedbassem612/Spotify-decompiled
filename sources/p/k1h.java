package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k1h implements v1h {
    public final int a;

    public k1h(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1h) && this.a == ((k1h) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
