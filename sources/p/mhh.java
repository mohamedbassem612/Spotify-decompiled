package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mhh {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final lhh f;
    public final int g;

    public mhh(String str, String str2, String str3, String str4, String str5, lhh lhhVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = lhhVar;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhh)) {
            return false;
        }
        mhh mhhVar = (mhh) obj;
        return this.a.equals(mhhVar.a) && this.b.equals(mhhVar.b) && u890.j(this.c, mhhVar.c) && u890.j(this.d, mhhVar.d) && this.e.equals(mhhVar.e) && this.f.equals(mhhVar.f) && this.g == mhhVar.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(true) + xcg1.g(ab80.k(this.g, (this.f.hashCode() + cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31), 31, true);
    }
}
