package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h7r {
    public final String a;
    public final int b;

    public h7r(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7r)) {
            return false;
        }
        h7r h7rVar = (h7r) obj;
        return this.a.equals(h7rVar.a) && this.b == h7rVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
