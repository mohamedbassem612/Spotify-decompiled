package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mkd {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public mkd(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkd)) {
            return false;
        }
        mkd mkdVar = (mkd) obj;
        return this.a.equals(mkdVar.a) && this.b == mkdVar.b && this.c == mkdVar.c && u890.j(this.d, mkdVar.d) && u890.j(this.e, mkdVar.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
