package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class som {
    public final String a;
    public final nvm b;
    public final zgo1 c;
    public final String d;
    public final Long e;
    public final Long f;
    public final cvm g;
    public final npm h;

    public som(String str, nvm nvmVar, zgo1 zgo1Var, String str2, Long l, Long l2, cvm cvmVar, npm npmVar) {
        this.a = str;
        this.b = nvmVar;
        this.c = zgo1Var;
        this.d = str2;
        this.e = l;
        this.f = l2;
        this.g = cvmVar;
        this.h = npmVar;
    }

    public final Long a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final zgo1 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof som)) {
            return false;
        }
        som somVar = (som) obj;
        return this.a.equals(somVar.a) && u890.j(this.b, somVar.b) && u890.j(this.c, somVar.c) && u890.j(this.d, somVar.d) && u890.j(this.e, somVar.e) && u890.j(this.f, somVar.f) && this.g == somVar.g && u890.j(this.h, somVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode4 = (this.g.hashCode() + ((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        npm npmVar = this.h;
        return iHashCode4 + (npmVar != null ? npmVar.hashCode() : 0);
    }
}
