package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d9z implements zqw {
    public final lik1 a;
    public final yzc0 b;
    public final String c;
    public final nm1 d;
    public final tu11 e;
    public final qep f;
    public final me30 g;
    public final boolean h;
    public final boolean i;
    public final otu j;
    public final o860 k;
    public final i5y0 l;
    public final np4 m;
    public final m381 n;
    public final jzm o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o3r f8p;
    public final o3r q;
    public final o3r r;

    public d9z(d0r d0rVar, lik1 lik1Var, yzc0 yzc0Var, String str, yzu yzuVar, hyy0 hyy0Var, nm1 nm1Var, tu11 tu11Var, qep qepVar, me30 me30Var, boolean z, boolean z2, otu otuVar, o860 o860Var, i5y0 i5y0Var, np4 np4Var) {
        this.a = lik1Var;
        this.b = yzc0Var;
        this.c = str;
        this.d = nm1Var;
        this.e = tu11Var;
        this.f = qepVar;
        this.g = me30Var;
        this.h = z;
        this.i = z2;
        this.j = otuVar;
        this.k = o860Var;
        this.l = i5y0Var;
        this.m = np4Var;
        this.n = z ? new lls0(z2) : new t0b((byte) 1);
        this.o = new jzm(this, hyy0Var, d0rVar, yzuVar, (byte) 14);
        this.f8p = w3p1.o(new l4r(pwc0.b, 2, i7z.a1, new j4r(i7z.Y0), i7z.b1), i7z.Z0);
        l4r l4rVar = new l4r(pwc0.v, 2, i7z.c1, new j4r(i7z.W0), i7z.d1);
        pwc0 pwc0Var = pwc0.D;
        this.q = w3p1.n(l4rVar, new l4r(pwc0Var, 2, i7z.e1, new j4r(i7z.X0), c9z.b), yty.N0);
        this.r = w3p1.o(new l4r(pwc0Var, 2, c9z.c, new j4r(c9z.e), c9z.d), c9z.f);
    }

    @Override // p.zqw
    public final m381 c() {
        return this.n;
    }

    @Override // p.zqw
    public final boolean d(hwq hwqVar) {
        zuc0 zuc0Var;
        tu00 tu00Var;
        dxc0 dxc0VarA;
        zuc0 zuc0Var2;
        l7e0 l7e0Var = hwqVar.g;
        if (!this.h) {
            String uri = l7e0Var.getUri();
            j7e0 j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
            mtl mtlVar = (j7e0Var == null || (zuc0Var = j7e0Var.a) == null || (tu00Var = zuc0Var.q) == null) ? null : (mtl) tu00Var.a(mtl.class);
            if (eqn1.N(uri)) {
                if ((mtlVar != null ? mtlVar.a : null) != ktl.b) {
                    return true;
                }
            }
            return false;
        }
        j7e0 j7e0Var2 = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
        tu00 tu00Var2 = (j7e0Var2 == null || (zuc0Var2 = j7e0Var2.a) == null) ? null : zuc0Var2.q;
        if (eqn1.O(l7e0Var.getUri(), this.i)) {
            mtl mtlVar2 = tu00Var2 != null ? (mtl) tu00Var2.a(mtl.class) : null;
            if ((mtlVar2 != null ? mtlVar2.a : null) == ktl.c) {
                return true;
            }
            if (tu00Var2 != null && (dxc0VarA = tu00Var2.a(dxc0.class)) != null && fno1.j(dxc0VarA)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.zqw
    public final Function0 e() {
        return this.o;
    }
}
