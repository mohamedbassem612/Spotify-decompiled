package p;

import app.p000rive.semantics.SemanticState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g891 implements xpw {
    public final /* synthetic */ byte a;
    public final js20 b;
    public final ia00 c;
    public final psw d;

    public g891(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = x3p1.m(r6x.a, u0e0.d1, x5d0.S0, (o8n) null, u0e0.e1, 8);
                this.c = n3o1.q(this).a(wud0.X, wud0.Y);
                j2i j2iVar = dxi.a;
                ien0 ien0Var = qsw.a;
                this.d = new psw(j2iVar, (byte) 0);
                break;
            case 4:
            default:
                this.b = x3p1.m(r6x.a, vc40.e, bp30.a1, (o8n) null, vc40.f, 8);
                this.c = n3o1.q(this).a(d640.g, d640.h);
                j2i j2iVar2 = kqi.a;
                ien0 ien0Var2 = qsw.a;
                this.d = new psw(j2iVar2, (byte) 0);
                break;
            case 5:
                this.b = x3p1.m(r6x.a, eak1.b, olj1.P0, (o8n) null, eak1.c, 8);
                this.c = n3o1.q(this).a(cxj1.i, cxj1.t);
                j2i j2iVar3 = grj.a;
                ien0 ien0Var3 = qsw.a;
                this.d = new psw(j2iVar3, (byte) 0);
                break;
            case 6:
                this.b = x3p1.m(r6x.a, eak1.R0, olj1.c1, (o8n) null, eak1.S0, 8);
                this.c = n3o1.q(this).a(cxj1.P0, cxj1.Q0);
                j2i j2iVar4 = lrj.a;
                ien0 ien0Var4 = qsw.a;
                this.d = new psw(j2iVar4, (byte) 0);
                break;
        }
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
            case 5:
                break;
        }
        return this.c;
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
            case 5:
                break;
        }
        return this.d;
    }

    public void e(int i, c891 c891Var, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1353013764);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.g(c891Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(this) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            ytw0 ytw0Var = jfv.b;
            int iCeil = (int) Math.ceil(jfv.h(fdg1.l0(c891Var.a, ngv.d)) / 1000.0f);
            String strU = cwl1.U(2131820561, iCeil, new Object[]{Integer.valueOf(iCeil)}, b0kVar3);
            qim0 qim0VarN = anm1.N(bzd1.a, u291.B(nim0.a, (gra) null, 3));
            boolean zG = b0kVar3.g(strU);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new pg61(strU, (byte) 22);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(s161.a(qim0VarN, (iu30) objT), een.h, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(655015603, new dxj(i, this, iCeil, c891Var), b0kVar3), b0kVar2, 0, 48, 2044);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(this, i, c891Var, i2, (byte) 20);
        }
    }

    public void f(int i, float f, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-565079438);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).d.b;
            boolean zF = x340Var.f(j);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = new ps((byte) 24, j);
                x340Var.s0(objT);
            }
            xto1.f(f, 4, ((i3 >> 3) & 14) | 384, 0, cbx.a(x340Var).c.e, cbx.a(x340Var).c.b, x340Var, exd0.q(nim0.a, (iu30) objT));
            uwo1.e(String.valueOf(i), (qim0) null, cbx.d(x340Var).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y791(this, i, f, i2, (byte) 0);
        }
    }

    public void g(int i, float f, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1315123506);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).d.b;
            boolean zF = x340Var.f(j);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = new ps((byte) 25, j);
                x340Var.s0(objT);
            }
            xto1.f(f, 3, ((i3 >> 3) & 14) | 384, 0, cbx.a(x340Var).c.e, cbx.a(x340Var).c.b, x340Var, exd0.q(nim0.a, (iu30) objT));
            uwo1.e(String.valueOf(i), (qim0) null, cbx.d(x340Var).n, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y791(this, i, f, i2, (byte) 1);
        }
    }

    public final mqw getBehavior() {
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
            case 5:
                break;
        }
        return this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void h(int i, iu30 iu30Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1578888232);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(this) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(-1188132165);
                j(iu30Var, x340Var, (i3 >> 3) & 126);
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -1188133157, false);
                }
                x340Var.i0(-1188130342);
                i(iu30Var, x340Var, (i3 >> 3) & 126);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(this, i, iu30Var, i2, (byte) 21);
        }
    }

    public void i(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1958400821);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N(bzd1.b, nim0.a);
            idx idxVar = new idx(18);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pc81(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, qim0VarN, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, nij.b, nij.c, x340Var, 0, 54, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z791(this, iu30Var, i, (byte) 0);
        }
    }

    public void j(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1377887379);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N(bzd1.b, nim0.a);
            ldx ldxVar = ldx.c;
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pc81(iu30Var, (byte) 19);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, nij.a, x340Var, 0, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z791(this, iu30Var, i, (byte) 1);
        }
    }

    public g891(a680 a680Var) {
        this.a = (byte) 4;
        this.b = a680Var.d(this);
        this.c = ((no5) a680Var.b).b(this, new ac8(a680Var, (byte) 18));
        j2i j2iVar = s2j.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public g891(q791 q791Var, vu30 vu30Var, mr20 mr20Var, mr20 mr20Var2, mr20 mr20Var3, mr20 mr20Var4, mr20 mr20Var5, Function0 function0) {
        this.a = (byte) 0;
        this.b = x3p1.n(new t3t0(mr20Var, this, mr20Var5, mr20Var2, mr20Var3, mr20Var4, (byte) 8), er81.X0, yd81.R0, (o8n) null, new pm0(vu30Var, (byte) 6), 8);
        this.c = n3o1.q(this).a(v691.f, v691.g);
        j2i j2iVar = new j2i(160490094, new pj0(this, q791Var, function0, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public g891(d520 d520Var, boolean z) {
        this.a = (byte) 1;
        this.b = d520Var.j(this);
        this.c = ((no5) d520Var.c).b(this, new kk11(d520Var, (byte) 7));
        j2i j2iVar = new j2i(-1364436532, new xyh(5, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
