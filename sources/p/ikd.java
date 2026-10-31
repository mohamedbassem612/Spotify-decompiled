package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ikd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final sid e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public ikd(String str, String str2, String str3, String str4, sid sidVar, String str5, String str6, String str7, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = sidVar;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = z;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikd)) {
            return false;
        }
        ikd ikdVar = (ikd) obj;
        return this.a.equals(ikdVar.a) && u890.j(this.b, ikdVar.b) && u890.j(this.c, ikdVar.c) && this.d.equals(ikdVar.d) && this.e == ikdVar.e && u890.j(this.f, ikdVar.f) && u890.j(this.g, ikdVar.g) && u890.j(this.h, ikdVar.h) && this.i == ikdVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (this.e.hashCode() + cy30.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d)) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
