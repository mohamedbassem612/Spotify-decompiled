package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iqk implements lm01 {
    public final String a;
    public final d8r0 b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public iqk(String str, d8r0 d8r0Var, String str2, String str3, int i, boolean z) {
        this.a = str;
        this.b = d8r0Var;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = z;
    }

    @Override // p.lm01
    public final d8r0 a() {
        return this.b;
    }

    @Override // p.lm01
    public final String b() {
        return this.d;
    }

    @Override // p.lm01
    public final boolean d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqk)) {
            return false;
        }
        iqk iqkVar = (iqk) obj;
        return this.a.equals(iqkVar.a) && this.b.equals(iqkVar.b) && u890.j(this.c, iqkVar.c) && u890.j(this.d, iqkVar.d) && this.e == iqkVar.e && this.f == iqkVar.f;
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    @Override // p.lm01
    public final int getPosition() {
        return this.e;
    }

    @Override // p.lm01
    public final String getUri() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kaa0.f(this.e, cy30.d(cy30.d(hrt.i(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31);
    }
}
