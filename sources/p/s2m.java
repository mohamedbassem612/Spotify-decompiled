package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s2m {
    public final String a;
    public final String b;
    public final c380 c;
    public final c380 d;
    public final c380 e;
    public final c380 f;
    public final k620 g;
    public final boolean h;
    public final boolean i;
    public final f2m j;

    public s2m(String str, String str2, c380 c380Var, c380 c380Var2, c380 c380Var3, c380 c380Var4, k620 k620Var, boolean z, boolean z2, f2m f2mVar) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = c380Var2;
        this.e = c380Var3;
        this.f = c380Var4;
        this.g = k620Var;
        this.h = z;
        this.i = z2;
        this.j = f2mVar;
    }

    public static s2m a(s2m s2mVar, String str, c380 c380Var, c380 c380Var2, c380 c380Var3, c380 c380Var4, k620 k620Var, boolean z, f2m f2mVar, int i) {
        String str2 = s2mVar.a;
        if ((i & 2) != 0) {
            str = s2mVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            c380Var = s2mVar.c;
        }
        c380 c380Var5 = c380Var;
        if ((i & 8) != 0) {
            c380Var2 = s2mVar.d;
        }
        return new s2m(str2, str3, c380Var5, c380Var2, (i & 16) != 0 ? s2mVar.e : c380Var3, (i & 32) != 0 ? s2mVar.f : c380Var4, (i & 64) != 0 ? s2mVar.g : k620Var, (i & 128) != 0 ? s2mVar.h : z, (i & 256) != 0 ? s2mVar.i : false, (i & 512) != 0 ? s2mVar.j : f2mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2m)) {
            return false;
        }
        s2m s2mVar = (s2m) obj;
        return u890.j(this.a, s2mVar.a) && this.b.equals(s2mVar.b) && u890.j(this.c, s2mVar.c) && u890.j(this.d, s2mVar.d) && u890.j(this.e, s2mVar.e) && u890.j(this.f, s2mVar.f) && this.g == s2mVar.g && this.h == s2mVar.h && this.i == s2mVar.i && u890.j(this.j, s2mVar.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.g.hashCode() + kk0.f(this.f, kk0.f(this.e, kk0.f(this.d, kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31)) * 31, 31, this.h), 31, this.i);
        f2m f2mVar = this.j;
        return iG + (f2mVar == null ? 0 : f2mVar.hashCode());
    }
}
