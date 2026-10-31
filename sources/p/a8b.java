package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a8b extends zr7 {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public a8b(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8b)) {
            return false;
        }
        a8b a8bVar = (a8b) obj;
        return u890.j(this.d, a8bVar.d) && u890.j(this.e, a8bVar.e) && u890.j(this.f, a8bVar.f) && u890.j(this.g, a8bVar.g) && this.h.equals(a8bVar.h) && this.i == a8bVar.i && this.j == a8bVar.j && this.k == a8bVar.k;
    }

    public final int hashCode() {
        int iD = cy30.d(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.k) + xcg1.g(xcg1.g(xcg1.g(cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, true);
    }
}
