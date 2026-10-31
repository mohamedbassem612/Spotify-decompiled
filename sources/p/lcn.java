package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lcn implements tcn {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public lcn(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcn)) {
            return false;
        }
        lcn lcnVar = (lcn) obj;
        return u890.j(this.a, lcnVar.a) && u890.j(this.b, lcnVar.b) && this.c.equals(lcnVar.c) && this.d == lcnVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
