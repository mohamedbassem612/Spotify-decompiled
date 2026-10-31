package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bou implements dou {
    public final boolean a;
    public final boolean b;
    public final c380 c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public bou(boolean z, boolean z2, c380 c380Var, String str, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = z;
        this.b = z2;
        this.c = c380Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
    }

    @Override // p.dou
    public final boolean a() {
        return this.h;
    }

    @Override // p.dou
    public final boolean b() {
        return this.g;
    }

    @Override // p.dou
    public final boolean c() {
        return this.k;
    }

    @Override // p.dou
    public final boolean d() {
        return this.j;
    }

    @Override // p.dou
    public final boolean e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bou)) {
            return false;
        }
        bou bouVar = (bou) obj;
        return this.a == bouVar.a && this.b == bouVar.b && u890.j(this.c, bouVar.c) && this.d.equals(bouVar.d) && this.e.equals(bouVar.e) && this.f.equals(bouVar.f) && this.g == bouVar.g && this.h == bouVar.h && this.i == bouVar.i && this.j == bouVar.j && this.k == bouVar.k && this.l == bouVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(kk0.f(this.c, xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
