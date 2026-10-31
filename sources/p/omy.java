package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class omy extends smy {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final cuu0 e;

    public omy(String str, String str2, String str3, int i, cuu0 cuu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = cuu0Var;
    }

    @Override // p.smy
    public final int a() {
        return this.d;
    }

    @Override // p.smy
    public final String b() {
        return this.a;
    }

    @Override // p.smy
    public final String c() {
        return this.c;
    }

    @Override // p.smy
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omy)) {
            return false;
        }
        omy omyVar = (omy) obj;
        return this.a.equals(omyVar.a) && u890.j(this.b, omyVar.b) && this.c.equals(omyVar.c) && this.d == omyVar.d && this.e.equals(omyVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
