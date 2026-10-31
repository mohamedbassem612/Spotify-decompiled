package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class rrn {
    public static final qrn Companion = new qrn();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public /* synthetic */ rrn(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (1023 != (i & 1023)) {
            o6p1.t(i, 1023, prn.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrn)) {
            return false;
        }
        rrn rrnVar = (rrn) obj;
        return u890.j(this.a, rrnVar.a) && u890.j(this.b, rrnVar.b) && u890.j(this.c, rrnVar.c) && u890.j(this.d, rrnVar.d) && u890.j(this.e, rrnVar.e) && u890.j(this.f, rrnVar.f) && u890.j(this.g, rrnVar.g) && u890.j(this.h, rrnVar.h) && u890.j(this.i, rrnVar.i) && u890.j(this.j, rrnVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d(cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public rrn(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
    }
}
