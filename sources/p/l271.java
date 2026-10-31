package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l271 extends hab0 implements xu30 {
    public final /* synthetic */ yxb0 N0;
    public final /* synthetic */ e821 O0;
    public final /* synthetic */ fqm P0;
    public final /* synthetic */ h9n Q0;
    public final /* synthetic */ boolean R0;
    public final /* synthetic */ boolean S0;
    public final /* synthetic */ boolean T0;
    public final /* synthetic */ sve U0;
    public final /* synthetic */ c101 V0;
    public final /* synthetic */ ngs0 W0;
    public final /* synthetic */ c380 X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ j171 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tom g;
    public final /* synthetic */ String h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l271(j171 j171Var, String str, boolean z, boolean z2, boolean z3, boolean z4, tom tomVar, String str2, iu30 iu30Var, Function0 function0, c380 c380Var, Function0 function1, Function0 function2, yxb0 yxb0Var, e821 e821Var, fqm fqmVar, h9n h9nVar, boolean z5, boolean z6, boolean z7, sve sveVar, c101 c101Var, ngs0 ngs0Var) {
        super(3);
        this.a = j171Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = tomVar;
        this.h = str2;
        this.i = iu30Var;
        this.t = function0;
        this.X = c380Var;
        this.Y = function1;
        this.Z = function2;
        this.N0 = yxb0Var;
        this.O0 = e821Var;
        this.P0 = fqmVar;
        this.Q0 = h9nVar;
        this.R0 = z5;
        this.S0 = z6;
        this.T0 = z7;
        this.U0 = sveVar;
        this.V0 = c101Var;
        this.W0 = ngs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:103:0x0254  */
    /* JADX WARN: Code duplicated, block: B:105:0x025a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0283  */
    /* JADX WARN: Code duplicated, block: B:111:0x028b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0298  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:119:0x0322  */
    /* JADX WARN: Code duplicated, block: B:122:0x033b  */
    /* JADX WARN: Code duplicated, block: B:130:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:133:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x041a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0444  */
    /* JADX WARN: Code duplicated, block: B:139:0x0447  */
    /* JADX WARN: Code duplicated, block: B:142:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x0459  */
    /* JADX WARN: Code duplicated, block: B:146:0x0485  */
    /* JADX WARN: Code duplicated, block: B:147:0x0489  */
    /* JADX WARN: Code duplicated, block: B:150:0x049a  */
    /* JADX WARN: Code duplicated, block: B:152:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:155:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:156:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:159:0x050b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0518  */
    /* JADX WARN: Code duplicated, block: B:162:0x0521  */
    /* JADX WARN: Code duplicated, block: B:164:0x0537  */
    /* JADX WARN: Code duplicated, block: B:167:0x0572  */
    /* JADX WARN: Code duplicated, block: B:168:0x0576  */
    /* JADX WARN: Code duplicated, block: B:171:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0205  */
    /* JADX WARN: Code duplicated, block: B:94:0x0208  */
    /* JADX WARN: Code duplicated, block: B:95:0x020f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0212  */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x0205, please report this as an issue */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j06 j06Var;
        List list;
        boolean z;
        yk01 yk01Var;
        List list2;
        boolean zIsEmpty;
        boolean z2;
        boolean z3;
        boolean zH;
        Object objT;
        float fX0;
        err0 err0Var;
        era eraVar;
        g36 g36Var;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0Var;
        yk01 yk01Var2;
        qim0 qim0VarE;
        boolean z4;
        n4k n4kVar;
        llj lljVar;
        vu30 vu30Var;
        llj lljVar2;
        llj lljVar3;
        lpl lplVar;
        boolean z5;
        w4i1 w4i1Var;
        boolean z6;
        boolean z7;
        pbh pbhVar;
        w4i1 w4i1Var2;
        qim0 qim0Var2;
        tom tomVar;
        g36 g36Var2;
        x340 x340Var;
        vu30 vu30Var2;
        qim0 qim0Var3;
        x340 x340Var2;
        boolean z8;
        gra graVar;
        boolean zG;
        Object objT2;
        era eraVar2;
        x340 x340Var3;
        float f;
        boolean z9;
        era eraVar3;
        boolean z10;
        String str;
        yk01 yk01Var3;
        g2c g2cVar = (g2c) obj;
        x340 x340Var4 = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        gra graVar2 = een.d;
        era eraVar4 = een.R0;
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var4.g(g2cVar) ? 4 : 2;
        }
        x340 x340Var5 = x340Var4;
        boolean zY = x340Var5.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var2 = x340Var5.a;
        if (zY) {
            wat watVar = (wat) x340Var5.k(t4k.h);
            j171 j171Var = this.a;
            List list3 = j171Var.l;
            List list4 = j171Var.m;
            tom tomVar2 = this.g;
            String str2 = tomVar2.a;
            List list5 = tomVar2.h;
            String strD = pcf.d(6, this.h, (String) null);
            boolean z11 = this.f;
            if (this.c && ((z10 = this.e) || z11)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list3.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    j06Var = j06Var2;
                    str = this.b;
                    if (!zHasNext) {
                        break;
                    }
                    List list6 = list5;
                    Object next = it.next();
                    boolean z12 = z11;
                    if (!u890.j(((pj01) next).c.a, str)) {
                        arrayList.add(next);
                    }
                    j06Var2 = j06Var;
                    list5 = list6;
                    z11 = z12;
                }
                list = list5;
                z = z11;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list4) {
                    if (!u890.j(((w4i1) obj4).a, str)) {
                        arrayList2.add(obj4);
                    }
                }
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList) {
                        if (((pj01) obj5).b == sl01.b) {
                            arrayList3.add(obj5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((pj01) it2.next()).c);
                    }
                    if (arrayList4.isEmpty()) {
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj6 : arrayList) {
                            if (((pj01) obj6).b == sl01.a) {
                                arrayList5.add(obj6);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                        Iterator it3 = arrayList5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(((pj01) it3.next()).c);
                        }
                        if (!arrayList6.isEmpty()) {
                            yk01Var3 = new yk01(1, str2, strD, mqo1.F(arrayList6), z10);
                        } else if (this.d) {
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj7 : arrayList) {
                                if (((pj01) obj7).b == sl01.c) {
                                    arrayList7.add(obj7);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                arrayList8.add(((pj01) it4.next()).c);
                            }
                            if (!arrayList8.isEmpty()) {
                                yk01Var3 = new yk01(4, str2, strD, mqo1.F(arrayList8), z10);
                            }
                            list2 = list;
                            zIsEmpty = list2.isEmpty();
                            if (yk01Var != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (zIsEmpty || z2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            zH = x340Var5.h(z3);
                            objT = x340Var5.T();
                            if (zH || objT == m4cVar) {
                                if (zIsEmpty) {
                                    fX0 = 0.0f;
                                } else {
                                    fX0 = watVar.X0(30.0f);
                                }
                                objT = bb00.h((int) (fX0 + (z2 ? watVar.X0(20.0f) : 0.0f)), x340Var5);
                            }
                            err0Var = (hdn0) objT;
                            eraVar = een.P0;
                            g36Var = h36.c;
                            mbhVarA = jbh.a(g36Var, eraVar, x340Var5, 0);
                            iHashCode = Long.hashCode(x340Var5.T);
                            xos0VarM = x340Var5.m();
                            qim0Var = nim0.a;
                            yk01Var2 = yk01Var;
                            qim0VarE = zr7.E(x340Var5, qim0Var);
                            hzj.A.getClass();
                            if (j06Var == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var5.m0();
                            z4 = x340Var5.S;
                            n4kVar = hmb0.t1;
                            if (z4) {
                                x340Var5.l(n4kVar);
                            } else {
                                x340Var5.v0();
                            }
                            lljVar = y580.O0;
                            nko1.H(mbhVarA, x340Var5, lljVar);
                            vu30Var = y580.N0;
                            nko1.H(xos0VarM, x340Var5, vu30Var);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            boolean z13 = z3;
                            lljVar2 = y580.R0;
                            nko1.H(numValueOf, x340Var5, lljVar2);
                            nko1.F(x340Var5);
                            lljVar3 = y580.Y;
                            nko1.H(qim0VarE, x340Var5, lljVar3);
                            lplVar = tomVar2.f;
                            if ((lplVar instanceof lpl) || lplVar.e == null) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            w4i1Var = tomVar2.c;
                            z6 = z5;
                            z7 = this.f;
                            pbhVar = pbh.a;
                            if (z6) {
                                x340Var5.i0(290367614);
                                String strO0 = cwl1.o0(x340Var5, 2131962253);
                                uwr uwrVar = cbx.a;
                                lee1 lee1Var = cbx.d(x340Var5).m;
                                long j = cbx.a(x340Var5).b.b;
                                cvx cvxVar = cbx.b(x340Var5).b;
                                qim0 qim0VarB = uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                                qim0Var2 = qim0Var;
                                if (z7) {
                                    eraVar3 = eraVar4;
                                } else {
                                    eraVar3 = eraVar;
                                }
                                qim0 qim0VarC = pbhVar.c(eraVar3, qim0VarB);
                                tomVar = tomVar2;
                                g36Var2 = g36Var;
                                w4i1Var2 = w4i1Var;
                                vu30Var2 = vu30Var;
                                uwo1.e(strO0, qim0VarC, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2032);
                                x340Var = x340Var5;
                                x340Var.r(false);
                            } else {
                                w4i1Var2 = w4i1Var;
                                qim0Var2 = qim0Var;
                                tomVar = tomVar2;
                                g36Var2 = g36Var;
                                x340Var = x340Var5;
                                vu30Var2 = vu30Var;
                                x340Var.i0(290746558);
                                x340Var.r(false);
                            }
                            if (this.e || !j171Var.g || z7) {
                                qim0Var3 = qim0Var2;
                                x340Var.i0(291217758);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(290829514);
                                uwr uwrVar2 = cbx.a;
                                cvx cvxVar2 = cbx.b(x340Var).b;
                                cvx cvxVar3 = cbx.b(x340Var).b;
                                qim0 qim0Var4 = qim0Var2;
                                qim0 qim0VarB2 = uyn1.B(qim0Var4, 0.0f, 4.0f, 0.0f, 8.0f, 5);
                                gfh0 gfh0VarC = t1c.c(graVar2, false);
                                int iHashCode2 = Long.hashCode(x340Var.T);
                                xos0 xos0VarM2 = x340Var.m();
                                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(n4kVar);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(gfh0VarC, x340Var, lljVar);
                                nko1.H(xos0VarM2, x340Var, vu30Var2);
                                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                                nko1.H(qim0VarE2, x340Var, lljVar3);
                                x340 x340Var6 = x340Var;
                                qim0Var3 = qim0Var4;
                                otw.c(this.U0, new yvm(w4i1Var2, true), (qim0) null, (ipb1) null, x340Var6, 8, 12);
                                x340Var = x340Var6;
                                x340Var.r(true);
                                x340Var.r(false);
                            }
                            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                            String str3 = w4i1Var2.b;
                            String str4 = this.h;
                            iu30 iu30Var = this.i;
                            x340Var2 = x340Var;
                            axo1.d(j171Var, str4, str3, iu30Var, z7, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, qim0VarF, this.R0, this.S0, this.T0, x340Var2, 0);
                            if (err0Var.s() == 0 && z13) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            fq7.b(pbhVar, z8, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(-2054338484, new q5j0(err0Var, (byte) 2), x340Var2), x340Var2, 1572870, 30);
                            x340Var2.r(true);
                            if (z) {
                                graVar = een.Y;
                            } else {
                                graVar = een.t;
                            }
                            qim0 qim0VarA = g2cVar.a(qim0Var3, graVar);
                            zG = x340Var2.g(err0Var);
                            objT2 = x340Var2.T();
                            if (zG || objT2 == m4cVar) {
                                objT2 = new myg0(err0Var, (byte) 23);
                                x340Var2.s0(objT2);
                            }
                            qim0 qim0VarX = ern1.x(qim0VarA, (iu30) objT2);
                            gfh0 gfh0VarC2 = t1c.c(graVar2, false);
                            int iHashCode3 = Long.hashCode(x340Var2.T);
                            xos0 xos0VarM3 = x340Var2.m();
                            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarX);
                            x340Var2.m0();
                            if (x340Var2.S) {
                                x340Var2.l(n4kVar);
                            } else {
                                x340Var2.v0();
                            }
                            nko1.H(gfh0VarC2, x340Var2, lljVar);
                            nko1.H(xos0VarM3, x340Var2, vu30Var2);
                            x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                            nko1.H(qim0VarE3, x340Var2, lljVar3);
                            if (z) {
                                eraVar2 = eraVar4;
                            } else {
                                eraVar2 = eraVar;
                            }
                            mbh mbhVarA2 = jbh.a(g36Var2, eraVar2, x340Var2, 0);
                            int iHashCode4 = Long.hashCode(x340Var2.T);
                            xos0 xos0VarM4 = x340Var2.m();
                            qim0 qim0VarE4 = zr7.E(x340Var2, qim0Var3);
                            x340Var2.m0();
                            if (x340Var2.S) {
                                x340Var2.l(n4kVar);
                            } else {
                                x340Var2.v0();
                            }
                            nko1.H(mbhVarA2, x340Var2, lljVar);
                            nko1.H(xos0VarM4, x340Var2, vu30Var2);
                            x0d.q(iHashCode4, x340Var2, lljVar2, x340Var2);
                            nko1.H(qim0VarE4, x340Var2, lljVar3);
                            fq7.b(pbhVar, !list2.isEmpty(), (qim0) null, (bby) null, xay.l(15, (ni20) null), (String) null, apo.r(886090246, new tf(z, this.V0, tomVar, iu30Var, (byte) 26), x340Var2), x340Var2, 1597446, 22);
                            x340Var3 = x340Var2;
                            if (yk01Var2 == null) {
                                x340Var3.i0(975092602);
                                x340Var3.r(false);
                                z9 = true;
                            } else {
                                x340Var3.i0(975092603);
                                if (zIsEmpty) {
                                    x340Var3.i0(-412444677);
                                    uwr uwrVar3 = cbx.a;
                                    cvx cvxVar4 = cbx.b(x340Var3).b;
                                    x340Var3.r(false);
                                    f = 8.0f;
                                } else {
                                    x340Var3.i0(-412446437);
                                    uwr uwrVar4 = cbx.a;
                                    cvx cvxVar5 = cbx.b(x340Var3).b;
                                    x340Var3.r(false);
                                    f = 2.0f;
                                }
                                qim0 qim0VarB3 = uyn1.B(qim0Var3, 0.0f, f, 0.0f, 0.0f, 13);
                                gfh0 gfh0VarC3 = t1c.c(graVar2, false);
                                int iHashCode5 = Long.hashCode(x340Var3.T);
                                xos0 xos0VarM5 = x340Var3.m();
                                qim0 qim0VarE5 = zr7.E(x340Var3, qim0VarB3);
                                x340Var3.m0();
                                if (x340Var3.S) {
                                    x340Var3.l(n4kVar);
                                } else {
                                    x340Var3.v0();
                                }
                                nko1.H(gfh0VarC3, x340Var3, lljVar);
                                nko1.H(xos0VarM5, x340Var3, vu30Var2);
                                x0d.q(iHashCode5, x340Var3, lljVar2, x340Var3);
                                nko1.H(qim0VarE5, x340Var3, lljVar3);
                                otw.c(this.W0, yk01Var2, (qim0) null, (ipb1) null, x340Var3, 0, 12);
                                x340Var3 = x340Var3;
                                z9 = true;
                                x340Var3.r(true);
                                x340Var3.r(false);
                            }
                            x340Var3.r(z9);
                            x340Var3.r(z9);
                        }
                    } else {
                        yk01Var3 = new yk01(2, str2, strD, mqo1.F(arrayList4), z10);
                    }
                } else {
                    yk01Var3 = new yk01(3, str2, strD, mqo1.F(arrayList2), z10);
                }
                yk01Var = yk01Var3;
                list2 = list;
                zIsEmpty = list2.isEmpty();
                if (yk01Var != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (zIsEmpty) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                zH = x340Var5.h(z3);
                objT = x340Var5.T();
                if (zH) {
                    if (zIsEmpty) {
                        fX0 = watVar.X0(30.0f);
                    } else {
                        fX0 = 0.0f;
                    }
                    objT = bb00.h((int) (fX0 + (z2 ? watVar.X0(20.0f) : 0.0f)), x340Var5);
                } else {
                    if (zIsEmpty) {
                        fX0 = watVar.X0(30.0f);
                    } else {
                        fX0 = 0.0f;
                    }
                    objT = bb00.h((int) (fX0 + (z2 ? watVar.X0(20.0f) : 0.0f)), x340Var5);
                }
                err0Var = (hdn0) objT;
                eraVar = een.P0;
                g36Var = h36.c;
                mbhVarA = jbh.a(g36Var, eraVar, x340Var5, 0);
                iHashCode = Long.hashCode(x340Var5.T);
                xos0VarM = x340Var5.m();
                qim0Var = nim0.a;
                yk01Var2 = yk01Var;
                qim0VarE = zr7.E(x340Var5, qim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                z4 = x340Var5.S;
                n4kVar = hmb0.t1;
                if (z4) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var5, lljVar);
                vu30Var = y580.N0;
                nko1.H(xos0VarM, x340Var5, vu30Var);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                boolean z14 = z3;
                lljVar2 = y580.R0;
                nko1.H(numValueOf2, x340Var5, lljVar2);
                nko1.F(x340Var5);
                lljVar3 = y580.Y;
                nko1.H(qim0VarE, x340Var5, lljVar3);
                lplVar = tomVar2.f;
                if (lplVar instanceof lpl) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                w4i1Var = tomVar2.c;
                z6 = z5;
                z7 = this.f;
                pbhVar = pbh.a;
                if (z6) {
                    x340Var5.i0(290367614);
                    String strO1 = cwl1.o0(x340Var5, 2131962253);
                    uwr uwrVar5 = cbx.a;
                    lee1 lee1Var2 = cbx.d(x340Var5).m;
                    long j2 = cbx.a(x340Var5).b.b;
                    cvx cvxVar6 = cbx.b(x340Var5).b;
                    qim0 qim0VarB4 = uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    qim0Var2 = qim0Var;
                    if (z7) {
                        eraVar3 = eraVar4;
                    } else {
                        eraVar3 = eraVar;
                    }
                    qim0 qim0VarC2 = pbhVar.c(eraVar3, qim0VarB4);
                    tomVar = tomVar2;
                    g36Var2 = g36Var;
                    w4i1Var2 = w4i1Var;
                    vu30Var2 = vu30Var;
                    uwo1.e(strO1, qim0VarC2, lee1Var2, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2032);
                    x340Var = x340Var5;
                    x340Var.r(false);
                } else {
                    w4i1Var2 = w4i1Var;
                    qim0Var2 = qim0Var;
                    tomVar = tomVar2;
                    g36Var2 = g36Var;
                    x340Var = x340Var5;
                    vu30Var2 = vu30Var;
                    x340Var.i0(290746558);
                    x340Var.r(false);
                }
                if (this.e) {
                    qim0Var3 = qim0Var2;
                    x340Var.i0(291217758);
                    x340Var.r(false);
                } else {
                    qim0Var3 = qim0Var2;
                    x340Var.i0(291217758);
                    x340Var.r(false);
                }
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                String str5 = w4i1Var2.b;
                String str6 = this.h;
                iu30 iu30Var2 = this.i;
                x340Var2 = x340Var;
                axo1.d(j171Var, str6, str5, iu30Var2, z7, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, qim0VarF2, this.R0, this.S0, this.T0, x340Var2, 0);
                if (err0Var.s() == 0) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                fq7.b(pbhVar, z8, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(-2054338484, new q5j0(err0Var, (byte) 2), x340Var2), x340Var2, 1572870, 30);
                x340Var2.r(true);
                if (z) {
                    graVar = een.Y;
                } else {
                    graVar = een.t;
                }
                qim0 qim0VarA2 = g2cVar.a(qim0Var3, graVar);
                zG = x340Var2.g(err0Var);
                objT2 = x340Var2.T();
                if (zG) {
                    objT2 = new myg0(err0Var, (byte) 23);
                    x340Var2.s0(objT2);
                } else {
                    objT2 = new myg0(err0Var, (byte) 23);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarX2 = ern1.x(qim0VarA2, (iu30) objT2);
                gfh0 gfh0VarC4 = t1c.c(graVar2, false);
                int iHashCode6 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM6 = x340Var2.m();
                qim0 qim0VarE6 = zr7.E(x340Var2, qim0VarX2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC4, x340Var2, lljVar);
                nko1.H(xos0VarM6, x340Var2, vu30Var2);
                x0d.q(iHashCode6, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE6, x340Var2, lljVar3);
                if (z) {
                    eraVar2 = eraVar4;
                } else {
                    eraVar2 = eraVar;
                }
                mbh mbhVarA3 = jbh.a(g36Var2, eraVar2, x340Var2, 0);
                int iHashCode7 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM7 = x340Var2.m();
                qim0 qim0VarE7 = zr7.E(x340Var2, qim0Var3);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA3, x340Var2, lljVar);
                nko1.H(xos0VarM7, x340Var2, vu30Var2);
                x0d.q(iHashCode7, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE7, x340Var2, lljVar3);
                fq7.b(pbhVar, !list2.isEmpty(), (qim0) null, (bby) null, xay.l(15, (ni20) null), (String) null, apo.r(886090246, new tf(z, this.V0, tomVar, iu30Var2, (byte) 26), x340Var2), x340Var2, 1597446, 22);
                x340Var3 = x340Var2;
                if (yk01Var2 == null) {
                    x340Var3.i0(975092602);
                    x340Var3.r(false);
                    z9 = true;
                } else {
                    x340Var3.i0(975092603);
                    if (zIsEmpty) {
                        x340Var3.i0(-412446437);
                        uwr uwrVar6 = cbx.a;
                        cvx cvxVar7 = cbx.b(x340Var3).b;
                        x340Var3.r(false);
                        f = 2.0f;
                    } else {
                        x340Var3.i0(-412444677);
                        uwr uwrVar7 = cbx.a;
                        cvx cvxVar8 = cbx.b(x340Var3).b;
                        x340Var3.r(false);
                        f = 8.0f;
                    }
                    qim0 qim0VarB5 = uyn1.B(qim0Var3, 0.0f, f, 0.0f, 0.0f, 13);
                    gfh0 gfh0VarC5 = t1c.c(graVar2, false);
                    int iHashCode8 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM8 = x340Var3.m();
                    qim0 qim0VarE8 = zr7.E(x340Var3, qim0VarB5);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var3, lljVar);
                    nko1.H(xos0VarM8, x340Var3, vu30Var2);
                    x0d.q(iHashCode8, x340Var3, lljVar2, x340Var3);
                    nko1.H(qim0VarE8, x340Var3, lljVar3);
                    otw.c(this.W0, yk01Var2, (qim0) null, (ipb1) null, x340Var3, 0, 12);
                    x340Var3 = x340Var3;
                    z9 = true;
                    x340Var3.r(true);
                    x340Var3.r(false);
                }
                x340Var3.r(z9);
                x340Var3.r(z9);
            } else {
                j06Var = j06Var2;
                list = list5;
                z = z11;
            }
            yk01Var = null;
            list2 = list;
            zIsEmpty = list2.isEmpty();
            if (yk01Var != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (zIsEmpty) {
                z3 = true;
            } else {
                z3 = true;
            }
            zH = x340Var5.h(z3);
            objT = x340Var5.T();
            if (zH) {
                if (zIsEmpty) {
                    fX0 = watVar.X0(30.0f);
                } else {
                    fX0 = 0.0f;
                }
                objT = bb00.h((int) (fX0 + (z2 ? watVar.X0(20.0f) : 0.0f)), x340Var5);
            } else {
                if (zIsEmpty) {
                    fX0 = watVar.X0(30.0f);
                } else {
                    fX0 = 0.0f;
                }
                objT = bb00.h((int) (fX0 + (z2 ? watVar.X0(20.0f) : 0.0f)), x340Var5);
            }
            err0Var = (hdn0) objT;
            eraVar = een.P0;
            g36Var = h36.c;
            mbhVarA = jbh.a(g36Var, eraVar, x340Var5, 0);
            iHashCode = Long.hashCode(x340Var5.T);
            xos0VarM = x340Var5.m();
            qim0Var = nim0.a;
            yk01Var2 = yk01Var;
            qim0VarE = zr7.E(x340Var5, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var5.m0();
            z4 = x340Var5.S;
            n4kVar = hmb0.t1;
            if (z4) {
                x340Var5.l(n4kVar);
            } else {
                x340Var5.v0();
            }
            lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var5, lljVar);
            vu30Var = y580.N0;
            nko1.H(xos0VarM, x340Var5, vu30Var);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            boolean z15 = z3;
            lljVar2 = y580.R0;
            nko1.H(numValueOf3, x340Var5, lljVar2);
            nko1.F(x340Var5);
            lljVar3 = y580.Y;
            nko1.H(qim0VarE, x340Var5, lljVar3);
            lplVar = tomVar2.f;
            if (lplVar instanceof lpl) {
                z5 = false;
            } else {
                z5 = false;
            }
            w4i1Var = tomVar2.c;
            z6 = z5;
            z7 = this.f;
            pbhVar = pbh.a;
            if (z6) {
                x340Var5.i0(290367614);
                String strO2 = cwl1.o0(x340Var5, 2131962253);
                uwr uwrVar8 = cbx.a;
                lee1 lee1Var3 = cbx.d(x340Var5).m;
                long j3 = cbx.a(x340Var5).b.b;
                cvx cvxVar9 = cbx.b(x340Var5).b;
                qim0 qim0VarB6 = uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                qim0Var2 = qim0Var;
                if (z7) {
                    eraVar3 = eraVar4;
                } else {
                    eraVar3 = eraVar;
                }
                qim0 qim0VarC3 = pbhVar.c(eraVar3, qim0VarB6);
                tomVar = tomVar2;
                g36Var2 = g36Var;
                w4i1Var2 = w4i1Var;
                vu30Var2 = vu30Var;
                uwo1.e(strO2, qim0VarC3, lee1Var3, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2032);
                x340Var = x340Var5;
                x340Var.r(false);
            } else {
                w4i1Var2 = w4i1Var;
                qim0Var2 = qim0Var;
                tomVar = tomVar2;
                g36Var2 = g36Var;
                x340Var = x340Var5;
                vu30Var2 = vu30Var;
                x340Var.i0(290746558);
                x340Var.r(false);
            }
            if (this.e) {
                qim0Var3 = qim0Var2;
                x340Var.i0(291217758);
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var2;
                x340Var.i0(291217758);
                x340Var.r(false);
            }
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            String str7 = w4i1Var2.b;
            String str8 = this.h;
            iu30 iu30Var3 = this.i;
            x340Var2 = x340Var;
            axo1.d(j171Var, str8, str7, iu30Var3, z7, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, qim0VarF3, this.R0, this.S0, this.T0, x340Var2, 0);
            if (err0Var.s() == 0) {
                z8 = false;
            } else {
                z8 = false;
            }
            fq7.b(pbhVar, z8, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(-2054338484, new q5j0(err0Var, (byte) 2), x340Var2), x340Var2, 1572870, 30);
            x340Var2.r(true);
            if (z) {
                graVar = een.Y;
            } else {
                graVar = een.t;
            }
            qim0 qim0VarA3 = g2cVar.a(qim0Var3, graVar);
            zG = x340Var2.g(err0Var);
            objT2 = x340Var2.T();
            if (zG) {
                objT2 = new myg0(err0Var, (byte) 23);
                x340Var2.s0(objT2);
            } else {
                objT2 = new myg0(err0Var, (byte) 23);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarX3 = ern1.x(qim0VarA3, (iu30) objT2);
            gfh0 gfh0VarC6 = t1c.c(graVar2, false);
            int iHashCode9 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM9 = x340Var2.m();
            qim0 qim0VarE9 = zr7.E(x340Var2, qim0VarX3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC6, x340Var2, lljVar);
            nko1.H(xos0VarM9, x340Var2, vu30Var2);
            x0d.q(iHashCode9, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE9, x340Var2, lljVar3);
            if (z) {
                eraVar2 = eraVar4;
            } else {
                eraVar2 = eraVar;
            }
            mbh mbhVarA4 = jbh.a(g36Var2, eraVar2, x340Var2, 0);
            int iHashCode10 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM10 = x340Var2.m();
            qim0 qim0VarE10 = zr7.E(x340Var2, qim0Var3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA4, x340Var2, lljVar);
            nko1.H(xos0VarM10, x340Var2, vu30Var2);
            x0d.q(iHashCode10, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE10, x340Var2, lljVar3);
            fq7.b(pbhVar, !list2.isEmpty(), (qim0) null, (bby) null, xay.l(15, (ni20) null), (String) null, apo.r(886090246, new tf(z, this.V0, tomVar, iu30Var3, (byte) 26), x340Var2), x340Var2, 1597446, 22);
            x340Var3 = x340Var2;
            if (yk01Var2 == null) {
                x340Var3.i0(975092602);
                x340Var3.r(false);
                z9 = true;
            } else {
                x340Var3.i0(975092603);
                if (zIsEmpty) {
                    x340Var3.i0(-412446437);
                    uwr uwrVar9 = cbx.a;
                    cvx cvxVar10 = cbx.b(x340Var3).b;
                    x340Var3.r(false);
                    f = 2.0f;
                } else {
                    x340Var3.i0(-412444677);
                    uwr uwrVar10 = cbx.a;
                    cvx cvxVar11 = cbx.b(x340Var3).b;
                    x340Var3.r(false);
                    f = 8.0f;
                }
                qim0 qim0VarB7 = uyn1.B(qim0Var3, 0.0f, f, 0.0f, 0.0f, 13);
                gfh0 gfh0VarC7 = t1c.c(graVar2, false);
                int iHashCode11 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM11 = x340Var3.m();
                qim0 qim0VarE11 = zr7.E(x340Var3, qim0VarB7);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC7, x340Var3, lljVar);
                nko1.H(xos0VarM11, x340Var3, vu30Var2);
                x0d.q(iHashCode11, x340Var3, lljVar2, x340Var3);
                nko1.H(qim0VarE11, x340Var3, lljVar3);
                otw.c(this.W0, yk01Var2, (qim0) null, (ipb1) null, x340Var3, 0, 12);
                x340Var3 = x340Var3;
                z9 = true;
                x340Var3.r(true);
                x340Var3.r(false);
            }
            x340Var3.r(z9);
            x340Var3.r(z9);
        } else {
            x340Var5.b0();
        }
        return rih1.a;
    }
}
