package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyg {
    public final String a;
    public final String b;
    public final long c;

    public cyg(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyg)) {
            return false;
        }
        cyg cygVar = (cyg) obj;
        if (!u890.j(this.a, cygVar.a) || !u890.j(this.b, cygVar.b)) {
            return false;
        }
        long j = cygVar.c;
        int i = u7h.l;
        return z4h1.b(this.c, j);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = u7h.l;
        return Long.hashCode(this.c) + iD;
    }
}
