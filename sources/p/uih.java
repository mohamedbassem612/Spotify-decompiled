package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uih extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uih(Function0 function0, long j, hdn0 hdn0Var, hdn0 hdn0Var2, u201 u201Var, List list, String str, iu30 iu30Var) {
        super(2);
        this.a = (byte) 0;
        this.b = function0;
        this.d = j;
        this.e = hdn0Var;
        this.f = hdn0Var2;
        this.g = u201Var;
        this.h = list;
        this.i = str;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        hdn0 hdn0Var;
        boolean z;
        Object obj3;
        String str;
        String strK;
        j2i j2iVar;
        vu30 vu30Var;
        gbx gbxVar;
        byte b = this.a;
        long j = this.d;
        Function0 function0 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                Object objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = kaa0.h(0L, x340Var2);
                }
                ven0 ven0Var = (ven0) objT;
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = bb00.h(0, x340Var2);
                }
                hdn0 hdn0Var2 = (hdn0) objT2;
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT3);
                }
                ven0 ven0Var2 = (ven0) objT3;
                tob1 tob1VarB = z95.b(((Boolean) ven0Var2.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(80, 0, (dlv) null, 6), "Reaction picker fade in", (iu30) null, x340Var2, 3072, 20);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean zI = x340Var2.i(ven0Var) | x340Var2.i(hdn0Var2);
                Object objT4 = x340Var2.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new ntb(ven0Var, hdn0Var2, (byte) 1);
                    x340Var2.s0(objT4);
                }
                qim0 qim0VarX = ern1.x(qim0VarD, (iu30) objT4);
                boolean zI2 = x340Var2.i(tob1VarB);
                Object objT5 = x340Var2.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new lq2(tob1VarB, (byte) 29);
                    x340Var2.s0(objT5);
                }
                qim0 qim0VarC = i541.C(qim0VarX, (iu30) objT5);
                uwr uwrVar = cbx.a;
                qim0 qim0VarN = anm1.N("social_interactivity_comment_row_picker_scrim", bin.x(dug.f(qim0VarC, ((vex) zex.a.e).f, d4o1.a), false, (String) null, (pm31) null, (idn0) null, this.b, 15));
                hdn0 hdn0Var3 = (hdn0) obj8;
                hdn0 hdn0Var4 = (hdn0) obj4;
                u201 u201Var = (u201) obj7;
                List list = (List) obj6;
                String str2 = (String) obj5;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z2 = x340Var2.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                long j2 = this.d;
                boolean zF = x340Var2.f(j2) | x340Var2.i(ven0Var) | x340Var2.i(hdn0Var2) | x340Var2.i(hdn0Var3) | x340Var2.i(hdn0Var4) | x340Var2.i(tob1VarB);
                Object objT6 = x340Var2.T();
                if (zF || objT6 == m4cVar) {
                    objT6 = new sih(j2, tob1VarB, ven0Var, hdn0Var2, hdn0Var3, hdn0Var4);
                    hdn0Var = hdn0Var4;
                    x340Var2.s0(objT6);
                } else {
                    hdn0Var = hdn0Var4;
                }
                qim0 qim0VarB = eqr0.B(nim0Var, (iu30) objT6);
                boolean zI3 = x340Var2.i(hdn0Var) | x340Var2.i(hdn0Var3);
                Object objT7 = x340Var2.T();
                if (zI3 || objT7 == m4cVar) {
                    z = false;
                    objT7 = new tih(hdn0Var, hdn0Var3, (byte) 0);
                    x340Var2.s0(objT7);
                } else {
                    z = false;
                }
                qim0 qim0VarU = lrn1.u(qim0VarB, (iu30) objT7);
                gfh0 gfh0VarC2 = t1c.c(graVar, z);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarU);
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
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new s201((String) it.next()));
                }
                iu30 iu30Var = this.c;
                boolean zG = x340Var2.g(iu30Var);
                Object objT8 = x340Var2.T();
                if (zG || objT8 == m4cVar) {
                    objT8 = new sm(iu30Var, (byte) 22);
                    x340Var2.s0(objT8);
                }
                otw.c(u201Var, new t201(arrayList, str2, (vu30) objT8, null, 8), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(true);
                x340Var2.r(true);
                boolean zI4 = x340Var2.i(ven0Var2);
                Object objT9 = x340Var2.T();
                if (zI4 || objT9 == m4cVar) {
                    objT9 = new vk1(ven0Var2, (lnm) null, (byte) 6);
                    x340Var2.s0(objT9);
                }
                qxd0.t(rih1Var, x340Var2, (vu30) objT9);
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                nlg0 nlg0Var = (nlg0) obj8;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    clg0 clg0Var = nlg0Var.a;
                    grn1 grn1Var = nlg0Var.c;
                    String str3 = clg0Var.b;
                    long j3 = nlg0Var.g;
                    if (grn1Var instanceof jlg0) {
                        obj3 = obj5;
                        str = str3;
                        strK = x0d.k(x340Var4, 2040867483, 2131953961, x340Var4, false);
                    } else {
                        obj3 = obj5;
                        str = str3;
                        if (grn1Var instanceof klg0) {
                            strK = x0d.k(x340Var4, 2040871556, 2131953964, x340Var4, false);
                        } else if (grn1Var instanceof mlg0) {
                            strK = x0d.k(x340Var4, 2040875970, 2131953962, x340Var4, false);
                        } else {
                            if (!(grn1Var instanceof llg0)) {
                                throw p3d1.k(x340Var4, 2040864751, false);
                            }
                            strK = x0d.k(x340Var4, 2040880514, 2131953963, x340Var4, false);
                        }
                    }
                    if (grn1Var.q() > 0) {
                        x340Var4.i0(-1157016654);
                        j2i j2iVarR = apo.r(-915182038, new w0f0((bv40) obj7, (d0r) obj6, (mjm) obj3, nlg0Var, (byte) 6), x340Var4);
                        x340Var4.r(false);
                        j2iVar = j2iVarR;
                    } else {
                        x340Var4.i0(-1156603982);
                        x340Var4.r(false);
                        j2iVar = null;
                    }
                    String strO0 = cwl1.o0(x340Var4, 2131962694);
                    boolean zG2 = x340Var4.g(function0);
                    iu30 iu30Var2 = this.c;
                    boolean zF2 = x340Var4.f(j) | zG2 | x340Var4.g(iu30Var2) | x340Var4.i(nlg0Var);
                    Object objT10 = x340Var4.T();
                    if (zF2 || objT10 == fkj0.X) {
                        objT10 = new zlg0(this.b, iu30Var2, nlg0Var, this.d, (byte) 0);
                        x340Var4.s0(objT10);
                    }
                    String str4 = strK;
                    String str5 = str;
                    rrn1.p(str5, (qim0) null, str4, (vu30) obj4, j2iVar, new gbx(new y50(strO0), (Function0) objT10), false, j3, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                gmg0 gmg0Var = (gmg0) obj8;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str6 = gmg0Var.b;
                    String str7 = gmg0Var.a;
                    long j4 = gmg0Var.j;
                    String strC = gg.C(gmg0Var.e, x340Var6, 0, 1);
                    if (str7 == null || gmg0Var.g == null || gmg0Var.h == null) {
                        x340Var6.i0(-2124572284);
                        x340Var6.r(false);
                        vu30Var = null;
                    } else {
                        x340Var6.i0(-2124986878);
                        vu30 vu30VarR = apo.r(-1495467431, new w0f0((bv40) obj7, (d0r) obj6, (njm) obj5, gmg0Var, (byte) 7), x340Var6);
                        x340Var6.r(false);
                        vu30Var = vu30VarR;
                    }
                    if (str7 != null) {
                        x340Var6.i0(-2124457584);
                        String strO1 = cwl1.o0(x340Var6, 2131962698);
                        boolean zG3 = x340Var6.g(function0);
                        iu30 iu30Var3 = this.c;
                        boolean zF3 = x340Var6.f(j) | zG3 | x340Var6.g(iu30Var3) | x340Var6.i(gmg0Var);
                        Object objT11 = x340Var6.T();
                        if (zF3 || objT11 == fkj0.X) {
                            objT11 = new zlg0(this.b, iu30Var3, gmg0Var, this.d, (byte) 2);
                            x340Var6.s0(objT11);
                        }
                        gbx gbxVar2 = new gbx(new y50(strO1), (Function0) objT11);
                        x340Var6.r(false);
                        gbxVar = gbxVar2;
                    } else {
                        x340Var6.i0(-2124088251);
                        x340Var6.r(false);
                        gbxVar = null;
                    }
                    rrn1.p(str6, (qim0) null, strC, (vu30) obj4, vu30Var, gbxVar, false, j4, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uih(Object obj, Function0 function0, iu30 iu30Var, long j, j2i j2iVar, bv40 bv40Var, d0r d0rVar, mjm mjmVar, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = function0;
        this.c = iu30Var;
        this.d = j;
        this.f = j2iVar;
        this.g = bv40Var;
        this.h = d0rVar;
        this.i = mjmVar;
    }
}
