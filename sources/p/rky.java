package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rky {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final qtt0 g;

    public rky(String str, String str2, String str3, String str4, String str5, int i, qtt0 qtt0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = qtt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rky)) {
            return false;
        }
        rky rkyVar = (rky) obj;
        return u890.j(this.a, rkyVar.a) && u890.j(this.b, rkyVar.b) && this.c.equals(rkyVar.c) && this.d.equals(rkyVar.d) && u890.j(this.e, rkyVar.e) && this.f == rkyVar.f && this.g == rkyVar.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + ab80.k(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
