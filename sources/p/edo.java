package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class edo implements gdo {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ki0 e;
    public final i6h1 f;

    public edo(String str, String str2, String str3, String str4, ki0 ki0Var, i6h1 i6h1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ki0Var;
        this.f = i6h1Var;
    }

    @Override // p.gdo
    public final i6h1 a() {
        return this.f;
    }

    @Override // p.gdo
    public final ki0 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edo)) {
            return false;
        }
        edo edoVar = (edo) obj;
        return u890.j(this.a, edoVar.a) && u890.j(this.b, edoVar.b) && u890.j(this.c, edoVar.c) && u890.j(this.d, edoVar.d) && u890.j(this.e, edoVar.e) && u890.j(this.f, edoVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ki0 ki0Var = this.e;
        int iHashCode5 = (iHashCode4 + (ki0Var == null ? 0 : ki0Var.hashCode())) * 31;
        i6h1 i6h1Var = this.f;
        return iHashCode5 + (i6h1Var != null ? i6h1Var.hashCode() : 0);
    }
}
