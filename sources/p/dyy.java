package p;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dyy extends f311 {
    public final vu30 a;
    public final vu30 b;
    public final yj41 c;
    public final boolean d;
    public final vu30 e;
    public final Function0 f;
    public final ck41 g;
    public final Bitmap h;
    public final float i;
    public final float j;
    public final int k;
    public final ok41 l;

    public dyy(vu30 vu30Var, vu30 vu30Var2, yj41 yj41Var, boolean z, vu30 vu30Var3, Function0 function0, int i) {
        this(vu30Var, vu30Var2, yj41Var, z, (i & 16) != 0 ? null : vu30Var3, (i & 32) != 0 ? null : function0, null, null, (i & 256) != 0 ? 8.0f : 24.0f, (i & 512) != 0 ? 24.0f : 8.0f);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        pxg1 pxg1VarJ0;
        pxg1 pxg1VarJ1;
        pxg1 pxg1VarJ2;
        tob1 tob1Var;
        ven0 ven0VarR;
        pxg1 pxg1VarJ3;
        boolean z;
        float f;
        drr0 drr0Var;
        pxg1 pxg1VarJ4;
        float f2;
        qim0 qim0Var;
        pxg1 pxg1VarJ5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2082025624);
        j06 j06Var = x340Var.a;
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
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1043) != 1042)) {
            ven0 ven0VarY = h7w.y(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            if (((Boolean) ven0VarY.getValue()).booleanValue()) {
                x340Var.i0(2002940247);
                Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
                boolean z2 = (i3 & 112) == 32 || ((i3 & 64) != 0 && x340Var.i(rk41Var));
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new uka(rk41Var, lz20Var, null, (byte) 2);
                    x340Var.s0(objT2);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(2003143018);
                x340Var.r(false);
            }
            int i4 = this.k;
            boolean z3 = this.d;
            if (z3) {
                ilv.a.getClass();
                pxg1VarJ0 = new pxg1(700, i4 + 100, flv.g);
            } else {
                pxg1VarJ0 = irn1.j0();
            }
            if (z3) {
                ilv.a.getClass();
                pxg1VarJ1 = new pxg1(700, i4 + 200, flv.g);
            } else {
                pxg1VarJ1 = irn1.j0();
            }
            if (z3) {
                ilv.a.getClass();
                pxg1VarJ2 = new pxg1(700, i4 + 300, flv.g);
            } else {
                pxg1VarJ2 = irn1.j0();
            }
            pxg1 pxg1Var = pxg1VarJ2;
            Bitmap bitmap = this.h;
            tob1 tob1VarR = zod.R(wxo1.r("imageUp", (!z3 || (bitmap != null)) ? 0.0f : 1.0f, 0.0f, pxg1VarJ0), rk41Var.a, (Function0) null, x340Var, 8, 4);
            if (z3) {
                x340Var.i0(2004586347);
                tob1Var = tob1VarR;
                ven0VarR = zod.R(wxo1.r("titleIn", 1.0f, 0.0f, pxg1VarJ1), rk41Var.a, (Function0) null, x340Var, 8, 4);
                x340Var.r(false);
            } else {
                x340Var.i0(2004465788);
                ven0VarR = zod.y("titleIn", rk41Var, pxg1VarJ1, x340Var);
                x340Var.r(false);
                tob1Var = tob1VarR;
            }
            ven0 ven0Var = ven0VarR;
            hsi1 hsi1VarR = wxo1.r("subtitleUp", !z3 ? 0.0f : 1.0f, 0.0f, pxg1Var);
            boolean z4 = rk41Var.a;
            boolean zI = x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new cyy(this, (byte) 0);
                x340Var.s0(objT3);
            }
            ven0 ven0VarR2 = zod.R(hsi1VarR, z4, (Function0) objT3, x340Var, 8, 0);
            if (z3) {
                int i5 = i4 + StoryCard.CLASSIC_CONTENT_FIELD_NUMBER;
                ilv.a.getClass();
                pxg1VarJ3 = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, i5, flv.d);
            } else {
                pxg1VarJ3 = irn1.j0();
            }
            hsi1 hsi1VarR2 = wxo1.r("textUp", !z3 ? 0.0f : 1.0f, 0.0f, pxg1VarJ3);
            boolean z5 = rk41Var.a;
            boolean zI2 = x340Var.i(this);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                z = true;
                objT4 = new cyy(this, (byte) 1);
                x340Var.s0(objT4);
            } else {
                z = true;
            }
            boolean z6 = z;
            ven0 ven0VarR3 = zod.R(hsi1VarR2, z5, (Function0) objT4, x340Var, 8, 0);
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT5;
            float f3 = zjy.j(i2cVar.c() * 0.4f, zjy.p(0.0f, new p3v((i2cVar.c() * 0.75f) - watVar.M0(err0Var.s())))).a;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                f = 0.0f;
                objT6 = us71.i(0.0f, x340Var);
            } else {
                f = 0.0f;
            }
            drr0 drr0Var2 = (drr0) objT6;
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = us71.i(f, x340Var);
            }
            drr0 drr0Var3 = (drr0) objT7;
            j2i j2iVarR = apo.r(837229782, new qfx(this, ven0Var, ven0VarR2, ven0VarR3, (byte) 9), x340Var);
            Object objT8 = x340Var.T();
            if (objT8 == m4cVar) {
                objT8 = new tu9(err0Var, (byte) 16);
                x340Var.s0(objT8);
            }
            e(j2iVarR, null, (iu30) objT8, x340Var, (i3 & 7168) | 390);
            gra graVar = een.h;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarC = u291.c(i2cVar.a(qim0Var2, graVar), 0.75f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            boolean zG = x340Var.g(tob1Var);
            Object objT9 = x340Var.T();
            if (zG || objT9 == m4cVar) {
                objT9 = new pak(tob1Var, (byte) 8);
                x340Var.s0(objT9);
            }
            qim0 qim0VarC2 = i541.C(qim0VarF, (iu30) objT9);
            gfh0 gfh0VarC = t1c.c(een.e, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarC2);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            yj41 yj41Var = this.c;
            yk4 yk4Var = new yk4(yj41Var.a);
            ksl kslVarA = yj41Var.a();
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            qim0 qim0VarJ = v8r.j(d7e.r(1.0f, u291.h(qim0Var2, f3), false), yj41Var.c);
            Object objT10 = x340Var.T();
            if (objT10 == m4cVar) {
                objT10 = auy.c1;
                x340Var.s0(objT10);
            }
            qim0 qim0VarA = s161.a(qim0VarJ, (iu30) objT10);
            Object objT11 = x340Var.T();
            if (objT11 == m4cVar) {
                drr0Var = drr0Var2;
                objT11 = new crf(drr0Var, drr0Var3, (byte) 2);
                x340Var.s0(objT11);
            } else {
                drr0Var = drr0Var2;
            }
            drr0 drr0Var4 = drr0Var;
            eso1.f(yk4Var, kslVarA, ern1.x(qim0VarA, (iu30) objT11), (p3v) null, (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, x340Var, 1597440, 392);
            x340Var.r(z6);
            f(ven0Var, ven0VarR2, ven0VarR3, lz20Var, x340Var, ((i3 << 3) & 57344) | 3072, 0);
            x340Var = x340Var;
            x340Var.r(z6);
            if (bitmap == null) {
                x340Var.i0(2008454743);
                x340Var.r(false);
                this = this;
                qim0Var = qim0Var2;
                f2 = 0.0f;
            } else {
                x340Var.i0(2008454744);
                float fX0 = watVar.X0(i2cVar.d());
                float fX1 = watVar.X0(i2cVar.c());
                if (z3) {
                    int i6 = i4 - 134;
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    ilv.a.getClass();
                    pxg1VarJ4 = new pxg1(700, i6, flv.g);
                } else {
                    pxg1VarJ4 = irn1.j0();
                }
                f2 = 0.0f;
                ven0 ven0VarR4 = zod.R(wxo1.r("fullscreenZoomOut", 0.0f, 1.0f, pxg1VarJ4), rk41Var.a, (Function0) null, x340Var, 8, 4);
                x340Var = x340Var;
                if (((Number) ven0VarR4.getValue()).floatValue() < 1.0f) {
                    x340Var.i0(-2139068905);
                    float fS = drr0Var3.s() > 0.0f ? drr0Var3.s() : fX0 * 0.4f;
                    float fS2 = drr0Var4.s() > 0.0f ? drr0Var4.s() : 0.35f * fX1;
                    float fFloatValue = (((Number) ven0VarR4.getValue()).floatValue() * (fS - fX0)) + fX0;
                    float fFloatValue2 = (((Number) ven0VarR4.getValue()).floatValue() * (fS - fX1)) + fX1;
                    float f4 = fX1 / 2.0f;
                    float f5 = (fX0 - fFloatValue) / 2.0f;
                    float fFloatValue3 = ((((Number) ven0VarR4.getValue()).floatValue() * (fS2 - f4)) + f4) - (fFloatValue2 / 2.0f);
                    yk4 yk4Var2 = new yk4(bitmap);
                    qim0Var = qim0Var2;
                    qim0 qim0VarS = u291.s(qim0Var, watVar.N0(fFloatValue), watVar.N0(fFloatValue2));
                    boolean zD = x340Var.d(f5) | x340Var.d(fFloatValue3);
                    Object objT12 = x340Var.T();
                    if (zD || objT12 == m4cVar) {
                        objT12 = new e8(f5, fFloatValue3, (byte) 6);
                        x340Var.s0(objT12);
                    }
                    cwl1.g(yk4Var2, (String) null, eqr0.B(qim0VarS, (iu30) objT12), as80Var, 0, x340Var, 24624, 232);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    qim0Var = qim0Var2;
                    x340Var.i0(-2138035830);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            ck41 ck41Var = this.g;
            if (ck41Var == null) {
                x340Var.i0(2010397885);
                x340Var.r(false);
            } else {
                x340Var.i0(2010397886);
                if (z3) {
                    int i7 = i4 - 134;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    ilv.a.getClass();
                    pxg1VarJ5 = new pxg1(100, i7, flv.i);
                } else {
                    pxg1VarJ5 = irn1.j0();
                }
                x340 x340Var2 = x340Var;
                ven0 ven0VarR5 = zod.R(wxo1.r("preambleFadeOut", 1.0f, f2, pxg1VarJ5), rk41Var.a, (Function0) null, x340Var2, 8, 4);
                x340Var = x340Var2;
                if (((Number) ven0VarR5.getValue()).floatValue() > f2) {
                    x340Var.i0(-1086472245);
                    qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                    boolean zG2 = x340Var.g(ven0VarR5);
                    Object objT13 = x340Var.T();
                    if (zG2 || objT13 == m4cVar) {
                        objT13 = new d7v(ven0VarR5, (byte) 21);
                        x340Var.s0(objT13);
                    }
                    w2g0.c(i541.C(qim0VarD, (iu30) objT13), (tl3) null, apo.r(2037931677, new nzd(ck41Var, rk41Var, this, (byte) 28), x340Var), x340Var, 3072, 6);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1086156076);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
        } else {
            this = this;
            rk41Var = rk41Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, i2cVar, rk41Var, function0, (byte) 19);
        }
    }

    public final void e(j2i j2iVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1825478613);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3);
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ozw(j2iVar, iu30Var, (byte) 25);
                x340Var.s0(objT);
            }
            ejo1.l(0, 0, x340Var, (vu30) objT, qim0VarZ);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, j2iVar, qim0Var2, iu30Var, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0234  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x0130  */
    /* JADX WARN: Code duplicated, block: B:75:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x0182  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0226  */
    public final void f(tob1 tob1Var, tob1 tob1Var2, tob1 tob1Var3, lz20 lz20Var, b0k b0kVar, int i, int i2) {
        int i3;
        lz20 lz20Var2;
        boolean z;
        lz20 lz20Var3;
        h311 h311VarV;
        vnr0 vnr0Var;
        lz20 lz20Var4;
        qim0 qim0Var;
        Object objT;
        m4c m4cVar;
        qim0 qim0VarThen;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        Object objT2;
        int i4;
        boolean z3;
        Object objT3;
        vu30 vu30Var;
        boolean z4;
        vnr0 vnr0Var2;
        boolean z5;
        Object objT4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(190036260);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(tob1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(tob1Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(tob1Var3) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                lz20Var2 = lz20Var;
                i3 |= x340Var.g(lz20Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(this)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                vnr0Var = null;
                if (i6 != 0) {
                    lz20Var4 = null;
                } else {
                    lz20Var4 = lz20Var2;
                }
                qim0Var = nim0.a;
                qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, qim0Var);
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = auy.d1;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarZ, true, (iu30) objT);
                if (lz20Var4 != null) {
                    qim0VarThen = vby0.p(qim0Var, lz20Var4).then(c030.a);
                } else {
                    qim0VarThen = qim0Var;
                }
                qim0 qim0VarThen2 = qim0VarB.then(qim0VarThen);
                mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 54);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarThen2);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                op71.g(x340Var, u291.h(qim0Var, 40.0f));
                vnr0 vnr0Var3 = (vnr0) this.a.invoke(x340Var, 0);
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new pak(tob1Var, (byte) 9);
                    x340Var.s0(objT2);
                }
                lz20 lz20Var5 = lz20Var4;
                i4 = i3;
                qgo1.f(vnr0Var3, i541.C(qim0VarF, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                op71.g(x340Var, u291.h(qim0Var, this.i));
                vnr0 vnr0Var4 = (vnr0) this.b.invoke(x340Var, 0);
                qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                if ((i4 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT3 = x340Var.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new pak(tob1Var2, (byte) 10);
                    x340Var.s0(objT3);
                }
                qgo1.f(vnr0Var4, i541.C(qim0VarF2, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                vu30Var = this.e;
                if (vu30Var == null) {
                    x340Var.i0(-1741207253);
                    z4 = false;
                } else {
                    z4 = false;
                    x340Var.i0(2022042006);
                    vnr0Var = (vnr0) vu30Var.invoke(x340Var, 0);
                }
                x340Var.r(z4);
                vnr0Var2 = vnr0Var;
                if (vnr0Var2 == null) {
                    x340Var.i0(-1741184840);
                    x340Var.r(z4);
                } else {
                    x340Var.i0(-1741184839);
                    qim0 qim0VarO = ab80.o(qim0Var, this.j, x340Var, qim0Var, 1.0f);
                    if ((i4 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objT4 = x340Var.T();
                    if (z5 || objT4 == m4cVar) {
                        objT4 = new pak(tob1Var3, (byte) 11);
                        x340Var.s0(objT4);
                    }
                    qgo1.f(vnr0Var2, i541.C(qim0VarO, (iu30) objT4), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                    x340Var.r(false);
                }
                x340Var.r(true);
                lz20Var3 = lz20Var5;
            } else {
                x340Var.b0();
                lz20Var3 = lz20Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(this, tob1Var, tob1Var2, tob1Var3, lz20Var3, i, i2, (byte) 8);
            }
        }
        i3 |= 3072;
        lz20Var2 = lz20Var;
        if ((i & 24576) == 0) {
            if (x340Var.i(this)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            vnr0Var = null;
            if (i6 != 0) {
                lz20Var4 = null;
            } else {
                lz20Var4 = lz20Var2;
            }
            qim0Var = nim0.a;
            qim0 qim0VarZ2 = uyn1.z(24.0f, 0.0f, 2, qim0Var);
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = auy.d1;
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarZ2, true, (iu30) objT);
            if (lz20Var4 != null) {
                qim0VarThen = vby0.p(qim0Var, lz20Var4).then(c030.a);
            } else {
                qim0VarThen = qim0Var;
            }
            qim0 qim0VarThen3 = qim0VarB2.then(qim0VarThen);
            mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 54);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarThen3);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            op71.g(x340Var, u291.h(qim0Var, 40.0f));
            vnr0 vnr0Var5 = (vnr0) this.a.invoke(x340Var, 0);
            qim0 qim0VarF3 = u291.f(qim0Var, 1.0f);
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objT2 = x340Var.T();
            if (z2) {
                objT2 = new pak(tob1Var, (byte) 9);
                x340Var.s0(objT2);
            } else {
                objT2 = new pak(tob1Var, (byte) 9);
                x340Var.s0(objT2);
            }
            lz20 lz20Var6 = lz20Var4;
            i4 = i3;
            qgo1.f(vnr0Var5, i541.C(qim0VarF3, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            op71.g(x340Var, u291.h(qim0Var, this.i));
            vnr0 vnr0Var6 = (vnr0) this.b.invoke(x340Var, 0);
            qim0 qim0VarF4 = u291.f(qim0Var, 1.0f);
            if ((i4 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objT3 = x340Var.T();
            if (z3) {
                objT3 = new pak(tob1Var2, (byte) 10);
                x340Var.s0(objT3);
            } else {
                objT3 = new pak(tob1Var2, (byte) 10);
                x340Var.s0(objT3);
            }
            qgo1.f(vnr0Var6, i541.C(qim0VarF4, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            vu30Var = this.e;
            if (vu30Var == null) {
                x340Var.i0(-1741207253);
                z4 = false;
            } else {
                z4 = false;
                x340Var.i0(2022042006);
                vnr0Var = (vnr0) vu30Var.invoke(x340Var, 0);
            }
            x340Var.r(z4);
            vnr0Var2 = vnr0Var;
            if (vnr0Var2 == null) {
                x340Var.i0(-1741184840);
                x340Var.r(z4);
            } else {
                x340Var.i0(-1741184839);
                qim0 qim0VarO2 = ab80.o(qim0Var, this.j, x340Var, qim0Var, 1.0f);
                if ((i4 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objT4 = x340Var.T();
                if (z5) {
                    objT4 = new pak(tob1Var3, (byte) 11);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new pak(tob1Var3, (byte) 11);
                    x340Var.s0(objT4);
                }
                qgo1.f(vnr0Var2, i541.C(qim0VarO2, (iu30) objT4), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                x340Var.r(false);
            }
            x340Var.r(true);
            lz20Var3 = lz20Var6;
        } else {
            x340Var.b0();
            lz20Var3 = lz20Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(this, tob1Var, tob1Var2, tob1Var3, lz20Var3, i, i2, (byte) 8);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.l;
    }

    public dyy(vu30 vu30Var, vu30 vu30Var2, yj41 yj41Var, boolean z, vu30 vu30Var3, Function0 function0, ck41 ck41Var, Bitmap bitmap, float f, float f2) {
        this.a = vu30Var;
        this.b = vu30Var2;
        this.c = yj41Var;
        this.d = z;
        this.e = vu30Var3;
        this.f = function0;
        this.g = ck41Var;
        this.h = bitmap;
        this.i = f;
        this.j = f2;
        int i = ck41Var != null ? 3000 : 0;
        this.k = i;
        this.l = new ok41(i + (vu30Var3 != null ? 2000 : StoryCard.CLASSIC_CONTENT_FIELD_NUMBER));
    }
}
