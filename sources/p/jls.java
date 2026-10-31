package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jls implements lls {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final gls e;

    public jls(String str, boolean z, String str2, String str3, gls glsVar) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = glsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jls)) {
            return false;
        }
        jls jlsVar = (jls) obj;
        return u890.j(this.a, jlsVar.a) && this.b == jlsVar.b && u890.j(this.c, jlsVar.c) && u890.j(this.d, jlsVar.d) && this.e.equals(jlsVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
