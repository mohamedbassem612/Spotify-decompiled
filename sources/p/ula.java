package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ula extends f311 {
    public final rla a;
    public final boolean b;

    public ula(rla rlaVar, boolean z) {
        this.a = rlaVar;
        this.b = z;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(169546491);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new s55(2, (lnm) null, (byte) 4);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            ven0 ven0VarI = g9p1.I("revealFadeIn", rka.c, rk41Var.a, this.b, (Function0) null, x340Var, 16);
            pxg1 pxg1Var = rka.d;
            boolean z = rk41Var.a;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32 || ((i2 & 64) != 0 && x340Var.i(rk41Var));
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new kf6(rk41Var, (byte) 1);
                x340Var.s0(objT2);
            }
            ven0 ven0VarI2 = g9p1.I("revealSubtitleFadeIn", pxg1Var, z, this.b, (Function0) objT2, x340Var, 0);
            ven0 ven0VarY = h7w.y(x340Var);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT3;
            if (((Boolean) ven0VarY.getValue()).booleanValue()) {
                x340Var.i0(78997682);
                Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
                boolean z3 = i3 == 32 || ((i2 & 64) != 0 && x340Var.i(rk41Var));
                Object objT4 = x340Var.T();
                if (z3 || objT4 == m4cVar) {
                    objT4 = new uka(rk41Var, lz20Var, null, (byte) 1);
                    x340Var.s0(objT4);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT4);
                x340Var.r(false);
            } else {
                x340Var.i0(79294631);
                x340Var.r(false);
            }
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.i0(-274534758);
            uwr uwrVar = cbx.a;
            int iI0 = watVar.i0(cbx.b(x340Var).b.a);
            x340Var.r(false);
            int iI1 = watVar.i0(96.0f);
            int iI2 = watVar.i0(182.0f);
            int iI3 = watVar.i0(100.0f);
            qim0 qim0VarThen = vby0.p(uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, i2cVar.a(u291.c(u291.f(nim0.a, 1.0f), 0.75f), een.h)), lz20Var).then(c030.a);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = yda.O0;
                x340Var.s0(objT5);
            }
            n9p1.g(iI0, iI1, iI2, iI3, apo.r(1654748179, new sla(this, ven0VarI, (byte) 0), x340Var), apo.r(686787250, new zt6(this, ven0VarI, rk41Var, (byte) 20), x340Var), apo.r(-281173679, new sla(this, ven0VarI2, (byte) 1), x340Var), s161.b(qim0VarThen, true, (iu30) objT5), x340Var, 1794048);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, i2cVar, rk41Var, function0, (byte) 29);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return pk41.a;
    }
}
