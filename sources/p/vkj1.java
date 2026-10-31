package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vkj1 extends f311 {
    public final rkj1 a;
    public final ck41 b;
    public final dlv c;
    public final Function0 d;
    public final int e;
    public final int f;
    public final ok41 g;
    public final ejj1 h;

    public vkj1(rkj1 rkj1Var, woa woaVar, ck41 ck41Var, dlv dlvVar, Function0 function0) {
        this.a = rkj1Var;
        this.b = ck41Var;
        this.c = dlvVar;
        this.d = function0;
        int i = ck41Var != null ? 3000 : 0;
        this.e = i;
        int i2 = ck41Var != null ? i - 334 : 0;
        this.f = i2;
        this.g = new ok41(i2 + (rkj1Var.e != null ? 1567 : 1467));
        this.h = new ejj1(woaVar, "Scenes Compose Debug", rkj1Var.d.a, true, false);
    }

    @Override // p.qj41
    public final Object b(ak41 ak41Var) {
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new ukj1(this, null, (byte) 1), ak41Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    @Override // p.qj41
    public final Object c(zj41 zj41Var) {
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new ukj1(this, null, (byte) 0), zj41Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-787763685);
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
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            Boolean boolValueOf = Boolean.valueOf(rk41Var.b);
            int i3 = i2 & 112;
            boolean zI = (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(rk41Var))) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new skj1(rk41Var, this, null, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
            Boolean boolValueOf2 = Boolean.valueOf(rk41Var.a);
            if (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(rk41Var))) {
                z = true;
            }
            boolean zI2 = x340Var.i(this) | z;
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new skj1(rk41Var, this, null, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf2, x340Var, (vu30) objT2);
            e(rk41Var, i2cVar.d(), i2cVar.c(), x340Var, (i2 & 7168) | ((i2 >> 3) & 14));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, i2cVar, rk41Var, function0, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0331  */
    public final void e(rk41 rk41Var, float f, float f2, b0k b0kVar, int i) {
        int i2;
        vkj1 vkj1Var;
        boolean z;
        float fS;
        drr0 drr0Var;
        err0 err0Var;
        gqb gqbVar;
        boolean z2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2086251450);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarY = h7w.y(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            if (((Boolean) ven0VarY.getValue()).booleanValue()) {
                x340Var.i0(955060905);
                Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
                boolean z4 = (i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(rk41Var));
                Object objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new uka(rk41Var, lz20Var, null, (byte) 6);
                    x340Var.s0(objT2);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(955263676);
                x340Var.r(false);
            }
            wat watVar = (wat) x340Var.k(t4k.h);
            float fX0 = watVar.X0(f2);
            float fX1 = watVar.X0(f);
            float fU0 = watVar.U0();
            float fO = fU0 <= 1.5f ? 0.34f : (yoi1.o((fU0 - 1.5f) / 1.5f, 0.0f, 1.0f) * (-0.22f)) + 0.34f;
            float f3 = fO / 0.34f;
            float f4 = fO * fX0;
            float f5 = (fX1 / fX0) * f4;
            float f6 = f4 / fX0;
            float f7 = fX0 * 0.16f * f3;
            float f8 = 0.16f * f7;
            float f9 = (f5 + f7) - f8;
            float f10 = (f5 - f9) / (f6 * 2.0f);
            float f11 = -f4;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var3 = (drr0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.h(0, x340Var);
            }
            err0 err0Var2 = (hdn0) objT5;
            int i3 = this.f;
            pxg1 pxg1Var = new pxg1(700, i3, this.c);
            int i4 = i3 + 500;
            ilv.a.getClass();
            ceo ceoVar = flv.g;
            pxg1 pxg1Var2 = new pxg1(700, i4, ceoVar);
            ven0 ven0VarR = zod.R(wxo1.r("videoScaleDown", 1.0f, f6, pxg1Var), rk41Var.a, (Function0) null, x340Var, 8, 4);
            ven0 ven0VarR2 = zod.R(wxo1.r("videoTransitionX", 0.0f, f10, pxg1Var), rk41Var.a, (Function0) null, x340Var, 8, 4);
            ven0 ven0VarR3 = zod.R(wxo1.r("videoTransitionY", 0.0f, f11, pxg1Var), rk41Var.a, (Function0) null, x340Var, 8, 4);
            ven0 ven0VarR4 = zod.R(wxo1.r("canvasCornerRadius", 0.0f, 8.0f / f6, pxg1Var), rk41Var.a, (Function0) null, x340Var, 8, 4);
            ven0 ven0VarR5 = zod.R(wxo1.r("imageZoomIn", 0.5f, 1.0f, pxg1Var2), rk41Var.a, (Function0) null, x340Var, 8, 4);
            ven0 ven0VarR6 = zod.R(wxo1.r("imageAlpha", 0.0f, 1.0f, pxg1Var2), rk41Var.a, (Function0) null, x340Var, 8, 4);
            ven0 ven0VarR7 = zod.R(wxo1.r("text1Enter", 1.0f, 0.0f, new pxg1(700, i3 + 667, ceoVar)), rk41Var.a, (Function0) null, x340Var, 8, 4);
            hsi1 hsi1VarR = wxo1.r("text2Enter", 1.0f, 0.0f, new pxg1(700, i3 + 767, ceoVar));
            boolean z5 = rk41Var.a;
            boolean zI = x340Var.i(this);
            Object objT6 = x340Var.T();
            if (zI || objT6 == m4cVar) {
                objT6 = new tkj1(this, (byte) 1);
                x340Var.s0(objT6);
            }
            ven0 ven0VarR8 = zod.R(hsi1VarR, z5, (Function0) objT6, x340Var, 8, 0);
            hsi1 hsi1VarR2 = wxo1.r("text3Enter", 1.0f, 0.0f, new pxg1(700, i3 + 867, ceoVar));
            boolean z6 = rk41Var.a;
            boolean zI2 = x340Var.i(this);
            Object objT7 = x340Var.T();
            if (zI2 || objT7 == m4cVar) {
                z = false;
                objT7 = new tkj1(this, (byte) 0);
                x340Var.s0(objT7);
            } else {
                z = false;
            }
            ven0 ven0VarR9 = zod.R(hsi1VarR2, z6, (Function0) objT7, x340Var, 8, 0);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, z);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z7 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (drr0Var2.s() > 0.0f) {
                err0 err0Var3 = err0Var2;
                if (err0Var3.s() > 0) {
                    fS = (fX0 / 2.0f) - (((drr0Var2.s() + ((f4 / 2.0f) + (drr0Var3.s() - (err0Var3.s() / 2.0f)))) + (drr0Var3.s() - err0Var3.s())) / 2.0f);
                } else {
                    fS = 0.0f;
                }
            } else {
                fS = 0.0f;
            }
            float fO2 = f6 < 1.0f ? yoi1.o((1.0f - ((Number) ven0VarR.getValue()).floatValue()) / (1.0f - f6), 0.0f, 1.0f) : 1.0f;
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            boolean zD = x340Var.d(fS) | x340Var.d(fO2);
            Object objT8 = x340Var.T();
            if (zD || objT8 == m4cVar) {
                objT8 = new e8(fS, fO2, (byte) 17);
                x340Var.s0(objT8);
            }
            qim0 qim0VarC = i541.C(qim0VarD2, (iu30) objT8);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarC);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            boolean zG = x340Var.g(ven0VarR);
            Object objT9 = x340Var.T();
            if (zG || objT9 == m4cVar) {
                objT9 = new eyg1(ven0VarR, (byte) 8);
                x340Var.s0(objT9);
            }
            qim0 qim0VarC2 = i541.C(nim0Var, (iu30) objT9);
            boolean zG2 = x340Var.g(ven0VarR2) | x340Var.g(ven0VarR3);
            Object objT10 = x340Var.T();
            if (zG2 || objT10 == m4cVar) {
                objT10 = new dy(ven0VarR2, ven0VarR3, (byte) 12);
                x340Var.s0(objT10);
            }
            qim0 qim0VarZ = u291.z(eqr0.B(qim0VarC2, (iu30) objT10), (fra) null, 3);
            Object objT11 = x340Var.T();
            if (objT11 == m4cVar) {
                drr0Var = drr0Var3;
                err0Var = err0Var2;
                objT11 = new hij1(drr0Var, err0Var, (byte) 2);
                x340Var.s0(objT11);
            } else {
                drr0Var = drr0Var3;
                err0Var = err0Var2;
            }
            qim0 qim0VarX = ern1.x(qim0VarZ, (iu30) objT11);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            boolean zG3 = x340Var.g(ven0VarR4);
            Object objT12 = x340Var.T();
            if (zG3 || objT12 == m4cVar) {
                objT12 = new eyg1(ven0VarR4, (byte) 9);
                x340Var.s0(objT12);
            }
            qim0 qim0VarC3 = i541.C(nim0Var, (iu30) objT12);
            rkj1 rkj1Var = this.a;
            did didVar = rkj1Var.d;
            yj41 yj41Var = rkj1Var.a;
            vvm1.s(this.h, didVar.b, rk41Var.a, qim0VarC3, true, didVar.c, x340Var, 196608);
            x340Var.r(true);
            float f12 = (((fX1 - f9) / 2.0f) + f5) - f8;
            float fS2 = drr0Var.s() - (err0Var.s() / 2.0f);
            float f13 = fS2 - (f7 / 2.0f);
            float fN0 = watVar.N0(f7);
            yk4 yk4Var = new yk4(yj41Var.a);
            ksl kslVarA = yj41Var.a();
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            qim0 qim0VarR = u291.r(nim0Var, fN0);
            boolean zD2 = x340Var.d(f12) | x340Var.d(f13);
            Object objT13 = x340Var.T();
            if (zD2 || objT13 == m4cVar) {
                objT13 = new e8(f12, f13, (byte) 18);
                x340Var.s0(objT13);
            }
            qim0 qim0VarB = eqr0.B(qim0VarR, (iu30) objT13);
            boolean zG4 = x340Var.g(ven0VarR5) | x340Var.g(ven0VarR6);
            Object objT14 = x340Var.T();
            if (zG4 || objT14 == m4cVar) {
                objT14 = new dy(ven0VarR5, ven0VarR6, (byte) 13);
                x340Var.s0(objT14);
            }
            qim0 qim0VarC4 = i541.C(qim0VarB, (iu30) objT14);
            gqb gqbVar2 = yj41Var.c;
            if (gqbVar2 != null) {
                gqbVar = new gqb(gqbVar2.a, ((Number) ven0VarR.getValue()).floatValue() * gqbVar2.b);
            } else {
                gqbVar = null;
            }
            eso1.f(yk4Var, kslVarA, v8r.j(qim0VarC4, gqbVar), (p3v) null, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 24576, 456);
            float fX2 = watVar.X0(50.0f);
            float f14 = (f4 / 2.0f) + fS2;
            qim0 qim0VarZ2 = uyn1.z(24.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            boolean zD3 = x340Var.d(f14);
            Object objT15 = x340Var.T();
            if (zD3 || objT15 == m4cVar) {
                objT15 = new waf1((byte) 9, f14);
                x340Var.s0(objT15);
            }
            qim0 qim0VarB2 = eqr0.B(qim0VarZ2, (iu30) objT15);
            gfh0 gfh0VarC4 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC4, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            era eraVar = een.Q0;
            qim0 qim0VarZ3 = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
            Object objT16 = x340Var.T();
            if (objT16 == m4cVar) {
                objT16 = new qg6(drr0Var2, (byte) 26);
                x340Var.s0(objT16);
            }
            qim0 qim0VarX2 = ern1.x(qim0VarZ3, (iu30) objT16);
            Object objT17 = x340Var.T();
            if (objT17 == m4cVar) {
                objT17 = egj1.Y0;
                x340Var.s0(objT17);
            }
            qim0 qim0VarThen = vby0.p(s161.b(qim0VarX2, true, (iu30) objT17), lz20Var).then(c030.a);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 48);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarThen);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            op71.g(x340Var, u291.h(nim0Var, 40.0f));
            vnr0 vnr0VarQ = o2p1.q(omo1.q((vnr0) rkj1Var.b.invoke(x340Var, 0), lee1.a(cbx.d(x340Var).d, 0L, fc11.G(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), cbx.d(x340Var).d, x340Var), 2);
            boolean zD4 = x340Var.d(fX2) | x340Var.g(ven0VarR7);
            Object objT18 = x340Var.T();
            if (zD4 || objT18 == m4cVar) {
                objT18 = new na5(fX2, (tob1) ven0VarR7, (byte) 4);
                x340Var.s0(objT18);
            }
            qgo1.f(vnr0VarQ, i541.C(nim0Var, (iu30) objT18), a0e1.a(), 0, false, (iu30) null, x340Var, 8, 56);
            op71.g(x340Var, u291.h(nim0Var, rkj1Var.f));
            vnr0 vnr0VarQ2 = o2p1.q(omo1.q((vnr0) rkj1Var.c.invoke(x340Var, 0), cbx.d(x340Var).j, cbx.d(x340Var).g, x340Var), 2);
            boolean zD5 = x340Var.d(fX2) | x340Var.g(ven0VarR8);
            Object objT19 = x340Var.T();
            if (zD5 || objT19 == m4cVar) {
                objT19 = new na5(fX2, (tob1) ven0VarR8, (byte) 5);
                x340Var.s0(objT19);
            }
            qgo1.f(vnr0VarQ2, i541.C(nim0Var, (iu30) objT19), a0e1.a(), 0, false, (iu30) null, x340Var, 8, 56);
            x340Var = x340Var;
            vu30 vu30Var = rkj1Var.e;
            if (vu30Var == null) {
                x340Var.i0(1532312233);
                z2 = false;
                x340Var.r(false);
            } else {
                x340Var.i0(1532312234);
                op71.g(x340Var, u291.h(nim0Var, rkj1Var.g));
                vnr0 vnr0VarQ3 = o2p1.q(omo1.q((vnr0) vu30Var.invoke(x340Var, 0), cbx.d(x340Var).j, cbx.d(x340Var).g, x340Var), 3);
                boolean zD6 = x340Var.d(fX2) | x340Var.g(ven0VarR9);
                Object objT20 = x340Var.T();
                if (zD6 || objT20 == m4cVar) {
                    objT20 = new na5(fX2, (tob1) ven0VarR9, (byte) 6);
                    x340Var.s0(objT20);
                }
                qgo1.f(vnr0VarQ3, i541.C(nim0Var, (iu30) objT20), a0e1.a(), 0, false, (iu30) null, x340Var, 8, 56);
                x340Var = x340Var;
                z2 = false;
                x340Var.r(false);
            }
            us71.m(x340Var, true, true, true);
            vkj1Var = this;
            ck41 ck41Var = vkj1Var.b;
            if (ck41Var == null) {
                x340Var.i0(-1999821933);
                x340Var.r(z2);
            } else {
                x340Var.i0(-1999821932);
                int i5 = vkj1Var.e - 134;
                if (i5 < 0) {
                    i5 = 0;
                }
                ven0 ven0VarR10 = zod.R(wxo1.r("preambleFadeOut", 1.0f, 0.0f, new pxg1(100, i5, flv.i)), rk41Var.a, (Function0) null, x340Var, 8, 4);
                if (((Number) ven0VarR10.getValue()).floatValue() > 0.0f) {
                    x340Var.i0(-712814504);
                    qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                    boolean zG5 = x340Var.g(ven0VarR10);
                    Object objT21 = x340Var.T();
                    if (zG5 || objT21 == m4cVar) {
                        objT21 = new i2g1(ven0VarR10, (byte) 12);
                        x340Var.s0(objT21);
                    }
                    w2g0.c(i541.C(qim0VarD3, (iu30) objT21), (tl3) null, apo.r(287286172, new sgi1(ck41Var, rk41Var, vkj1Var), x340Var), x340Var, 3072, 6);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    z3 = false;
                    x340Var.i0(-712479115);
                    x340Var.r(false);
                }
                x340Var.r(z3);
            }
            x340Var.r(true);
        } else {
            vkj1Var = this;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new btl((byte) 1, f, f2, i, vkj1Var, rk41Var);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.g;
    }
}
