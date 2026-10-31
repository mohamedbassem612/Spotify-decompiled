package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k060 {
    public final int a;

    public k060(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k060) && this.a == ((k060) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
