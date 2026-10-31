package p;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class suh1 implements xpw {
    public final /* synthetic */ byte a;
    public final ia00 b;
    public final psw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final mqw g;

    public suh1(jly0 jly0Var, gw70 gw70Var, yqg yqgVar, urk0 urk0Var, j2h1 j2h1Var, iu30 iu30Var) {
        ia00 ia00VarA;
        this.a = (byte) 2;
        this.d = jly0Var;
        this.e = gw70Var;
        this.f = yqgVar;
        this.g = x3p1.n(new z5d((zob1) ((aod0) jly0Var.get()).b, (byte) 8), nvi1.i, zhi1.d, (o8n) null, new ceg1(iu30Var, (byte) 10), 8);
        if (j2h1Var instanceof xsr0) {
            ia00VarA = n3o1.q(this).a(new zm01(urk0Var, (byte) 10), ruh1.S0);
        } else {
            if (!(j2h1Var instanceof ysr0)) {
                eg.o();
                throw null;
            }
            ia00VarA = n3o1.q(this).a(new y63(urk0Var, ((ysr0) j2h1Var).d, (byte) 9), ruh1.R0);
        }
        this.b = ia00VarA;
        j2i j2iVar = new j2i(-113822474, new l6i1(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.b;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.c;
    }

    public void e(boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1317517673);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.h(z2) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, z2 ? 2131958046 : 2131958041);
            String strO1 = cwl1.o0(b0kVar3, 2131958040);
            boolean z3 = z || z2;
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(b0kVar3);
            zzq0 zzq0VarH = uyn1.h(2, 0.0f, 0.0f);
            boolean z4 = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z4 || objT == fkj0.X) {
                objT = new sah1(function0, (byte) 4);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), ldxVar, (qim0) null, z3 ? new hax(strO1) : jax.a, gdxVarS, zzq0VarH, (idn0) null, (ga80) null, apo.r(767510055, new ov51((byte) 6, z3), b0kVar3), (vu30) null, apo.r(-1756093384, new mv8(z3, strO0, (byte) 15), b0kVar3), b0kVar2, 805306368, 48, 1420);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(this, z, z2, function0, i);
        }
    }

    public void f(s5m1 s5m1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1365758917);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(s5m1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = s5m1Var.a;
            String strO0 = cwl1.o0(x340Var, 2131963932);
            ptx ptxVar = ptx.c;
            t2g t2gVar = new t2g(z, false, (qex) null, 6);
            String strO1 = cwl1.o0(x340Var, 2131963931);
            qim0 qim0VarN = anm1.N("workout_toggle_chip_is_active_" + z, nim0.a);
            boolean zH = x340Var.h(z) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                objT = new ag21(iu30Var, z, (byte) 8);
                x340Var.s0(objT);
            }
            kyo1.c(strO0, ptxVar, (Function0) objT, qim0VarN, false, strO1, t2gVar, jsj.a, x340Var, (ptx.d << 3) | 12582912, 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(this, s5m1Var, iu30Var, i, (byte) 18);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        js20 js20Var = this.g;
        switch (b) {
            case 0:
                return (e7m0) js20Var;
            case 1:
                return (rey0) js20Var;
            case 2:
                return js20Var;
            case 3:
                return (poy0) js20Var;
            case 4:
                return js20Var;
            default:
                return js20Var;
        }
    }

    public suh1(lzn0 lzn0Var, jtl1 jtl1Var, los losVar) {
        this.a = (byte) 1;
        this.d = lzn0Var;
        this.e = jtl1Var;
        this.f = losVar;
        this.g = new rey0(new e9f1(this, (byte) 22));
        this.b = n3o1.q(this).a(ruh1.f, ruh1.g);
        j2i j2iVar = new j2i(1361164944, new y2f1(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public suh1(String str, y4m1 y4m1Var, hj91 hj91Var, zwz0 zwz0Var) {
        this.a = (byte) 5;
        this.d = str;
        this.e = y4m1Var;
        this.f = hj91Var;
        this.g = x3p1.m(new x010(zwz0Var.b(), new yv8(y4m1Var.b(str), (byte) 11), new irp0(3, null, (byte) 27), (byte) 1), m5m1.c, u5l1.Z0, (o8n) null, new c4m1(this, (byte) 4), 8);
        this.b = n3o1.q(this).a(yxl1.f, yxl1.g);
        j2i j2iVar = new j2i(-1011571197, new l6i1(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public suh1(a1r0 a1r0Var, iz31 iz31Var, x1i1 x1i1Var) {
        this.a = (byte) 4;
        this.d = a1r0Var;
        this.f = iz31Var;
        this.e = x1i1Var;
        this.g = x3p1.n(new xxl1(this, (byte) 0), owl1.d, u5l1.U0, (o8n) null, new xxl1(this, (byte) 1), 8);
        this.b = n3o1.q(this).a(cxj1.e1, yxl1.b);
        j2i j2iVar = fsj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public suh1(FlowableMap flowableMap, yjj1 yjj1Var, gw70 gw70Var) {
        this.a = (byte) 3;
        this.d = flowableMap;
        this.e = yjj1Var;
        this.f = gw70Var;
        this.g = d4o1.f(new xaj1(this, (byte) 12), egj1.T0, zhi1.d1, egj1.U0, 8);
        j2i j2iVar = new j2i(961131199, new l6i1(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(k3j1.V0, k3j1.W0);
    }

    public suh1(h3y0 h3y0Var, xq81 xq81Var, e7y0 e7y0Var, mie0 mie0Var, x1i1 x1i1Var, u6y0 u6y0Var, i5y0 i5y0Var, iz31 iz31Var) {
        this.a = (byte) 0;
        this.d = xq81Var;
        this.e = i5y0Var;
        this.f = iz31Var;
        this.g = sbl.B(new luh1("", false, false, false, false, false, false, false, false, false, (z740) null, (z740) null), new wam0((byte) 24), new zth1(h3y0Var, e7y0Var, mie0Var, x1i1Var, u6y0Var), new rvd1(this, (byte) 21), new quh1(this));
        this.b = n3o1.q(this).a(swg1.e1, ruh1.b);
        j2i j2iVar = new j2i(-903568665, new y2f1(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }
}
