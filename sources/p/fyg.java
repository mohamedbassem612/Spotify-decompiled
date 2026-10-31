package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fyg implements iyg {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final u7h g;

    public fyg(String str, String str2, String str3, int i, String str4, boolean z, u7h u7hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = z;
        this.g = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyg)) {
            return false;
        }
        fyg fygVar = (fyg) obj;
        return u890.j(this.a, fygVar.a) && u890.j(this.b, fygVar.b) && this.c.equals(fygVar.c) && this.d == fygVar.d && u890.j(this.e, fygVar.e) && this.f == fygVar.f && u890.j(this.g, fygVar.g);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        int iG = xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        u7h u7hVar = this.g;
        return iG + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0);
    }
}
