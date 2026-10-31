package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vim {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public vim(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vim)) {
            return false;
        }
        vim vimVar = (vim) obj;
        if (!u890.j(this.a, vimVar.a) || !u890.j(this.b, vimVar.b) || !u890.j(this.c, vimVar.c)) {
            return false;
        }
        long j = vimVar.d;
        int i = u7h.l;
        return z4h1.b(this.d, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i = u7h.l;
        return Long.hashCode(this.d) + iHashCode3;
    }
}
