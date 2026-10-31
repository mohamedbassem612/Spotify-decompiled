package p;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cex extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cex(pjf0 pjf0Var, lfm lfmVar, vgb vgbVar) {
        super(3);
        this.a = (byte) 18;
        this.c = pjf0Var;
        this.b = vgbVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        kw60 kw60Var;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(1979829173);
        kw60 kw60Var2 = (kw60) this.c;
        kw60Var2.c.a(kw60Var2, x340Var, 0);
        x340Var.r(false);
        ven0 ven0VarL = ggo1.L(bottomSheetBehavior, ((Number) kw60Var2.g.getValue()).intValue(), x340Var, iIntValue & 14);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = bb00.h(kw60Var2.c(), x340Var);
        }
        err0 err0Var = (hdn0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(null);
            x340Var.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        boolean zI = x340Var.i(kw60Var2) | x340Var.i(err0Var);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new x060(kw60Var2, err0Var, (lnm) null, (byte) 7);
            x340Var.s0(objT3);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT3);
        Integer numValueOf = Integer.valueOf(err0Var.s());
        Integer num = (Integer) ven0Var.getValue();
        boolean zI2 = x340Var.i(kw60Var2) | x340Var.i(err0Var) | x340Var.i(ven0Var) | x340Var.i(bottomSheetBehavior) | x340Var.i(ven0VarL);
        Object objT4 = x340Var.T();
        if (zI2 || objT4 == m4cVar) {
            kw60Var = kw60Var2;
            ur1 ur1Var = new ur1(kw60Var, bottomSheetBehavior, ven0VarL, err0Var, ven0Var, (lnm) null);
            x340Var.s0(ur1Var);
            objT4 = ur1Var;
        } else {
            kw60Var = kw60Var2;
        }
        qxd0.s(numValueOf, num, (vu30) objT4, x340Var);
        i6o0 i6o0VarQ = k1o1.q(x340Var);
        boolean zG = x340Var.g(i6o0VarQ);
        ls60 ls60Var = (ls60) this.b;
        Object objT5 = x340Var.T();
        if (zG || objT5 == m4cVar) {
            mjp mjpVar = kw60Var.b;
            String strValueOf = String.valueOf(ls60Var != null ? ls60Var.b.a.size() : 0);
            r6h1 r6h1Var = r6h1.c;
            lbl0 lbl0Var = new lbl0(strValueOf);
            i030 i030Var = new i030(ven0Var, (byte) 20);
            a680 a680Var = (a680) mjpVar.a.c;
            lw60 lw60Var = (lw60) a680Var.a;
            vu60 vu60Var = (vu60) lw60Var.f.get();
            c8o.l(vu60Var);
            njp njpVar = (njp) ((jly0) a680Var.b).get();
            ojp ojpVar = (ojp) ((jly0) a680Var.d).get();
            js90 js90Var = (js90) lw60Var.i.get();
            c8o.l(js90Var);
            vu60 vu60Var2 = (vu60) lw60Var.g.get();
            c8o.l(vu60Var2);
            los losVar = (los) ((jly0) a680Var.e).get();
            b0a0 b0a0Var = (b0a0) lw60Var.k.get();
            c8o.l(b0a0Var);
            xv60 xv60Var = new xv60(vu60Var, ven0VarL, i6o0VarQ, lbl0Var, i030Var, njpVar, ojpVar, js90Var, vu60Var2, losVar, b0a0Var);
            x340Var.s0(xv60Var);
            objT5 = xv60Var;
        }
        otw.c((xv60) objT5, new qv60(kw60Var.e.b), (qim0) null, (ipb1) null, x340Var, 0, 12);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x01da  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e8  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        float f;
        float f2;
        vu30 vu30Var;
        int i3;
        int i4;
        boolean z;
        vu30 vu30Var2 = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        i2c i2cVar = (i2c) obj;
        ((Number) obj3).intValue();
        b0k b0kVar = (x340) ((b0k) obj2);
        Object objK = b0kVar.k(t4k.h);
        j06 j06Var = ((x340) b0kVar).a;
        wat watVar = (wat) objK;
        int iX0 = (int) watVar.X0(i2cVar.d());
        int iX1 = (int) watVar.X0(i2cVar.c());
        if (iX0 > 0 && iX1 > 0) {
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            boolean z2 = ((Configuration) b0kVar.k(kivVar)).orientation == 2;
            int i5 = ((Configuration) b0kVar.k(kivVar)).smallestScreenWidthDp;
            int i6 = z2 ? 2 : 3;
            boolean z3 = i5 >= 600;
            if (z3 && z2) {
                i = 7;
            } else if (z3) {
                i = 6;
            } else {
                i = z2 ? 5 : 4;
            }
            if (i6 > 2) {
                f = 0.5f;
                i2 = 2;
                if ((i6 - 0.5f) * (iX0 / (i - 1.0f)) > iX1) {
                    i6--;
                    int i7 = i % 2;
                    if (i7 + (((((-i7) | i7) & (i7 ^ 2)) >> 31) & 2) == 0) {
                        i++;
                    }
                }
            } else {
                i2 = 2;
                f = 0.5f;
            }
            int i8 = i6;
            while (true) {
                f2 = iX0 / (i - 1.0f);
                if ((i8 - f) * f2 <= iX1) {
                    break;
                }
                i += 2;
            }
            int i9 = (int) f2;
            if (i9 >= watVar.X0(72.0f)) {
                float fM0 = watVar.M0(i9);
                uwr uwrVar = cbx.a;
                vex vexVar = (vex) zex.a.b;
                long j = vexVar.k;
                long j2 = vexVar.g;
                qim0 qim0Var = nim0.a;
                qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                nhc nhcVar = (nhc) this.c;
                td10 td10Var = (td10) this.b;
                long j3 = j2;
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar).T);
                xos0 xos0VarM = b0kVar.m();
                qim0 qim0VarE = zr7.E(b0kVar, qim0VarD);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar.m0();
                boolean z4 = ((x340) b0kVar).S;
                n4k n4kVar = hmb0.t1;
                if (z4) {
                    b0kVar.l(n4kVar);
                } else {
                    b0kVar.v0();
                }
                nko1.H(mbhVarA, b0kVar, lljVar3);
                nko1.H(xos0VarM, b0kVar, lljVar2);
                nko1.H(Integer.valueOf(iHashCode), b0kVar, lljVar);
                nko1.F(b0kVar);
                nko1.H(qim0VarE, b0kVar, vu30Var2);
                b0kVar.i0(851623020);
                int i10 = 0;
                while (i10 < i8) {
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    int i11 = i10;
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar, 0);
                    vu30 vu30Var3 = vu30Var2;
                    int iHashCode2 = Long.hashCode(((x340) b0kVar).T);
                    xos0 xos0VarM2 = b0kVar.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar, qim0VarF);
                    hzj.A.getClass();
                    b0kVar.m0();
                    if (((x340) b0kVar).S) {
                        b0kVar.l(n4kVar);
                    } else {
                        b0kVar.v0();
                    }
                    nko1.H(jw31VarA, b0kVar, lljVar3);
                    nko1.H(xos0VarM2, b0kVar, lljVar2);
                    nko1.H(Integer.valueOf(iHashCode2), b0kVar, lljVar);
                    nko1.F(b0kVar);
                    vu30 vu30Var4 = vu30Var3;
                    nko1.H(qim0VarE2, b0kVar, vu30Var4);
                    b0kVar.i0(-1591837115);
                    int i12 = 0;
                    while (i12 < i) {
                        int i13 = (i11 * i) + i12;
                        int i14 = i13 / i;
                        int i15 = i13 % i;
                        int i16 = i / 2;
                        if (i14 == 0 && i15 == 0) {
                            vu30Var = vu30Var4;
                            z = false;
                            i4 = 1;
                        } else {
                            if (i14 == 0) {
                                vu30Var = vu30Var4;
                                if (i15 == i - 1) {
                                    z = false;
                                    i4 = 3;
                                }
                            } else {
                                vu30Var = vu30Var4;
                            }
                            if (i14 == 0) {
                                i4 = i2;
                            } else if (i15 == 0) {
                                i4 = 4;
                            } else if (i15 == i - 1) {
                                i4 = 6;
                            } else {
                                if (i8 != 3 || i14 != 1 || i15 != i16) {
                                    if (i8 != 3) {
                                        i3 = 2;
                                        if (i8 == i3) {
                                            if (i14 == 1 || i15 != i16 + 1) {
                                                i3 = 2;
                                            }
                                        }
                                        if (i8 == i3 || i14 != 1 || i15 != i16 - 1) {
                                            i4 = 5;
                                            z = false;
                                        }
                                    } else {
                                        i3 = i2;
                                        if (i14 != i3) {
                                            if (i8 == i3) {
                                                if (i14 == 1) {
                                                }
                                                i3 = 2;
                                            }
                                            if (i8 == i3) {
                                            }
                                            i4 = 5;
                                            z = false;
                                        } else if (i15 != i16 - 1) {
                                            i3 = 2;
                                            if (i8 == i3) {
                                                if (i14 == 1) {
                                                }
                                                i3 = 2;
                                            }
                                            if (i8 == i3) {
                                            }
                                            i4 = 5;
                                            z = false;
                                        }
                                    }
                                    z = false;
                                    i4 = 8;
                                }
                                i4 = 7;
                            }
                            z = false;
                        }
                        b0k b0kVar2 = b0kVar;
                        nhc nhcVar2 = nhcVar;
                        qim0 qim0Var2 = qim0Var;
                        td10 td10Var2 = td10Var;
                        long j4 = j;
                        long j5 = j3;
                        nhcVar2.e(i4, fM0, j4, j5, td10Var2, b0kVar2, 0);
                        i12++;
                        i2 = 2;
                        vu30Var4 = vu30Var;
                        i = i;
                        j3 = j5;
                        j = j4;
                        i8 = i8;
                        nhcVar = nhcVar2;
                        td10Var = td10Var2;
                        qim0Var = qim0Var2;
                        b0kVar = b0kVar2;
                    }
                    vu30 vu30Var5 = vu30Var4;
                    b0k b0kVar3 = b0kVar;
                    b0kVar3.r(false);
                    b0kVar3.r(true);
                    i10 = i11 + 1;
                    i2 = i2;
                    vu30Var2 = vu30Var5;
                    i = i;
                    j3 = j3;
                    j = j;
                    i8 = i8;
                    nhcVar = nhcVar;
                    td10Var = td10Var;
                    qim0Var = qim0Var;
                    b0kVar = b0kVar3;
                }
                b0k b0kVar4 = b0kVar;
                b0kVar4.r(false);
                b0kVar4.r(true);
            }
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        na90 na90Var = (na90) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        txk0 txk0Var = (txk0) this.b;
        ia90 ia90Var = (ia90) this.c;
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(na90Var) : x340Var.i(na90Var) ? 4 : 2;
        }
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            x340Var2.b0();
        } else if (na90Var instanceof la90) {
            x340Var2.i0(-40540219);
            ia90Var.d.b(70, apo.r(2021205967, new bp50(na90Var, ia90Var, txk0Var, (byte) 29), x340Var2), x340Var2);
            x340Var2.r(false);
        } else {
            if (!(na90Var instanceof ma90)) {
                throw p3d1.k(x340Var2, -2079517600, false);
            }
            x340Var2.i0(-40117472);
            pe peVarA = ef.a(x340Var2);
            r6h1 r6h1VarB = txk0Var.b();
            ma90 ma90Var = (ma90) na90Var;
            String str = ma90Var.a;
            g5l0 g5l0Var = new g5l0(str, r6h1VarB, (byte) 7);
            w6b1 w6b1VarA = f7b1.a(blc0.K6);
            w6b1VarA.getClass();
            String str2 = o7h.q0(w6b1VarA.c) + "?id=" + str;
            w6b1 w6b1VarA2 = f7b1.a(blc0.L6);
            w6b1VarA2.getClass();
            String str3 = o7h.q0(w6b1VarA2.c) + "?id=" + str;
            boolean zB = peVarA.b(7);
            boolean zI = x340Var2.i(ia90Var) | x340Var2.i(txk0Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new ha90(ia90Var, txk0Var, (byte) 1);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            int i = iIntValue & 14;
            boolean zI2 = x340Var2.i(ia90Var) | (i == 4 || ((iIntValue & 8) != 0 && x340Var2.i(na90Var)));
            Object objT2 = x340Var2.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new fpo(ia90Var, na90Var, (lnm) null, (byte) 14);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            if (i != 4 && ((iIntValue & 8) == 0 || !x340Var2.i(na90Var))) {
                z = false;
            }
            boolean zG = x340Var2.g(str3) | z | x340Var2.g(str2) | x340Var2.i(g5l0Var) | x340Var2.i(ia90Var);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == m4cVar) {
                vt1 vt1Var = new vt1(na90Var, str3, str2, g5l0Var, ia90Var, (byte) 20);
                x340Var2.s0(vt1Var);
                objT3 = vt1Var;
            }
            a8o.e(ma90Var, zB, function0, iu30Var, (Function0) objT3, x340Var2, i);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        boolean z;
        boolean z2;
        qim0 qim0VarR;
        Object obj9;
        Object obj10;
        Object obj11;
        byte b = this.a;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj12 = this.b;
        Object obj13 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b3o1.f(((lex) obj13).e, (j2i) obj12, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    uwr uwrVar = cbx.a;
                    b3o1.f(cbx.d(x340Var4).k, apo.r(1687659208, new a61((vu30) obj13, (j2i) obj12, (byte) 1), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                tky tkyVar = (tky) obj12;
                otw.c((fmy) obj13, new emy(tkyVar.d, tkyVar.e, tkyVar.a, tkyVar.f == EntityType.Artist, tkyVar.g, tkyVar.h, tkyVar.j), (qim0) null, (ipb1) null, b0kVar, 0, 12);
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                gdx gdxVarS = yla.s(x340Var5);
                String strN0 = cwl1.n0(2131953568, new Object[]{((tky) obj13).b}, x340Var5);
                iu30 iu30Var = (iu30) obj12;
                x340 x340Var6 = x340Var5;
                boolean zG = x340Var6.g(iu30Var);
                Object objT = x340Var6.T();
                Object obj14 = objT;
                if (zG || objT == m4cVar) {
                    y9y y9yVar = new y9y(iu30Var, (byte) 15);
                    x340Var6.s0(y9yVar);
                    obj14 = y9yVar;
                }
                gbx gbxVar = new gbx(new y50(strN0), (Function0) obj14);
                Object objT2 = x340Var6.T();
                Object obj15 = objT2;
                if (objT2 == m4cVar) {
                    lgx lgxVar = lgx.R0;
                    x340Var6.s0(lgxVar);
                    obj15 = lgxVar;
                }
                vu30 vu30Var = (vu30) obj15;
                Object objT3 = x340Var6.T();
                Object obj16 = objT3;
                if (objT3 == m4cVar) {
                    lgx lgxVar2 = lgx.S0;
                    x340Var6.s0(lgxVar2);
                    obj16 = lgxVar2;
                }
                foo1.c(gbxVar, new hdx(0, vu30Var, (vu30) obj16, (vu30) null, (hw61) null, 25), (qim0) null, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, imi.a, x340Var6, 0, 48, 2012);
                return rih1Var;
            case 4:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                mty mtyVar = (mty) obj12;
                ((res) obj13).i(mtyVar.a, mtyVar.c, mtyVar.d, mtyVar.b.size() > 3, b0kVar2, 0);
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var7).j;
                Function0 function0 = (Function0) obj13;
                x340 x340Var8 = x340Var7;
                boolean zG2 = x340Var8.g(function0);
                Object objT4 = x340Var8.T();
                if (zG2 || objT4 == fkj0.X) {
                    obj4 = objT4;
                    xet xetVar = new xet(function0, (byte) 9);
                    x340Var8.s0(xetVar);
                    obj4 = xetVar;
                }
                obj4 = objT4;
                uwo1.f((af5) obj12, s161.b(nim0Var, false, (iu30) obj4), lee1Var, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var8, 0, 0, 4088);
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                otw.c((xvu) ((byp) obj13).d, (fvu) obj12, (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj2;
                ((Number) obj3).intValue();
                hf2 hf2Var = (hf2) obj13;
                uep uepVar = (uep) hf2Var.d;
                cir0 cir0Var = (cir0) hf2Var.f;
                diz dizVar = (diz) obj12;
                otw.c(uepVar.a(new njm(cir0Var.g())), new rwg1(dj20.e(dizVar.a, dizVar.d), 1), (qim0) null, (ipb1) null, x340Var9, 8, 12);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(x340Var9).b;
                op71.g(x340Var9, u291.h(nim0Var, 16.0f));
                vep vepVar = (vep) hf2Var.e;
                njm njmVar = new njm(cir0Var.g());
                x340 x340Var10 = x340Var9;
                Object objT5 = x340Var10.T();
                if (objT5 == fkj0.X) {
                    i = 1;
                    sg0 sg0Var = new sg0(1, (lnm) null, (byte) 11);
                    x340Var10.s0(sg0Var);
                    obj5 = sg0Var;
                } else {
                    i = 1;
                    obj5 = objT5;
                }
                otw.c(vepVar.a(njmVar, (iu30) obj5), new lqu(3, i), (qim0) null, (ipb1) null, x340Var9, 8, 12);
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    gra graVar = een.h;
                    qim0 qim0VarQ = i1p1.q(u291.d(nim0Var, 1.0f), er31.b(2.0f));
                    uwr uwrVar4 = cbx.a;
                    zsc zscVar = zex.a;
                    qim0 qim0VarF = dug.f(qim0VarQ, ((yex) zscVar.d).f, u5j1Var);
                    Object objT6 = x340Var12.T();
                    if (objT6 == fkj0.X) {
                        obj6 = objT6;
                        fa00 fa00Var = fa00.Y;
                        x340Var12.s0(fa00Var);
                        obj6 = fa00Var;
                    }
                    obj6 = objT6;
                    qim0 qim0VarA = s161.a(qim0VarF, (iu30) obj6);
                    String str = (String) obj13;
                    lee1 lee1Var2 = (lee1) obj12;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    qim0 qim0VarE = zr7.E(x340Var12, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(gfh0VarC, x340Var12, y580.O0);
                    nko1.H(xos0VarM, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE, x340Var12, y580.Y);
                    uwo1.e(str, (qim0) null, lee1Var2, ((yex) zscVar.d).a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2018);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                hcx hcxVar = (hcx) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                re10 re10Var = (re10) obj13;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var13.e(hcxVar.ordinal()) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    otw.c((mf0) re10Var.g.getValue(), new if0(((le10) obj12).Z, hcxVar, re10Var.e), (qim0) null, (ipb1) null, x340Var14, 64, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var15 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                err0 err0Var = (hdn0) obj13;
                c380 c380Var = (c380) obj12;
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                x340 x340Var16 = x340Var15;
                int iHashCode2 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM2 = x340Var16.m();
                qim0 qim0VarE2 = zr7.E(x340Var15, qim0VarF2);
                hzj.A.getClass();
                x340 x340Var17 = x340Var15;
                if (x340Var17.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var17.m0();
                if (x340Var17.S) {
                    x340Var17.l(n4kVar);
                } else {
                    x340Var17.v0();
                }
                nko1.H(gfh0VarC2, x340Var15, y580.O0);
                nko1.H(xos0VarM2, x340Var15, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var15, y580.R0);
                nko1.F(x340Var15);
                nko1.H(qim0VarE2, x340Var15, y580.Y);
                Integer numValueOf = Integer.valueOf(err0Var.s());
                Object objT7 = x340Var17.T();
                Object obj17 = objT7;
                if (objT7 == fkj0.X) {
                    xc10 xc10Var = xc10.h;
                    x340Var17.s0(xc10Var);
                    obj17 = xc10Var;
                }
                hm5.a(numValueOf, (qim0) null, (iu30) obj17, (tl3) null, "fact_animation", (iu30) null, apo.r(849248833, new wx00(c380Var, (byte) 3), x340Var15), x340Var15, 1597824, 42);
                x340Var17.r(true);
                return rih1Var;
            case 11:
                ((Number) obj3).intValue();
                boolean zEquals = ((fyo1) obj13).equals(zw10.c);
                gbx gbxVar2 = (gbx) obj12;
                x340 x340Var18 = (b0k) obj2;
                boolean zG3 = x340Var18.g(gbxVar2);
                Object objT8 = x340Var18.T();
                if (zG3 || objT8 == fkj0.X) {
                    obj7 = objT8;
                    o70 o70Var = new o70(gbxVar2, (byte) 1);
                    x340Var18.s0(o70Var);
                    obj7 = o70Var;
                }
                obj7 = objT8;
                aex.b(zEquals, (iu30) obj7, (qim0) null, (String) null, 0, (idn0) null, (ga80) null, x340Var18, 0, 124);
                return rih1Var;
            case 12:
                x340 x340Var19 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    List list = (List) obj13;
                    br0 br0Var = (br0) obj12;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ee21 ee21Var = (ee21) list.get(i2);
                        x340Var20.f0(-771673090, ee21Var.a.getId());
                        qim0 qim0VarN = anm1.N("filter_reordering_chip_" + ee21Var.a.getId(), nim0Var);
                        gfh0 gfh0VarC3 = t1c.c(een.d, false);
                        int iHashCode3 = Long.hashCode(x340Var20.T);
                        xos0 xos0VarM3 = x340Var20.m();
                        qim0 qim0VarE3 = zr7.E(x340Var20, qim0VarN);
                        hzj.A.getClass();
                        if (x340Var20.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var20.m0();
                        if (x340Var20.S) {
                            x340Var20.l(n4kVar);
                        } else {
                            x340Var20.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var20, y580.O0);
                        nko1.H(xos0VarM3, x340Var20, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode3), x340Var20, y580.R0);
                        nko1.F(x340Var20);
                        nko1.H(qim0VarE3, x340Var20, y580.Y);
                        otw.c(br0Var, new ge21(ee21Var, i2), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                        x340Var20.r(true);
                        x340Var20.r(false);
                    }
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var21 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var2 = (iu30) obj12;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    dn20 dn20Var = (dn20) obj13;
                    za51 za51Var = dn20Var.i;
                    boolean z3 = !dn20Var.d;
                    boolean zG4 = x340Var22.g(iu30Var2);
                    Object objT9 = x340Var22.T();
                    if (zG4 || objT9 == m4cVar2) {
                        obj8 = objT9;
                        y720 y720Var = new y720(iu30Var2, (byte) 13);
                        x340Var22.s0(y720Var);
                        obj8 = y720Var;
                    }
                    Function0 function1 = (Function0) obj8;
                    boolean zG5 = x340Var22.g(iu30Var2);
                    Object objT10 = x340Var22.T();
                    Object obj18 = objT10;
                    if (zG5 || objT10 == m4cVar2) {
                        y720 y720Var2 = new y720(iu30Var2, (byte) 14);
                        x340Var22.s0(y720Var2);
                        obj18 = y720Var2;
                    }
                    eqr0.i(za51Var, z3, (qim0) null, function1, (Function0) obj18, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var23 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    bmq0.c(((dn20) obj13).a, (qim0) null, (xu30) obj12, x340Var24, 0, 2);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                d1u.d(0, (b0k) obj2, (iu30) obj13, (ic40) obj12);
                return rih1Var;
            case 16:
                x340 x340Var25 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var26 = x340Var25;
                boolean zY = x340Var26.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16);
                j06 j06Var = x340Var26.a;
                if (zY) {
                    qim0 qim0VarQ2 = i1p1.q(u291.d(nim0Var, 1.0f), er31.b(8.0f));
                    tf50 tf50Var = (tf50) obj13;
                    boolean z4 = tf50Var.k;
                    t9b0 t9b0Var = tf50Var.l;
                    boolean z5 = tf50Var.f;
                    List list2 = (List) obj12;
                    gfh0 gfh0VarC4 = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM4 = x340Var26.m();
                    qim0 qim0VarE4 = zr7.E(x340Var26, qim0VarQ2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC4, x340Var26, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM4, x340Var26, lljVar2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf2, x340Var26, lljVar3);
                    nko1.F(x340Var26);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE4, x340Var26, lljVar4);
                    x340Var26.i0(755512677);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    if (z5) {
                        x340Var26.i0(-1040691355);
                        boolean z6 = !((Boolean) x340Var26.k(cn80.a)).booleanValue();
                        z = false;
                        x340Var26.r(false);
                        z2 = z6;
                    } else {
                        z = false;
                        x340Var26.i0(2098307600);
                        x340Var26.r(false);
                        z2 = false;
                    }
                    if (z2) {
                        x340Var26.i0(2098352462);
                        jmr0 jmr0VarN = i3o1.n(2131233509, x340Var26, z ? 1 : 0);
                        qim0 qim0VarD2 = i541.D(qim0VarD, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039);
                        boolean zI = x340Var26.i(jmr0VarN);
                        Object objT11 = x340Var26.T();
                        if (zI || objT11 == fkj0.X) {
                            obj9 = objT11;
                            rmn rmnVar = new rmn(jmr0VarN, (byte) 1);
                            x340Var26.s0(rmnVar);
                            obj9 = rmnVar;
                        }
                        obj9 = objT11;
                        qim0VarR = exd0.r(qim0VarD2, (iu30) obj9);
                        z = false;
                        x340Var26.r(false);
                    } else {
                        qim0VarR = qim0VarD;
                        x340Var26.i0(2098892637);
                        x340Var26.r(z);
                    }
                    qim0 qim0Var = qim0VarR;
                    x340Var26.r(z);
                    Uri uri = Uri.parse(tf50Var.i);
                    h6m h6mVar = mif1.Q0;
                    isl islVar = isl.a;
                    eso1.e(uri, islVar, qim0Var, (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var26, 1572912, 0, 4024);
                    h2c h2cVar = h2c.a;
                    if (z5) {
                        x340Var26.i0(1946941745);
                        w0h1.a(klx.c, islVar, anm1.N("ACTIVATED_ICON", h2cVar.a(xcg1.k(cbx.a, u291.f(uyn1.x(nim0Var, 9.0f), 0.16f)), een.f)), tf50Var.e, 0L, false, x340Var26, klx.d | 48, 48);
                        x340Var26.r(false);
                    } else {
                        x340Var26.i0(1947326393);
                        x340Var26.r(false);
                    }
                    qim0 qim0VarA2 = h2cVar.a(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), een.X);
                    era eraVar = een.P0;
                    mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var26, 0);
                    int iHashCode5 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM5 = x340Var26.m();
                    qim0 qim0VarE5 = zr7.E(x340Var26, qim0VarA2);
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    nko1.H(mbhVarA, x340Var26, lljVar);
                    nko1.H(xos0VarM5, x340Var26, lljVar2);
                    x0d.q(iHashCode5, x340Var26, lljVar3, x340Var26);
                    nko1.H(qim0VarE5, x340Var26, lljVar4);
                    t1c.a(dug.e(u291.h(u291.f(nim0Var, 1.0f), 35.0f), v9c.s(list2, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var26, 0);
                    d36 d36Var = new d36(2.0f, true, new um5(false));
                    qim0 qim0VarA3 = uyn1.A(dug.f(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), tf50Var.h, u5j1Var), 12.0f, 4.0f, 12.0f, 12.0f);
                    mbh mbhVarA2 = jbh.a(d36Var, eraVar, x340Var26, 6);
                    int iHashCode6 = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM6 = x340Var26.m();
                    qim0 qim0VarE6 = zr7.E(x340Var26, qim0VarA3);
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    nko1.H(mbhVarA2, x340Var26, lljVar);
                    nko1.H(xos0VarM6, x340Var26, lljVar2);
                    x0d.q(iHashCode6, x340Var26, lljVar3, x340Var26);
                    nko1.H(qim0VarE6, x340Var26, lljVar4);
                    if (t9b0Var != null) {
                        x340Var26.i0(-250718995);
                        eqn1.f(t9b0Var, z4, nim0Var, x340Var26, 384);
                        x340Var26.r(false);
                    } else {
                        x340Var26.i0(-250561019);
                        x340Var26.r(false);
                    }
                    String str2 = tf50Var.d;
                    uwr uwrVar5 = cbx.a;
                    uwo1.e(str2, anm1.N("TITLE", nim0Var), vgo1.q(cbx.d(x340Var26).k, z4, x340Var26), cbx.a(x340Var26).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 48, 0, 2032);
                    us71.m(x340Var26, true, true, true);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj3).intValue();
                jqi0 jqi0Var = (jqi0) obj13;
                String str3 = jqi0Var.b;
                iu30 iu30Var3 = (iu30) obj12;
                x340 x340Var27 = (b0k) obj2;
                boolean zG6 = x340Var27.g(iu30Var3) | x340Var27.g(jqi0Var);
                Object objT12 = x340Var27.T();
                if (zG6 || objT12 == fkj0.X) {
                    obj10 = objT12;
                    hs20 hs20Var = new hs20(iu30Var3, jqi0Var, (byte) 14);
                    x340Var27.s0(hs20Var);
                    obj10 = hs20Var;
                }
                obj10 = objT12;
                jhc1.a(0, str3, (Function0) obj10, x340Var27, u291.f(nim0Var, 1.0f));
                return rih1Var;
            case 18:
                jw50 jw50Var = (jw50) obj;
                iw50 iw50Var = (iw50) obj2;
                tqw tqwVar = (tqw) obj3;
                pjf0 pjf0Var = (pjf0) obj13;
                if (iw50Var.equals(fw50.a)) {
                    pjf0Var.a(cvl1.d(tqwVar), pzm.g("translation_mode_enabled", false));
                } else if (iw50Var.equals(gw50.a)) {
                    nw50 nw50Var = jw50Var.a;
                    if (!(nw50Var instanceof lw50)) {
                        hhg1.n("Failed requirement.");
                        return null;
                    }
                    Bundle bundleH = mno1.h(new mmr0[]{new mmr0("start_y", ((lw50) nw50Var).a.invoke())});
                    tv80 tv80VarD = cvl1.d(tqwVar);
                    bundleH.putParcelable("page_mode", ofm0.b);
                    ((pjf0) ((vgb) obj12).a.get()).a(tv80VarD, bundleH);
                } else {
                    if (!iw50Var.equals(hw50.a)) {
                        eg.o();
                        return null;
                    }
                    pjf0Var.a(cvl1.d(tqwVar), pzm.g("translation_mode_enabled", true));
                }
                return rih1Var;
            case 19:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    rd60 rd60Var = (rd60) obj13;
                    loo1.c(rd60Var.c, rd60Var, (iu30) obj12, x340Var29, 0);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var30 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    uwr uwrVar6 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var31).b;
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    rd60 rd60Var2 = (rd60) obj13;
                    ven0 ven0Var = (ven0) obj12;
                    gfh0 gfh0VarC5 = t1c.c(een.d, false);
                    int iHashCode7 = Long.hashCode(x340Var31.T);
                    xos0 xos0VarM7 = x340Var31.m();
                    qim0 qim0VarE7 = zr7.E(x340Var31, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var31.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var31.m0();
                    if (x340Var31.S) {
                        x340Var31.l(n4kVar);
                    } else {
                        x340Var31.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var31, y580.O0);
                    nko1.H(xos0VarM7, x340Var31, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode7), x340Var31, y580.R0);
                    nko1.F(x340Var31);
                    nko1.H(qim0VarE7, x340Var31, y580.Y);
                    String str4 = rd60Var2.a.b;
                    cjc0 cjc0Var = new cjc0(2);
                    long j = cbx.a(x340Var31).b.a;
                    boolean zD = x340Var31.d(4.0f);
                    Object objT13 = x340Var31.T();
                    if (zD || objT13 == fkj0.X) {
                        obj11 = objT13;
                        i030 i030Var = new i030(ven0Var, (byte) 19);
                        x340Var31.s0(i030Var);
                        obj11 = i030Var;
                    }
                    obj11 = objT13;
                    uwo1.e(str4, (qim0) null, (lee1) null, j, (a0e1) null, (iu30) obj11, 2, false, cjc0Var, 0, (qx8) null, x340Var31, 1572864, 0, 1686);
                    x340Var31.r(true);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 21:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar7 = cbx.a;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                ((bm00) obj13).e(0, b0kVar3, (iu30) obj12, aqb0.b((aqb0) obj, dug.f(uyn1.z(0.0f, 16.0f, 1, nim0Var), u7h.j, u5j1Var), (pxg1) null, (ni20) null, 7));
                return rih1Var;
            case 22:
                ((Number) obj3).intValue();
                sfx0 sfx0Var = (sfx0) obj12;
                n511 n511Var = (n511) obj13;
                x340 x340Var32 = (b0k) obj2;
                x340Var32.i0(-1322940339);
                Object objT14 = x340Var32.T();
                m4c m4cVar3 = fkj0.X;
                Object obj19 = objT14;
                if (objT14 == m4cVar3) {
                    c9n c9nVarM = qxd0.M(o6x.a, x340Var32);
                    x340Var32.s0(c9nVarM);
                    obj19 = c9nVarM;
                }
                c9n c9nVar = (c9n) obj19;
                boolean zG7 = x340Var32.g(n511Var) | x340Var32.i(c9nVar) | x340Var32.i(sfx0Var);
                Object objT15 = x340Var32.T();
                Object obj20 = objT15;
                if (zG7 || objT15 == m4cVar3) {
                    mhg mhgVar = new mhg(n511Var, c9nVar, sfx0Var, (byte) 3);
                    x340Var32.s0(mhgVar);
                    obj20 = mhgVar;
                }
                qim0 qim0VarB2 = f8d1.b(nim0Var, n511Var, (PointerInputEventHandler) obj20);
                x340Var32.r(false);
                return qim0VarB2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return a(obj, obj2, obj3);
            case 24:
                return d(obj, obj2, obj3);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var33 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    c97.e(0, ((y370) obj13).a, x340Var34, anm1.N("TITLE", nim0Var), ((wgh1) obj12).f);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 26:
                return e(obj, obj2, obj3);
            case 27:
                x340 x340Var35 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (((String) obj13).length() > 0) {
                    x340 x340Var36 = x340Var35;
                    x340Var36.i0(-795718243);
                    ((xu30) obj12).invoke(anm1.N("InviteByQrCodeImage", nim0Var), x340Var36, 0);
                    x340Var36.r(false);
                } else {
                    x340 x340Var37 = x340Var35;
                    x340Var37.i0(-795639441);
                    x340Var37.r(false);
                }
                return rih1Var;
            case 28:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                lw90 lw90Var = (lw90) obj13;
                acq0.s(cwl1.n0(2131956938, new Object[]{Integer.valueOf(lw90Var.c().a)}, b0kVar4), lw90Var instanceof iw90, (iu30) obj12, b0kVar4, 0);
                return rih1Var;
            default:
                x340 x340Var38 = (b0k) obj2;
                ((Number) obj3).intValue();
                era eraVar2 = een.Q0;
                uwr uwrVar8 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var38).b;
                hux huxVar = (hux) obj13;
                String str5 = (String) obj12;
                mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar2, x340Var38, 0);
                x340 x340Var39 = x340Var38;
                int iHashCode8 = Long.hashCode(x340Var39.T);
                xos0 xos0VarM8 = x340Var39.m();
                qim0 qim0VarE8 = zr7.E(x340Var38, nim0Var);
                hzj.A.getClass();
                x340 x340Var40 = x340Var38;
                if (x340Var40.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var40.m0();
                if (x340Var40.S) {
                    x340Var40.l(n4kVar);
                } else {
                    x340Var40.v0();
                }
                nko1.H(mbhVarA3, x340Var38, y580.O0);
                nko1.H(xos0VarM8, x340Var38, y580.N0);
                nko1.H(Integer.valueOf(iHashCode8), x340Var38, y580.R0);
                nko1.F(x340Var38);
                nko1.H(qim0VarE8, x340Var38, y580.Y);
                w0h1.a(huxVar, new jsl(str5), (qim0) null, 0L, 0L, false, x340Var38, 8, 60);
                uwo1.e(str5, (qim0) null, cbx.d(x340Var38).m, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var38, 0, 0, 2042);
                x340Var40.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cex(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
