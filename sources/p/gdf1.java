package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gdf1 extends f311 {
    public final lfa1 a;
    public final String b;
    public final ejj1 c;
    public final tjz d;
    public final tob1 e;
    public final boolean f;
    public final int g;
    public final Function0 h;
    public final boolean i;
    public final hrr0 j;
    public final hrr0 k;
    public volatile boolean l;
    public boolean m;
    public boolean n;

    public gdf1(lfa1 lfa1Var, String str, ejj1 ejj1Var, tjz tjzVar, tob1 tob1Var, boolean z, Function0 function0, int i) {
        int i2 = (i & 64) != 0 ? 0 : 300;
        function0 = (i & 128) != 0 ? q9f1.i : function0;
        this.a = lfa1Var;
        this.b = str;
        this.c = ejj1Var;
        this.d = tjzVar;
        this.e = tob1Var;
        this.f = z;
        this.g = i2;
        this.h = function0;
        this.i = false;
        hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
        this.j = hrr0VarQ;
        this.k = hrr0VarQ;
    }

    @Override // p.qj41
    public final Object b(ak41 ak41Var) {
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new fdf1(this, null, (byte) 1), ak41Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    @Override // p.qj41
    public final Object c(zj41 zj41Var) {
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new fdf1(this, null, (byte) 0), zj41Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        i2c i2cVar2;
        char c;
        char c2;
        x340 x340Var2;
        boolean z;
        tob1 tob1Var;
        boolean z2;
        lnm lnmVar;
        d3k d3kVar;
        lnm lnmVar2;
        d3k d3kVar2;
        boolean z3;
        lz20 lz20Var;
        tcf1 tcf1Var;
        Throwable th;
        ?? r11;
        Boolean bool;
        boolean z4;
        boolean z5;
        boolean z6;
        gdf1 gdf1Var = this;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        vu30 vu30Var2 = y580.N0;
        llj lljVar2 = y580.O0;
        qim0 qim0VarA = nim0.a;
        n4k n4kVar = hmb0.t1;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1447022584);
        if ((i & 6) == 0) {
            i2 = (x340Var3.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var3.g(rk41Var) : x340Var3.i(rk41Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var3.i(gdf1Var) ? 2048 : 1024;
        }
        if (x340Var3.Y(i2 & 1, (i2 & 1043) != 1042)) {
            qam1 qam1Var = (qam1) x340Var3.k(sam1.a);
            Object objT = x340Var3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = bb00.h(0, x340Var3);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == obj) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zBooleanValue = ((Boolean) gdf1Var.e.getValue()).booleanValue();
            boolean z7 = gdf1Var.f;
            boolean z8 = rk41Var.a || ((Boolean) gdf1Var.j.getValue()).booleanValue();
            int i3 = gdf1Var.g;
            Function0 function1 = gdf1Var.h;
            boolean zI = x340Var3.i(gdf1Var) | x340Var3.i(qam1Var);
            Object objT3 = x340Var3.T();
            if (zI || objT3 == obj) {
                objT3 = new x0e1(gdf1Var, qam1Var, (byte) 18);
                x340Var3.s0(objT3);
            }
            tcf1 tcf1VarQ = lvx.q(zBooleanValue, z7, z8, i3, "video", 0, (Function0) objT3, function1, x340Var3, 32);
            boolean zG = x340Var3.g(tcf1VarQ);
            Object objT4 = x340Var3.T();
            if (zG || objT4 == obj) {
                objT4 = yv91.a(new x0e1(tcf1VarQ, ven0Var, (byte) 20));
                x340Var3.s0(objT4);
            }
            tob1 tob1Var2 = (tob1) objT4;
            err0 err0Var2 = err0Var;
            ven0 ven0Var2 = ven0Var;
            tcf1 tcf1Var2 = tcf1VarQ;
            x340Var3.f0(980739454, Integer.valueOf(err0Var2.s()));
            Object objT5 = x340Var3.T();
            if (objT5 == obj) {
                objT5 = new z2k1(!gdf1Var.f && gdf1Var.l);
                x340Var3.s0(objT5);
            }
            z2k1 z2k1Var = (z2k1) objT5;
            boolean z9 = err0Var2.s() > 0;
            int i4 = i2 & 7168;
            int i5 = i2;
            ejj1 ejj1Var = gdf1Var.c;
            x340Var3.i0(1875046477);
            if (gdf1Var.n) {
                d3kVar2 = d3k.c;
                x340Var3.r(false);
                x340Var2 = x340Var3;
                ven0Var2 = ven0Var2;
                tcf1Var2 = tcf1Var2;
                lnmVar2 = null;
                c2 = 3;
            } else {
                Object objT6 = x340Var3.T();
                if (objT6 == obj) {
                    objT6 = Boolean.valueOf(ejj1Var.j);
                    x340Var3.s0(objT6);
                }
                boolean zBooleanValue2 = ((Boolean) objT6).booleanValue();
                Object objT7 = x340Var3.T();
                if (objT7 == obj) {
                    objT7 = ejj1Var.h;
                    if (objT7 == null) {
                        eg.m("VideoController is not initialized");
                        return;
                    }
                    x340Var3.s0(objT7);
                }
                mr20 mr20Var = (mr20) objT7;
                boolean zBooleanValue3 = ((Boolean) z2k1Var.a.getValue()).booleanValue();
                boolean z10 = ((Boolean) z2k1Var.b.getValue()).booleanValue() && ((Boolean) gdf1Var.e.getValue()).booleanValue();
                boolean z11 = rk41Var.a;
                boolean z12 = gdf1Var.f;
                boolean z13 = ejj1Var.d || (!((Boolean) z2k1Var.a.getValue()).booleanValue() && (z9 || !zBooleanValue2));
                boolean zI2 = x340Var3.i(gdf1Var);
                Object objT8 = x340Var3.T();
                if (zI2 || objT8 == obj) {
                    c = 3;
                    objT8 = new j4f1(gdf1Var, (byte) 3);
                    x340Var3.s0(objT8);
                } else {
                    c = 3;
                }
                Function0 function2 = (Function0) objT8;
                c2 = c;
                tob1 tob1VarG = rwq.g(mr20Var, zij1.a, (o8n) null, x340Var3, 0, 2);
                x340Var2 = x340Var3;
                Object objT9 = x340Var2.T();
                if (objT9 == obj) {
                    objT9 = v8r.q((Object) null);
                    x340Var2.s0(objT9);
                }
                ven0 ven0Var3 = (ven0) objT9;
                Object objT10 = x340Var2.T();
                if (objT10 == obj) {
                    objT10 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT10);
                }
                ven0 ven0Var4 = (ven0) objT10;
                ven0 ven0VarS = v8r.s(function2, x340Var2);
                boolean z14 = !z12 && zBooleanValue3;
                cjj1 cjj1Var = (cjj1) tob1VarG.getValue();
                Boolean boolValueOf = Boolean.valueOf(z11);
                boolean zH = x340Var2.h(z14) | x340Var2.g(tob1VarG) | x340Var2.h(z11) | x340Var2.g(ven0VarS) | x340Var2.h(z13);
                boolean z15 = z13;
                Object objT11 = x340Var2.T();
                if (zH || objT11 == obj) {
                    z = z11;
                    tob1Var = tob1VarG;
                    z2 = z14;
                    objT11 = new hdf1(z2, z, z15, ven0Var3, tob1Var, ven0Var4, ven0VarS, null);
                    x340Var2.s0(objT11);
                } else {
                    z = z11;
                    tob1Var = tob1VarG;
                    z2 = z14;
                }
                qxd0.s(cjj1Var, boolValueOf, (vu30) objT11, x340Var2);
                boolean z16 = !zBooleanValue3;
                boolean z17 = !z2 && (((((cjj1) tob1Var.getValue()) instanceof wij1) && z12) || (((cjj1) tob1Var.getValue()) instanceof bjj1));
                if (((d3k) ven0Var3.getValue()) != null || (zBooleanValue3 && !z17)) {
                    x340Var2.i0(-1947639173);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1948048559);
                    x340Var2.f0(1184085895, Boolean.valueOf(z16));
                    hsi1 hsi1Var = new hsi1("topSongJourneyVideoTimeout", Float.valueOf(0.0f), Float.valueOf(1.0f), irn1.o0(10000, 0, mlv.d, 2), rno1.a);
                    boolean z18 = z || !z10;
                    Object objT12 = x340Var2.T();
                    if (objT12 == obj) {
                        objT12 = new aya1(ven0Var3, (byte) 12);
                        x340Var2.s0(objT12);
                    }
                    zod.R(hsi1Var, z18, (Function0) objT12, x340Var2, 392, 0);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                    x340Var2.r(false);
                }
                d3k d3kVar3 = (d3k) ven0Var3.getValue();
                Boolean boolValueOf2 = Boolean.valueOf(rk41Var.b);
                boolean zI3 = x340Var2.i(gdf1Var) | x340Var2.i(rk41Var);
                Object objT13 = x340Var2.T();
                if (zI3 || objT13 == obj) {
                    lnmVar = null;
                    objT13 = new kwb1(gdf1Var, rk41Var, (lnm) null, (byte) 11);
                    x340Var2.s0(objT13);
                } else {
                    lnmVar = null;
                }
                qxd0.t(boolValueOf2, x340Var2, (vu30) objT13);
                Boolean boolValueOf3 = Boolean.valueOf(rk41Var.a);
                boolean zI4 = x340Var2.i(gdf1Var) | x340Var2.i(rk41Var) | x340Var2.e(d3kVar3 == null ? -1 : d3kVar3.ordinal());
                Object objT14 = x340Var2.T();
                if (zI4 || objT14 == obj) {
                    d3kVar = d3kVar3;
                    lnm lnmVar3 = lnmVar;
                    ku91 ku91Var = new ku91(gdf1Var, rk41Var, d3kVar, lnmVar3, (byte) 14);
                    lnmVar2 = lnmVar3;
                    x340Var2.s0(ku91Var);
                    objT14 = ku91Var;
                } else {
                    d3kVar = d3kVar3;
                    lnmVar2 = lnmVar;
                }
                qxd0.s(boolValueOf3, d3kVar, (vu30) objT14, x340Var2);
                rih1 rih1Var = rih1.a;
                boolean zI5 = x340Var2.i(gdf1Var);
                Object objT15 = x340Var2.T();
                if (zI5 || objT15 == obj) {
                    objT15 = new b0f1(gdf1Var, zBooleanValue2, lnmVar2, c2);
                    x340Var2.s0(objT15);
                }
                qxd0.t(rih1Var, x340Var2, (vu30) objT15);
                x340Var2.r(false);
                d3kVar2 = d3kVar;
            }
            int i6 = i4 | 6;
            lnm lnmVar4 = lnmVar2;
            x340 x340Var4 = x340Var2;
            d3k d3kVar4 = d3kVar2;
            gdf1Var.f(z2k1Var, d3kVar4, tob1Var2, x340Var4, i6);
            gdf1Var = gdf1Var;
            x340 x340Var5 = x340Var4;
            boolean z19 = ((Boolean) z2k1Var.a.getValue()).booleanValue() || gdf1Var.l;
            x340Var5.r(false);
            boolean z20 = d3kVar4 != null || (((Boolean) gdf1Var.e.getValue()).booleanValue() && !z19);
            boolean zI6 = x340Var5.i(gdf1Var) | x340Var5.h(z20);
            Object objT16 = x340Var5.T();
            if (zI6 || objT16 == obj) {
                objT16 = new vm1(gdf1Var, z20, ven0Var2, (byte) 23);
                x340Var5.s0(objT16);
            }
            qxd0.S((Function0) objT16, x340Var5);
            View view = (View) x340Var5.k(AndroidCompositionLocals_androidKt.f);
            ven0 ven0VarY = h7w.y(x340Var5);
            if (z20) {
                x340Var5.i0(338962251);
                ven0 ven0VarH = rwq.h(((ycl1) rk41Var.c).a.getState(), x340Var5, 0);
                boolean zG2 = x340Var5.g(ven0VarH);
                Object objT17 = x340Var5.T();
                if (zG2 || objT17 == obj) {
                    objT17 = yv91.a(new x0e1(ven0VarH, gdf1Var, (byte) 19));
                    x340Var5.s0(objT17);
                }
                tob1 tob1Var3 = (tob1) objT17;
                qim0 qim0VarF = dug.f(u291.d(qim0VarA, 1.0f), u7h.b, d4o1.a);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var5, qim0VarF);
                hzj.A.getClass();
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw lnmVar4;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(gfh0VarC, x340Var5, lljVar2);
                nko1.H(xos0VarM, x340Var5, vu30Var2);
                x0d.q(iHashCode, x340Var5, lljVar, x340Var5);
                nko1.H(qim0VarE, x340Var5, vu30Var);
                if (d3kVar4 != null) {
                    x340Var5.i0(744936897);
                    Boolean bool2 = (Boolean) tob1Var3.getValue();
                    bool2.getClass();
                    boolean zG3 = x340Var5.g(tob1Var3) | x340Var5.i(rk41Var);
                    Object objT18 = x340Var5.T();
                    if (zG3 || objT18 == obj) {
                        objT18 = new kwb1(rk41Var, tob1Var3, lnmVar4, (byte) 10);
                        x340Var5.s0(objT18);
                    }
                    qxd0.t(bool2, x340Var5, (vu30) objT18);
                    boolean zBooleanValue4 = ((Boolean) tob1Var3.getValue()).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) ven0VarY.getValue()).booleanValue();
                    boolean zI7 = x340Var5.i(gdf1Var);
                    Object objT19 = x340Var5.T();
                    if (zI7 || objT19 == obj) {
                        objT19 = new x0e1(gdf1Var, err0Var, (byte) 17);
                        x340Var5.s0(objT19);
                    }
                    z5 = true;
                    z6 = false;
                    gdf1Var.e(d3kVar4, zBooleanValue4, zBooleanValue5, (Function0) objT19, x340Var5, (i5 << 3) & 57344);
                    x340Var5.r(false);
                } else {
                    z5 = true;
                    z6 = false;
                    x340Var5.i0(745613069);
                    xto1.e((qim0) null, 0, 0L, 0L, x340Var5, 0, 15);
                    x340Var5 = x340Var5;
                    x340Var5.r(false);
                }
                x340Var5.r(z5);
                x340Var5.r(z6);
                h311 h311VarV = x340Var5.v();
                if (h311VarV != null) {
                    h311VarV.d = new edf1(this, i2cVar, rk41Var, function0, i, (byte) 0);
                    return;
                }
                return;
            }
            i2cVar2 = i2cVar;
            vu30 vu30Var3 = vu30Var;
            llj lljVar3 = lljVar;
            x340Var5.i0(340022234);
            x340Var5.r(false);
            kjd kjdVarI = b0o1.i(x340Var5);
            boolean zG4 = x340Var5.g(tob1Var2);
            Object objT20 = x340Var5.T();
            if (zG4 || objT20 == obj) {
                objT20 = new ctd1(tob1Var2, (byte) 26);
                x340Var5.s0(objT20);
            }
            b0o1.a(kjdVarI, i541.C(qim0VarA, (iu30) objT20), 0, 0, 0.0f, 0.0f, 0L, x340Var5, 0, 124);
            x340Var = x340Var5;
            float fC = i2cVar2.c() * 0.125f;
            Object objT21 = x340Var.T();
            if (objT21 == obj) {
                objT21 = pzm.i(x340Var);
            }
            lz20 lz20Var2 = (lz20) objT21;
            tcf1 tcf1Var3 = tcf1Var2;
            Boolean bool3 = (Boolean) tcf1Var3.g.getValue();
            kjd kjdVar = kjdVarI;
            boolean zBooleanValue6 = bool3.booleanValue();
            if (((Boolean) ven0VarY.getValue()).booleanValue()) {
                x340Var.i0(340448360);
                boolean zH2 = x340Var.h(zBooleanValue6) | x340Var.i(gdf1Var) | x340Var.i(view);
                z3 = zBooleanValue6;
                Object objT22 = x340Var.T();
                if (zH2 || objT22 == obj) {
                    lz20Var = lz20Var2;
                    tcf1Var = tcf1Var3;
                    th = null;
                    bool = bool3;
                    z4 = false;
                    objT22 = new bfb1(z3, gdf1Var, view, lz20Var, (lnm) null, (byte) 19);
                    gdf1Var = gdf1Var;
                    x340Var.s0(objT22);
                } else {
                    lz20Var = lz20Var2;
                    tcf1Var = tcf1Var3;
                    th = null;
                    bool = bool3;
                    z4 = false;
                }
                qxd0.t(bool, x340Var, (vu30) objT22);
                x340Var.r(z4);
                r11 = z4;
            } else {
                z3 = zBooleanValue6;
                lz20Var = lz20Var2;
                tcf1Var = tcf1Var3;
                vu30Var3 = vu30Var3;
                lljVar3 = lljVar3;
                kjdVar = kjdVar;
                th = null;
                vu30Var2 = vu30Var2;
                r11 = 0;
                x340Var.i0(340988442);
                x340Var.r(false);
            }
            qim0 qim0VarA2 = i2cVar2.a(u291.f(qim0VarA, 1.0f), een.X);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = uyn1.y(qim0VarA2, cbx.b(x340Var).b.a, fC);
            Object objT23 = x340Var.T();
            if (objT23 == obj) {
                objT23 = v7f1.T0;
                x340Var.s0(objT23);
            }
            qim0 qim0VarThen = vby0.p(s161.b(qim0VarY, true, (iu30) objT23), lz20Var).then(c030.a);
            mbh mbhVarA = jbh.a(h36.d, een.Q0, x340Var, 54);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar2);
            vu30 vu30Var4 = vu30Var2;
            nko1.H(xos0VarM2, x340Var, vu30Var4);
            llj lljVar4 = lljVar3;
            x0d.q(iHashCode2, x340Var, lljVar4, x340Var);
            vu30 vu30Var5 = vu30Var3;
            nko1.H(qim0VarE2, x340Var, vu30Var5);
            if (z3) {
                x340Var.i0(1236684870);
            } else {
                x340Var.i0(1236685621);
                Object objT24 = x340Var.T();
                if (objT24 == obj) {
                    objT24 = v7f1.U0;
                    x340Var.s0(objT24);
                }
                qim0VarA = s161.a(qim0VarA, (iu30) objT24);
            }
            x340Var.r((boolean) r11);
            qim0 qim0VarX = ern1.x(qim0VarA, new m4d(kjdVar, (byte) 2));
            gfh0 gfh0VarC2 = t1c.c(een.d, (boolean) r11);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar2);
            nko1.H(xos0VarM3, x340Var, vu30Var4);
            x0d.q(iHashCode3, x340Var, lljVar4, x340Var);
            nko1.H(qim0VarE3, x340Var, vu30Var5);
            h7w.l(gdf1Var.a, tcf1Var, x340Var, (int) r11);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            i2cVar2 = i2cVar;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new edf1(gdf1Var, i2cVar2, rk41Var, function0, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void e(d3k d3kVar, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        Object objI;
        ?? r5;
        sjz sjzVar;
        xhm1 xhm1Var;
        boolean z3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1494779869);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.e(d3kVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(this) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objI = objT;
                objI = pzm.i(b0kVar3);
            }
            objI = objT;
            lz20 lz20Var = (lz20) objI;
            String strO0 = cwl1.o0(b0kVar3, 2131963937);
            sjz sjzVarC = whm1.c(d3kVar);
            xhm1 xhm1Var2 = (xhm1) b0kVar3.k(yhm1.a);
            boolean zI = b0kVar3.i(this) | b0kVar3.e(sjzVarC.ordinal());
            Object objT2 = b0kVar3.T();
            Object obj = objT2;
            if (zI || objT2 == m4cVar) {
                cmd1 cmd1Var = new cmd1(this, sjzVarC, (byte) 22);
                b0kVar3.s0(cmd1Var);
                obj = cmd1Var;
            }
            iu30 iu30Var = (iu30) obj;
            tjz tjzVar = this.d;
            boolean zI2 = b0kVar3.i(tjzVar);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new hcf1(1, tjzVar, tjz.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 1);
                b0kVar3.s0(objT3);
            }
            yhm1.a(sjzVarC, iu30Var, (iu30) objT3, b0kVar3, 0);
            if (z2) {
                b0kVar3.i0(766833430);
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zI3 = ((i2 & 112) == 32) | b0kVar3.i(view) | b0kVar3.g(strO0);
                Object objT4 = b0kVar3.T();
                if (zI3 || objT4 == m4cVar) {
                    xhm1Var = xhm1Var2;
                    sjzVar = sjzVarC;
                    z3 = false;
                    bfb1 bfb1Var = new bfb1(z, view, strO0, lz20Var, (lnm) null, (byte) 18);
                    b0kVar3.s0(bfb1Var);
                    objT4 = bfb1Var;
                } else {
                    sjzVar = sjzVarC;
                    xhm1Var = xhm1Var2;
                    z3 = false;
                }
                qxd0.t(boolValueOf, b0kVar3, (vu30) objT4);
                b0kVar3.r(z3);
                r5 = z3;
            } else {
                r5 = 0;
                m4cVar = m4cVar;
                sjzVar = sjzVarC;
                xhm1Var = xhm1Var2;
                b0kVar3.i0(767186117);
                b0kVar3.r(false);
            }
            wrx wrxVar = wrx.c;
            jsl jslVar = new jsl(cwl1.o0(b0kVar3, 2131963938));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            qim0 qim0VarP = vby0.p(u291.r(nim0.a, 64.0f), lz20Var);
            pm31 pm31Var = new pm31((int) r5);
            int i3 = (((b0kVar3.i(xhm1Var) ? 1 : 0) | (b0kVar3.i(this) ? 1 : 0)) | (b0kVar3.e(sjzVar.ordinal()) ? 1 : 0) ? 1 : 0) | ((i2 & 7168) != 2048 ? r5 : 1);
            Object objT5 = b0kVar3.T();
            if (i3 != 0 || objT5 == m4cVar) {
                odp0 odp0Var = new odp0(xhm1Var, function0, this, sjzVar, (byte) 19);
                b0kVar3.s0(odp0Var);
                objT5 = odp0Var;
            }
            b0kVar2 = b0kVar3;
            w0h1.a(wrxVar, jslVar, bin.x(qim0VarP, false, (String) null, pm31Var, (idn0) null, (Function0) objT5, 11), 0L, 0L, false, b0kVar2, wrx.d, 56);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(this, d3kVar, z, z2, function0, i);
        }
    }

    public final void f(z2k1 z2k1Var, d3k d3kVar, tob1 tob1Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1348186853);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(z2k1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(d3kVar == null ? -1 : d3kVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(tob1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarS = v8r.s(d3kVar, x340Var);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            int i3 = i2 & 112;
            boolean zI = (i3 == 32) | x340Var.i(this) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new rsc1(d3kVar, this, tob1Var);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarD, (iu30) objT);
            int i4 = i2 & 14;
            boolean zI2 = x340Var.i(this) | (i4 == 4) | x340Var.g(ven0VarS);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new rsc1(this, z2k1Var, ven0VarS, (byte) 15);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI3 = (i4 == 4) | x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new cmd1(this, z2k1Var, (byte) 23);
                x340Var.s0(objT3);
            }
            iu30 iu30Var2 = (iu30) objT3;
            boolean zI4 = x340Var.i(this) | (i3 == 32);
            Object objT4 = x340Var.T();
            if (zI4 || objT4 == m4cVar) {
                objT4 = new cmd1(d3kVar, this, (byte) 24);
                x340Var.s0(objT4);
            }
            dm5.b(iu30Var, qim0VarC, (iu30) null, iu30Var2, (iu30) objT4, x340Var, 0, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, z2k1Var, d3kVar, tob1Var, (byte) 2);
        }
    }

    public final boolean g() {
        return (this.m || this.n) ? false : true;
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return nk41.a;
    }
}
