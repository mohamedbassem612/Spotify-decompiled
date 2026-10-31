package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h7e {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final e7e e;

    public h7e(String str, String str2, int i, String str3, e7e e7eVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = e7eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7e)) {
            return false;
        }
        h7e h7eVar = (h7e) obj;
        return u890.j(this.a, h7eVar.a) && u890.j(this.b, h7eVar.b) && this.c == h7eVar.c && u890.j(this.d, h7eVar.d) && u890.j(this.e, h7eVar.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        e7e e7eVar = this.e;
        return iHashCode + (e7eVar != null ? e7eVar.hashCode() : 0);
    }
}
