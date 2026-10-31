package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ybl1 implements w8l1 {
    public final String a;
    public final vpl b;
    public final c380 c;
    public final c380 d;
    public final c380 e;
    public final c380 f;
    public final c380 g;
    public final boolean h;
    public final r160 i;
    public final String t;

    public ybl1(String str, vpl vplVar, c9 c9Var, c9 c9Var2, c9 c9Var3, c9 c9Var4, c9 c9Var5, boolean z, r160 r160Var, String str2) {
        this.a = str;
        this.b = vplVar;
        this.c = c9Var;
        this.d = c9Var2;
        this.e = c9Var3;
        this.f = c9Var4;
        this.g = c9Var5;
        this.h = z;
        this.i = r160Var;
        this.t = str2;
    }

    @Override // p.w8l1
    public final vpl a() {
        return this.b;
    }

    @Override // p.w8l1
    public final r160 b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybl1)) {
            return false;
        }
        ybl1 ybl1Var = (ybl1) obj;
        return this.a.equals(ybl1Var.a) && u890.j(this.b, ybl1Var.b) && this.c.equals(ybl1Var.c) && this.d.equals(ybl1Var.d) && this.e.equals(ybl1Var.e) && this.f.equals(ybl1Var.f) && this.g.equals(ybl1Var.g) && this.h == ybl1Var.h && u890.j(this.i, ybl1Var.i) && this.t.equals(ybl1Var.t);
    }

    @Override // p.w8l1
    public final String getItemId() {
        return this.a;
    }

    @Override // p.w8l1
    public final String getUri() {
        return this.t;
    }

    @Override // p.w8l1
    public final vq71 h() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vpl vplVar = this.b;
        int iG = xcg1.g(kk0.f(this.g, kk0.f(this.f, kk0.f(this.e, kk0.f(this.d, kk0.f(this.c, (iHashCode + (vplVar == null ? 0 : vplVar.hashCode())) * 31, 31), 31), 31), 31), 31), 961, this.h);
        r160 r160Var = this.i;
        return cy30.d((iG + (r160Var != null ? r160Var.hashCode() : 0)) * 31, 31, this.t);
    }
}
