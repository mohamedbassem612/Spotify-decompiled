package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sm71 implements jsw {
    public final gw70 a;
    public final ug71 b;
    public final ya71 c;
    public final woa d;
    public final kma e;
    public final yqg f;
    public final zxa g;
    public final wh71 h;
    public final ij01 i;

    public sm71(gw70 gw70Var, ug71 ug71Var, ya71 ya71Var, woa woaVar, kma kmaVar, yqg yqgVar, twb twbVar, zxa zxaVar, wh71 wh71Var, ij01 ij01Var, nbc nbcVar) {
        this.a = gw70Var;
        this.b = ug71Var;
        this.c = ya71Var;
        this.d = woaVar;
        this.e = kmaVar;
        this.f = yqgVar;
        this.g = zxaVar;
        this.h = wh71Var;
        this.i = ij01Var;
    }

    public final boolean b() {
        return true;
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1169900616);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var).b.f, 1, qim0VarF);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(h2c.a.a(nim0Var, een.h), 6, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dj71(this, i, (byte) 1);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(zg71 zg71Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1349363914);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(zg71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            mod.c(new ely0[]{oi7.a.a(this.a), nge0.a.a(this.c), mge0.a.a(this.d), mge0.b.a(this.e), mge0.c.a(this.f), und.a.a(this.g)}, apo.r(-423359094, new qm71(iu30Var, zg71Var, this, (byte) 0), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, (Object) this, (Object) zg71Var, (Object) iu30Var, (Object) kswVar, (byte) 11);
        }
    }
}
