package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hxw {
    public final String a;
    public final String b;
    public final String c;

    public hxw(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxw)) {
            return false;
        }
        hxw hxwVar = (hxw) obj;
        return this.a.equals(hxwVar.a) && this.b.equals(hxwVar.b) && u890.j(this.c, hxwVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return f4i1.f("EmailLinkData(username: ", this.a, ")");
    }
}
