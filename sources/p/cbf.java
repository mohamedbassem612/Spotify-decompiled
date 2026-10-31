package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cbf implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ cbf(List list, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        int i8;
        int i9;
        x340 x340Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.g;
        Object obj6 = this.d;
        Object obj7 = this.c;
        c380 c380Var = this.b;
        Object obj8 = this.e;
        Object obj9 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int i10 = 32;
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ven0 ven0Var = (ven0) obj9;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var2.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    if (!x340Var2.e(iIntValue)) {
                        i10 = 16;
                    }
                    i |= i10;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(i & 1, (i & 147) != 146)) {
                    jwm jwmVar = (jwm) c380Var.get(iIntValue);
                    x340Var3.i0(-182939868);
                    xpi0 xpi0Var = (xpi0) obj7;
                    int size = ((c380) ((ven0) obj5).getValue()).size() + iIntValue;
                    abf abfVar = (abf) obj6;
                    String str = abfVar.b;
                    String str2 = abfVar.a;
                    jwm jwmVar2 = (jwm) obj8;
                    boolean zI = x340Var3.i(ven0Var) | x340Var3.i(jwmVar);
                    Object objT = x340Var3.T();
                    if (zI || objT == fkj0.X) {
                        objT = new bbf(ven0Var, jwmVar, (byte) 1);
                        x340Var3.s0(objT);
                    }
                    otw.c(xpi0Var, new tpi0(size, str, str2, jwmVar, jwmVar2, (Function0) objT), (qim0) null, (ipb1) null, x340Var3, 0, 12);
                    x340Var3.r(false);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 1:
                int i11 = 32;
                z8x z8xVar = (z8x) obj5;
                gpb0 gpb0Var = (gpb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var4 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                g1i g1iVar = (g1i) obj6;
                if ((iIntValue4 & 6) == 0) {
                    i2 = (x340Var4.g(gpb0Var) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    if (!x340Var4.e(iIntValue3)) {
                        i11 = 16;
                    }
                    i2 |= i11;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(i2 & 1, (i2 & 147) != 146)) {
                    a900 a900Var = (d6m) c380Var.get(iIntValue3);
                    x340Var5.i0(1526268175);
                    if (a900Var instanceof a900) {
                        x340Var5.i0(1526299670);
                        a900 a900Var2 = a900Var;
                        String str3 = a900Var2.b;
                        int iOrdinal = a900Var2.h.ordinal();
                        if (iOrdinal == 0) {
                            z3 = false;
                            x340Var5.i0(1526340683);
                            x340Var5.r(false);
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                x340Var5.i0(1527030495);
                                i1o1.e((tyq) obj8, new tek(str3, 1, 56, true), cwl1.C((q7r0) g1iVar.f), null, null, apo.r(-449665568, new opk(g1iVar, (byte) 1), x340Var5), mei.b, 0, null, x340Var5, 1769472, 204);
                                z4 = false;
                                x340Var5.r(false);
                            } else if (iOrdinal == 3) {
                                z4 = false;
                                x340Var5.i0(1527537035);
                                x340Var5.r(false);
                            } else {
                                if (iOrdinal != 4) {
                                    throw p3d1.k(x340Var5, -1197690516, false);
                                }
                                x340Var5.i0(1527597547);
                                z4 = false;
                                x340Var5.r(false);
                            }
                            z3 = z4;
                        } else {
                            x340Var5.i0(1526419361);
                            z3 = false;
                            i1o1.e((tyq) obj7, new vqk(str3, (af5) null, (u7h) null, true, 1, 1, false, false, (u7h) null, (String) null, (Integer) null, (Integer) null, 32654), cwl1.C((q7r0) g1iVar.f), null, null, apo.r(2019665951, new opk(g1iVar, (byte) 0), x340Var5), mei.a, 0, null, x340Var5, 1769536, 204);
                            x340Var5.r(false);
                        }
                        x340Var5.r(z3);
                        z = z3;
                    } else if (a900Var instanceof hvi1) {
                        x340Var5.i0(-1197645831);
                        i1o1.e((ovi1) obj9, new kvi1(((hvi1) a900Var).b), cwl1.C((q7r0) g1iVar.f), null, null, apo.r(-2036181609, new opk(g1iVar, (byte) 2), x340Var5), mei.c, 0, null, x340Var5, 1769480, 204);
                        z = false;
                        x340Var5.r(false);
                    } else if (a900Var instanceof iye1) {
                        x340Var5.i0(-1197637863);
                        iye1 iye1Var = (iye1) a900Var;
                        if (iye1Var.a.length() > 0) {
                            x340Var5.i0(-1197637026);
                            z2 = false;
                            g1iVar.g(iye1Var, (qim0) null, x340Var5, 0);
                        } else {
                            z2 = false;
                            x340Var5.i0(1527966509);
                        }
                        x340Var5.r(z2);
                        x340Var5.r(z2);
                        z = z2;
                    } else {
                        if (!(a900Var instanceof w8x)) {
                            throw p3d1.k(x340Var5, -1197691532, false);
                        }
                        x340Var5.i0(-1197635153);
                        z8xVar.getClass();
                        w8x w8xVar = (w8x) a900Var;
                        otw.c(q1o1.u(z8xVar, null, null, 7), new y8x(w8xVar.a, w8xVar.b, w8xVar.c, w8xVar.d, false), (qim0) null, (ipb1) null, x340Var5, 0, 12);
                        z = false;
                        x340Var5.r(false);
                    }
                    x340Var5.r(z);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 2:
                gpb0 gpb0Var2 = (gpb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var6 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                List list = (List) obj8;
                i4d0 i4d0Var = (i4d0) obj7;
                m4c m4cVar = fkj0.X;
                tvb0 tvb0Var = (tvb0) obj6;
                dpy dpyVar = tvb0Var.a;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var6.g(gpb0Var2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var6.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(i3 & 1, (i3 & 147) != 146)) {
                    mhy mhyVar = (mhy) c380Var.get(iIntValue5);
                    x340Var7.i0(-1651557224);
                    boolean zG = x340Var7.g(rc11.a.b(mhyVar.getClass())) | x340Var7.g(mhyVar);
                    Object objT2 = x340Var7.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = dpyVar.a(mhyVar);
                        x340Var7.s0(objT2);
                    }
                    fzy fzyVar = (fzy) objT2;
                    int i12 = (i3 & 112) ^ 48;
                    boolean zE = x340Var7.e(fzyVar.ordinal()) | ((i12 > 32 && x340Var7.e(iIntValue5)) || (i3 & 48) == 32) | x340Var7.g(i4d0Var);
                    Object objT3 = x340Var7.T();
                    if (zE || objT3 == m4cVar) {
                        sw9 sw9Var = tvb0Var.b;
                        int i13 = sw9Var.b;
                        if (((dpy) sw9Var.c).a(mhyVar).a == nyy.d) {
                            i4 = 1;
                            i5 = 1;
                        } else {
                            i4 = i13;
                            i5 = 1;
                        }
                        if (i13 == i5 || i4 == i13) {
                            i6 = 0;
                        } else if (i4 != i5) {
                            n57.e("O(1) column position requires single-span body items but got span=" + i4 + " at index=" + iIntValue5);
                            i6 = 0;
                        } else {
                            int i14 = iIntValue5 - i4d0Var.a;
                            if (i14 < 0) {
                                i14 = 0;
                            }
                            i6 = i14 % i13;
                        }
                        int i15 = (iIntValue5 - i6) - 1;
                        objT3 = tvb0Var.d.g(iIntValue5, i6, list.size(), fzyVar.a, i15 >= 0 ? dpyVar.a((mhy) list.get(i15)).a : null);
                        i7 = iIntValue5;
                        x340Var7.s0(objT3);
                    } else {
                        i7 = iIntValue5;
                    }
                    vzq0 vzq0Var = (vzq0) objT3;
                    boolean z6 = (i12 > 32 && x340Var7.e(i7)) || (i3 & 48) == 32;
                    Object objT4 = x340Var7.T();
                    if (z6 || objT4 == m4cVar) {
                        objT4 = new po60(i7, (byte) 9);
                        x340Var7.s0(objT4);
                    }
                    dgo1.c("your_library_list_composer", (iu30) objT4, apo.r(1650972875, new wc0(tvb0Var, fzyVar, (qih1) obj9, i7, mhyVar, (iu30) obj5, vzq0Var), x340Var7), x340Var7, 390);
                    x340Var7.r(false);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var8 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                fvd fvdVar = (fvd) obj5;
                m4c m4cVar2 = fkj0.X;
                ven0 ven0Var2 = (ven0) obj9;
                if ((iIntValue8 & 6) == 0) {
                    z5 = true;
                    i8 = iIntValue8 | (x340Var8.g(aqb0Var2) ? 4 : 2);
                } else {
                    z5 = true;
                    i8 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i8 |= x340Var8.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(i8 & 1, (i8 & 147) != 146 ? z5 : false)) {
                    c380 c380Var2 = (c380) c380Var.get(iIntValue7);
                    x340Var9.i0(738845852);
                    if (((s3t0) o7h.q0(c380Var2)).j) {
                        x340Var9.i0(738869969);
                        s3t0 s3t0Var = (s3t0) o7h.q0(c380Var2);
                        Map map = (Map) obj7;
                        Object objB = map.get(s3t0Var);
                        if (objB == null) {
                            objB = gio1.b(Boolean.FALSE);
                            map.put(s3t0Var, objB);
                        }
                        kly0 kly0Var = (kly0) obj6;
                        o0i o0iVar = (o0i) obj8;
                        boolean zBooleanValue = ((Boolean) rwq.h((wen0) objB, x340Var9, 0).getValue()).booleanValue();
                        boolean zG2 = x340Var9.g(ven0Var2);
                        Object objT5 = x340Var9.T();
                        if (zG2 || objT5 == m4cVar2) {
                            objT5 = new abh0(ven0Var2, (byte) 26);
                            x340Var9.s0(objT5);
                        }
                        qim0 qim0VarV = u291.v(nim0.a, fvdVar.a);
                        cbx.a.getClass();
                        w3p1.d(kly0Var, o0iVar, s3t0Var, zBooleanValue, (iu30) objT5, hno1.f(qim0VarV, (ecx) uwr.k.getValue()), x340Var9, 64);
                        x340Var9.r(false);
                    } else {
                        x340Var9.i0(739460891);
                        float f = fvdVar.b;
                        boolean zG3 = x340Var9.g(ven0Var2);
                        Object objT6 = x340Var9.T();
                        if (zG3 || objT6 == m4cVar2) {
                            objT6 = new abh0(ven0Var2, (byte) 27);
                            x340Var9.s0(objT6);
                        }
                        f2p1.g(f, 0, x340Var9, (iu30) objT6, c380Var2, null);
                        x340Var9.r(false);
                    }
                    x340Var9.r(false);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            default:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var10 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                iu30 iu30Var = (iu30) obj9;
                m4c m4cVar3 = fkj0.X;
                iu30 iu30Var2 = (iu30) obj8;
                if ((iIntValue10 & 6) == 0) {
                    i9 = iIntValue10 | (x340Var10.g(aqb0Var3) ? 4 : 2);
                } else {
                    i9 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i9 |= x340Var10.e(iIntValue9) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i9 & 1, (i9 & 147) != 146)) {
                    String str4 = (String) c380Var.get(iIntValue9);
                    x340Var11.i0(-1519061468);
                    if (((op41) obj7) == op41.b) {
                        x340Var11.i0(-1519021231);
                        hz5 hz5Var = (hz5) obj6;
                        int i16 = (i9 & 112) ^ 48;
                        boolean zG4 = x340Var11.g(iu30Var2) | ((i16 > 32 && x340Var11.e(iIntValue9)) || (i9 & 48) == 32);
                        Object objT7 = x340Var11.T();
                        if (zG4 || objT7 == m4cVar3) {
                            objT7 = new ck0(iu30Var2, iIntValue9, (byte) 18);
                            x340Var11.s0(objT7);
                        }
                        Function0 function0 = (Function0) objT7;
                        boolean zG5 = x340Var11.g(iu30Var) | ((i16 > 32 && x340Var11.e(iIntValue9)) || (i9 & 48) == 32);
                        Object objT8 = x340Var11.T();
                        if (zG5 || objT8 == m4cVar3) {
                            objT8 = new ck0(iu30Var, iIntValue9, (byte) 19);
                            x340Var11.s0(objT8);
                        }
                        otw.c(hz5Var, new tuc1(iIntValue9, str4, function0, (Function0) objT8), (qim0) null, (ipb1) null, x340Var11, 0, 12);
                        x340Var = x340Var11;
                        x340Var.r(false);
                    } else {
                        x340Var = x340Var11;
                        x340Var.i0(-1518683796);
                        p40 p40Var = (p40) obj5;
                        boolean zG6 = x340Var.g(iu30Var2) | ((((i9 & 112) ^ 48) > 32 && x340Var.e(iIntValue9)) || (i9 & 48) == 32);
                        Object objT9 = x340Var.T();
                        if (zG6 || objT9 == m4cVar3) {
                            objT9 = new ck0(iu30Var2, iIntValue9, (byte) 20);
                            x340Var.s0(objT9);
                        }
                        otw.c(p40Var, new hvc1(iIntValue9, str4, (Function0) objT9), (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
        }
    }
}
