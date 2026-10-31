package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zfk extends nln {
    public final String e;
    public final String f;
    public final String g;
    public final tv80 h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final k6k m;

    public zfk(String str, String str2, String str3, tv80 tv80Var, String str4, String str5, String str6, String str7, k6k k6kVar) {
        super((byte) 4);
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = tv80Var;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = k6kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfk)) {
            return false;
        }
        zfk zfkVar = (zfk) obj;
        return u890.j(this.e, zfkVar.e) && this.f.equals(zfkVar.f) && this.g.equals(zfkVar.g) && u890.j(this.h, zfkVar.h) && this.i.equals(zfkVar.i) && u890.j(this.j, zfkVar.j) && this.k.equals(zfkVar.k) && u890.j(this.l, zfkVar.l) && u890.j(this.m, zfkVar.m);
    }

    public final int hashCode() {
        int iD = cy30.d((this.h.hashCode() + cy30.d(cy30.d(this.e.hashCode() * 31, 31, this.f), 31, this.g)) * 31, 31, this.i);
        String str = this.j;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.k);
        String str2 = this.l;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        k6k k6kVar = this.m;
        return iHashCode + (k6kVar != null ? k6kVar.hashCode() : 0);
    }
}
