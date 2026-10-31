package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ka30 {
    public final short a;

    public final boolean equals(Object obj) {
        if (obj instanceof ka30) {
            return this.a == ((ka30) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "FontWeight(value=" + ((int) this.a) + ')';
    }
}
