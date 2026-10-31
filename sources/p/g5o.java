package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g5o {
    public final e5o a;
    public final String b;

    public g5o(e5o e5oVar, String str) {
        this.a = e5oVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5o)) {
            return false;
        }
        g5o g5oVar = (g5o) obj;
        return this.a.equals(g5oVar.a) && u890.j(this.b, g5oVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
