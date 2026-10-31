package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ldh implements mdh {
    public final String a;
    public final String b;
    public final String c;
    public final tv80 d;
    public final Long e;

    public ldh(String str, String str2, String str3, tv80 tv80Var, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tv80Var;
        this.e = l;
    }

    @Override // p.mdh
    public final String a() {
        return this.c;
    }

    @Override // p.sdh
    public final tv80 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldh)) {
            return false;
        }
        ldh ldhVar = (ldh) obj;
        return u890.j(this.a, ldhVar.a) && u890.j(this.b, ldhVar.b) && u890.j(this.c, ldhVar.c) && u890.j(this.d, ldhVar.d) && u890.j(this.e, ldhVar.e);
    }

    @Override // p.mdh
    public final String getContextUri() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        Long l = this.e;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
