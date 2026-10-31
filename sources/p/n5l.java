package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n5l {
    public final String a;
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public n5l(String str, int i, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5l)) {
            return false;
        }
        n5l n5lVar = (n5l) obj;
        return this.a.equals(n5lVar.a) && this.b == n5lVar.b && this.c == n5lVar.c && u890.j(this.d, n5lVar.d) && u890.j(this.e, n5lVar.e) && u890.j(this.f, n5lVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
