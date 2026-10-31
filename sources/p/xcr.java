package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xcr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public xcr(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcr)) {
            return false;
        }
        xcr xcrVar = (xcr) obj;
        return this.a.equals(xcrVar.a) && this.b.equals(xcrVar.b) && u890.j(this.c, xcrVar.c) && u890.j(this.d, xcrVar.d) && this.e.equals(xcrVar.e) && this.f.equals(xcrVar.f) && u890.j(this.g, xcrVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iD2 = cy30.d(cy30.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
        String str3 = this.g;
        return iD2 + (str3 != null ? str3.hashCode() : 0);
    }
}
