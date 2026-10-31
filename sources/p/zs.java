package p;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zs extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(hdk hdkVar, iu30 iu30Var, boolean z) {
        super(2);
        this.a = (byte) 11;
        this.c = hdkVar;
        this.d = iu30Var;
        this.b = z;
    }

    private final Object a(Object obj, Object obj2) {
        ulx0 ulx0Var;
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long jB;
        long j5;
        long j6;
        boolean z2;
        Object objJ;
        boolean z3;
        Object objJ2;
        boolean z4;
        Object objJ3;
        Object objJ4;
        boolean z5;
        float f;
        boolean z6;
        float f2;
        boolean z7;
        Object objJ5;
        boolean z8;
        Object objJ6;
        boolean z9;
        Object objJ7;
        boolean z10;
        Object objJ8;
        Object objA;
        boolean z11;
        Object objJ9;
        boolean z12;
        Object obj3 = this.d;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4h m4hVar = m4h.X0;
        hdk hdkVar = (hdk) this.c;
        int i = hdkVar.E;
        int i2 = hdkVar.D;
        String str = hdkVar.a;
        Object obj4 = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            String str2 = hdkVar.u;
            boolean zJ = u890.j(str2, "reserved.announce");
            ulx0 ulx0Var2 = ulx0.b;
            if (zJ) {
                ulx0Var = ulx0.a;
            } else {
                ulx0Var = u890.j(str2, "reserved.sale") ? ulx0Var2 : ulx0.c;
            }
            u7h u7hVar = hdkVar.k;
            Object[] objArr = {str};
            df41 df41Var = vr21.b;
            boolean zE = x340Var2.e(ulx0Var.ordinal());
            Object objT = x340Var2.T();
            if (zE || objT == obj4) {
                objT = new vjh(ulx0Var, (byte) 13);
                x340Var2.s0(objT);
            }
            vr21 vr21Var = (vr21) k5p1.u(objArr, df41Var, (Function0) objT, x340Var2, 0);
            boolean zG = x340Var2.g(str) | x340Var2.e(ulx0Var.ordinal());
            Object objT2 = x340Var2.T();
            if (zG || objT2 == obj4) {
                if (vr21Var.a || ulx0Var != ulx0Var2) {
                    z = false;
                } else {
                    vr21Var.a = true;
                    z = true;
                }
                objT2 = Boolean.valueOf(z);
                x340Var2.s0(objT2);
            }
            boolean zBooleanValue = ((Boolean) objT2).booleanValue();
            boolean zG2 = x340Var2.g(str);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == obj4) {
                objT3 = bb00.h(0, x340Var2);
            }
            hdn0 hdn0Var = (hdn0) objT3;
            ven0 ven0VarS = v8r.s(ulx0Var, x340Var2);
            boolean zG3 = x340Var2.g(str);
            Object objT4 = x340Var2.T();
            if (zG3 || objT4 == obj4) {
                objT4 = new ntb(ven0VarS, hdn0Var, (byte) 2);
                x340Var2.s0(objT4);
            }
            iu30 iu30Var2 = (iu30) objT4;
            if (u7hVar == null) {
                x340Var2.i0(-1561353070);
                uwr uwrVar = cbx.a;
                long jA = cbx.a(x340Var2).a.b.a();
                x340Var2.r(false);
                j = jA;
            } else {
                x340Var2.i0(-1561354899);
                x340Var2.r(false);
                j = u7hVar.a;
            }
            u7h u7hVar2 = hdkVar.j;
            if (u7hVar2 == null) {
                x340Var2.i0(-1561350670);
                uwr uwrVar2 = cbx.a;
                j2 = cbx.a(x340Var2).b.a;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1561351941);
                x340Var2.r(false);
                j2 = u7hVar2.a;
            }
            long j7 = j2;
            boolean z13 = hdkVar.h.a() == 1;
            if (u7hVar == null) {
                x340Var2.i0(-1561344558);
                uwr uwrVar3 = cbx.a;
                j3 = cbx.a(x340Var2).a.c;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1561346170);
                x340Var2.r(false);
                j3 = u7hVar.a;
            }
            long jB2 = u7h.b(j3, 1.0f, 0.0f, 0.0f, 0.0f, 14);
            long j8 = hdkVar.l;
            boolean z14 = hdkVar.C != 0;
            long jB3 = z13 ? j7 : u7h.b(j7, 0.0f, 0.0f, 0.0f, 0.0f, 14);
            if (z13) {
                jB = u7h.b(j7, 0.0f, 0.0f, 0.0f, 0.0f, 14);
                j4 = jB2;
            } else {
                j4 = jB2;
                jB = j7;
            }
            if (z13) {
                j6 = j4;
                j5 = j7;
            } else {
                j5 = j7;
                j6 = j5;
            }
            bjg1 bjg1VarY = bno1.y(new vlx0(ulx0Var, j, j8, j5, z14, jB3, jB, j6, z13), "concert_campaign_promo_card_reserved_sale", x340Var2, 48, 0);
            hrr0 hrr0Var = ((mhg1) bjg1VarY).d;
            k9 k9Var = ((mhg1) bjg1VarY).a;
            aw1 aw1Var = new aw1((byte) 12, zBooleanValue);
            vlx0 vlx0Var = (vlx0) hrr0Var.getValue();
            x340Var2.i0(1036598667);
            long j9 = vlx0Var.b;
            x340Var2.r(false);
            hah hahVarE = u7h.e(j9);
            boolean zG4 = x340Var2.g(hahVarE);
            Object objT5 = x340Var2.T();
            if (zG4 || objT5 == obj4) {
                objT5 = new tzg1(m4hVar, new syf(hahVarE, (byte) 20));
                x340Var2.s0(objT5);
            }
            tzg1 tzg1Var = (tzg1) objT5;
            if (bjg1VarY.g()) {
                z2 = false;
                objJ = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG5 = x340Var2.g(bjg1VarY);
                objJ = x340Var2.T();
                if (zG5 || objJ == obj4) {
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
                }
                z2 = false;
                x340Var2.r(false);
            }
            x340Var2.i0(1036598667);
            int i3 = i;
            int i4 = i2;
            u7h u7hVarL = p3d1.l(x340Var2, z2, ((vlx0) objJ).b);
            boolean zG6 = x340Var2.g(bjg1VarY);
            Object objT6 = x340Var2.T();
            if (zG6 || objT6 == obj4) {
                objT6 = yv91.a(new dck(bjg1VarY, (byte) 3));
                x340Var2.s0(objT6);
            }
            vlx0 vlx0Var2 = (vlx0) ((tob1) objT6).getValue();
            x340Var2.i0(1036598667);
            u7h u7hVarL2 = p3d1.l(x340Var2, false, vlx0Var2.b);
            boolean zG7 = x340Var2.g(bjg1VarY);
            Object objT7 = x340Var2.T();
            if (zG7 || objT7 == obj4) {
                objT7 = yv91.a(new dck(bjg1VarY, (byte) 4));
                x340Var2.s0(objT7);
            }
            fhg1 fhg1VarO = bno1.o(bjg1VarY, u7hVarL, u7hVarL2, (ni20) aw1Var.invoke(((tob1) objT7).getValue(), x340Var2, 0), tzg1Var, x340Var2, 196608);
            aw1 aw1Var2 = new aw1((byte) 13, zBooleanValue);
            vlx0 vlx0Var3 = (vlx0) hrr0Var.getValue();
            x340Var2.i0(-370287795);
            long j10 = vlx0Var3.c;
            x340Var2.r(false);
            hah hahVarE2 = u7h.e(j10);
            boolean zG8 = x340Var2.g(hahVarE2);
            Object objT8 = x340Var2.T();
            if (zG8 || objT8 == obj4) {
                objT8 = new tzg1(m4hVar, new syf(hahVarE2, (byte) 20));
                x340Var2.s0(objT8);
            }
            tzg1 tzg1Var2 = (tzg1) objT8;
            if (bjg1VarY.g()) {
                i3 = i3;
                z3 = false;
                objJ2 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG9 = x340Var2.g(bjg1VarY);
                objJ2 = x340Var2.T();
                if (zG9 || objJ2 == obj4) {
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
                z3 = false;
                x340Var2.r(false);
            }
            x340Var2.i0(-370287795);
            u7h u7hVarL3 = p3d1.l(x340Var2, z3, ((vlx0) objJ2).c);
            boolean zG10 = x340Var2.g(bjg1VarY);
            Object objT9 = x340Var2.T();
            if (zG10 || objT9 == obj4) {
                objT9 = yv91.a(new dck(bjg1VarY, (byte) 5));
                x340Var2.s0(objT9);
            }
            vlx0 vlx0Var4 = (vlx0) ((tob1) objT9).getValue();
            x340Var2.i0(-370287795);
            u7h u7hVarL4 = p3d1.l(x340Var2, false, vlx0Var4.c);
            boolean zG11 = x340Var2.g(bjg1VarY);
            Object objT10 = x340Var2.T();
            if (zG11 || objT10 == obj4) {
                objT10 = yv91.a(new dck(bjg1VarY, (byte) 6));
                x340Var2.s0(objT10);
            }
            fhg1 fhg1VarO2 = bno1.o(bjg1VarY, u7hVarL3, u7hVarL4, (ni20) aw1Var2.invoke(((tob1) objT10).getValue(), x340Var2, 0), tzg1Var2, x340Var2, 196608);
            aw1 aw1Var3 = new aw1((byte) 14, zBooleanValue);
            vlx0 vlx0Var5 = (vlx0) hrr0Var.getValue();
            x340Var2.i0(1365469852);
            long j11 = vlx0Var5.d;
            x340Var2.r(false);
            hah hahVarE3 = u7h.e(j11);
            boolean zG12 = x340Var2.g(hahVarE3);
            Object objT11 = x340Var2.T();
            if (zG12 || objT11 == obj4) {
                objT11 = new tzg1(m4hVar, new syf(hahVarE3, (byte) 20));
                x340Var2.s0(objT11);
            }
            tzg1 tzg1Var3 = (tzg1) objT11;
            if (bjg1VarY.g()) {
                i4 = i4;
                z4 = false;
                objJ3 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG13 = x340Var2.g(bjg1VarY);
                objJ3 = x340Var2.T();
                if (zG13 || objJ3 == obj4) {
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
                z4 = false;
                x340Var2.r(false);
            }
            x340Var2.i0(1365469852);
            u7h u7hVarL5 = p3d1.l(x340Var2, z4, ((vlx0) objJ3).d);
            boolean zG14 = x340Var2.g(bjg1VarY);
            Object objT12 = x340Var2.T();
            if (zG14 || objT12 == obj4) {
                objT12 = yv91.a(new dck(bjg1VarY, (byte) 7));
                x340Var2.s0(objT12);
            }
            vlx0 vlx0Var6 = (vlx0) ((tob1) objT12).getValue();
            x340Var2.i0(1365469852);
            u7h u7hVarL6 = p3d1.l(x340Var2, false, vlx0Var6.d);
            boolean zG15 = x340Var2.g(bjg1VarY);
            Object objT13 = x340Var2.T();
            if (zG15 || objT13 == obj4) {
                objT13 = yv91.a(new dck(bjg1VarY, (byte) 8));
                x340Var2.s0(objT13);
            }
            fhg1 fhg1VarO3 = bno1.o(bjg1VarY, u7hVarL5, u7hVarL6, (ni20) aw1Var3.invoke(((tob1) objT13).getValue(), x340Var2, 0), tzg1Var3, x340Var2, 196608);
            aw1 aw1Var4 = new aw1((byte) 16, zBooleanValue);
            if (bjg1VarY.g()) {
                iu30Var = iu30Var;
                objJ4 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG16 = x340Var2.g(bjg1VarY);
                objJ4 = x340Var2.T();
                if (zG16 || objJ4 == obj4) {
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
            x340Var2.i0(-650298038);
            if (((vlx0) objJ4).e) {
                x340Var2.i0(2128812431);
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var = cbx.b(x340Var2).g;
                z5 = false;
                x340Var2.r(false);
                f = 16.0f;
            } else {
                z5 = false;
                x340Var2.i0(2128812844);
                x340Var2.r(false);
                f = 0.0f;
            }
            x340Var2.r(z5);
            p3v p3vVar = new p3v(f);
            boolean zG17 = x340Var2.g(bjg1VarY);
            Object objT14 = x340Var2.T();
            if (zG17 || objT14 == obj4) {
                objT14 = yv91.a(new dck(bjg1VarY, (byte) 12));
                x340Var2.s0(objT14);
            }
            vlx0 vlx0Var7 = (vlx0) ((tob1) objT14).getValue();
            x340Var2.i0(-650298038);
            if (vlx0Var7.e) {
                x340Var2.i0(2128812431);
                uwr uwrVar5 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var2).g;
                z6 = false;
                x340Var2.r(false);
                f2 = 16.0f;
            } else {
                z6 = false;
                x340Var2.i0(2128812844);
                x340Var2.r(false);
                f2 = 0.0f;
            }
            x340Var2.r(z6);
            p3v p3vVar2 = new p3v(f2);
            boolean zG18 = x340Var2.g(bjg1VarY);
            Object objT15 = x340Var2.T();
            if (zG18 || objT15 == obj4) {
                objT15 = yv91.a(new dck(bjg1VarY, (byte) 13));
                x340Var2.s0(objT15);
            }
            fhg1 fhg1VarO4 = bno1.o(bjg1VarY, p3vVar, p3vVar2, (ni20) aw1Var4.invoke(((tob1) objT15).getValue(), x340Var2, 0), rno1.c, x340Var2, 196608);
            aw1 aw1Var5 = new aw1((byte) 15, zBooleanValue);
            if (bjg1VarY.g()) {
                fhg1VarO4 = fhg1VarO4;
                z7 = false;
                objJ5 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG19 = x340Var2.g(bjg1VarY);
                objJ5 = x340Var2.T();
                if (zG19 || objJ5 == obj4) {
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
                z7 = false;
                x340Var2.r(false);
            }
            x340Var2.i0(-2005178444);
            float f3 = ((vlx0) objJ5).e ? 1.0f : 0.0f;
            x340Var2.r(z7);
            Float fValueOf = Float.valueOf(f3);
            boolean zG20 = x340Var2.g(bjg1VarY);
            Object objT16 = x340Var2.T();
            if (zG20 || objT16 == obj4) {
                objT16 = yv91.a(new dck(bjg1VarY, (byte) 14));
                x340Var2.s0(objT16);
            }
            vlx0 vlx0Var8 = (vlx0) ((tob1) objT16).getValue();
            x340Var2.i0(-2005178444);
            float f4 = vlx0Var8.e ? 1.0f : 0.0f;
            x340Var2.r(false);
            Float fValueOf2 = Float.valueOf(f4);
            boolean zG21 = x340Var2.g(bjg1VarY);
            Object objT17 = x340Var2.T();
            if (zG21 || objT17 == obj4) {
                objT17 = yv91.a(new dck(bjg1VarY, (byte) 15));
                x340Var2.s0(objT17);
            }
            ni20 ni20Var = (ni20) aw1Var5.invoke(((tob1) objT17).getValue(), x340Var2, 0);
            tzg1 tzg1Var4 = rno1.a;
            fhg1 fhg1VarO5 = bno1.o(bjg1VarY, fValueOf, fValueOf2, ni20Var, tzg1Var4, x340Var2, 196608);
            tzg1 tzg1Var5 = tzg1Var4;
            aw1 aw1Var6 = new aw1((byte) 17, zBooleanValue);
            vlx0 vlx0Var9 = (vlx0) hrr0Var.getValue();
            x340Var2.i0(1079138263);
            long j12 = vlx0Var9.f;
            x340Var2.r(false);
            hah hahVarE4 = u7h.e(j12);
            boolean zG22 = x340Var2.g(hahVarE4);
            Object objT18 = x340Var2.T();
            if (zG22 || objT18 == obj4) {
                objT18 = new tzg1(m4hVar, new syf(hahVarE4, (byte) 20));
                x340Var2.s0(objT18);
            }
            tzg1 tzg1Var6 = (tzg1) objT18;
            if (bjg1VarY.g()) {
                tzg1Var5 = tzg1Var5;
                z8 = false;
                objJ6 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG23 = x340Var2.g(bjg1VarY);
                objJ6 = x340Var2.T();
                if (zG23 || objJ6 == obj4) {
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
                z8 = false;
                x340Var2.r(false);
            }
            x340Var2.i0(1079138263);
            u7h u7hVarL7 = p3d1.l(x340Var2, z8, ((vlx0) objJ6).f);
            boolean zG24 = x340Var2.g(bjg1VarY);
            Object objT19 = x340Var2.T();
            if (zG24 || objT19 == obj4) {
                objT19 = yv91.a(new dck(bjg1VarY, (byte) 9));
                x340Var2.s0(objT19);
            }
            vlx0 vlx0Var10 = (vlx0) ((tob1) objT19).getValue();
            x340Var2.i0(1079138263);
            u7h u7hVarL8 = p3d1.l(x340Var2, false, vlx0Var10.f);
            boolean zG25 = x340Var2.g(bjg1VarY);
            Object objT20 = x340Var2.T();
            if (zG25 || objT20 == obj4) {
                objT20 = yv91.a(new dck(bjg1VarY, (byte) 10));
                x340Var2.s0(objT20);
            }
            fhg1 fhg1VarO6 = bno1.o(bjg1VarY, u7hVarL7, u7hVarL8, (ni20) aw1Var6.invoke(((tob1) objT20).getValue(), x340Var2, 0), tzg1Var6, x340Var2, 196608);
            aw1 aw1Var7 = new aw1((byte) 18, zBooleanValue);
            vlx0 vlx0Var11 = (vlx0) hrr0Var.getValue();
            x340Var2.i0(1784150937);
            long j13 = vlx0Var11.g;
            x340Var2.r(false);
            hah hahVarE5 = u7h.e(j13);
            boolean zG26 = x340Var2.g(hahVarE5);
            Object objT21 = x340Var2.T();
            if (zG26 || objT21 == obj4) {
                objT21 = new tzg1(m4hVar, new syf(hahVarE5, (byte) 20));
                x340Var2.s0(objT21);
            }
            tzg1 tzg1Var7 = (tzg1) objT21;
            if (bjg1VarY.g()) {
                fhg1VarO6 = fhg1VarO6;
                z9 = false;
                objJ7 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG27 = x340Var2.g(bjg1VarY);
                objJ7 = x340Var2.T();
                if (zG27 || objJ7 == obj4) {
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
                z9 = false;
                x340Var2.r(false);
            }
            x340Var2.i0(1784150937);
            u7h u7hVarL9 = p3d1.l(x340Var2, z9, ((vlx0) objJ7).g);
            boolean zG28 = x340Var2.g(bjg1VarY);
            Object objT22 = x340Var2.T();
            if (zG28 || objT22 == obj4) {
                objT22 = yv91.a(new dck(bjg1VarY, (byte) 11));
                x340Var2.s0(objT22);
            }
            vlx0 vlx0Var12 = (vlx0) ((tob1) objT22).getValue();
            x340Var2.i0(1784150937);
            u7h u7hVarL10 = p3d1.l(x340Var2, false, vlx0Var12.g);
            boolean zG29 = x340Var2.g(bjg1VarY);
            Object objT23 = x340Var2.T();
            if (zG29 || objT23 == obj4) {
                objT23 = yv91.a(new dck(bjg1VarY, (byte) 0));
                x340Var2.s0(objT23);
            }
            fhg1 fhg1VarO7 = bno1.o(bjg1VarY, u7hVarL9, u7hVarL10, (ni20) aw1Var7.invoke(((tob1) objT23).getValue(), x340Var2, 0), tzg1Var7, x340Var2, 196608);
            aw1 aw1Var8 = new aw1((byte) 19, zBooleanValue);
            vlx0 vlx0Var13 = (vlx0) hrr0Var.getValue();
            x340Var2.i0(-566406192);
            long j14 = vlx0Var13.h;
            x340Var2.r(false);
            hah hahVarE6 = u7h.e(j14);
            boolean zG30 = x340Var2.g(hahVarE6);
            Object objT24 = x340Var2.T();
            if (zG30 || objT24 == obj4) {
                objT24 = new tzg1(m4hVar, new syf(hahVarE6, (byte) 20));
                x340Var2.s0(objT24);
            }
            tzg1 tzg1Var8 = (tzg1) objT24;
            if (bjg1VarY.g()) {
                z10 = false;
                objJ8 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG31 = x340Var2.g(bjg1VarY);
                objJ8 = x340Var2.T();
                if (zG31 || objJ8 == obj4) {
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
                z10 = false;
                x340Var2.r(false);
            }
            x340Var2.i0(-566406192);
            u7h u7hVarL11 = p3d1.l(x340Var2, z10, ((vlx0) objJ8).h);
            boolean zG32 = x340Var2.g(bjg1VarY);
            Object objT25 = x340Var2.T();
            if (zG32 || objT25 == obj4) {
                objA = yv91.a(new dck(bjg1VarY, (byte) 1));
                x340Var2.s0(objA);
            } else {
                objA = objT25;
            }
            vlx0 vlx0Var14 = (vlx0) ((tob1) objA).getValue();
            x340Var2.i0(-566406192);
            u7h u7hVarL12 = p3d1.l(x340Var2, false, vlx0Var14.h);
            boolean zG33 = x340Var2.g(bjg1VarY);
            Object objT26 = x340Var2.T();
            if (zG33 || objT26 == obj4) {
                objT26 = yv91.a(new dck(bjg1VarY, (byte) 2));
                x340Var2.s0(objT26);
            }
            fhg1 fhg1VarO8 = bno1.o(bjg1VarY, u7hVarL11, u7hVarL12, (ni20) aw1Var8.invoke(((tob1) objT26).getValue(), x340Var2, 0), tzg1Var8, x340Var2, 196608);
            aw1 aw1Var9 = new aw1((byte) 20, zBooleanValue);
            if (bjg1VarY.g()) {
                z11 = false;
                objJ9 = p3d1.j(x340Var2, 1666827533, false, k9Var);
            } else {
                x340Var2.i0(1666573488);
                boolean zG34 = x340Var2.g(bjg1VarY);
                objJ9 = x340Var2.T();
                if (zG34 || objJ9 == obj4) {
                    jv91 jv91VarO9 = ekb.o();
                    iu30 iu30VarE9 = jv91VarO9 != null ? jv91VarO9.e() : null;
                    jv91 jv91VarU9 = ekb.u(jv91VarO9);
                    try {
                        Object objP8 = k9Var.P0();
                        ekb.C(jv91VarO9, jv91VarU9, iu30VarE9);
                        x340Var2.s0(objP8);
                        objJ9 = objP8;
                    } catch (Throwable th9) {
                        ekb.C(jv91VarO9, jv91VarU9, iu30VarE9);
                        throw th9;
                    }
                }
                z11 = false;
                x340Var2.r(false);
            }
            x340Var2.i0(-906933412);
            float f5 = ((vlx0) objJ9).i ? 1.0f : 0.0f;
            x340Var2.r(z11);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zG35 = x340Var2.g(bjg1VarY);
            Object objT27 = x340Var2.T();
            if (zG35 || objT27 == obj4) {
                objT27 = yv91.a(new dck(bjg1VarY, (byte) 16));
                x340Var2.s0(objT27);
            }
            vlx0 vlx0Var15 = (vlx0) ((tob1) objT27).getValue();
            x340Var2.i0(-906933412);
            float f6 = vlx0Var15.i ? 1.0f : 0.0f;
            x340Var2.r(false);
            Float fValueOf4 = Float.valueOf(f6);
            boolean zG36 = x340Var2.g(bjg1VarY);
            Object objT28 = x340Var2.T();
            if (zG36 || objT28 == obj4) {
                objT28 = yv91.a(new dck(bjg1VarY, (byte) 17));
                x340Var2.s0(objT28);
            }
            fhg1 fhg1VarO9 = bno1.o(bjg1VarY, fValueOf3, fValueOf4, (ni20) aw1Var9.invoke(((tob1) objT28).getValue(), x340Var2, 0), tzg1Var5, x340Var2, 196608);
            u7h u7hVar3 = (u7h) fhg1VarO.t.getValue();
            long j15 = u7hVar3.a;
            long j16 = ((u7h) fhg1VarO2.t.getValue()).a;
            u7h u7hVar4 = (u7h) fhg1VarO3.t.getValue();
            long j17 = u7hVar4.a;
            hdk hdkVar2 = new hdk(hdkVar.a, hdkVar.b, hdkVar.c, hdkVar.d, hdkVar.e, hdkVar.f, hdkVar.g, hdkVar.C, hdkVar.h, hdkVar.i, u7hVar4, u7hVar3, j16, hdkVar.m, hdkVar.n, hdkVar.o, hdkVar.D, hdkVar.p, hdkVar.q, hdkVar.r, hdkVar.s, hdkVar.E, hdkVar.t, hdkVar.u, hdkVar.v, hdkVar.w, hdkVar.x, hdkVar.y, hdkVar.z, hdkVar.F, hdkVar.A, hdkVar.B, hdkVar.G);
            fb5 fb5Var = new fb5(((u7h) fhg1VarO6.t.getValue()).a, ((u7h) fhg1VarO7.t.getValue()).a, ((u7h) fhg1VarO8.t.getValue()).a);
            int i5 = i4;
            int i6 = i3;
            boolean z15 = i5 != 2 && i6 == 2;
            if (i5 == 2 || i6 != 2) {
                z12 = i5 == 2;
            } else {
                z12 = hdkVar.v;
            }
            boolean zG37 = x340Var2.g(iu30Var);
            Object objT29 = x340Var2.T();
            if (zG37 || objT29 == obj4) {
                objT29 = new erj(iu30Var, (byte) 25);
                x340Var2.s0(objT29);
            }
            w2g0.c(nim0.a, (tl3) null, apo.r(268931672, new cck(hdkVar, (iu30) obj3, z12, hdkVar2, z15, (Function0) objT29, fb5Var, z13, iu30Var2, this.b, z95.b(z12 ? 180.0f : 0.0f, (fe5) null, "concert_campaign_promo_card_chevron_rotation", (iu30) null, x340Var2, 3072, 22), fhg1VarO4, fhg1VarO5, fhg1VarO9, hdn0Var), x340Var2), x340Var2, 3072, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                ((pt) obj3).z(z, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                rf0.b((hcx) obj3, z, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                ziu ziuVar = (ziu) obj3;
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    biu biuVar = ziuVar.f.c;
                    String str = biuVar.a;
                    String str2 = biuVar.c;
                    hti1 hti1Var = hti1.f;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarX = uyn1.x(qim0VarF, 6.0f);
                    boolean zH = x340Var2.h(z) | x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zH || objT == fkj0.X) {
                        objT = new z20(z, iu30Var, (byte) 3);
                        x340Var2.s0(objT);
                    }
                    f6o1.b(str, str2, hti1Var, qim0VarX, null, (Function0) objT, apo.r(441553171, new iq0(ziuVar, iu30Var, b2), x340Var2), x340Var2, 1573248, 16);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                j82.m((tg2) obj3, z, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                sbl.b((kx2) obj3, z, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    xto.e((View) obj3, x340Var4, 0);
                    if (z) {
                        x340Var4.i0(-1409798955);
                        nln.a((rin0) obj4, (qim0) null, x340Var4, 0, 2);
                    } else {
                        x340Var4.i0(-754061008);
                    }
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((yu3) obj3).e(czo1.p(1), (String) obj4, (b0k) obj, z);
                return rih1Var;
            case 7:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj4;
                ic9 ic9Var = (ic9) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zI = x340Var6.i(ic9Var) | x340Var6.h(z) | x340Var6.g(function0);
                    Object objT2 = x340Var6.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new vm1(ic9Var, z, function0, (byte) 3);
                        x340Var6.s0(objT2);
                    }
                    m3b.f(0, (Function0) objT2, x340Var6, (qim0) null, z);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objT3 = x340Var8.T();
                    if (objT3 == fkj0.X) {
                        objT3 = iub.c;
                        x340Var8.s0(objT3);
                    }
                    qim0 qim0VarA = s161.a(nim0Var, (iu30) objT3);
                    bv30 bv30Var = (bv30) obj3;
                    otn0 otn0Var = (otn0) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(hmb0.t1);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(gfh0VarC, x340Var8, y580.O0);
                    nko1.H(xos0VarM, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE, x340Var8, y580.Y);
                    Boolean boolValueOf = Boolean.valueOf(z);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    bv30Var.c1(otn0Var, boolValueOf, new p3v(4.0f), x340Var8, 0);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                zpn1.b((m0d) obj3, z, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                tto1.h((skf) obj3, z, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return a(obj, obj2);
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                yoo1.f((v5q0) obj3, z, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                nmn1.b((WidgetState) obj3, (gt40) obj4, z, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((bxv) obj3).d(z, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                u7n0.a((rpu) obj3, z, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ycm ycmVar = (ycm) obj3;
                return l6o1.A(new jpg0(f6o1.A(new idm(new t7y((iu30) obj4, (iac0) obj2, (byte) 4), ycmVar.a, ycmVar.b, ycmVar.c, ycmVar.d), new ViewGroup.LayoutParams(-2, -2), null, 2), new cb8((ymd0) obj, z, (byte) 10)));
            case 17:
                ((Number) obj2).intValue();
                ((sq00) obj3).a(z, (u6p0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                dxo1.h((yq00) obj3, z, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                sbl.l((r340) obj3, (bjx) obj4, z, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                eqn1.f((t9b0) obj3, z, (qim0) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                wgo1.j((vuv0) obj3, (Function0) obj4, z, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                loo1.c(z, (rd60) obj3, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    otw.c(((q880) obj3).f, new c880((ji41) obj4, z), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p9p1.m((so80) obj3, (iu30) obj4, null, this.b, x340Var12, 0, 4);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                hqq0.r((ix90) obj3, z, (iu30) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                ((zgb0) obj3).a(czo1.p(1), (Function0) obj4, (b0k) obj, z);
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                pto1.m((String) obj3, (n4m) obj4, z, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                pto1.n((String) obj3, (rrt0) obj4, z, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var2 = (iu30) obj4;
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                } else if (z) {
                    x340Var14.i0(811987121);
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(811757442);
                    z5d0 z5d0Var = (z5d0) obj3;
                    boolean zG = x340Var14.g(iu30Var2);
                    Object objT4 = x340Var14.T();
                    if (zG || objT4 == m4cVar) {
                        objT4 = new sya0(iu30Var2, (byte) 20);
                        x340Var14.s0(objT4);
                    }
                    Function0 function1 = (Function0) objT4;
                    boolean zG2 = x340Var14.g(iu30Var2);
                    Object objT5 = x340Var14.T();
                    if (zG2 || objT5 == m4cVar) {
                        objT5 = new sya0(iu30Var2, (byte) 21);
                        x340Var14.s0(objT5);
                    }
                    vyo1.h(z5d0Var, function1, (Function0) objT5, x340Var14, 0);
                    x340Var14.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(Object obj, Object obj2, boolean z, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(Object obj, Object obj2, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(Object obj, boolean z, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(Object obj, boolean z, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(byte b, Object obj, cv30 cv30Var, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(boolean z, rd60 rd60Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 22;
        this.b = z;
        this.c = rd60Var;
        this.d = iu30Var;
    }
}
