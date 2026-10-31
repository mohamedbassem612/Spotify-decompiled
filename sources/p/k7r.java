package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k7r {
    public final String a;
    public final int b;

    public k7r(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7r)) {
            return false;
        }
        k7r k7rVar = (k7r) obj;
        return this.a.equals(k7rVar.a) && this.b == k7rVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
