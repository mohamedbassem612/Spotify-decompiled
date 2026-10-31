package p;

import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ki1 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ iu30 c;

    public /* synthetic */ ki1(List list, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = list;
        this.c = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        qim0 qim0Var;
        ksl kslVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        List list = this.b;
        boolean z = true;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    w4i1 w4i1Var = (w4i1) list.get(iIntValue);
                    x340Var2.i0(637351589);
                    qim0 qim0VarB = aqb0.b(aqb0Var, nim0Var, (pxg1) null, (ni20) null, 7);
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.i(w4i1Var);
                    if ((((i & 112) ^ 48) <= 32 || !x340Var2.e(iIntValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zG | z;
                    Object objT = x340Var2.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new ji1(iu30Var, w4i1Var, iIntValue);
                        x340Var2.s0(objT);
                    }
                    Parcelable.Creator creator = w4i1.CREATOR;
                    iho1.b(w4i1Var, qim0VarB, (Function0) objT, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    kb6 kb6Var = (kb6) list.get(iIntValue3);
                    x340Var4.i0(-375667913);
                    boolean zG2 = x340Var4.g(iu30Var) | x340Var4.i(kb6Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new nx2(iu30Var, kb6Var, (byte) 25);
                        x340Var4.s0(objT2);
                    }
                    ilo1.b(kb6Var, (Function0) objT2, x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    dwl dwlVar = (dwl) list.get(iIntValue5);
                    x340Var6.i0(1403523847);
                    d1e.d(dwlVar, iu30Var, u291.p(u291.k(nim0Var, 96.0f), dwlVar instanceof xul ? 272.0f : 96.0f), x340Var6, 0);
                    x340Var6.r(false);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var4 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (x340Var7.g(aqb0Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= x340Var7.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    w4i1 w4i1Var2 = (w4i1) list.get(iIntValue7);
                    x340Var8.i0(228642170);
                    qim0 qim0VarB2 = aqb0.b(aqb0Var4, nim0Var, (pxg1) null, (ni20) null, 7);
                    boolean zG3 = x340Var8.g(iu30Var);
                    if ((((i4 & 112) ^ 48) <= 32 || !x340Var8.e(iIntValue7)) && (i4 & 48) != 32) {
                        z = false;
                    }
                    boolean zI = zG3 | z | x340Var8.i(w4i1Var2);
                    Object objT3 = x340Var8.T();
                    if (zI || objT3 == fkj0.X) {
                        objT3 = new ji1(iu30Var, iIntValue7, w4i1Var2);
                        x340Var8.s0(objT3);
                    }
                    Parcelable.Creator creator2 = w4i1.CREATOR;
                    iho1.b(w4i1Var2, qim0VarB2, (Function0) objT3, x340Var8, 0);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                aqb0 aqb0Var5 = (aqb0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var9 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (x340Var9.g(aqb0Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= x340Var9.e(iIntValue9) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i5 & 1, (i5 & 147) != 146)) {
                    fom0 fom0Var = (fom0) list.get(iIntValue9);
                    x340Var10.i0(-1074875246);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uvx uvxVar = new uvx(1, (pgx) null, 3, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
                    boolean zG4 = x340Var10.g(iu30Var) | x340Var10.g(fom0Var);
                    if ((((i5 & 112) ^ 48) <= 32 || !x340Var10.e(iIntValue9)) && (i5 & 48) != 32) {
                        z = false;
                    }
                    boolean z3 = zG4 | z;
                    Object objT4 = x340Var10.T();
                    if (z3 || objT4 == fkj0.X) {
                        objT4 = new wv1(iu30Var, fom0Var, iIntValue9, (byte) 8);
                        x340Var10.s0(objT4);
                    }
                    jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT4), (gbx) null, (xu30) null, o2j.e, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(1274212647, new b1s(fom0Var, (byte) 11), x340Var10), x340Var10, 805306432, 196608, 32188);
                    x340Var10.r(false);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                uwr uwrVar = cbx.a;
                aqb0 aqb0Var6 = (aqb0) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var11 = (b0k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (x340Var11.g(aqb0Var6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= x340Var11.e(iIntValue11) ? 32 : 16;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i6 & 1, (i6 & 147) != 146)) {
                    ku50 ku50Var = (ku50) list.get(iIntValue11);
                    x340Var12.i0(-139374876);
                    mta mtaVar = cbx.b(x340Var12).d;
                    qim0 qim0Var2 = nim0.a;
                    qim0 qim0VarB3 = u291.b(0.0f, 32.0f, 1, qim0Var2);
                    boolean zG5 = x340Var12.g(iu30Var) | x340Var12.i(ku50Var);
                    Object objT5 = x340Var12.T();
                    if (zG5 || objT5 == m4cVar) {
                        objT5 = new nu50(iu30Var, ku50Var, (byte) 2);
                        x340Var12.s0(objT5);
                    }
                    qim0 qim0VarK = eqn1.k(qim0VarB3, (Function0) objT5);
                    boolean zI2 = x340Var12.i(ku50Var);
                    Object objT6 = x340Var12.T();
                    if (zI2 || objT6 == m4cVar) {
                        objT6 = new mu50(ku50Var, (byte) 2);
                        x340Var12.s0(objT6);
                    }
                    qim0 qim0VarB4 = s161.b(qim0VarK, true, (iu30) objT6);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var12, 48);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    qim0 qim0VarE = zr7.E(x340Var12, qim0VarB4);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw 0;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(hmb0.t1);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(jw31VarA, x340Var12, y580.O0);
                    nko1.H(xos0VarM, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE, x340Var12, y580.Y);
                    c380 c380Var = ku50Var.f;
                    if (c380Var.size() == 1) {
                        x340Var12.i0(-567707232);
                        ju50 ju50Var = (ju50) o7h.q0(c380Var);
                        hux huxVar = ju50Var.a;
                        ksl kslVar2 = isl.a;
                        if (huxVar == null) {
                            x340Var12.i0(-567652983);
                            x340Var12.r(false);
                            qim0Var = qim0Var2;
                            kslVar = kslVar2;
                        } else {
                            x340Var12.i0(-567652982);
                            long j = cbx.a(x340Var12).b.a;
                            cvx cvxVar = cbx.b(x340Var12).b;
                            qim0Var = qim0Var2;
                            w0h1.a(huxVar, kslVar2, u291.r(uyn1.B(qim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11), 18.0f), j, 0L, false, x340Var12, 56, 48);
                            kslVar = kslVar2;
                            x340Var12.r(false);
                        }
                        iu50 iu50Var = ju50Var.b;
                        if (iu50Var == null) {
                            x340Var12.i0(-567360622);
                            x340Var12.r(false);
                        } else {
                            x340Var12.i0(-567360621);
                            Uri uri = Uri.parse(iu50Var.a);
                            cvx cvxVar2 = cbx.b(x340Var12).b;
                            eso1.e(uri, kslVar, i1p1.q(u291.r(uyn1.B(qim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 18.0f), er31.a), null, null, null, null, null, null, null, false, false, x340Var12, 27696, 0, 4064);
                            x340Var12.r(false);
                        }
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(-566994015);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = c380Var.iterator();
                        while (it.hasNext()) {
                            iu50 iu50Var2 = ((ju50) it.next()).b;
                            if (iu50Var2 != null) {
                                arrayList.add(iu50Var2);
                            }
                        }
                        c380 c380VarA = mqo1.A(arrayList);
                        Object objT7 = x340Var12.T();
                        if (objT7 == m4cVar) {
                            objT7 = em50.R0;
                            x340Var12.s0(objT7);
                        }
                        mue1.m(c380VarA, s161.b(qim0Var2, false, (iu30) objT7), x340Var12, 3504);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar3 = cbx.b(x340Var12).b;
                        ywx0.n(qim0Var2, 4.0f, x340Var12, false);
                    }
                    uwo1.e(ku50Var.b, (qim0) null, cbx.d(x340Var12).k, cbx.a(x340Var12).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var12, 0, 0, 2034);
                    x340Var12.r(true);
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                aqb0 aqb0Var7 = (aqb0) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var13 = (b0k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (x340Var13.g(aqb0Var7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= x340Var13.e(iIntValue13) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i7 & 1, (i7 & 147) != 146)) {
                    iys0 iys0Var = (iys0) list.get(iIntValue13);
                    x340Var14.i0(181353700);
                    if ((((i7 & 112) ^ 48) <= 32 || !x340Var14.e(iIntValue13)) && (i7 & 48) != 32) {
                        z = false;
                    }
                    boolean zG6 = x340Var14.g(iys0Var) | z;
                    Object objT8 = x340Var14.T();
                    if (zG6 || objT8 == fkj0.X) {
                        objT8 = new wta0(iIntValue13, new d720(iu30Var, (byte) 18));
                        x340Var14.s0(objT8);
                    }
                    otw.c((wta0) objT8, new vta0(iys0Var), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                    x340Var14.r(false);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                aqb0 aqb0Var8 = (aqb0) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (x340Var15.g(aqb0Var8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= x340Var15.e(iIntValue15) ? 32 : 16;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i8 & 1, (i8 & 147) != 146)) {
                    eka1 eka1Var = (eka1) list.get(iIntValue15);
                    x340Var16.i0(1270347883);
                    boolean zG7 = x340Var16.g(iu30Var) | x340Var16.i(eka1Var);
                    Object objT9 = x340Var16.T();
                    if (zG7 || objT9 == fkj0.X) {
                        objT9 = new zkz0(iu30Var, eka1Var, (byte) 0);
                        x340Var16.s0(objT9);
                    }
                    zmo1.k(eka1Var, (Function0) objT9, (qim0) null, x340Var16, 0);
                    x340Var16.r(false);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                rub0 rub0Var = (rub0) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var17 = (b0k) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (x340Var17.g(rub0Var) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= x340Var17.e(iIntValue17) ? 32 : 16;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(i9 & 1, (i9 & 147) != 146)) {
                    String str = (String) list.get(iIntValue17);
                    x340Var18.i0(23031771);
                    boolean zG8 = x340Var18.g(iu30Var) | x340Var18.g(str);
                    Object objT10 = x340Var18.T();
                    if (zG8 || objT10 == fkj0.X) {
                        objT10 = new are(iu30Var, str, (byte) 15);
                        x340Var18.s0(objT10);
                    }
                    eqn1.i(0, str, (Function0) objT10, x340Var18, (qim0) null);
                    x340Var18.r(false);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                aqb0 aqb0Var9 = (aqb0) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var19 = (b0k) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (x340Var19.g(aqb0Var9) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= x340Var19.e(iIntValue19) ? 32 : 16;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i10 & 1, (i10 & 147) != 146)) {
                    y8f1 y8f1Var = (y8f1) list.get(iIntValue19);
                    x340Var20.i0(715861805);
                    boolean zG9 = x340Var20.g(iu30Var) | x340Var20.g(y8f1Var);
                    Object objT11 = x340Var20.T();
                    if (zG9 || objT11 == fkj0.X) {
                        objT11 = new x0e1(iu30Var, y8f1Var, (byte) 13);
                        x340Var20.s0(objT11);
                    }
                    pqo.b(y8f1Var, (Function0) objT11, (qim0) null, x340Var20, 0);
                    x340Var20.r(false);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            default:
                aqb0 aqb0Var10 = (aqb0) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var21 = (b0k) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (x340Var21.g(aqb0Var10) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= x340Var21.e(iIntValue21) ? 32 : 16;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(i11 & 1, (i11 & 147) != 146)) {
                    rjf1 rjf1Var = (rjf1) list.get(iIntValue21);
                    x340Var22.i0(321306532);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    boolean zG10 = x340Var22.g(iu30Var) | x340Var22.g(rjf1Var);
                    Object objT12 = x340Var22.T();
                    if (zG10 || objT12 == fkj0.X) {
                        objT12 = new x0e1(iu30Var, rjf1Var, (byte) 23);
                        x340Var22.s0(objT12);
                    }
                    exd0.k(rjf1Var, (Function0) objT12, qim0VarF2, x340Var22, 0);
                    x340Var22.r(false);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
        }
    }
}
