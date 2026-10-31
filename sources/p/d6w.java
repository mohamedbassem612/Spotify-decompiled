package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d6w {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;

    public d6w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6w)) {
            return false;
        }
        d6w d6wVar = (d6w) obj;
        return this.a.equals(d6wVar.a) && this.b.equals(d6wVar.b) && this.c.equals(d6wVar.c) && this.d.equals(d6wVar.d) && u890.j(this.e, d6wVar.e) && u890.j(this.f, d6wVar.f) && u890.j(this.g, d6wVar.g) && u890.j(this.h, d6wVar.h) && u890.j(this.i, d6wVar.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }
}
