package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.font.FontWeight;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class htd1 {
    public static final long a = z4p1.g(4285628159L);

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1902678038);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131963051);
            foo1.c(new gbx(z50.c, function0), jdx.c, anm1.N("TasteMatchCancelFriendRequest", qim0Var), z ? new hax(strO0) : jax.a, yla.s(x340Var), null, null, null, null, null, apo.r(1088022475, new zsd1(strO0, (byte) 0), x340Var), x340Var, 0, 48, 1992);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var, i, (byte) 20);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-9432913);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gpx gpxVar = gpx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131963053));
            qim0Var2 = nim0.a;
            w0h1.a(gpxVar, jslVar, bin.x(anm1.N("TasteMatchContextMenu", u291.r(uyn1.x(qim0Var2, 12.0f), 24.0f)), false, null, null, null, function0, 15), j, 0L, false, x340Var, gpx.d, 48);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 10);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(ssd1 ssd1Var, long j, long j2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(595938261);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ssd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = ssd1Var.e.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(1466024630);
                strN0 = cwl1.n0(2131963050, new Object[]{"\u0000"}, x340Var);
                x340Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, 1466023319, false);
                }
                x340Var.i0(-1797779167);
                String str = ssd1Var.f;
                if (str == null || ihc1.y0(str)) {
                    x340Var.i0(-1797699032);
                    strN0 = cwl1.n0(2131963059, new Object[]{"\u0000"}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1797592981);
                    strN0 = cwl1.n0(2131963058, new Object[]{"\u0000", str}, x340Var);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            int i3 = i2 << 6;
            i1p1.n(strN0, ssd1Var.d, j, j2, x340Var, (i3 & 7168) | 384 | (i3 & 57344));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bfx((byte) 2, i, j, j2, ssd1Var);
        }
    }

    public static final void d(int i, int i2, long j, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-170797247);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.f(j) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strN0 = cwl1.n0(2131963055, new Object[]{Integer.valueOf(i)}, x340Var);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).b;
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            gxo1.c(strN0, null, lee1Var, j, null, 0, false, new cjc0(1), null, 150.0f, (FontWeight) ((bjx) yfuVar.c).f, null, x340Var, (i3 << 6) & 7168, 0, 2418);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new atd1(i, j, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:434:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:443:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:445:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:449:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:451:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:452:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:455:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:458:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:460:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:463:0x0b6b  */
    /* JADX WARN: Code duplicated, block: B:465:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:466:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:470:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:472:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:474:0x0c0b  */
    /* JADX WARN: Code duplicated, block: B:476:0x0c0f  */
    public static final void e(tsd1 tsd1Var, afx afxVar, afx afxVar2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        boolean z;
        Object objJ;
        boolean z2;
        Object objJ2;
        Object objJ3;
        Object objJ4;
        afx afxVar3;
        long j;
        Object objJ5;
        Object objJ6;
        Object objJ7;
        Object objJ8;
        qim0 qim0VarX;
        Object obj;
        qim0 qim0Var3;
        Object obj2;
        boolean z3;
        fhg1 fhg1Var;
        fhg1 fhg1Var2;
        boolean zI;
        Object objT;
        boolean z4;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z5;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        gfh0 gfh0VarC2;
        int iHashCode2;
        xos0 xos0VarM2;
        qim0 qim0VarE2;
        boolean z6;
        boolean z7;
        tob1 tob1Var;
        int i3;
        qim0 qim0VarB;
        mbh mbhVarA;
        int iHashCode3;
        xos0 xos0VarM3;
        qim0 qim0VarE3;
        boolean zI2;
        Object obj3;
        boolean zI3;
        Object objT2;
        Object obj4;
        m4h m4hVar = m4h.X0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1494792336);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(tsd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(afxVar) : x340Var2.i(afxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var2.g(afxVar2) : x340Var2.i(afxVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if (x340Var2.Y(i4 & 1, (i4 & 9363) != 9362)) {
            ssd1 ssd1Var = tsd1Var instanceof ssd1 ? (ssd1) tsd1Var : null;
            boolean z8 = ssd1Var != null;
            boolean z9 = (tsd1Var instanceof rsd1 ? (rsd1) tsd1Var : null) != null;
            bjg1 bjg1VarY = bno1.y(Boolean.valueOf((tsd1Var instanceof qsd1 ? (qsd1) tsd1Var : null) == null), "taste_match_reveal", x340Var2, 48, 0);
            hrr0 hrr0Var = ((mhg1) bjg1VarY).d;
            k9 k9Var = ((mhg1) bjg1VarY).a;
            uwr uwrVar = cbx.a;
            int iT = jfv.t(cbx.c(x340Var2).b.b, ngv.d);
            ceo ceoVar = ((jhx) cbx.c(x340Var2).a.b).a;
            dtd1 dtd1Var = new dtd1(iT, ceoVar, (byte) 5);
            if (bjg1VarY.g()) {
                j06Var = j06Var;
                z = false;
                objJ = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG = x340Var2.g(bjg1VarY);
                objJ = x340Var2.T();
                if (zG || objJ == m4cVar) {
                    jv91 jv91VarO = ekb.o();
                    iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                    jv91 jv91VarU = ekb.u(jv91VarO);
                    try {
                        Object objP0 = k9Var.P0();
                        ekb.C(jv91VarO, jv91VarU, iu30VarE);
                        x340Var2.s0(objP0);
                        objJ = objP0;
                    } catch (Throwable th) {
                        ekb.C(jv91VarO, jv91VarU, iu30VarE);
                        throw th;
                    }
                } else {
                    j06Var = j06Var;
                }
                z = false;
                x340Var2.r(false);
            }
            boolean zBooleanValue = ((Boolean) objJ).booleanValue();
            x340Var2.i0(-831630372);
            float f = zBooleanValue ? 1.0f : 0.0f;
            x340Var2.r(z);
            Float fValueOf = Float.valueOf(f);
            boolean zG2 = x340Var2.g(bjg1VarY);
            Object objT3 = x340Var2.T();
            Object obj5 = objT3;
            if (zG2 || objT3 == m4cVar) {
                mdt mdtVarA = yv91.a(new btd1(bjg1VarY, (byte) 5));
                x340Var2.s0(mdtVarA);
                obj5 = mdtVarA;
            }
            boolean zBooleanValue2 = ((Boolean) ((tob1) obj5).getValue()).booleanValue();
            x340Var2.i0(-831630372);
            float f2 = zBooleanValue2 ? 1.0f : 0.0f;
            x340Var2.r(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zG3 = x340Var2.g(bjg1VarY);
            Object objT4 = x340Var2.T();
            Object obj6 = objT4;
            if (zG3 || objT4 == m4cVar) {
                mdt mdtVarA2 = yv91.a(new btd1(bjg1VarY, (byte) 6));
                x340Var2.s0(mdtVarA2);
                obj6 = mdtVarA2;
            }
            ni20 ni20Var = (ni20) dtd1Var.invoke(((tob1) obj6).getValue(), x340Var2, 0);
            tzg1 tzg1Var = rno1.a;
            hrr0 hrr0Var2 = hrr0Var;
            fhg1 fhg1VarO = bno1.o(bjg1VarY, fValueOf, fValueOf2, ni20Var, tzg1Var, x340Var2, 196608);
            etd1 etd1Var = new etd1(iT / 4, iT, ceoVar);
            if (bjg1VarY.g()) {
                hrr0Var2 = hrr0Var2;
                z2 = false;
                objJ2 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG4 = x340Var2.g(bjg1VarY);
                objJ2 = x340Var2.T();
                if (zG4 || objJ2 == m4cVar) {
                    jv91 jv91VarO2 = ekb.o();
                    iu30 iu30VarE2 = jv91VarO2 != null ? jv91VarO2.e() : null;
                    jv91 jv91VarU2 = ekb.u(jv91VarO2);
                    try {
                        Object objP1 = k9Var.P0();
                        ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                        x340Var2.s0(objP1);
                        objJ2 = objP1;
                    } catch (Throwable th2) {
                        ekb.C(jv91VarO2, jv91VarU2, iu30VarE2);
                        throw th2;
                    }
                }
                z2 = false;
                x340Var2.r(false);
            }
            boolean zBooleanValue3 = ((Boolean) objJ2).booleanValue();
            x340Var2.i0(-851257222);
            float f3 = zBooleanValue3 ? 1.0f : 0.0f;
            x340Var2.r(z2);
            Float fValueOf3 = Float.valueOf(f3);
            boolean zG5 = x340Var2.g(bjg1VarY);
            Object objT5 = x340Var2.T();
            Object obj7 = objT5;
            if (zG5 || objT5 == m4cVar) {
                mdt mdtVarA3 = yv91.a(new btd1(bjg1VarY, (byte) 7));
                x340Var2.s0(mdtVarA3);
                obj7 = mdtVarA3;
            }
            boolean zBooleanValue4 = ((Boolean) ((tob1) obj7).getValue()).booleanValue();
            x340Var2.i0(-851257222);
            float f4 = zBooleanValue4 ? 1.0f : 0.0f;
            x340Var2.r(false);
            Float fValueOf4 = Float.valueOf(f4);
            boolean zG6 = x340Var2.g(bjg1VarY);
            Object objT6 = x340Var2.T();
            Object obj8 = objT6;
            if (zG6 || objT6 == m4cVar) {
                mdt mdtVarA4 = yv91.a(new btd1(bjg1VarY, (byte) 8));
                x340Var2.s0(mdtVarA4);
                obj8 = mdtVarA4;
            }
            ni20 ni20Var2 = (ni20) etd1Var.invoke(((tob1) obj8).getValue(), x340Var2, 0);
            fhg1 fhg1Var3 = fhg1VarO;
            fhg1 fhg1VarO2 = bno1.o(bjg1VarY, fValueOf3, fValueOf4, ni20Var2, tzg1Var, x340Var2, 196608);
            tzg1 tzg1Var2 = tzg1Var;
            dtd1 dtd1Var2 = new dtd1(iT, ceoVar, (byte) 4);
            if (bjg1VarY.g()) {
                tzg1Var2 = tzg1Var2;
                objJ3 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG7 = x340Var2.g(bjg1VarY);
                objJ3 = x340Var2.T();
                if (zG7 || objJ3 == m4cVar) {
                    jv91 jv91VarO3 = ekb.o();
                    iu30 iu30VarE3 = jv91VarO3 != null ? jv91VarO3.e() : null;
                    jv91 jv91VarU3 = ekb.u(jv91VarO3);
                    try {
                        Object objP2 = k9Var.P0();
                        ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                        x340Var2.s0(objP2);
                        objJ3 = objP2;
                    } catch (Throwable th3) {
                        ekb.C(jv91VarO3, jv91VarU3, iu30VarE3);
                        throw th3;
                    }
                }
                x340Var2.r(false);
            }
            boolean zBooleanValue5 = ((Boolean) objJ3).booleanValue();
            x340Var2.i0(-2012543962);
            float f5 = (zBooleanValue5 && z9) ? 0.0f : 99.0f;
            x340Var2.r(false);
            p3v p3vVar = new p3v(f5);
            boolean zG8 = x340Var2.g(bjg1VarY);
            Object objT7 = x340Var2.T();
            Object obj9 = objT7;
            if (zG8 || objT7 == m4cVar) {
                mdt mdtVarA5 = yv91.a(new btd1(bjg1VarY, (byte) 3));
                x340Var2.s0(mdtVarA5);
                obj9 = mdtVarA5;
            }
            boolean zBooleanValue6 = ((Boolean) ((tob1) obj9).getValue()).booleanValue();
            x340Var2.i0(-2012543962);
            float f6 = (zBooleanValue6 && z9) ? 0.0f : 99.0f;
            x340Var2.r(false);
            p3v p3vVar2 = new p3v(f6);
            boolean zG9 = x340Var2.g(bjg1VarY);
            Object objT8 = x340Var2.T();
            Object obj10 = objT8;
            if (zG9 || objT8 == m4cVar) {
                mdt mdtVarA6 = yv91.a(new btd1(bjg1VarY, (byte) 4));
                x340Var2.s0(mdtVarA6);
                obj10 = mdtVarA6;
            }
            tob1 tob1VarO = bno1.o(bjg1VarY, p3vVar, p3vVar2, (ni20) dtd1Var2.invoke(((tob1) obj10).getValue(), x340Var2, 0), rno1.c, x340Var2, 196608);
            dtd1 dtd1Var3 = new dtd1(iT, ceoVar, (byte) 3);
            if (bjg1VarY.g()) {
                tob1VarO = tob1VarO;
                objJ4 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG10 = x340Var2.g(bjg1VarY);
                objJ4 = x340Var2.T();
                if (zG10 || objJ4 == m4cVar) {
                    jv91 jv91VarO4 = ekb.o();
                    iu30 iu30VarE4 = jv91VarO4 != null ? jv91VarO4.e() : null;
                    jv91 jv91VarU4 = ekb.u(jv91VarO4);
                    try {
                        Object objP3 = k9Var.P0();
                        ekb.C(jv91VarO4, jv91VarU4, iu30VarE4);
                        x340Var2.s0(objP3);
                        objJ4 = objP3;
                    } catch (Throwable th4) {
                        ekb.C(jv91VarO4, jv91VarU4, iu30VarE4);
                        throw th4;
                    }
                }
                x340Var2.r(false);
            }
            boolean zBooleanValue7 = ((Boolean) objJ4).booleanValue();
            x340Var2.i0(1124876692);
            float f7 = (zBooleanValue7 && z9) ? 1.0f : 0.0f;
            x340Var2.r(false);
            Float fValueOf5 = Float.valueOf(f7);
            boolean zG11 = x340Var2.g(bjg1VarY);
            Object objT9 = x340Var2.T();
            Object obj11 = objT9;
            if (zG11 || objT9 == m4cVar) {
                mdt mdtVarA7 = yv91.a(new btd1(bjg1VarY, (byte) 9));
                x340Var2.s0(mdtVarA7);
                obj11 = mdtVarA7;
            }
            boolean zBooleanValue8 = ((Boolean) ((tob1) obj11).getValue()).booleanValue();
            x340Var2.i0(1124876692);
            float f8 = (zBooleanValue8 && z9) ? 1.0f : 0.0f;
            x340Var2.r(false);
            Float fValueOf6 = Float.valueOf(f8);
            boolean zG12 = x340Var2.g(bjg1VarY);
            Object objT10 = x340Var2.T();
            Object obj12 = objT10;
            if (zG12 || objT10 == m4cVar) {
                mdt mdtVarA8 = yv91.a(new btd1(bjg1VarY, (byte) 10));
                x340Var2.s0(mdtVarA8);
                obj12 = mdtVarA8;
            }
            fhg1 fhg1VarO3 = bno1.o(bjg1VarY, fValueOf5, fValueOf6, (ni20) dtd1Var3.invoke(((tob1) obj12).getValue(), x340Var2, 0), tzg1Var2, x340Var2, 196608);
            dtd1 dtd1Var4 = new dtd1(iT, ceoVar, (byte) 0);
            boolean zBooleanValue9 = ((Boolean) hrr0Var2.getValue()).booleanValue();
            x340Var2.i0(-718114235);
            if (zBooleanValue9) {
                afxVar3 = afxVar2;
                j = afxVar3.a.c;
            } else {
                afxVar3 = afxVar2;
                j = afxVar.a.c;
            }
            long j2 = j;
            x340Var2.r(false);
            hah hahVarE = u7h.e(j2);
            boolean zG13 = x340Var2.g(hahVarE);
            Object objT11 = x340Var2.T();
            if (zG13 || objT11 == m4cVar) {
                tzg1 tzg1Var3 = new tzg1(m4hVar, new syf(hahVarE, (byte) 20));
                x340Var2.s0(tzg1Var3);
                objT11 = tzg1Var3;
            }
            tzg1 tzg1Var4 = (tzg1) objT11;
            if (bjg1VarY.g()) {
                fhg1Var3 = fhg1Var3;
                tzg1Var4 = tzg1Var4;
                objJ5 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG14 = x340Var2.g(bjg1VarY);
                objJ5 = x340Var2.T();
                if (zG14 || objJ5 == m4cVar) {
                    jv91 jv91VarO5 = ekb.o();
                    iu30 iu30VarE5 = jv91VarO5 != null ? jv91VarO5.e() : null;
                    jv91 jv91VarU5 = ekb.u(jv91VarO5);
                    try {
                        Object objP4 = k9Var.P0();
                        ekb.C(jv91VarO5, jv91VarU5, iu30VarE5);
                        x340Var2.s0(objP4);
                        objJ5 = objP4;
                    } catch (Throwable th5) {
                        ekb.C(jv91VarO5, jv91VarU5, iu30VarE5);
                        throw th5;
                    }
                }
                x340Var2.r(false);
            }
            boolean zBooleanValue10 = ((Boolean) objJ5).booleanValue();
            x340Var2.i0(-718114235);
            u7h u7hVarL = p3d1.l(x340Var2, false, (zBooleanValue10 ? afxVar3.a : afxVar.a).c);
            boolean zG15 = x340Var2.g(bjg1VarY);
            Object objT12 = x340Var2.T();
            Object obj13 = objT12;
            if (zG15 || objT12 == m4cVar) {
                mdt mdtVarA9 = yv91.a(new ro20(bjg1VarY, (byte) 25));
                x340Var2.s0(mdtVarA9);
                obj13 = mdtVarA9;
            }
            boolean zBooleanValue11 = ((Boolean) ((tob1) obj13).getValue()).booleanValue();
            x340Var2.i0(-718114235);
            u7h u7hVarL2 = p3d1.l(x340Var2, false, (zBooleanValue11 ? afxVar3.a : afxVar.a).c);
            boolean zG16 = x340Var2.g(bjg1VarY);
            Object objT13 = x340Var2.T();
            Object obj14 = objT13;
            if (zG16 || objT13 == m4cVar) {
                mdt mdtVarA10 = yv91.a(new ro20(bjg1VarY, (byte) 26));
                x340Var2.s0(mdtVarA10);
                obj14 = mdtVarA10;
            }
            afx afxVar4 = afxVar3;
            fhg1 fhg1VarO4 = bno1.o(bjg1VarY, u7hVarL, u7hVarL2, (ni20) dtd1Var4.invoke(((tob1) obj14).getValue(), x340Var2, 0), tzg1Var4, x340Var2, 196608);
            dtd1 dtd1Var5 = new dtd1(iT, ceoVar, (byte) 1);
            boolean zBooleanValue12 = ((Boolean) hrr0Var2.getValue()).booleanValue();
            x340Var2.i0(296392362);
            long jC = zBooleanValue12 ? afxVar4.a.a.c() : afxVar.a.a.c();
            x340Var2.r(false);
            hah hahVarE2 = u7h.e(jC);
            boolean zG17 = x340Var2.g(hahVarE2);
            Object objT14 = x340Var2.T();
            if (zG17 || objT14 == m4cVar) {
                tzg1 tzg1Var5 = new tzg1(m4hVar, new syf(hahVarE2, (byte) 20));
                x340Var2.s0(tzg1Var5);
                objT14 = tzg1Var5;
            }
            tzg1 tzg1Var6 = (tzg1) objT14;
            if (bjg1VarY.g()) {
                fhg1VarO4 = fhg1VarO4;
                tzg1Var6 = tzg1Var6;
                objJ6 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG18 = x340Var2.g(bjg1VarY);
                objJ6 = x340Var2.T();
                if (zG18 || objJ6 == m4cVar) {
                    jv91 jv91VarO6 = ekb.o();
                    iu30 iu30VarE6 = jv91VarO6 != null ? jv91VarO6.e() : null;
                    jv91 jv91VarU6 = ekb.u(jv91VarO6);
                    try {
                        Object objP5 = k9Var.P0();
                        ekb.C(jv91VarO6, jv91VarU6, iu30VarE6);
                        x340Var2.s0(objP5);
                        objJ6 = objP5;
                    } catch (Throwable th6) {
                        ekb.C(jv91VarO6, jv91VarU6, iu30VarE6);
                        throw th6;
                    }
                }
                x340Var2.r(false);
            }
            boolean zBooleanValue13 = ((Boolean) objJ6).booleanValue();
            x340Var2.i0(296392362);
            u7h u7hVarL3 = p3d1.l(x340Var2, false, zBooleanValue13 ? afxVar4.a.a.c() : afxVar.a.a.c());
            boolean zG19 = x340Var2.g(bjg1VarY);
            Object objT15 = x340Var2.T();
            Object obj15 = objT15;
            if (zG19 || objT15 == m4cVar) {
                mdt mdtVarA11 = yv91.a(new ro20(bjg1VarY, (byte) 27));
                x340Var2.s0(mdtVarA11);
                obj15 = mdtVarA11;
            }
            boolean zBooleanValue14 = ((Boolean) ((tob1) obj15).getValue()).booleanValue();
            x340Var2.i0(296392362);
            u7h u7hVarL4 = p3d1.l(x340Var2, false, zBooleanValue14 ? afxVar4.a.a.c() : afxVar.a.a.c());
            boolean zG20 = x340Var2.g(bjg1VarY);
            Object objT16 = x340Var2.T();
            Object obj16 = objT16;
            if (zG20 || objT16 == m4cVar) {
                mdt mdtVarA12 = yv91.a(new ro20(bjg1VarY, (byte) 28));
                x340Var2.s0(mdtVarA12);
                obj16 = mdtVarA12;
            }
            fhg1 fhg1VarO5 = bno1.o(bjg1VarY, u7hVarL3, u7hVarL4, (ni20) dtd1Var5.invoke(((tob1) obj16).getValue(), x340Var2, 0), tzg1Var6, x340Var2, 196608);
            dtd1 dtd1Var6 = new dtd1(iT, ceoVar, (byte) 2);
            boolean zBooleanValue15 = ((Boolean) hrr0Var2.getValue()).booleanValue();
            x340Var2.i0(-299865561);
            long jC2 = zBooleanValue15 ? afxVar4.a.a.c() : afxVar.a.a.c();
            x340Var2.r(false);
            hah hahVarE3 = u7h.e(jC2);
            boolean zG21 = x340Var2.g(hahVarE3);
            Object objT17 = x340Var2.T();
            if (zG21 || objT17 == m4cVar) {
                tzg1 tzg1Var7 = new tzg1(m4hVar, new syf(hahVarE3, (byte) 20));
                x340Var2.s0(tzg1Var7);
                objT17 = tzg1Var7;
            }
            tzg1 tzg1Var8 = (tzg1) objT17;
            if (bjg1VarY.g()) {
                fhg1VarO5 = fhg1VarO5;
                tzg1Var8 = tzg1Var8;
                objJ7 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG22 = x340Var2.g(bjg1VarY);
                objJ7 = x340Var2.T();
                if (zG22 || objJ7 == m4cVar) {
                    jv91 jv91VarO7 = ekb.o();
                    iu30 iu30VarE7 = jv91VarO7 != null ? jv91VarO7.e() : null;
                    jv91 jv91VarU7 = ekb.u(jv91VarO7);
                    try {
                        Object objP6 = k9Var.P0();
                        ekb.C(jv91VarO7, jv91VarU7, iu30VarE7);
                        x340Var2.s0(objP6);
                        objJ7 = objP6;
                    } catch (Throwable th7) {
                        ekb.C(jv91VarO7, jv91VarU7, iu30VarE7);
                        throw th7;
                    }
                }
                x340Var2.r(false);
            }
            boolean zBooleanValue16 = ((Boolean) objJ7).booleanValue();
            x340Var2.i0(-299865561);
            u7h u7hVarL5 = p3d1.l(x340Var2, false, zBooleanValue16 ? afxVar4.a.a.c() : afxVar.a.a.c());
            boolean zG23 = x340Var2.g(bjg1VarY);
            Object objT18 = x340Var2.T();
            Object obj17 = objT18;
            if (zG23 || objT18 == m4cVar) {
                mdt mdtVarA13 = yv91.a(new ro20(bjg1VarY, (byte) 29));
                x340Var2.s0(mdtVarA13);
                obj17 = mdtVarA13;
            }
            boolean zBooleanValue17 = ((Boolean) ((tob1) obj17).getValue()).booleanValue();
            x340Var2.i0(-299865561);
            u7h u7hVarL6 = p3d1.l(x340Var2, false, zBooleanValue17 ? afxVar4.a.a.c() : afxVar.a.a.c());
            boolean zG24 = x340Var2.g(bjg1VarY);
            Object objT19 = x340Var2.T();
            Object obj18 = objT19;
            if (zG24 || objT19 == m4cVar) {
                mdt mdtVarA14 = yv91.a(new btd1(bjg1VarY, (byte) 0));
                x340Var2.s0(mdtVarA14);
                obj18 = mdtVarA14;
            }
            fhg1 fhg1VarO6 = bno1.o(bjg1VarY, u7hVarL5, u7hVarL6, (ni20) dtd1Var6.invoke(((tob1) obj18).getValue(), x340Var2, 0), tzg1Var8, x340Var2, 196608);
            dtd1 dtd1Var7 = new dtd1(iT, ceoVar, (byte) 6);
            boolean zBooleanValue18 = ((Boolean) hrr0Var2.getValue()).booleanValue();
            x340Var2.i0(-1414637319);
            long j3 = zBooleanValue18 ? afxVar4.b.a : afxVar.b.b;
            x340Var2.r(false);
            hah hahVarE4 = u7h.e(j3);
            boolean zG25 = x340Var2.g(hahVarE4);
            Object objT20 = x340Var2.T();
            Object obj19 = objT20;
            if (zG25 || objT20 == m4cVar) {
                tzg1 tzg1Var9 = new tzg1(m4hVar, new syf(hahVarE4, (byte) 20));
                x340Var2.s0(tzg1Var9);
                obj19 = tzg1Var9;
            }
            tzg1 tzg1Var10 = (tzg1) obj19;
            if (bjg1VarY.g()) {
                objJ8 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG26 = x340Var2.g(bjg1VarY);
                objJ8 = x340Var2.T();
                if (zG26 || objJ8 == m4cVar) {
                    jv91 jv91VarO8 = ekb.o();
                    iu30 iu30VarE8 = jv91VarO8 != null ? jv91VarO8.e() : null;
                    jv91 jv91VarU8 = ekb.u(jv91VarO8);
                    try {
                        Object objP7 = k9Var.P0();
                        ekb.C(jv91VarO8, jv91VarU8, iu30VarE8);
                        x340Var2.s0(objP7);
                        objJ8 = objP7;
                    } catch (Throwable th8) {
                        ekb.C(jv91VarO8, jv91VarU8, iu30VarE8);
                        throw th8;
                    }
                }
                x340Var2.r(false);
            }
            boolean zBooleanValue19 = ((Boolean) objJ8).booleanValue();
            x340Var2.i0(-1414637319);
            u7h u7hVarL7 = p3d1.l(x340Var2, false, zBooleanValue19 ? afxVar4.b.a : afxVar.b.b);
            boolean zG27 = x340Var2.g(bjg1VarY);
            Object objT21 = x340Var2.T();
            Object obj20 = objT21;
            if (zG27 || objT21 == m4cVar) {
                mdt mdtVarA15 = yv91.a(new btd1(bjg1VarY, (byte) 1));
                x340Var2.s0(mdtVarA15);
                obj20 = mdtVarA15;
            }
            boolean zBooleanValue20 = ((Boolean) ((tob1) obj20).getValue()).booleanValue();
            x340Var2.i0(-1414637319);
            u7h u7hVarL8 = p3d1.l(x340Var2, false, zBooleanValue20 ? afxVar4.b.a : afxVar.b.b);
            boolean zG28 = x340Var2.g(bjg1VarY);
            Object objT22 = x340Var2.T();
            Object obj21 = objT22;
            if (zG28 || objT22 == m4cVar) {
                mdt mdtVarA16 = yv91.a(new btd1(bjg1VarY, (byte) 2));
                x340Var2.s0(mdtVarA16);
                obj21 = mdtVarA16;
            }
            fhg1 fhg1VarO7 = bno1.o(bjg1VarY, u7hVarL7, u7hVarL8, (ni20) dtd1Var7.invoke(((tob1) obj21).getValue(), x340Var2, 0), tzg1Var10, x340Var2, 196608);
            String strO0 = cwl1.o0(x340Var2, 2131963060);
            Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
            cr31 cr31VarB = er31.b(16.0f);
            pxg1 pxg1VarO0 = irn1.o0(iT, 0, ceoVar, 2);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = o0c.d(qim0Var4, pxg1VarO0, 2);
            if (z8) {
                qim0Var2 = qim0Var4;
                qim0VarX = bin.x(qim0Var4, false, null, new pm31(0), null, function0, 11);
            } else {
                qim0Var2 = qim0Var4;
                qim0VarX = qim0Var2;
            }
            if (z8) {
                x340Var2.i0(-1976224712);
                x340Var2.r(false);
                qim0Var3 = qim0Var2;
            } else {
                if (z9) {
                    x340Var2.i0(-1976223275);
                    Object objT23 = x340Var2.T();
                    if (objT23 == m4cVar) {
                        obj2 = objT23;
                        pod1 pod1Var = pod1.Q0;
                        x340Var2.s0(pod1Var);
                        obj2 = pod1Var;
                    }
                    obj2 = objT23;
                    qim0 qim0VarB2 = s161.b(qim0Var2, true, (iu30) obj2);
                    x340Var2.r(false);
                    qim0Var3 = qim0VarB2;
                } else {
                    x340Var2.i0(-1976221295);
                    boolean zG29 = x340Var2.g(strO0);
                    Object objT24 = x340Var2.T();
                    if (zG29 || objT24 == m4cVar) {
                        obj = objT24;
                        hqa1 hqa1Var = new hqa1(strO0, (byte) 17);
                        x340Var2.s0(hqa1Var);
                        obj = hqa1Var;
                    }
                    qim0 qim0VarB3 = s161.b(qim0Var2, true, (iu30) obj);
                    x340Var2.r(false);
                    qim0Var3 = qim0VarB3;
                }
                qim0 qim0VarThen = i1p1.q(u291.j(132.0f, 0.0f, 2, u291.v(qim0Var2, 176.0f)), cr31VarB).then(qim0VarD);
                boolean zI4 = x340Var2.i(fhg1VarO3);
                if ((i4 & 112) != 32 || ((i4 & 64) != 0 && x340Var2.i(afxVar))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z10 = zI4 | z3;
                fhg1Var = fhg1VarO4;
                fhg1Var2 = fhg1VarO5;
                zI = z10 | x340Var2.i(fhg1Var) | x340Var2.i(fhg1Var2);
                objT = x340Var2.T();
                if (!zI || objT == m4cVar) {
                    z4 = true;
                    e971 e971Var = new e971(afxVar, fhg1VarO3, fhg1Var, fhg1Var2, (byte) 11);
                    x340Var2.s0(e971Var);
                    objT = e971Var;
                } else {
                    z4 = true;
                }
                qim0 qim0VarThen2 = exd0.q(qim0VarThen, (iu30) objT).then(qim0VarX).then(qim0Var3);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarThen2);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z5 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z5) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var2, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                qim0 qim0VarY = uyn1.y(u291.f(qim0Var2, 1.0f), 12.0f, 8.0f);
                gfh0VarC2 = t1c.c(graVar, false);
                iHashCode2 = Long.hashCode(x340Var2.T);
                xos0VarM2 = x340Var2.m();
                qim0VarE2 = zr7.E(x340Var2, qim0VarY);
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                z6 = z9;
                z7 = z4;
                tob1Var = tob1VarO;
                h(ssd1Var, z6, ((Number) fhg1Var3.t.getValue()).floatValue(), ((u7h) fhg1VarO6.t.getValue()).a, afxVar.b.b, h2c.a.a(qim0Var2, een.e), x340Var2, 0);
                if (z6) {
                    x340Var2.i0(-1356445793);
                    zI3 = x340Var2.i(tob1Var);
                    objT2 = x340Var2.T();
                    if (zI3 || objT2 == m4cVar) {
                        obj4 = objT2;
                        ctd1 ctd1Var = new ctd1(tob1Var, z7 ? (byte) 1 : (byte) 0);
                        x340Var2.s0(ctd1Var);
                        obj4 = ctd1Var;
                    }
                    qim0VarB = eqr0.B(qim0Var2, (iu30) obj4);
                    i3 = 0;
                    x340Var2.r(false);
                } else {
                    i3 = 0;
                    x340Var2.i0(-1356338626);
                    x340Var2.r(false);
                    qim0VarB = uyn1.B(qim0Var2, 0.0f, 99.0f, 0.0f, 0.0f, 13);
                }
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, i3);
                iHashCode3 = Long.hashCode(x340Var2.T);
                xos0VarM3 = x340Var2.m();
                qim0VarE3 = zr7.E(x340Var2, qim0VarB);
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                localeForLanguageTag.getClass();
                String upperCase = strO0.toUpperCase(localeForLanguageTag);
                lee1 lee1Var = cbx.d(x340Var2).f;
                yfu yfuVar = ajx.a;
                Object obj22 = yfuVar.b;
                FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).d;
                long j4 = u7h.f;
                cjc0 cjc0Var = new cjc0(z7 ? 1 : 0);
                zI2 = x340Var2.i(fhg1VarO7);
                Object objT25 = x340Var2.T();
                obj3 = objT25;
                if (zI2 || objT25 == m4cVar) {
                    ctd1 ctd1Var2 = new ctd1(fhg1VarO7, (byte) 0);
                    x340Var2.s0(ctd1Var2);
                    obj3 = ctd1Var2;
                }
                gxo1.c(upperCase, i541.C(qim0Var2, (iu30) obj3), lee1Var, j4, null, 0, false, cjc0Var, null, 50.0f, fontWeight, null, x340Var2, 0, 0, 2416);
                x340Var = x340Var2;
                g(tsd1Var, ((Number) fhg1VarO2.t.getValue()).floatValue(), afxVar2, afxVar, x340Var, (i4 & 910) | ((i4 << 6) & 7168));
                us71.m(x340Var, z7, z7, z7);
            }
            qim0 qim0VarThen3 = i1p1.q(u291.j(132.0f, 0.0f, 2, u291.v(qim0Var2, 176.0f)), cr31VarB).then(qim0VarD);
            boolean zI5 = x340Var2.i(fhg1VarO3);
            if ((i4 & 112) != 32) {
                z3 = true;
            } else {
                z3 = true;
            }
            boolean z11 = zI5 | z3;
            fhg1Var = fhg1VarO4;
            fhg1Var2 = fhg1VarO5;
            zI = z11 | x340Var2.i(fhg1Var) | x340Var2.i(fhg1Var2);
            objT = x340Var2.T();
            if (zI) {
                z4 = true;
                e971 e971Var2 = new e971(afxVar, fhg1VarO3, fhg1Var, fhg1Var2, (byte) 11);
                x340Var2.s0(e971Var2);
                objT = e971Var2;
            } else {
                z4 = true;
                e971 e971Var3 = new e971(afxVar, fhg1VarO3, fhg1Var, fhg1Var2, (byte) 11);
                x340Var2.s0(e971Var3);
                objT = e971Var3;
            }
            qim0 qim0VarThen4 = exd0.q(qim0VarThen3, (iu30) objT).then(qim0VarX).then(qim0Var3);
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarThen4);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z5 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z5) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar3);
            nko1.F(x340Var2);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarY2 = uyn1.y(u291.f(qim0Var2, 1.0f), 12.0f, 8.0f);
            gfh0VarC2 = t1c.c(graVar, false);
            iHashCode2 = Long.hashCode(x340Var2.T);
            xos0VarM2 = x340Var2.m();
            qim0VarE2 = zr7.E(x340Var2, qim0VarY2);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            z6 = z9;
            z7 = z4;
            tob1Var = tob1VarO;
            h(ssd1Var, z6, ((Number) fhg1Var3.t.getValue()).floatValue(), ((u7h) fhg1VarO6.t.getValue()).a, afxVar.b.b, h2c.a.a(qim0Var2, een.e), x340Var2, 0);
            if (z6) {
                x340Var2.i0(-1356445793);
                zI3 = x340Var2.i(tob1Var);
                objT2 = x340Var2.T();
                if (zI3) {
                    obj4 = objT2;
                    ctd1 ctd1Var3 = new ctd1(tob1Var, z7 ? (byte) 1 : (byte) 0);
                    x340Var2.s0(ctd1Var3);
                    obj4 = ctd1Var3;
                } else {
                    obj4 = objT2;
                    ctd1 ctd1Var4 = new ctd1(tob1Var, z7 ? (byte) 1 : (byte) 0);
                    x340Var2.s0(ctd1Var4);
                    obj4 = ctd1Var4;
                }
                qim0VarB = eqr0.B(qim0Var2, (iu30) obj4);
                i3 = 0;
                x340Var2.r(false);
            } else {
                i3 = 0;
                x340Var2.i0(-1356338626);
                x340Var2.r(false);
                qim0VarB = uyn1.B(qim0Var2, 0.0f, 99.0f, 0.0f, 0.0f, 13);
            }
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, i3);
            iHashCode3 = Long.hashCode(x340Var2.T);
            xos0VarM3 = x340Var2.m();
            qim0VarE3 = zr7.E(x340Var2, qim0VarB);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            localeForLanguageTag.getClass();
            String upperCase2 = strO0.toUpperCase(localeForLanguageTag);
            lee1 lee1Var2 = cbx.d(x340Var2).f;
            yfu yfuVar2 = ajx.a;
            Object obj23 = yfuVar2.b;
            FontWeight fontWeight2 = (FontWeight) ((bjx) yfuVar2.c).d;
            long j5 = u7h.f;
            cjc0 cjc0Var2 = new cjc0(z7 ? 1 : 0);
            zI2 = x340Var2.i(fhg1VarO7);
            Object objT26 = x340Var2.T();
            obj3 = objT26;
            if (zI2) {
                ctd1 ctd1Var5 = new ctd1(fhg1VarO7, (byte) 0);
                x340Var2.s0(ctd1Var5);
                obj3 = ctd1Var5;
            } else {
                ctd1 ctd1Var6 = new ctd1(fhg1VarO7, (byte) 0);
                x340Var2.s0(ctd1Var6);
                obj3 = ctd1Var6;
            }
            gxo1.c(upperCase2, i541.C(qim0Var2, (iu30) obj3), lee1Var2, j5, null, 0, false, cjc0Var2, null, 50.0f, fontWeight2, null, x340Var2, 0, 0, 2416);
            x340Var = x340Var2;
            g(tsd1Var, ((Number) fhg1VarO2.t.getValue()).floatValue(), afxVar2, afxVar, x340Var, (i4 & 910) | ((i4 << 6) & 7168));
            us71.m(x340Var, z7, z7, z7);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 8, i, (Object) tsd1Var, (Object) afxVar, (Object) afxVar2, (Object) function0, (Object) qim0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0155  */
    public static final void f(tsd1 tsd1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        afx afxVar;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1892943963);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(tsd1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            afx afxVarA = cbx.a(x340Var);
            boolean z = tsd1Var instanceof ssd1;
            ssd1 ssd1Var = z ? (ssd1) tsd1Var : null;
            if (ssd1Var == null || (afxVar = ssd1Var.h) == null) {
                afxVar = afxVarA;
            }
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            mbh mbhVarA = jbh.a(h36.c, een.R0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i4 = i3 & 112;
            boolean zI = x340Var.i(tsd1Var) | (i4 == 32);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new ftd1(tsd1Var, iu30Var);
                x340Var.s0(objT);
            }
            e(tsd1Var, afxVarA, afxVar, (Function0) objT, null, x340Var, i3 & 14);
            if (tsd1Var instanceof qsd1) {
                qsd1 qsd1Var = (qsd1) tsd1Var;
                if (qsd1Var.b) {
                    x340Var.i0(-1866019);
                    boolean z3 = qsd1Var.c;
                    boolean z4 = i4 == 32;
                    Object objT2 = x340Var.T();
                    if (z4 || objT2 == m4cVar) {
                        objT2 = new pwc1(iu30Var, (byte) 6);
                        x340Var.s0(objT2);
                    }
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0Var3 = qim0Var4;
                    a(0, (Function0) objT2, x340Var, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), z3);
                    x340Var.r(false);
                } else {
                    qim0Var3 = qim0Var4;
                    x340Var.i0(-1604627);
                    x340Var.r(false);
                }
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(-1604627);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (!z || ((ssd1) tsd1Var).a) {
                x340Var.i0(-507915133);
                x340Var.r(false);
            } else {
                x340Var.i0(-508008350);
                boolean zI2 = (i4 == 32) | x340Var.i(tsd1Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new ftd1(iu30Var, tsd1Var);
                    x340Var.s0(objT3);
                }
                b(0, (Function0) objT3, x340Var, null);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(tsd1Var, iu30Var, qim0Var2, i, (byte) 13);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(tsd1 tsd1Var, float f, afx afxVar, afx afxVar2, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(974767341);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(tsd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(afxVar) : x340Var.i(afxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(afxVar2) : x340Var.i(afxVar2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = tsd1Var instanceof rsd1;
            nim0 nim0Var = nim0.a;
            n4k n4kVar = hmb0.t1;
            f36 f36Var = h36.c;
            if (z) {
                x340Var.i0(1020185686);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new vbk0((byte) 21, f);
                    x340Var.s0(objT);
                }
                qim0 qim0VarC = i541.C(nim0Var, (iu30) objT);
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
                hzj.A.getClass();
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
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                d(((rsd1) tsd1Var).b, 48, a, x340Var);
                String strO0 = cwl1.o0(x340Var, 2131963054);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, null, cbx.d(x340Var).j, afxVar2.b.b, null, null, 2, false, new cjc0(3), 0, new px8(cbx.d(x340Var).m.a.b, cbx.d(x340Var).j.a.b, 0L, (mx8) null, 12), x340Var, 0, 8, 690);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            } else if (tsd1Var instanceof ssd1) {
                x340Var.i0(1020868833);
                boolean z3 = (i2 & 112) == 32;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new vbk0((byte) 22, f);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarC2 = i541.C(nim0Var, (iu30) objT2);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarC2);
                hzj.A.getClass();
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
                nko1.H(mbhVarA2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                ssd1 ssd1Var = (ssd1) tsd1Var;
                d(ssd1Var.b, 0, afxVar.b.c, x340Var);
                yxx yxxVar = afxVar.b;
                c(ssd1Var, yxxVar.b, yxxVar.a, x340Var, i2 & 14);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                if (!(tsd1Var instanceof qsd1)) {
                    throw p3d1.k(x340Var, 448550065, false);
                }
                x340Var.i0(448586641);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f61(tsd1Var, f, afxVar, afxVar2, i, (byte) 6);
        }
    }

    public static final void h(ssd1 ssd1Var, boolean z, float f, long j, long j2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2139765683);
        int i2 = i | (x340Var2.i(ssd1Var) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.d(f) ? 256 : 128) | (x340Var2.f(j) ? 2048 : 1024) | (x340Var2.f(j2) ? 16384 : 8192) | (x340Var2.i(qim0Var) ? 131072 : 65536);
        if (x340Var2.Y(i2 & 1, (74899 & i2) != 74898)) {
            cr31 cr31VarB = er31.b(16.0f);
            qim0 qim0VarR = u291.r(k1u.u(eqr0.D(0.0f, -9.0f, 1, qim0Var), -14.0f), 100.0f);
            int i3 = i2 & 896;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 256);
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new ik6(z, f, (byte) 4);
                x340Var2.s0(objT);
            }
            qim0 qim0VarQ = i1p1.q(sto1.o(i541.C(qim0VarR, (iu30) objT), 15.0f, cr31VarB, false, 0L, 0L, 28), cr31VarB);
            boolean z3 = (i2 & 7168) == 2048;
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new ps((byte) 29, j);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarQ2 = exd0.q(qim0VarQ, (iu30) objT2);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = pod1.R0;
                x340Var2.s0(objT3);
            }
            qim0 qim0VarA = s161.a(qim0VarQ2, (iu30) objT3);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131963056);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).a;
            FontWeight fontWeight = (FontWeight) ((bjx) ajx.a.c).f;
            cjc0 cjc0Var = new cjc0(1);
            boolean zI = x340Var2.i(ssd1Var) | (i3 == 256);
            Object objT4 = x340Var2.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new ef6((Object) ssd1Var, f, (byte) 6);
                x340Var2.s0(objT4);
            }
            nim0 nim0Var = nim0.a;
            gxo1.c(strO0, i541.C(nim0Var, (iu30) objT4), lee1Var, j2, new a0e1(3), 0, false, cjc0Var, null, 150.0f, fontWeight, null, x340Var2, (i2 >> 3) & 7168, 0, 2400);
            x340Var = x340Var2;
            String str = ssd1Var != null ? ssd1Var.g : null;
            if (str != null) {
                x340Var.i0(-1443627758);
                Uri uri = Uri.parse(str);
                boolean z4 = i3 == 256;
                Object objT5 = x340Var.T();
                if (z4 || objT5 == m4cVar) {
                    objT5 = new vbk0((byte) 23, f);
                    x340Var.s0(objT5);
                }
                eso1.e(uri, isl.a, i541.C(nim0Var, (iu30) objT5), new p3v(100.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 3120, 0, 4080);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-1443409425);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gtd1(ssd1Var, z, f, j, j2, qim0Var, i);
        }
    }

    public static final zfv i(dhg1 dhg1Var, int i, dlv dlvVar) {
        return (((Boolean) dhg1Var.e()).booleanValue() || !((Boolean) dhg1Var.b()).booleanValue()) ? irn1.j0() : irn1.o0(i, 0, dlvVar, 2);
    }
}
