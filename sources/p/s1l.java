package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s1l {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public s1l(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1l)) {
            return false;
        }
        s1l s1lVar = (s1l) obj;
        return u890.j(this.a, s1lVar.a) && u890.j(this.b, s1lVar.b) && u890.j(this.c, s1lVar.c) && this.d == s1lVar.d && this.e == s1lVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        int i = this.d;
        int iC = (iHashCode3 + (i == 0 ? 0 : l1d.C(i))) * 31;
        int i2 = this.e;
        return iC + (i2 != 0 ? l1d.C(i2) : 0);
    }
}
