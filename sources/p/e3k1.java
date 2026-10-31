package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e3k1 {
    public final int a;

    public e3k1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3k1) && this.a == ((e3k1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
