package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pj0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj0(Object obj, Object obj2, Object obj3, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:241:0x0798  */
    /* JADX WARN: Code duplicated, block: B:242:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:247:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:249:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:252:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:254:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:255:0x081b  */
    /* JADX WARN: Code duplicated, block: B:257:0x081f  */
    /* JADX WARN: Code duplicated, block: B:259:0x083d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0842  */
    /* JADX WARN: Code duplicated, block: B:263:0x0845  */
    /* JADX WARN: Code duplicated, block: B:268:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:270:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:271:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:273:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:274:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:276:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:279:0x0908  */
    /* JADX WARN: Code duplicated, block: B:281:0x094c  */
    /* JADX WARN: Code duplicated, block: B:400:0x0968 A[SYNTHETIC] */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        m4c m4cVar;
        ahp ahpVar;
        rmc0 rmc0VarListIterator;
        rmc0 rmc0Var;
        Object next;
        iu30 iu30Var;
        m4c m4cVar2;
        ahp ahpVar2;
        maa maaVar;
        boolean zG;
        Object objT;
        boolean zG2;
        Object objT2;
        String string;
        pl20 pl20Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                ksw kswVar = (ksw) obj;
                jk0 jk0Var = (jk0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                qj0 qj0Var = (qj0) obj6;
                int i = iIntValue & 14;
                s1p1.l(kswVar, iu30Var2, x340Var, ((iIntValue >> 3) & 112) | i);
                i01 i01Var = (i01) obj8;
                x340 x340Var2 = x340Var;
                boolean zI = x340Var2.i(i01Var);
                Object objT3 = x340Var2.T();
                if (zI || objT3 == fkj0.X) {
                    objT3 = new j2(i01Var, (byte) 7);
                    x340Var2.s0(objT3);
                }
                n9p1.e(kswVar, (iu30) objT3, x340Var2, i);
                mod.c(new ely0[]{jge0.a.a((wj0) obj7), oi7.a.a((gw70) qj0Var.d)}, apo.r(2101715273, new q1(jk0Var, iu30Var2, qj0Var, (byte) 8), x340Var2), x340Var2, 56);
                return rih1Var;
            case 1:
                dob1 dob1Var = (dob1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                x6o0 x6o0Var = (x6o0) obj6;
                yk90 yk90Var = (yk90) obj7;
                kp7 kp7Var = (kp7) obj8;
                fp7 fp7Var = kp7Var.f;
                k8e0 k8e0Var = dob1Var.a;
                int i2 = (iIntValue2 & 48) == 0 ? iIntValue2 | ((iIntValue2 & 64) == 0 ? x340Var3.g(dob1Var) : x340Var3.i(dob1Var) ? 32 : 16) : iIntValue2;
                if ((iIntValue2 & 384) == 0) {
                    i2 |= x340Var3.i(iu30Var3) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    x340Var4.b0();
                } else if (k8e0Var instanceof jae0) {
                    x340Var4.i0(-911381530);
                    fp7Var.d(x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    if (!(k8e0Var instanceof k8e0)) {
                        throw p3d1.k(x340Var4, -911382023, false);
                    }
                    x340Var4.i0(1812037729);
                    k8e0 k8e0Var2 = k8e0Var;
                    hwq hwqVar = k8e0Var2.b;
                    xu30 xu30VarG = wro1.G(yk90Var.f, hwqVar, x340Var4);
                    xu30 xu30VarG2 = wro1.G(yk90Var.a, hwqVar, x340Var4);
                    xu30 xu30VarG3 = wro1.G(yk90Var.d, hwqVar, x340Var4);
                    u7p0 u7p0Var = kp7Var.t;
                    Object objT4 = x340Var4.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT4 == m4cVar3) {
                        objT4 = ge7.T0;
                        x340Var4.s0(objT4);
                    }
                    int i3 = (i2 >> 3) & 14;
                    xu30 xu30VarJ = wro1.J(dob1Var, u7p0Var, (iu30) objT4, x340Var4);
                    nm1 nm1Var = kp7Var.d;
                    Object objT5 = x340Var4.T();
                    if (objT5 == m4cVar3) {
                        objT5 = ge7.U0;
                        x340Var4.s0(objT5);
                    }
                    xu30 xu30VarJ2 = wro1.J(dob1Var, nm1Var, (iu30) objT5, x340Var4);
                    xvu xvuVar = kp7Var.e;
                    boolean zI2 = x340Var4.i(kp7Var);
                    Object objT6 = x340Var4.T();
                    if (zI2 || objT6 == m4cVar3) {
                        objT6 = new hp7(kp7Var, (byte) 2);
                        x340Var4.s0(objT6);
                    }
                    xu30 xu30VarJ3 = wro1.J(dob1Var, xvuVar, (iu30) objT6, x340Var4);
                    rit0 rit0Var = kp7Var.a;
                    boolean zI3 = x340Var4.i(kp7Var);
                    Object objT7 = x340Var4.T();
                    if (zI3 || objT7 == m4cVar3) {
                        objT7 = new hp7(kp7Var, (byte) 3);
                        x340Var4.s0(objT7);
                    }
                    xu30 xu30VarJ4 = wro1.J(dob1Var, rit0Var, (iu30) objT7, x340Var4);
                    nm1 nm1Var2 = kp7Var.c;
                    boolean zI4 = x340Var4.i(kp7Var);
                    Object objT8 = x340Var4.T();
                    if (zI4 || objT8 == m4cVar3) {
                        objT8 = new hp7(kp7Var, (byte) 4);
                        x340Var4.s0(objT8);
                    }
                    xu30 xu30VarJ5 = wro1.J(dob1Var, nm1Var2, (iu30) objT8, x340Var4);
                    qlb qlbVar = kp7Var.g;
                    boolean zI5 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var4.i(dob1Var))) | x340Var4.i(x6o0Var);
                    Object objT9 = x340Var4.T();
                    if (zI5 || objT9 == m4cVar3) {
                        objT9 = new jp7(x6o0Var, dob1Var, (byte) 1);
                        x340Var4.s0(objT9);
                    }
                    xu30 xu30VarJ6 = wro1.J(dob1Var, qlbVar, (iu30) objT9, x340Var4);
                    ngs0 ngs0Var = kp7Var.h;
                    Object objT10 = x340Var4.T();
                    if (objT10 == m4cVar3) {
                        objT10 = ge7.V0;
                        x340Var4.s0(objT10);
                    }
                    fp7Var.c(dob1Var, k8e0Var2, iu30Var3, xu30VarG, xu30VarG2, xu30VarG3, xu30VarJ4, xu30VarJ5, xu30VarJ, xu30VarJ2, xu30VarJ3, xu30VarJ6, wro1.J(dob1Var, ngs0Var, (iu30) objT10, x340Var4), x340Var4, i3 | (i2 & 896));
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                f7g0 f7g0Var = (f7g0) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? (x340Var5.g(aqb0Var) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= x340Var5.e(iIntValue3) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i4 |= x340Var5.g(f7g0Var) ? 256 : 128;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i4 & 1, (i4 & 1171) != 1170)) {
                    y7y0.l(f7g0Var, (vyr0) obj8, ((g7g0) obj7).d, iIntValue3 < ((ArrayList) obj6).size() + (-1), aqb0.b(aqb0Var, nim0Var, (pxg1) null, (ni20) null, 7), x340Var6, (i4 >> 6) & 14);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                qim0 qim0Var = null;
                dhm0 dhm0Var = (dhm0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                ((Number) obj5).intValue();
                x340 x340Var7 = (b0k) obj4;
                Context context = (Context) x340Var7.k(AndroidCompositionLocals_androidKt.b);
                az00 az00Var = (az00) obj8;
                iy00 iy00Var = (iy00) ((vu30) az00Var.t.d).invoke(x340Var7, 0);
                zgp zgpVar = (zgp) obj7;
                Object objT11 = x340Var7.T();
                m4c m4cVar4 = fkj0.X;
                if (objT11 == m4cVar4) {
                    kp00 kp00Var = new kp00(az00Var, iu30Var4, (byte) 2);
                    c21 c21Var = (c21) zgpVar.a.c;
                    lik1 lik1VarG = ((qop) c21Var.b).g();
                    n6r0 n6r0Var = ((qop) c21Var.b).c;
                    c8o.l(n6r0Var);
                    de11 de11Var = new de11(lik1VarG, n6r0Var, kp00Var);
                    x340Var7.s0(de11Var);
                    objT11 = de11Var;
                }
                qim0 qim0VarB = uyn1.B(anm1.N("playlist_extender_list", u291.f(nim0Var, 1.0f)), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                ahp ahpVar3 = (ahp) obj6;
                maa maaVar2 = (de11) objT11;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var7, 0);
                int iHashCode = Long.hashCode(x340Var7.T);
                xos0 xos0VarM = x340Var7.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0VarB);
                hzj.A.getClass();
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(mbhVarA, x340Var7, y580.O0);
                nko1.H(xos0VarM, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE, x340Var7, y580.Y);
                x340Var7.i0(-1003076334);
                boolean z = az00Var.g;
                bhp bhpVar = az00Var.f;
                boolean z2 = az00Var.h;
                String str = dhm0Var.b;
                boolean z3 = dhm0Var.X;
                boolean z4 = dhm0Var.h;
                boolean z5 = dhm0Var.c;
                List list = dhm0Var.R0;
                xbe0 xbe0Var = dhm0Var.O0;
                smc0 smc0VarN = k4p1.n();
                String str2 = iy00Var.a;
                boolean z6 = iy00Var.b;
                bhp bhpVar2 = bhpVar;
                String string2 = str2 == null ? context.getString(2131960000) : str2;
                iu30 iu30Var5 = iu30Var4;
                ibe0 ibe0Var = ibe0.a;
                String string3 = "";
                if (z6) {
                    m4cVar = m4cVar4;
                } else if (z4) {
                    m4cVar = m4cVar4;
                    List list2 = list;
                    if (list2.isEmpty() || !dhm0Var.Z.isEmpty()) {
                        if (!list2.isEmpty() && z5 && z3) {
                            string3 = context.getString(2131959998);
                        } else if (!list2.isEmpty()) {
                            string3 = context.getString(2131959999);
                        } else if (u890.j(xbe0Var, ibe0Var)) {
                            string3 = context.getString(2131959993);
                        } else if (u890.j(xbe0Var, tae0.a)) {
                            string3 = context.getString(2131959992);
                        } else {
                            string3 = u890.j(xbe0Var, ube0.a) ? context.getString(2131959994) : " ";
                        }
                    }
                } else {
                    m4cVar = m4cVar4;
                    string3 = context.getString(2131959995);
                }
                smc0VarN.add(new b460(string2, string3));
                List list3 = iy00Var.c;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new kwb0((ky00) it.next()));
                }
                smc0VarN.addAll(arrayList);
                if (z3 && str.length() > 0) {
                    smc0VarN.add(new zy41(str));
                }
                mbe0 mbe0Var = mbe0.a;
                if (u890.j(xbe0Var, mbe0Var) && list.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(6);
                    int i5 = 0;
                    for (int i6 = 6; i5 < i6; i6 = 6) {
                        arrayList2.add(new kae0());
                        i5++;
                    }
                    smc0VarN.addAll(arrayList2);
                } else {
                    if (z4 && !list.isEmpty()) {
                        List list4 = dhm0Var.V0;
                        ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                        Iterator it2 = list4.iterator();
                        int i7 = 0;
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                p7h.T();
                                throw null;
                            }
                            p111 p111Var = (p111) next2;
                            Iterator it3 = it2;
                            if (!(p111Var instanceof p111)) {
                                eg.o();
                                return null;
                            }
                            arrayList3.add(new fy01(i7, z5, z || (z5 && z2), p111Var));
                            it2 = it3;
                            i7 = i8;
                            ahpVar3 = ahpVar3;
                        }
                        ahpVar = ahpVar3;
                        smc0VarN.addAll(arrayList3);
                    }
                    if (z4 && !dhm0Var.d && (!z5 || !list.isEmpty() || !u890.j(xbe0Var, ibe0Var))) {
                        if (u890.j(xbe0Var, mbe0Var)) {
                            string = context.getString(2131959997);
                        } else {
                            string = context.getString(2131959996);
                        }
                        string.getClass();
                        smc0VarN.add(new ce11(string, z5));
                    }
                    rmc0VarListIterator = k4p1.k(smc0VarN).listIterator(0);
                    while (true) {
                        rmc0Var = rmc0VarListIterator;
                        if (rmc0Var.hasNext()) {
                            x340Var7.r(false);
                            x340Var7.r(true);
                            return rih1Var;
                        }
                        next = rmc0Var.next();
                        if (next instanceof b460) {
                            x340Var7.i0(271507326);
                            otw.c(az00Var.Y, (b460) next, u291.f(nim0Var, 1.0f), (ipb1) null, x340Var7, 0, 8);
                            x340Var7.r(false);
                        } else {
                            if (next instanceof kwb0) {
                                x340Var7.i0(262702551);
                                ky00 ky00Var = ((kwb0) next).a;
                                ky00Var.getClass();
                                x340Var7.f0(-822519619, "suggested_prompts");
                                ktd.s(ky00Var.a, x340Var7, 0, false, false);
                            } else {
                                if (next instanceof fy01) {
                                    x340Var7.i0(271809669);
                                    ahpVar2 = ahpVar;
                                    zG2 = x340Var7.g(((fy01) next).d.b) | x340Var7.g(ahpVar2);
                                    objT2 = x340Var7.T();
                                    if (zG2) {
                                        m4cVar2 = m4cVar;
                                    } else {
                                        m4cVar2 = m4cVar;
                                        if (objT2 == m4cVar2) {
                                            iu30Var = iu30Var5;
                                        }
                                        i1o1.e((ky01) objT2, next, az00Var.X, u291.f(nim0Var, 1.0f), (ipb1) null, tni.a, (xu30) null, 0, (xu30) null, x340Var7, 196608, 232);
                                        x340Var7.r(false);
                                    }
                                    iu30Var = iu30Var5;
                                    bz00 bz00Var = new bz00(iu30Var);
                                    c21 c21Var2 = (c21) ahpVar2.a.c;
                                    Context context2 = (Context) ((k0q) c21Var2.d).a.x1.a;
                                    c8o.l(context2);
                                    bct bctVar = (bct) c21Var2.c;
                                    v6q v6qVar = (v6q) ((k0q) c21Var2.d).b.r8.get();
                                    c8o.l(v6qVar);
                                    ky01 ky01Var = new ky01(context2, bctVar, v6qVar, bz00Var);
                                    x340Var7.s0(ky01Var);
                                    objT2 = ky01Var;
                                    i1o1.e((ky01) objT2, next, az00Var.X, u291.f(nim0Var, 1.0f), (ipb1) null, tni.a, (xu30) null, 0, (xu30) null, x340Var7, 196608, 232);
                                    x340Var7.r(false);
                                } else {
                                    iu30Var = iu30Var5;
                                    m4cVar2 = m4cVar;
                                    ahpVar2 = ahpVar;
                                    if (next instanceof kae0) {
                                        x340Var7.i0(-822500289);
                                        ilo1.g(qim0Var, x340Var7, 0);
                                        x340Var7.r(false);
                                    } else if (next instanceof ce11) {
                                        x340Var7.i0(-822497558);
                                        maa maaVar3 = maaVar2;
                                        otw.c(maaVar3, next, u291.f(nim0Var, 1.0f), (ipb1) null, x340Var7, 0, 8);
                                        maaVar = maaVar3;
                                        x340Var7.r(false);
                                    } else {
                                        maaVar = maaVar2;
                                        if (next instanceof zy41) {
                                            x340Var7.i0(272594124);
                                            bhpVar2 = bhpVar2;
                                            zG = x340Var7.g(bhpVar2);
                                            objT = x340Var7.T();
                                            if (zG || objT == m4cVar2) {
                                                cz00 cz00Var = new cz00(iu30Var);
                                                c21 c21Var3 = (c21) bhpVar2.a.c;
                                                lik1 lik1VarG2 = ((qop) c21Var3.b).g();
                                                qop qopVar = (qop) c21Var3.b;
                                                g431 g431VarF = qopVar.f();
                                                n6r0 n6r0Var2 = qopVar.c;
                                                c8o.l(n6r0Var2);
                                                objT = new bz41(lik1VarG2, g431VarF, n6r0Var2, cz00Var);
                                                x340Var7.s0(objT);
                                            }
                                            otw.c((bz41) objT, next, u291.f(nim0Var, 1.0f), (ipb1) null, x340Var7, 0, 8);
                                            x340Var7.r(false);
                                        } else {
                                            bhpVar2 = bhpVar2;
                                            x340Var7.i0(-822477681);
                                            x340Var7.r(false);
                                        }
                                    }
                                }
                                maaVar = maaVar2;
                            }
                            maaVar2 = maaVar;
                            m4cVar = m4cVar2;
                            ahpVar = ahpVar2;
                            iu30Var5 = iu30Var;
                            bhpVar2 = bhpVar2;
                            qim0Var = null;
                        }
                        maaVar = maaVar2;
                        iu30Var = iu30Var5;
                        m4cVar2 = m4cVar;
                        ahpVar2 = ahpVar;
                        maaVar2 = maaVar;
                        m4cVar = m4cVar2;
                        ahpVar = ahpVar2;
                        iu30Var5 = iu30Var;
                        bhpVar2 = bhpVar2;
                        qim0Var = null;
                    }
                }
                ahpVar = ahpVar3;
                if (z4) {
                    if (u890.j(xbe0Var, mbe0Var)) {
                        string = context.getString(2131959997);
                    } else {
                        string = context.getString(2131959996);
                    }
                    string.getClass();
                    smc0VarN.add(new ce11(string, z5));
                }
                rmc0VarListIterator = k4p1.k(smc0VarN).listIterator(0);
                while (true) {
                    rmc0Var = rmc0VarListIterator;
                    if (rmc0Var.hasNext()) {
                        x340Var7.r(false);
                        x340Var7.r(true);
                        return rih1Var;
                    }
                    next = rmc0Var.next();
                    if (next instanceof b460) {
                        x340Var7.i0(271507326);
                        otw.c(az00Var.Y, (b460) next, u291.f(nim0Var, 1.0f), (ipb1) null, x340Var7, 0, 8);
                        x340Var7.r(false);
                    } else {
                        if (next instanceof kwb0) {
                            x340Var7.i0(262702551);
                            ky00 ky00Var2 = ((kwb0) next).a;
                            ky00Var2.getClass();
                            x340Var7.f0(-822519619, "suggested_prompts");
                            ktd.s(ky00Var2.a, x340Var7, 0, false, false);
                        } else {
                            if (next instanceof fy01) {
                                x340Var7.i0(271809669);
                                ahpVar2 = ahpVar;
                                zG2 = x340Var7.g(((fy01) next).d.b) | x340Var7.g(ahpVar2);
                                objT2 = x340Var7.T();
                                if (zG2) {
                                    m4cVar2 = m4cVar;
                                    if (objT2 == m4cVar2) {
                                        iu30Var = iu30Var5;
                                    }
                                    i1o1.e((ky01) objT2, next, az00Var.X, u291.f(nim0Var, 1.0f), (ipb1) null, tni.a, (xu30) null, 0, (xu30) null, x340Var7, 196608, 232);
                                    x340Var7.r(false);
                                } else {
                                    m4cVar2 = m4cVar;
                                }
                                iu30Var = iu30Var5;
                                bz00 bz00Var2 = new bz00(iu30Var);
                                c21 c21Var4 = (c21) ahpVar2.a.c;
                                Context context3 = (Context) ((k0q) c21Var4.d).a.x1.a;
                                c8o.l(context3);
                                bct bctVar2 = (bct) c21Var4.c;
                                v6q v6qVar2 = (v6q) ((k0q) c21Var4.d).b.r8.get();
                                c8o.l(v6qVar2);
                                ky01 ky01Var2 = new ky01(context3, bctVar2, v6qVar2, bz00Var2);
                                x340Var7.s0(ky01Var2);
                                objT2 = ky01Var2;
                                i1o1.e((ky01) objT2, next, az00Var.X, u291.f(nim0Var, 1.0f), (ipb1) null, tni.a, (xu30) null, 0, (xu30) null, x340Var7, 196608, 232);
                                x340Var7.r(false);
                            } else {
                                iu30Var = iu30Var5;
                                m4cVar2 = m4cVar;
                                ahpVar2 = ahpVar;
                                if (next instanceof kae0) {
                                    x340Var7.i0(-822500289);
                                    ilo1.g(qim0Var, x340Var7, 0);
                                    x340Var7.r(false);
                                } else if (next instanceof ce11) {
                                    x340Var7.i0(-822497558);
                                    maa maaVar4 = maaVar2;
                                    otw.c(maaVar4, next, u291.f(nim0Var, 1.0f), (ipb1) null, x340Var7, 0, 8);
                                    maaVar = maaVar4;
                                    x340Var7.r(false);
                                } else {
                                    maaVar = maaVar2;
                                    if (next instanceof zy41) {
                                        x340Var7.i0(272594124);
                                        bhpVar2 = bhpVar2;
                                        zG = x340Var7.g(bhpVar2);
                                        objT = x340Var7.T();
                                        if (zG) {
                                            cz00 cz00Var2 = new cz00(iu30Var);
                                            c21 c21Var5 = (c21) bhpVar2.a.c;
                                            lik1 lik1VarG3 = ((qop) c21Var5.b).g();
                                            qop qopVar2 = (qop) c21Var5.b;
                                            g431 g431VarF2 = qopVar2.f();
                                            n6r0 n6r0Var3 = qopVar2.c;
                                            c8o.l(n6r0Var3);
                                            objT = new bz41(lik1VarG3, g431VarF2, n6r0Var3, cz00Var2);
                                            x340Var7.s0(objT);
                                        } else {
                                            cz00 cz00Var3 = new cz00(iu30Var);
                                            c21 c21Var6 = (c21) bhpVar2.a.c;
                                            lik1 lik1VarG4 = ((qop) c21Var6.b).g();
                                            qop qopVar3 = (qop) c21Var6.b;
                                            g431 g431VarF3 = qopVar3.f();
                                            n6r0 n6r0Var4 = qopVar3.c;
                                            c8o.l(n6r0Var4);
                                            objT = new bz41(lik1VarG4, g431VarF3, n6r0Var4, cz00Var3);
                                            x340Var7.s0(objT);
                                        }
                                        otw.c((bz41) objT, next, u291.f(nim0Var, 1.0f), (ipb1) null, x340Var7, 0, 8);
                                        x340Var7.r(false);
                                    } else {
                                        bhpVar2 = bhpVar2;
                                        x340Var7.i0(-822477681);
                                        x340Var7.r(false);
                                    }
                                }
                            }
                            maaVar = maaVar2;
                        }
                        maaVar2 = maaVar;
                        m4cVar = m4cVar2;
                        ahpVar = ahpVar2;
                        iu30Var5 = iu30Var;
                        bhpVar2 = bhpVar2;
                        qim0Var = null;
                    }
                    maaVar = maaVar2;
                    iu30Var = iu30Var5;
                    m4cVar2 = m4cVar;
                    ahpVar2 = ahpVar;
                    maaVar2 = maaVar;
                    m4cVar = m4cVar2;
                    ahpVar = ahpVar2;
                    iu30Var5 = iu30Var;
                    bhpVar2 = bhpVar2;
                    qim0Var = null;
                }
                break;
            case 4:
                bot0 bot0Var = (bot0) obj2;
                ((Number) obj5).intValue();
                x340 x340Var8 = (b0k) obj4;
                klz0 klz0Var = (klz0) x340Var8.k(llz0.a);
                Integer numValueOf = Integer.valueOf(bot0Var.c);
                fit0 fit0Var = (fit0) obj8;
                vzq0 vzq0Var = fit0Var.a;
                jlz0 jlz0Var = klz0Var.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                j2i j2iVarR = apo.r(1903331448, new rl6(bot0Var, fit0Var, (dmq) obj7, (emq) obj6, (iu30) obj3, (byte) 6), x340Var8);
                jlz0 jlz0Var2 = jlz0.i;
                lzj.c(numValueOf, vzq0Var, jlz0Var, qim0VarD, j2iVarR, x340Var8, 24576);
                return rih1Var;
            case 5:
                xkk1 xkk1Var = (xkk1) obj;
                qxc0 qxc0Var = (qxc0) obj3;
                return ((iu30) obj8).invoke(new l4h(gxo1.q(xkk1Var), ((jo70) obj2).a, gxo1.m(((ox1) obj7).a, qxc0Var, (fuj0) obj4), gxo1.p(xkk1Var, (q37) obj5), gxo1.l(qxc0Var, ((z6h) obj6).a())));
            case 6:
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                xzq xzqVar = (xzq) obj8;
                d0r d0rVar = (d0r) obj7;
                kpg0 kpg0Var = (kpg0) obj6;
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var9, 0);
                x340 x340Var10 = x340Var9;
                int iHashCode2 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM2 = x340Var10.m();
                qim0 qim0VarE2 = zr7.E(x340Var9, nim0Var);
                hzj.A.getClass();
                x340 x340Var11 = x340Var9;
                if (x340Var11.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(mbhVarA2, x340Var9, y580.O0);
                nko1.H(xos0VarM2, x340Var9, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var9, y580.R0);
                nko1.F(x340Var9);
                nko1.H(qim0VarE2, x340Var9, y580.Y);
                int i9 = iIntValue5 & 112;
                i1o1.e(xzqVar, obj2, d0rVar, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var9, i9, 252);
                otw.c(kpg0Var, obj2, (qim0) null, (ipb1) null, x340Var9, i9, 12);
                x340Var11.r(true);
                return rih1Var;
            case 7:
                mox0 mox0Var = (mox0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                int i10 = (iIntValue6 & 48) == 0 ? iIntValue6 | (x340Var12.g(mox0Var) ? 32 : 16) : iIntValue6;
                if ((iIntValue6 & 384) == 0) {
                    i10 |= x340Var12.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i10 & 1, (i10 & 1169) != 1168)) {
                    mod.b(oi7.a.a((gw70) obj8), apo.r(-389570054, new b2o0(iu30Var6, mox0Var, (idm) obj7, (hft0) obj6), x340Var13), x340Var13, 56);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 8:
                ksw kswVar2 = (ksw) obj;
                pl20 pl20Var2 = (pl20) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                xe01 xe01Var = (xe01) obj8;
                ven0 ven0VarH = rwq.h(xe01Var, x340Var14, 0);
                x340 x340Var15 = x340Var14;
                yy80 yy80Var = (yy80) obj7;
                boolean zI6 = x340Var15.i(ven0VarH) | x340Var15.i(xe01Var) | x340Var15.g(yy80Var) | ((((iIntValue7 & 112) ^ 48) > 32 && x340Var15.i(pl20Var2)) || (iIntValue7 & 48) == 32);
                Object objT12 = x340Var15.T();
                if (zI6 || objT12 == fkj0.X) {
                    objT12 = new vvu0(ven0VarH, yy80Var, pl20Var2, xe01Var, (byte) 27);
                    pl20Var = pl20Var2;
                    x340Var15.s0(objT12);
                } else {
                    pl20Var = pl20Var2;
                }
                qim0 qim0VarS = exd0.s(nim0Var, (iu30) objT12);
                ujo ujoVar = (ujo) obj6;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM3 = x340Var15.m();
                qim0 qim0VarE3 = zr7.E(x340Var15, qim0VarS);
                hzj.A.getClass();
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(gfh0VarC, x340Var15, y580.O0);
                nko1.H(xos0VarM3, x340Var15, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var15, y580.R0);
                nko1.F(x340Var15);
                nko1.H(qim0VarE3, x340Var15, y580.Y);
                int i11 = iIntValue7 >> 3;
                ujoVar.d.a(((iIntValue7 << 6) & 896) | (i11 & 112) | 8 | (i11 & 14), pl20Var, x340Var15, kswVar2, iu30Var7);
                x340Var15.r(true);
                return rih1Var;
            case 9:
                c891 c891Var = (d891) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                int i12 = ((q791) obj7).a;
                g891 g891Var = (g891) obj8;
                if (c891Var instanceof a891) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(861865362);
                    x340Var17.r(false);
                } else if (c891Var instanceof c891) {
                    x340 x340Var18 = x340Var16;
                    x340Var18.i0(-387838544);
                    g891Var.e(i12, c891Var, x340Var18, iIntValue8 & 112);
                    x340Var18.r(false);
                } else {
                    if (!(c891Var instanceof b891)) {
                        throw p3d1.k(x340Var16, -387841135, false);
                    }
                    x340 x340Var19 = x340Var16;
                    x340Var19.i0(-387836429);
                    if (((Boolean) ((Function0) obj6).invoke()).booleanValue()) {
                        x340Var19.i0(-387835592);
                        g891Var.h(i12, iu30Var8, x340Var19, (iIntValue8 >> 3) & 112);
                    } else {
                        x340Var19.i0(862038900);
                    }
                    x340Var19.r(false);
                    x340Var19.r(false);
                }
                return rih1Var;
            case 10:
                yfc1 yfc1Var = (yfc1) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                int iIntValue9 = ((Number) obj5).intValue();
                dg90 dg90Var = (dg90) obj7;
                x340 x340Var20 = (b0k) obj4;
                Object objT13 = x340Var20.T();
                m4c m4cVar5 = fkj0.X;
                if (objT13 == m4cVar5) {
                    objT13 = (cac) dg90Var.b;
                    x340Var20.s0(objT13);
                }
                xpw xpwVar = (xpw) objT13;
                dg90 dg90Var2 = (dg90) obj6;
                Object objT14 = x340Var20.T();
                if (objT14 == m4cVar5) {
                    objT14 = (ldo) dg90Var2.b;
                    x340Var20.s0(objT14);
                }
                xpw xpwVar2 = (xpw) objT14;
                kgc1 kgc1VarA = ((emv0) obj8).a(yfc1Var);
                int i13 = (iIntValue9 & 896) ^ 384;
                boolean z7 = (i13 > 256 && x340Var20.g(iu30Var9)) || (iIntValue9 & 384) == 256;
                Object objT15 = x340Var20.T();
                if (z7 || objT15 == m4cVar5) {
                    objT15 = new pba1(iu30Var9, (byte) 24);
                    x340Var20.s0(objT15);
                }
                Function0 function0 = (Function0) objT15;
                boolean z8 = (i13 > 256 && x340Var20.g(iu30Var9)) || (iIntValue9 & 384) == 256;
                Object objT16 = x340Var20.T();
                if (z8 || objT16 == m4cVar5) {
                    objT16 = new pba1(iu30Var9, (byte) 25);
                    x340Var20.s0(objT16);
                }
                zko1.i(kgc1VarA, function0, (Function0) objT16, cwl1.o0(x340Var20, 2131957749), cwl1.o0(x340Var20, 2131957748), cwl1.o0(x340Var20, 2131957747), apo.r(1287021515, new rff(xpwVar, (byte) 7), x340Var20), (qim0) null, apo.r(586955145, new rff(xpwVar2, (byte) 8), x340Var20), x340Var20, 102236160);
                return rih1Var;
            default:
                ksw kswVar3 = (ksw) obj;
                edj1 edj1Var = (edj1) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                e701 e701Var = (e701) obj8;
                czs czsVar = (czs) e701Var.i;
                int i14 = (iIntValue10 & 896) ^ 384;
                boolean z9 = (i14 > 256 && x340Var21.g(iu30Var10)) || (iIntValue10 & 384) == 256;
                x340 x340Var22 = x340Var21;
                Object objT17 = x340Var22.T();
                if (z9 || objT17 == m4cVar6) {
                    objT17 = new ceg1(iu30Var10, (byte) 25);
                    x340Var22.s0(objT17);
                }
                n9p1.e(kswVar3, (iu30) objT17, x340Var22, iIntValue10 & 14);
                boolean zB = ((crl1) x340Var22.k(t4k.u)).b();
                Boolean boolValueOf = Boolean.valueOf(zB);
                boolean zH = x340Var22.h(zB) | ((i14 > 256 && x340Var22.g(iu30Var10)) || (iIntValue10 & 384) == 256);
                Object objT18 = x340Var22.T();
                if (zH || objT18 == m4cVar6) {
                    objT18 = new ag21(iu30Var10, zB, (byte) 5);
                    x340Var22.s0(objT18);
                }
                qxd0.C(boolValueOf, (Function0) objT18, x340Var22);
                uoa uoaVarA = czsVar.a();
                if (uoaVarA != null) {
                    kiv kivVar = ibj1.a;
                    boolean zI7 = x340Var22.i(uoaVarA);
                    Object objT19 = x340Var22.T();
                    if (zI7 || objT19 == m4cVar6) {
                        objT19 = new yaj1(uoaVarA, (byte) 0);
                        x340Var22.s0(objT19);
                    }
                    mod.c(new ely0[]{kivVar.a(objT19), ibj1.d.a((bzs) e701Var.Y), abj1.a.a(czsVar), ibj1.b.a((z3q) obj7), ibj1.c.a((av0) obj6), oi7.a.a((gw70) e701Var.f), qp0.a.a((op0) e701Var.e), ibj1.e.a(Boolean.valueOf(e701Var.b)), ibj1.f.a((h44) e701Var.X)}, apo.r(1617982447, new eii1(edj1Var, e701Var, iu30Var10), x340Var22), x340Var22, 56);
                }
                return rih1Var;
        }
    }
}
