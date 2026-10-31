package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h7d {
    public final String a;
    public final String b;

    public h7d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7d)) {
            return false;
        }
        h7d h7dVar = (h7d) obj;
        return this.a.equals(h7dVar.a) && this.b.equals(h7dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
