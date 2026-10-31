package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ig31 implements xpw {
    public final psw N0;
    public final s880 X;
    public final rey0 Y;
    public final ia00 Z;
    public final lzn0 a;
    public final hyy0 b;
    public final z201 c;
    public final sve d;
    public final lgq e;
    public final mgq f;
    public final h4q g;
    public final kgq h;
    public final ngs0 i;
    public final add t;

    public ig31(lzn0 lzn0Var, hyy0 hyy0Var, z201 z201Var, sve sveVar, lgq lgqVar, mgq mgqVar, h4q h4qVar, kgq kgqVar, ngs0 ngs0Var, add addVar, awb1 awb1Var, sgq sgqVar, tgq tgqVar, d0r d0rVar, ttm0 ttm0Var) {
        jd6 jd6Var;
        this.a = lzn0Var;
        this.b = hyy0Var;
        this.c = z201Var;
        this.d = sveVar;
        this.e = lgqVar;
        this.f = mgqVar;
        this.g = h4qVar;
        this.h = kgqVar;
        this.i = ngs0Var;
        this.t = addVar;
        qf4 qf4Var = addVar.a;
        if (qf4Var.h() && qf4Var.h0()) {
            e821 e821Var = new e821();
            e821Var.b = ttm0Var;
            e821Var.a = ttm0Var.c(false);
            e821Var.c = gio1.b((Object) null);
            e821Var.d = gio1.b((Object) null);
            jd6Var = new jd6(d0rVar, e821Var);
        } else {
            jd6Var = null;
        }
        this.X = new s880(d0rVar, awb1Var, sgqVar, tgqVar, jd6Var);
        this.Y = new rey0(new lw11(this, (byte) 17));
        this.Z = n3o1.q(this).a(ve21.Z0, new aaq0(this, (byte) 17));
        j2i j2iVar = new j2i(-819133818, new hg31(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.N0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.Z;
    }

    public final jsw c() {
        return this.N0;
    }

    public final mqw getBehavior() {
        return this.Y;
    }
}
