package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x5d {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final n1x j;
    public final String k;

    public x5d(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, n1x n1xVar, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = z;
        this.j = n1xVar;
        this.k = str8;
    }

    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5d)) {
            return false;
        }
        x5d x5dVar = (x5d) obj;
        return this.a == x5dVar.a && this.b.equals(x5dVar.b) && this.c.equals(x5dVar.c) && this.d.equals(x5dVar.d) && this.e.equals(x5dVar.e) && this.f.equals(x5dVar.f) && u890.j(this.g, x5dVar.g) && u890.j(this.h, x5dVar.h) && this.i == x5dVar.i && u890.j(this.j, x5dVar.j) && u890.j(this.k, x5dVar.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iG = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        n1x n1xVar = this.j;
        int iHashCode2 = (iG + (n1xVar == null ? 0 : n1xVar.hashCode())) * 31;
        String str3 = this.k;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
