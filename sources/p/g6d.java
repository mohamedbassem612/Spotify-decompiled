package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g6d {
    public final String a;
    public final int b;

    public g6d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6d)) {
            return false;
        }
        g6d g6dVar = (g6d) obj;
        return this.a.equals(g6dVar.a) && this.b == g6dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
