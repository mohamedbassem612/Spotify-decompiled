package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j6a implements xpw {
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final l8a a;
    public final ypg0 b;
    public final ypg0 c;
    public final js20 d;
    public final eih1 e;
    public final psw f;

    static {
        new gex0((byte) 29);
        ytw0 ytw0Var = jfv.b;
        g = fdg1.k0(500, ngv.d);
    }

    public j6a(y6a y6aVar, l8a l8aVar) {
        this.a = l8aVar;
        ypg0 ypg0VarB0 = nyn1.b0(xj.i, y6aVar.e);
        this.b = ypg0VarB0;
        this.c = nyn1.b0(fr9.c1, ypg0VarB0);
        this.d = x3p1.m(new h6a(ypg0VarB0, (byte) 0), new uv8(this, (byte) 24), v30.f, (o8n) null, (iu30) null, 24);
        this.e = f3o1.u();
        j2i j2iVarJ = apo.j(1383013024, new m04(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVarJ, (byte) 0);
    }

    @Override // p.avl1
    public final rqw a() {
        return this.e;
    }

    @Override // p.maa
    public final jsw c() {
        return this.f;
    }

    public final void e(e6a e6aVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(677841216);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(e6aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            z7a z7aVar = e6aVar.a;
            nim0 nim0Var = nim0.a;
            if (z7aVar != null) {
                x340Var.i0(-1368454410);
                e6aVar.b.b(z7aVar, anm1.N(gex0.d(z7aVar), u291.f(nim0Var, 1.0f)), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1368289118);
                x340Var.r(false);
            }
            qim0Var2 = nim0Var;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(this, e6aVar, qim0Var2, i, (byte) 26);
        }
    }

    @Override // p.maa
    public final mqw getBehavior() {
        return this.d;
    }
}
