package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tkl {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public tkl(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkl)) {
            return false;
        }
        tkl tklVar = (tkl) obj;
        return u890.j(this.a, tklVar.a) && u890.j(this.b, tklVar.b) && this.c == tklVar.c && u890.j(this.d, tklVar.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
