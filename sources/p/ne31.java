package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ne31 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ne31(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne31)) {
            return false;
        }
        ne31 ne31Var = (ne31) obj;
        return u890.j(this.a, ne31Var.a) && u890.j(this.b, ne31Var.b) && u890.j(this.c, ne31Var.c) && u890.j(this.d, ne31Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ ne31() {
        this("", null, null, null);
    }
}
