package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x5b extends m87 {
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;

    public x5b(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = z2;
    }

    public static x5b E(x5b x5bVar, boolean z) {
        return new x5b(x5bVar.e, x5bVar.f, x5bVar.g, x5bVar.h, x5bVar.i, x5bVar.j, z, x5bVar.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5b)) {
            return false;
        }
        x5b x5bVar = (x5b) obj;
        return this.d == x5bVar.d && this.e.equals(x5bVar.e) && u890.j(this.f, x5bVar.f) && u890.j(this.g, x5bVar.g) && u890.j(this.h, x5bVar.h) && u890.j(this.i, x5bVar.i) && u890.j(this.j, x5bVar.j) && this.k == x5bVar.k;
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.d) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
