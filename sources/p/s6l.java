package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s6l implements t6l {
    public final r6l a;
    public final String b;
    public final o6l c;
    public final iyk0 d;
    public final String e;
    public final String f;
    public final boolean g;

    public s6l(r6l r6lVar, String str, o6l o6lVar, iyk0 iyk0Var, String str2, String str3, boolean z, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 32) != 0 ? "" : str2;
        str3 = (i & 64) != 0 ? "" : str3;
        z = (i & 128) != 0 ? false : z;
        this.a = r6lVar;
        this.b = str;
        this.c = o6lVar;
        this.d = iyk0Var;
        this.e = str2;
        this.f = str3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6l)) {
            return false;
        }
        s6l s6lVar = (s6l) obj;
        return u890.j(this.a, s6lVar.a) && u890.j(this.b, s6lVar.b) && this.c.equals(s6lVar.c) && this.d == s6lVar.d && this.e.equals(s6lVar.e) && this.f.equals(s6lVar.f) && this.g == s6lVar.g;
    }

    public final int hashCode() {
        r6l r6lVar = this.a;
        int iHashCode = (r6lVar == null ? 0 : r6lVar.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + cy30.d(cy30.d((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 961)) * 31)) * 31, 31, this.e), 31, this.f);
    }
}
