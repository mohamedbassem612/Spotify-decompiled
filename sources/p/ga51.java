package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ga51 implements xpw, cvl1 {
    public final lzn0 a;
    public final mt61 b;
    public final kly0 c;
    public final kly0 d;
    public final tbr0 e;
    public final rey0 f = new rey0(new u451(this, (byte) 3));
    public final hy00 g = n3o1.r(this).c(v451.d, v451.e);
    public final psw h;

    public ga51(lzn0 lzn0Var, mt61 mt61Var, ipq ipqVar, ipq ipqVar2, tbr0 tbr0Var) {
        this.a = lzn0Var;
        this.b = mt61Var;
        this.c = ipqVar;
        this.d = ipqVar2;
        this.e = tbr0Var;
        j2i j2iVar = new j2i(-1019723020, new hg31(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final void e(hux huxVar, ryn1 ryn1Var, xt61 xt61Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        String strN0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1086982646);
        int i2 = i | (b0kVar3.i(huxVar) ? 4 : 2) | (b0kVar3.i(ryn1Var) ? 32 : 16) | (b0kVar3.i(xt61Var) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strR = uyn1.r(ryn1Var, (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b));
            String strU = zmo1.u(xt61Var.b, (String) null, b0kVar3);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).m;
            long j = cbx.a(b0kVar3).b.b;
            wat watVar = (wat) b0kVar3.k(t4k.h);
            zma1 zma1Var = lee1Var.a;
            float fY = watVar.y(zma1Var.b);
            ye5 ye5Var = new ye5();
            z6p1.s(ye5Var, "pageIcon");
            ye5Var.g(strR);
            if (strU != null) {
                z6p1.s(ye5Var, "chevron");
                ye5Var.g(strU);
            }
            af5 af5VarP = ye5Var.p();
            if (strU == null || ihc1.y0(strU)) {
                b0kVar3.i0(1754220838);
                strN0 = cwl1.n0(2131962112, new Object[]{strR}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1754372738);
                strN0 = cwl1.n0(2131962113, new Object[]{strR, strU}, b0kVar3);
                b0kVar3.r(false);
            }
            boolean zG = b0kVar3.g(strN0);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new sc21(strN0, (byte) 23);
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT);
            long j2 = zma1Var.b;
            long j3 = zma1Var.b;
            fc11.o(j2);
            mmr0 mmr0Var = new mmr0("pageIcon", new gh80(new d6t0(4, fc11.Y(TextUnit.c(j2) * 1.5f, j2 & 1095216660480L), zma1Var.b), apo.r(1616953465, new s7j(fY, huxVar, j), b0kVar3)));
            fc11.o(j3);
            long jY = fc11.Y(TextUnit.c(j3) * 0.8f, j3 & 1095216660480L);
            fc11.o(jY);
            long jY2 = fc11.Y(TextUnit.c(jY) * 1.5f, jY & 1095216660480L);
            fc11.o(j3);
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, j, qim0VarB, lee1Var, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, mqo1.t(new mmr0[]{mmr0Var, new mmr0("chevron", new gh80(new d6t0(4, jY2, fc11.Y(TextUnit.c(j3) * 0.8f, j3 & 1095216660480L)), apo.r(-188549830, new wzu0(fY, j), b0kVar3)))}), b0kVar2, 0, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(this, huxVar, ryn1Var, xt61Var, qim0Var2, i, (byte) 7);
        }
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
