package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ok7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok7(int i, String str, LocalDate localDate, boolean z) {
        super(3);
        this.a = (byte) 1;
        this.b = i;
        this.d = str;
        this.e = localDate;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x013b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0147  */
    /* JADX WARN: Code duplicated, block: B:43:0x014a  */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0199  */
    /* JADX WARN: Code duplicated, block: B:51:0x019d  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x0201  */
    /* JADX WARN: Code duplicated, block: B:61:0x020a  */
    /* JADX WARN: Code duplicated, block: B:63:0x020e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0296  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        Iterator it;
        char c;
        float f;
        int iC;
        int i;
        boolean z;
        byte b = this.a;
        boolean z2 = this.c;
        int i2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                zqo1.c((c380) obj5, this.b, this.c, (iu30) obj4, null, (b0k) obj2, 0);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                h1p1.c(this.b, (String) obj5, (LocalDate) obj4, this.c, null, (b0k) obj2, 0);
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                z6d1 z6d1Var = (z6d1) obj5;
                zho1.q(z6d1Var, uyn1.B(nim0.a, 0.0f, 0.0f, 16.0f, 0.0f, 11), b0kVar, 0, 0);
                zho1.y(z2, apo.r(1177071444, new zo7(z6d1Var, (iu30) obj4, i2, (byte) 7), b0kVar), b0kVar, 48);
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ((b0i0) obj5).d((a401) obj4, x340Var2, 0);
                    if (i2 > 1) {
                        x340Var2.i0(-696745409);
                        Object objT = x340Var2.T();
                        if (objT == fkj0.X) {
                            objT = bb00.h(i2, x340Var2);
                        }
                        ((b0i0) obj5).c(((hdn0) objT).s(), this.b, this.c, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-696490744);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    fli0 fli0Var = (fli0) obj4;
                    otw.c((x521) obj5, new v521(this.b, fli0Var.a, fli0Var.b, this.c, fli0Var.c), (qim0) null, (ipb1) null, x340Var4, 6, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                vu30 vu30Var = y580.Y;
                vu30 vu30Var2 = y580.R0;
                vu30 vu30Var3 = y580.N0;
                llj lljVar = y580.O0;
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                boolean z3 = p3v.b(((i2c) obj).d(), 320.0f) >= 0;
                ArrayList arrayList2 = (ArrayList) obj4;
                mbh mbhVarA = jbh.a(new d36(6.0f, true, new um5(false)), een.P0, b0kVar2, 0);
                x340 x340Var5 = (x340) b0kVar2;
                yxb0 yxb0Var = (yxb0) obj5;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
                hzj.A.getClass();
                x340 x340Var6 = (x340) b0kVar2;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                boolean z4 = x340Var6.S;
                n4k n4kVar = hmb0.t1;
                if (z4) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, b0kVar2, lljVar);
                nko1.H(xos0VarM, b0kVar2, vu30Var3);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, vu30Var2);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, vu30Var);
                x340Var6.i0(-1363174324);
                ArrayList arrayList3 = new ArrayList();
                List listK0 = arrayList2;
                while (!listK0.isEmpty()) {
                    ij51 ij51Var = (ij51) o7h.q0(listK0);
                    List list = listK0;
                    List listD1 = o7h.d1(list, (!ij51Var.d || z3) ? 2 : 1);
                    ArrayList arrayList4 = arrayList2;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = listD1.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = i2;
                            z = z3;
                        }
                        z = z3;
                        Object next = it2.next();
                        Iterator it3 = it2;
                        i = i2;
                        if (((ij51) next).d != ij51Var.d) {
                        }
                        arrayList5.add(next);
                        it2 = it3;
                        z3 = z;
                        i2 = i;
                        break;
                        break;
                    }
                    arrayList3.add(arrayList5);
                    listK0 = o7h.k0(list, arrayList5.size());
                    arrayList2 = arrayList4;
                    z3 = z;
                    i2 = i;
                }
                int i3 = i2;
                ArrayList arrayList6 = arrayList2;
                int iC2 = l1d.C(i3);
                List listT0 = arrayList3;
                if (iC2 == 0) {
                    List<List> list2 = listT0;
                    arrayList = new ArrayList(q7h.U(list2, 10));
                    for (List listT1 : list2) {
                        iC = l1d.C(i3);
                        if (iC == 0) {
                            if (iC == 1) {
                                listT1 = o7h.T0(listT1);
                            }
                        }
                        arrayList.add(listT1);
                    }
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        List<ij51> list3 = (List) it.next();
                        qim0 qim0VarD = sgc1.D(1, qim0Var);
                        c = 0;
                        jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), een.Z, b0kVar2, 0);
                        qim0 qim0Var2 = qim0Var;
                        int iHashCode2 = Long.hashCode(x340Var6.T);
                        xos0 xos0VarM2 = x340Var6.m();
                        qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarD);
                        hzj.A.getClass();
                        x340Var6.m0();
                        if (x340Var6.S) {
                            x340Var6.l(n4kVar);
                        } else {
                            x340Var6.v0();
                        }
                        nko1.H(jw31VarA, b0kVar2, lljVar);
                        nko1.H(xos0VarM2, b0kVar2, vu30Var3);
                        nko1.H(Integer.valueOf(iHashCode2), b0kVar2, vu30Var2);
                        nko1.F(b0kVar2);
                        nko1.H(qim0VarE2, b0kVar2, vu30Var);
                        x340Var6.i0(-2044918032);
                        for (ij51 ij51Var2 : list3) {
                            yxb0 yxb0Var2 = yxb0Var;
                            ldo ldoVar = (ldo) yxb0Var2.c;
                            vu30 vu30Var4 = vu30Var;
                            vu30 vu30Var5 = vu30Var2;
                            vu30 vu30Var6 = vu30Var3;
                            Iterator it4 = it;
                            xmn xmnVar = new xmn(ij51Var2.b, ij51Var2.a, ij51Var2.c, new qnn(ij51Var2.d, (imn) yxb0Var2.d, z2));
                            if (1.0f <= 0.0d) {
                                of80.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            } else {
                                f = 1.0f;
                            }
                            b0k b0kVar3 = b0kVar2;
                            otw.c(ldoVar, xmnVar, new wnb0(f, true), (ipb1) null, b0kVar3, 0, 8);
                            c = 0;
                            yxb0Var = yxb0Var2;
                            b0kVar2 = b0kVar3;
                            vu30Var = vu30Var4;
                            vu30Var2 = vu30Var5;
                            vu30Var3 = vu30Var6;
                            it = it4;
                        }
                        yxb0 yxb0Var3 = yxb0Var;
                        vu30 vu30Var7 = vu30Var;
                        vu30 vu30Var8 = vu30Var2;
                        vu30 vu30Var9 = vu30Var3;
                        Iterator it5 = it;
                        b0k b0kVar4 = b0kVar2;
                        x340Var6.r(false);
                        if (arrayList6.size() > 1 || list3.size() >= 2 || ((ij51) o7h.q0(list3)).d) {
                            x340Var6.i0(1033132102);
                            x340Var6.r(false);
                        } else {
                            x340Var6.i0(1033033119);
                            int size = 2 - list3.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                if (1.0f <= 0.0d) {
                                    of80.a("invalid weight; must be greater than zero");
                                }
                                op71.g(b0kVar4, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                            }
                            x340Var6.r(false);
                        }
                        x340Var6.r(true);
                        qim0Var = qim0Var2;
                        b0kVar2 = b0kVar4;
                        yxb0Var = yxb0Var3;
                        vu30Var = vu30Var7;
                        vu30Var2 = vu30Var8;
                        vu30Var3 = vu30Var9;
                        it = it5;
                    }
                    x340Var6.r(false);
                    x340Var6.r(true);
                    return rih1Var;
                }
                if (iC2 == 1) {
                    listT0 = o7h.T0(arrayList3);
                    List<List> list4 = listT0;
                    arrayList = new ArrayList(q7h.U(list4, 10));
                    while (r7.hasNext()) {
                        iC = l1d.C(i3);
                        if (iC == 0) {
                            if (iC == 1) {
                                listT1 = o7h.T0(listT1);
                            }
                        }
                        arrayList.add(listT1);
                    }
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        List<ij51> list5 = (List) it.next();
                        qim0 qim0VarD2 = sgc1.D(1, qim0Var);
                        c = 0;
                        jw31 jw31VarA2 = ew31.a(new d36(6.0f, true, new um5(false)), een.Z, b0kVar2, 0);
                        qim0 qim0Var3 = qim0Var;
                        int iHashCode3 = Long.hashCode(x340Var6.T);
                        xos0 xos0VarM3 = x340Var6.m();
                        qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarD2);
                        hzj.A.getClass();
                        x340Var6.m0();
                        if (x340Var6.S) {
                            x340Var6.l(n4kVar);
                        } else {
                            x340Var6.v0();
                        }
                        nko1.H(jw31VarA2, b0kVar2, lljVar);
                        nko1.H(xos0VarM3, b0kVar2, vu30Var3);
                        nko1.H(Integer.valueOf(iHashCode3), b0kVar2, vu30Var2);
                        nko1.F(b0kVar2);
                        nko1.H(qim0VarE3, b0kVar2, vu30Var);
                        x340Var6.i0(-2044918032);
                        while (r8.hasNext()) {
                            yxb0 yxb0Var4 = yxb0Var;
                            ldo ldoVar2 = (ldo) yxb0Var4.c;
                            vu30 vu30Var10 = vu30Var;
                            vu30 vu30Var11 = vu30Var2;
                            vu30 vu30Var12 = vu30Var3;
                            Iterator it6 = it;
                            xmn xmnVar2 = new xmn(ij51Var2.b, ij51Var2.a, ij51Var2.c, new qnn(ij51Var2.d, (imn) yxb0Var4.d, z2));
                            if (1.0f <= 0.0d) {
                                of80.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            } else {
                                f = 1.0f;
                            }
                            b0k b0kVar5 = b0kVar2;
                            otw.c(ldoVar2, xmnVar2, new wnb0(f, true), (ipb1) null, b0kVar5, 0, 8);
                            c = 0;
                            yxb0Var = yxb0Var4;
                            b0kVar2 = b0kVar5;
                            vu30Var = vu30Var10;
                            vu30Var2 = vu30Var11;
                            vu30Var3 = vu30Var12;
                            it = it6;
                        }
                        yxb0 yxb0Var5 = yxb0Var;
                        vu30 vu30Var13 = vu30Var;
                        vu30 vu30Var14 = vu30Var2;
                        vu30 vu30Var15 = vu30Var3;
                        Iterator it7 = it;
                        b0k b0kVar6 = b0kVar2;
                        x340Var6.r(false);
                        if (arrayList6.size() > 1) {
                            x340Var6.i0(1033132102);
                            x340Var6.r(false);
                        } else {
                            x340Var6.i0(1033132102);
                            x340Var6.r(false);
                        }
                        x340Var6.r(true);
                        qim0Var = qim0Var3;
                        b0kVar2 = b0kVar6;
                        yxb0Var = yxb0Var5;
                        vu30Var = vu30Var13;
                        vu30Var2 = vu30Var14;
                        vu30Var3 = vu30Var15;
                        it = it7;
                    }
                    x340Var6.r(false);
                    x340Var6.r(true);
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok7(int i, iu30 iu30Var, c380 c380Var, boolean z) {
        super(3);
        this.a = (byte) 0;
        this.d = c380Var;
        this.b = i;
        this.c = z;
        this.e = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok7(Object obj, int i, Object obj2, byte b, boolean z) {
        super(3);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok7(z6d1 z6d1Var, boolean z, iu30 iu30Var, int i) {
        super(3);
        this.a = (byte) 2;
        this.d = z6d1Var;
        this.c = z;
        this.e = iu30Var;
        this.b = i;
    }
}
