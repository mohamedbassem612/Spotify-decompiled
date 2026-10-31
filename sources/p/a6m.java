package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a6m extends e6m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a6m(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6m)) {
            return false;
        }
        a6m a6mVar = (a6m) obj;
        return this.a.equals(a6mVar.a) && this.b.equals(a6mVar.b) && u890.j(this.c, a6mVar.c) && u890.j(this.d, a6mVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
