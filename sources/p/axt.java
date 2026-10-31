package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class axt implements bxt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final f0u e;
    public final boolean f;
    public final int g;
    public final int h;
    public final zwt i;

    public axt(String str, String str2, String str3, String str4, f0u f0uVar, boolean z, int i, int i2, zwt zwtVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f0uVar;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = zwtVar;
    }

    @Override // p.bxt
    public final int a() {
        return this.g;
    }

    @Override // p.bxt
    public final String b() {
        return this.c;
    }

    @Override // p.bxt
    public final boolean c() {
        return this.f;
    }

    @Override // p.bxt
    public final String d() {
        return this.b;
    }

    @Override // p.bxt
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axt)) {
            return false;
        }
        axt axtVar = (axt) obj;
        return u890.j(this.a, axtVar.a) && u890.j(this.b, axtVar.b) && this.c.equals(axtVar.c) && u890.j(this.d, axtVar.d) && this.e == axtVar.e && this.f == axtVar.f && this.g == axtVar.g && this.h == axtVar.h && this.i.equals(axtVar.i);
    }

    @Override // p.bxt
    public final zwt f() {
        return this.i;
    }

    @Override // p.bxt
    public final String getName() {
        return this.d;
    }

    @Override // p.bxt
    public final f0u getType() {
        return this.e;
    }

    public final int hashCode() {
        return this.i.hashCode() + ab80.k(this.h, ab80.k(this.g, xcg1.g((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31), 31);
    }
}
