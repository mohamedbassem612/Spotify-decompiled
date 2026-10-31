package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class znt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public znt(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znt)) {
            return false;
        }
        znt zntVar = (znt) obj;
        return this.a.equals(zntVar.a) && this.b.equals(zntVar.b) && u890.j(this.c, zntVar.c) && u890.j(this.d, zntVar.d) && u890.j(this.e, zntVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
