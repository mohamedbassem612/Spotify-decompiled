package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pmy extends smy {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final x8d1 e;

    public pmy(String str, String str2, String str3, int i, x8d1 x8d1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = x8d1Var;
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmy)) {
            return false;
        }
        pmy pmyVar = (pmy) obj;
        return this.a.equals(pmyVar.a) && u890.j(this.b, pmyVar.b) && this.c.equals(pmyVar.c) && this.d == pmyVar.d && u890.j(this.e, pmyVar.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        x8d1 x8d1Var = this.e;
        return iF + (x8d1Var == null ? 0 : x8d1Var.hashCode());
    }
}
