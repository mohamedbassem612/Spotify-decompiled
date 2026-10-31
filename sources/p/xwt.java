package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xwt implements bxt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final f0u e;
    public final boolean f;
    public final int g;
    public final zwt h;

    public xwt(String str, String str2, String str3, String str4, f0u f0uVar, boolean z, int i, zwt zwtVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f0uVar;
        this.f = z;
        this.g = i;
        this.h = zwtVar;
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
        if (!(obj instanceof xwt)) {
            return false;
        }
        xwt xwtVar = (xwt) obj;
        return u890.j(this.a, xwtVar.a) && u890.j(this.b, xwtVar.b) && this.c.equals(xwtVar.c) && u890.j(this.d, xwtVar.d) && this.e == xwtVar.e && this.f == xwtVar.f && this.g == xwtVar.g && this.h.equals(xwtVar.h);
    }

    @Override // p.bxt
    public final zwt f() {
        return this.h;
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
        return this.h.hashCode() + ab80.k(this.g, xcg1.g((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31);
    }
}
