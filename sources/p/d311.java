package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d311 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d311(byte b, Object obj, Object obj2, List list) {
        this.a = b;
        this.b = list;
        this.c = obj;
        this.d = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            rzj1 rzj1Var = (rzj1) this.b.get(iIntValue);
            x340Var2.i0(1759228976);
            qim0 qim0VarB = aqb0.b(aqb0Var, nim0.a, (pxg1) null, (ni20) null, 7);
            String str = rzj1Var.b;
            String str2 = rzj1Var.a;
            lzj1 lzj1Var = new lzj1(iIntValue, str, str2, x4p1.l((bzj1) this.c, str2));
            pzj1 pzj1Var = (pzj1) this.d;
            i1o1.e(pzj1Var, lzj1Var, pzj1Var.a, qim0VarB, (ipb1) null, xqj.c, (xu30) null, 0, (xu30) null, x340Var2, 196608, 232);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        iu30 iu30Var = (iu30) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            gzl1 gzl1Var = (gzl1) this.b.get(iIntValue);
            x340Var2.i0(1328829050);
            boolean z = gzl1Var == ((gzl1) this.c);
            boolean zG = x340Var2.g(iu30Var) | x340Var2.e(gzl1Var.ordinal());
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new g4k1(iu30Var, gzl1Var, (byte) 13);
                x340Var2.s0(objT);
            }
            poo1.e(new gbx(z50.c, (Function0) objT), z ? new nex(6) : pex.b, yoo1.z(x340Var2), (qim0) null, 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-894962641, new fak1(gzl1Var, (byte) 17), x340Var2), x340Var2, 0, 3072, 8184);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        mmr0 mmr0Var;
        int i3;
        int i4;
        int i5;
        ?? r9;
        Object obj5;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        ldo fmuVar;
        boolean z;
        boolean z2;
        int i10;
        List listSingletonList;
        int i11;
        Object obj6;
        int i12;
        b5i1 b5i1Var;
        int i13;
        byte b = this.a;
        byte b2 = 24;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.d;
        Object obj8 = this.c;
        c380 c380Var = this.b;
        boolean z3 = true;
        switch (b) {
            case 0:
                rub0 rub0Var = (rub0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var.g(rub0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    u211 u211Var = (u211) c380Var.get(iIntValue);
                    x340Var2.i0(-1900658695);
                    otw.c((ufd) obj8, new r751(((c311) obj7).a, u211Var, iIntValue), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    d6q0 d6q0Var = (b6q0) c380Var.get(iIntValue3);
                    x340Var4.i0(-1232806711);
                    yp71 yp71Var = (yp71) obj8;
                    t7q0 t7q0Var = ((dp71) obj7).b;
                    if (d6q0Var instanceof d6q0) {
                        d6q0 d6q0Var2 = d6q0Var;
                        mmr0Var = new mmr0(d6q0Var2.a, d6q0Var2.b);
                    } else {
                        if (!(d6q0Var instanceof h6q0)) {
                            eg.o();
                            return null;
                        }
                        w4i1 w4i1Var = ((h6q0) d6q0Var).a;
                        mmr0Var = new mmr0(Collections.singletonList(w4i1Var), w4i1Var.b);
                    }
                    otw.c(yp71Var, new up71(iIntValue3, (List) mmr0Var.a, (String) mmr0Var.b, d6q0Var.h(), d6q0Var.j(), t7q0Var, d6q0Var.a(), d6q0Var.k()), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var5.g(aqb0Var2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    ns71 ns71Var = (ns71) c380Var.get(iIntValue5);
                    x340Var6.i0(-1184462765);
                    qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 10.0f, 7);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(hmb0.t1);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    otw.c((ls71) obj8, new ks71(ns71Var.a, ns71Var.b, iIntValue5, ((os71) obj7).a), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    x340Var6.r(true);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                vu30 vu30Var = (vu30) obj7;
                ven0 ven0Var = (ven0) obj8;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (x340Var7.g(aqb0Var3) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= x340Var7.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    m881 m881Var = (m881) c380Var.get(iIntValue7);
                    x340Var8.i0(181988207);
                    boolean zI = x340Var8.i(ven0Var) | x340Var8.g(vu30Var) | x340Var8.g(m881Var);
                    if ((((i4 & 112) ^ 48) <= 32 || !x340Var8.e(iIntValue7)) && (i4 & 48) != 32) {
                        z3 = false;
                    }
                    boolean z4 = zI | z3;
                    Object objT = x340Var8.T();
                    if (z4 || objT == fkj0.X) {
                        objT = new ka0(vu30Var, m881Var, iIntValue7, ven0Var, (byte) 14);
                        x340Var8.s0(objT);
                    }
                    z6p1.k(m881Var, (Function0) objT, (qim0) null, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                aqb0 aqb0Var4 = (aqb0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var9 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                iu30 iu30Var = (iu30) obj7;
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (x340Var9.g(aqb0Var4) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= x340Var9.e(iIntValue9) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i5 & 1, (i5 & 147) != 146)) {
                    bc81 bc81Var = (bc81) ((ArrayList) c380Var).get(iIntValue9);
                    x340Var10.i0(638695587);
                    Map map = ((i7a1) obj8).b;
                    boolean zG = x340Var10.g(iu30Var) | x340Var10.g(bc81Var);
                    Object objT2 = x340Var10.T();
                    if (zG || objT2 == fkj0.X) {
                        r9 = 0;
                        k7a1 k7a1Var = new k7a1((Object) iu30Var, (Object) bc81Var, (byte) (false ? 1 : 0));
                        x340Var10.s0(k7a1Var);
                        obj5 = k7a1Var;
                    } else {
                        r9 = 0;
                        obj5 = objT2;
                    }
                    gm50.h(bc81Var, map, (Function0) obj5, x340Var10, (int) r9);
                    x340Var10.r((boolean) r9);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                rub0 rub0Var2 = (rub0) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var11 = (b0k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (x340Var11.g(rub0Var2) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= x340Var11.e(iIntValue11) ? 32 : 16;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i6 & 1, (i6 & 147) != 146)) {
                    iys0 iys0Var = (iys0) c380Var.get(iIntValue11);
                    x340Var12.i0(1946073663);
                    ((irp) obj8).getClass();
                    otw.c(new awc1(iIntValue11, (vu30) obj7), new zvc1(iys0Var), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                aqb0 aqb0Var5 = (aqb0) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var13 = (b0k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (x340Var13.g(aqb0Var5) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= x340Var13.e(iIntValue13) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i7 & 1, (i7 & 147) != 146)) {
                    w8d1 w8d1Var = (w8d1) c380Var.get(iIntValue13);
                    x340Var14.i0(-1909388571);
                    Object objT3 = x340Var14.T();
                    if (objT3 == fkj0.X) {
                        h9d1 h9d1Var = (h9d1) obj7;
                        vsq vsqVar = h9d1Var.a;
                        iuy0 iuy0Var = h9d1Var.b;
                        hyl0 hyl0Var = (hyl0) ((y281) ((jmq) vsqVar.a.c).a).b;
                        c8o.l(hyl0Var);
                        d9d1 d9d1Var = new d9d1(hyl0Var, iuy0Var);
                        x340Var14.s0(d9d1Var);
                        objT3 = d9d1Var;
                    }
                    g9d1 g9d1Var = (g9d1) obj8;
                    otw.c((d9d1) objT3, new c9d1(w8d1Var, iIntValue13, g9d1Var.b, g9d1Var.c), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                    x340Var14.r(false);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                uwr uwrVar = cbx.a;
                aqb0 aqb0Var6 = (aqb0) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var2 = (iu30) obj7;
                iie1 iie1Var = (iie1) obj8;
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (x340Var15.g(aqb0Var6) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= x340Var15.e(iIntValue15) ? 32 : 16;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i8 & 1, (i8 & 147) != 146)) {
                    int i14 = i8 & 126;
                    uhe1 uhe1Var = (uhe1) c380Var.get(iIntValue15);
                    x340Var16.i0(-1693037633);
                    qim0 qim0VarD = o0c.d(nim0Var, (ni20) null, 3);
                    if (iIntValue15 == iie1Var.f.s()) {
                        x340Var16.i0(1330865463);
                        zov0 zov0Var = cbx.b(x340Var16).g;
                        x340Var16.r(false);
                        f = 48.0f;
                    } else {
                        x340Var16.i0(1330867668);
                        zov0 zov0Var2 = cbx.b(x340Var16).g;
                        x340Var16.r(false);
                        f = 24.0f;
                    }
                    qim0 qim0VarV = u291.v(qim0VarD, f);
                    zov0 zov0Var3 = cbx.b(x340Var16).g;
                    qim0 qim0VarH = u291.h(qim0VarV, 48.0f);
                    int i15 = (i8 & 112) ^ 48;
                    boolean zG2 = x340Var16.g(iu30Var2) | ((i15 > 32 && x340Var16.e(iIntValue15)) || (i8 & 48) == 32);
                    Object objT4 = x340Var16.T();
                    Object obj9 = objT4;
                    if (zG2 || objT4 == m4cVar) {
                        ck0 ck0Var = new ck0(iu30Var2, iIntValue15, (byte) 24);
                        x340Var16.s0(ck0Var);
                        obj9 = ck0Var;
                    }
                    qim0 qim0VarX = bin.x(qim0VarH, false, (String) null, (pm31) null, (idn0) null, (Function0) obj9, 15);
                    if ((i15 <= 32 || !x340Var16.e(iIntValue15)) && (i8 & 48) != 32) {
                        z3 = false;
                    }
                    boolean zG3 = x340Var16.g(iie1Var) | z3;
                    Object objT5 = x340Var16.T();
                    Object obj10 = objT5;
                    if (zG3 || objT5 == m4cVar) {
                        ym ymVar = new ym(iIntValue15, iie1Var, (byte) 26);
                        x340Var16.s0(ymVar);
                        obj10 = ymVar;
                    }
                    s9p1.z(iIntValue15, uhe1Var, anm1.N("thumbnail_item", s161.b(qim0VarX, false, (iu30) obj10)), x340Var16, (i14 >> 3) & 14);
                    x340Var16.r(false);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                aqb0 aqb0Var7 = (aqb0) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var17 = (b0k) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (x340Var17.g(aqb0Var7) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= x340Var17.e(iIntValue17) ? 32 : 16;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(i9 & 1, (i9 & 147) != 146)) {
                    yue1 yue1Var = (yue1) c380Var.get(iIntValue17);
                    x340Var18.i0(798771902);
                    if (yue1Var instanceof x5r) {
                        x340Var18.i0(798802374);
                        if (iIntValue17 == 0) {
                            x340Var18.i0(798827112);
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar = cbx.b(x340Var18).b;
                            z2 = false;
                            x0d.s(nim0Var, 8.0f, x340Var18, false);
                        } else {
                            z2 = false;
                            x340Var18.i0(798916485);
                            x340Var18.r(false);
                        }
                        x340Var18.r(z2);
                    } else {
                        x340Var18.i0(798924421);
                        x340Var18.r(false);
                    }
                    boolean zG4 = x340Var18.g(yue1Var);
                    Object objT6 = x340Var18.T();
                    if (zG4 || objT6 == fkj0.X) {
                        pre1 pre1Var = (pre1) obj8;
                        iu30 iu30Var3 = (iu30) obj7;
                        if (yue1Var instanceof x5r) {
                            r6m0 r6m0Var = new r6m0();
                            fmuVar = pre1Var.a.a(new fjc1(r6m0Var, b2), r6m0Var);
                        } else if (yue1Var instanceof usb1) {
                            fmuVar = pre1Var.b.a();
                        } else if (yue1Var instanceof b9x) {
                            switch (pre1Var.c.a) {
                                case 0:
                                    fmuVar = new fmu((byte) 1);
                                    break;
                                default:
                                    fmuVar = new fmu((byte) 1);
                                    break;
                            }
                        } else if (yue1Var instanceof sa60) {
                            buq buqVar = pre1Var.d;
                            switch (buqVar.a) {
                                case 0:
                                    f0a f0aVar = (f0a) buqVar.b.c;
                                    gw70 gw70Var = (gw70) ((lii1) f0aVar.b).d.get();
                                    c8o.l(gw70Var);
                                    lii1 lii1Var = (lii1) f0aVar.b;
                                    Context context = (Context) lii1Var.b.get();
                                    c8o.l(context);
                                    gw70 gw70Var2 = (gw70) lii1Var.d.get();
                                    c8o.l(gw70Var2);
                                    c8o.l((im4) lii1Var.g.get());
                                    xfx xfxVar = new xfx(context, gw70Var2, new sua((byte) 9));
                                    lzn0 lzn0Var = (lzn0) ((lii1) f0aVar.b).f.get();
                                    c8o.l(lzn0Var);
                                    xh71 xh71Var = (xh71) ((lii1) f0aVar.b).h.get();
                                    c8o.l(xh71Var);
                                    xf60 xf60Var = new xf60(xh71Var);
                                    ssf1 ssf1Var = (ssf1) ((lii1) f0aVar.b).p.get();
                                    c8o.l(ssf1Var);
                                    fmuVar = new tm(gw70Var, xfxVar, lzn0Var, xf60Var, ssf1Var, f0aVar.y());
                                    break;
                                default:
                                    wj3 wj3Var = (wj3) buqVar.b.c;
                                    gw70 gw70Var3 = (gw70) ((pii1) wj3Var.b).e.get();
                                    c8o.l(gw70Var3);
                                    gj5 gj5Var = (gj5) ((pii1) wj3Var.b).b.get();
                                    c8o.l(gj5Var);
                                    pii1 pii1Var = (pii1) wj3Var.b;
                                    gw70 gw70Var4 = (gw70) pii1Var.e.get();
                                    c8o.l(gw70Var4);
                                    c8o.l((im4) pii1Var.g.get());
                                    xfx xfxVar2 = new xfx(gj5Var, gw70Var4, new sua((byte) 9));
                                    lzn0 lzn0Var2 = (lzn0) ((pii1) wj3Var.b).c.get();
                                    c8o.l(lzn0Var2);
                                    xh71 xh71Var2 = (xh71) ((pii1) wj3Var.b).h.get();
                                    c8o.l(xh71Var2);
                                    xf60 xf60Var2 = new xf60(xh71Var2);
                                    ssf1 ssf1Var2 = (ssf1) ((pii1) wj3Var.b).o.get();
                                    c8o.l(ssf1Var2);
                                    fmuVar = new tm(gw70Var3, xfxVar2, lzn0Var2, xf60Var2, ssf1Var2, wj3Var.m());
                                    break;
                            }
                        } else if (yue1Var instanceof t6x) {
                            switch (pre1Var.e.a) {
                                case 0:
                                    fmuVar = new u6x((byte) 0);
                                    break;
                                default:
                                    fmuVar = new u6x((byte) 0);
                                    break;
                            }
                        } else if (yue1Var instanceof rae0) {
                            switch (pre1Var.f.a) {
                                case 0:
                                    fmuVar = new fmu((byte) 2);
                                    break;
                                default:
                                    fmuVar = new fmu((byte) 2);
                                    break;
                            }
                        } else if (yue1Var instanceof dte1) {
                            fmuVar = new hhz(pre1Var.h, new pwc1(iu30Var3, (byte) 16));
                        } else if (yue1Var instanceof qre1) {
                            switch (pre1Var.g.a) {
                                case 0:
                                    fmuVar = new fmu((byte) 3);
                                    break;
                                default:
                                    fmuVar = new fmu((byte) 3);
                                    break;
                            }
                        } else {
                            fmuVar = null;
                        }
                        ldo ldoVar = fmuVar != null ? fmuVar : null;
                        x340Var18.s0(ldoVar);
                        objT6 = ldoVar;
                    }
                    xpw xpwVar = (xpw) objT6;
                    if (xpwVar == null) {
                        x340Var18.i0(799041941);
                        z = false;
                    } else {
                        z = false;
                        x340Var18.i0(799041942);
                        otw.c(xpwVar, yue1Var, (qim0) null, (ipb1) null, x340Var18, 0, 12);
                    }
                    x340Var18.r(z);
                    x340Var18.r(z);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                aqb0 aqb0Var8 = (aqb0) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var19 = (b0k) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (x340Var19.g(aqb0Var8) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= x340Var19.e(iIntValue19) ? 32 : 16;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i10 & 1, (i10 & 147) != 146)) {
                    d6q0 d6q0Var3 = (b6q0) c380Var.get(iIntValue19);
                    x340Var20.i0(-1821492401);
                    yp71 yp71Var2 = (yp71) obj8;
                    String str = (String) obj7;
                    String strA = d6q0Var3.a();
                    if (d6q0Var3 instanceof d6q0) {
                        listSingletonList = d6q0Var3.a;
                    } else {
                        if (!(d6q0Var3 instanceof h6q0)) {
                            eg.o();
                            return null;
                        }
                        listSingletonList = Collections.singletonList(((h6q0) d6q0Var3).a);
                    }
                    otw.c(yp71Var2, new vp71(iIntValue19, listSingletonList, d6q0Var3.h(), d6q0Var3.j(), new g7q0(str), strA, f610.Q0), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                    x340Var20.r(false);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                aqb0 aqb0Var9 = (aqb0) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var21 = (b0k) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (x340Var21.g(aqb0Var9) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= x340Var21.e(iIntValue21) ? 32 : 16;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(i11 & 1, (i11 & 147) != 146)) {
                    zmh1 zmh1Var = (zmh1) c380Var.get(iIntValue21);
                    x340Var22.i0(1687760135);
                    boolean zG5 = x340Var22.g(zmh1Var.a);
                    Object objT7 = x340Var22.T();
                    if (zG5 || objT7 == fkj0.X) {
                        obj6 = objT7;
                        gnh1 gnh1Var = new gnh1(((wmh1) obj7).a);
                        x340Var22.s0(gnh1Var);
                        obj6 = gnh1Var;
                    }
                    obj6 = objT7;
                    otw.c((gnh1) obj6, new hnh1(zmh1Var, ((xmh1) obj8).b, iIntValue21), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                    x340Var22.r(false);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 11:
                aqb0 aqb0Var10 = (aqb0) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                x340 x340Var23 = (b0k) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                vu30 vu30Var2 = (vu30) obj8;
                iu30 iu30Var4 = (iu30) obj7;
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (x340Var23.g(aqb0Var10) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= x340Var23.e(iIntValue23) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(i12 & 1, (i12 & 147) != 146)) {
                    yc90 yc90Var = (yc90) ((ArrayList) c380Var).get(iIntValue23);
                    x340Var24.i0(-2126150887);
                    b5i1 b5i1Var2 = yc90Var.a;
                    me90 me90Var = yc90Var.b;
                    String strI = wro1.I(b5i1Var2);
                    String username = b5i1Var2.getUsername();
                    boolean zG6 = x340Var24.g(vu30Var2) | x340Var24.i(yc90Var) | ((((i12 & 112) ^ 48) > 32 && x340Var24.e(iIntValue23)) || (i12 & 48) == 32);
                    Object objT8 = x340Var24.T();
                    if (zG6 || objT8 == m4cVar2) {
                        objT8 = new v2b(vu30Var2, yc90Var, iIntValue23, (lnm) null, (byte) 13);
                        x340Var24.s0(objT8);
                    }
                    qxd0.s(username, me90Var, (vu30) objT8, x340Var24);
                    me90 me90Var2 = me90.c;
                    String strN0 = cwl1.n0(me90Var == me90Var2 ? 2131963643 : 2131963644, new Object[]{strI}, x340Var24);
                    boolean z5 = (me90Var == me90Var2 || me90Var == me90.b) ? false : true;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean zG7 = x340Var24.g(strN0) | x340Var24.h(z5) | x340Var24.g(iu30Var4) | x340Var24.i(b5i1Var2);
                    Object objT9 = x340Var24.T();
                    if (zG7 || objT9 == m4cVar2) {
                        objT9 = new eu91(strN0, z5, iu30Var4, b5i1Var2, (byte) 5);
                        b5i1Var = b5i1Var2;
                        x340Var24.s0(objT9);
                    } else {
                        b5i1Var = b5i1Var2;
                    }
                    jto1.b(s161.b(qim0VarF, true, (iu30) objT9), new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(177131929, new sgi1(b5i1Var, strI, (byte) 2), x340Var24), (xu30) null, (xu30) null, (xu30) null, apo.r(1113572662, new p8e1(yc90Var, iu30Var4, b5i1Var, (byte) 6), x340Var24), (xu30) null, (xu30) null, apo.r(-1041800877, new dba1(strI, (byte) 12), x340Var24), x340Var24, 100663360, 196992, 28412);
                    x340Var24.r(false);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 12:
                return a(obj, obj2, obj3, obj4);
            case 13:
                return d(obj, obj2, obj3, obj4);
            default:
                aqb0 aqb0Var11 = (aqb0) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var25 = (b0k) obj3;
                int iIntValue26 = ((Number) obj4).intValue();
                if ((iIntValue26 & 6) == 0) {
                    i13 = iIntValue26 | (x340Var25.g(aqb0Var11) ? 4 : 2);
                } else {
                    i13 = iIntValue26;
                }
                if ((iIntValue26 & 48) == 0) {
                    i13 |= x340Var25.e(iIntValue25) ? 32 : 16;
                }
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(i13 & 1, (i13 & 147) != 146)) {
                    kjo0 kjo0Var = (kjo0) c380Var.get(iIntValue25);
                    x340Var26.i0(-1907382464);
                    otw.c((o2n1) ((ynb0) ((yrg0) obj8).b).get(), new n2n1(iIntValue25, kjo0Var, (iu30) obj7), aqb0.b(aqb0Var11, nim0Var, (pxg1) null, (ni20) null, 7), (ipb1) null, x340Var26, 72, 8);
                    x340Var26.r(false);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
        }
    }
}
