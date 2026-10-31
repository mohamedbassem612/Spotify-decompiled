package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zju {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;

    public zju(String str, int i, int i2, int i3, int i4, String str2, String str3, String str4, Boolean bool) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zju)) {
            return false;
        }
        zju zjuVar = (zju) obj;
        return this.a.equals(zjuVar.a) && this.b == zjuVar.b && this.c == zjuVar.c && this.d == zjuVar.d && this.e == zjuVar.e && u890.j(this.f, zjuVar.f) && u890.j(this.g, zjuVar.g) && u890.j(this.h, zjuVar.h) && this.i.equals(zjuVar.i);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        String str = this.f;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return this.i.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
