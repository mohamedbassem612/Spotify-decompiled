package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hef0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hef0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ee  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        pjf0 pjf0Var;
        Object obj6;
        a9h a9hVar;
        boolean z;
        boolean z2;
        boolean z3;
        int iC;
        zef0 yef0Var;
        int i;
        String str;
        pjf0 pjf0Var2;
        tl7 qbo0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.b;
        Object obj11 = this.c;
        switch (b) {
            case 0:
                tef0 tef0Var = (tef0) obj2;
                iu30 iu30Var = (iu30) obj3;
                ((Number) obj5).intValue();
                pjf0 pjf0Var3 = (pjf0) obj11;
                m4c m4cVar = fkj0.X;
                String str2 = tef0Var.f;
                String str3 = tef0Var.e;
                String str4 = tef0Var.d;
                String str5 = tef0Var.b;
                a9h a9hVar2 = tef0Var.a;
                x340 x340Var = (b0k) obj4;
                boolean zG = x340Var.g(tef0Var);
                qhm qhmVar = (qhm) obj10;
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    boolean z4 = qhmVar.b;
                    String strS = upn1.s();
                    boolean z5 = tef0Var.h;
                    fef0 fef0Var = a9hVar2.a;
                    String str6 = tef0Var.i;
                    a9h a9hVarA = a9h.a(a9hVar2, rqt0.K(fef0Var, str6), null, 2);
                    String str7 = tef0Var.c;
                    bff0 bff0Var = a9hVar2.b;
                    int i2 = fef0Var.h;
                    List list = fef0Var.c;
                    List list2 = fef0Var.a;
                    boolean z6 = i2 != 1;
                    List list3 = list2;
                    boolean z7 = !list3.isEmpty() && i2 == 1;
                    boolean z8 = !list3.isEmpty() && tef0Var.g && i2 == 1 && z5;
                    if (!z5 || list3.isEmpty()) {
                        pjf0Var = pjf0Var3;
                        obj6 = obj9;
                        a9hVar = a9hVar2;
                        z = false;
                    } else {
                        if (z4) {
                            if (rqt0.A(fef0Var, str6)) {
                                pjf0Var = pjf0Var3;
                                obj6 = obj9;
                                a9hVar = a9hVar2;
                                z = false;
                            } else {
                                List list4 = list;
                                pjf0Var = pjf0Var3;
                                obj6 = obj9;
                                ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
                                Iterator it = list4.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((def0) it.next()).a);
                                }
                                ArrayList arrayListN0 = o7h.N0(fef0Var.i, arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayListN0.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = it2;
                                    a9h a9hVar3 = a9hVar2;
                                    if (!nhc1.S((String) next, fef0Var.d, true)) {
                                        arrayList2.add(next);
                                    }
                                    it2 = it3;
                                    a9hVar2 = a9hVar3;
                                }
                                a9hVar = a9hVar2;
                                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                                for (Iterator it4 = arrayList2.iterator(); it4.hasNext(); it4 = it4) {
                                    arrayList3.add(new nbb0((String) it4.next(), false, "", false));
                                }
                                z = false;
                                if (!cev0.w(strS, arrayList3).isEmpty()) {
                                }
                            }
                            z2 = true;
                        } else {
                            pjf0Var = pjf0Var3;
                            obj6 = obj9;
                            a9hVar = a9hVar2;
                            z = false;
                            if (!list.isEmpty()) {
                                z2 = true;
                            }
                        }
                        if (i2 == 2) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        iC = l1d.C(i2);
                        if (iC != 0 || iC == 1) {
                            yef0Var = xef0.a;
                        } else {
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                            yef0Var = new yef0(str5, str4, str3, str2);
                        }
                        zef0 zef0Var = yef0Var;
                        if (z4 || !rqt0.A(fef0Var, str6)) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        aff0 aff0Var = new aff0(a9hVarA, str5, str7, bff0Var, z7, z8, z2, z3, zef0Var, z6, i);
                        str = str5;
                        objT = v8r.q(aff0Var);
                        x340Var.s0(objT);
                    }
                    z2 = z;
                    if (i2 == 2) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    iC = l1d.C(i2);
                    if (iC != 0) {
                        yef0Var = xef0.a;
                    } else {
                        yef0Var = xef0.a;
                    }
                    zef0 zef0Var2 = yef0Var;
                    if (z4) {
                        i = 1;
                    } else {
                        i = 1;
                    }
                    aff0 aff0Var2 = new aff0(a9hVarA, str5, str7, bff0Var, z7, z8, z2, z3, zef0Var2, z6, i);
                    str = str5;
                    objT = v8r.q(aff0Var2);
                    x340Var.s0(objT);
                } else {
                    pjf0Var = pjf0Var3;
                    obj6 = obj9;
                    str = str5;
                    a9hVar = a9hVar2;
                }
                ven0 ven0Var = (ven0) objT;
                boolean zG2 = x340Var.g(tef0Var);
                vgb vgbVar = (vgb) obj6;
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    pjf0Var2 = pjf0Var;
                    objT2 = v8r.q(new lfm(a9hVar, new dof1(str3, str4, str2, str), pjf0Var2, vgbVar));
                    x340Var.s0(objT2);
                } else {
                    pjf0Var2 = pjf0Var;
                }
                ven0 ven0Var2 = (ven0) objT2;
                Object obj12 = (e27) obj8;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    x340Var.s0(obj12);
                } else {
                    obj12 = objT3;
                }
                xpw xpwVar = (xpw) obj12;
                z6c z6cVar = (z6c) obj7;
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = new qj0(z6cVar.a);
                    x340Var.s0(objT4);
                }
                xpw xpwVar2 = (xpw) objT4;
                boolean zG3 = x340Var.g(tef0Var);
                Object objT5 = x340Var.T();
                if (zG3 || objT5 == m4cVar) {
                    objT5 = v8r.q(new p40(new dof1(str3, str4, str2, str), pjf0Var2));
                    x340Var.s0(objT5);
                }
                gfx.e(z4p1.e(((aff0) ven0Var.getValue()).d.a), z4p1.e(((aff0) ven0Var.getValue()).d.b), z4p1.e(((aff0) ven0Var.getValue()).d.c), z4p1.e(((aff0) ven0Var.getValue()).d.d), z4p1.e(((aff0) ven0Var.getValue()).d.e), apo.r(-165797140, new ta5(xpwVar, xpwVar2, qhmVar, iu30Var, ven0Var, ven0Var2, (ven0) objT5, (byte) 26), x340Var), x340Var, 196608);
                return rih1Var;
            case 1:
                ksw kswVar = (ksw) obj;
                pii0 pii0Var = (pii0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                String str8 = pii0Var.a;
                x340 x340Var2 = (b0k) obj4;
                Object objT6 = x340Var2.T();
                Object obj13 = fkj0.X;
                if (objT6 == obj13) {
                    objT6 = new LinkedHashMap();
                    x340Var2.s0(objT6);
                }
                Map map = (Map) objT6;
                Function0 function0 = (Function0) obj10;
                if (function0 == null || (qbo0Var = (tl7) function0.invoke()) == null) {
                    qbo0Var = new qbo0();
                }
                jgi0 jgi0Var = (jgi0) obj11;
                Object objCreate = map.get(str8);
                if (objCreate == null) {
                    objCreate = jgi0Var.create();
                    map.put(str8, objCreate);
                }
                kgi0 kgi0Var = (kgi0) objCreate;
                boolean zI = x340Var2.i(kgi0Var) | ((((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var2)) || (iIntValue & 384) == 256) | x340Var2.i(pii0Var);
                Object objT7 = x340Var2.T();
                if (zI || objT7 == obj13) {
                    objT7 = new dt90(kgi0Var, iu30Var2, pii0Var, (byte) 23);
                    x340Var2.s0(objT7);
                }
                Function0 function1 = (Function0) objT7;
                boolean zI2 = x340Var2.i(kgi0Var);
                Object objT8 = x340Var2.T();
                if (zI2 || objT8 == obj13) {
                    objT8 = new qgi0(kgi0Var, (byte) 6);
                    x340Var2.s0(objT8);
                }
                tl7 tl7Var = qbo0Var;
                i1o1.b(kswVar, tl7Var, str8, function1, (Function0) objT8, x340Var2, iIntValue & 14, 0);
                rce0.a(tl7Var, apo.r(580305355, new uuy(iu30Var2, pii0Var, (cgi0) obj9, kgi0Var, (kly0) obj8, (j2i) obj7, (byte) 22), x340Var2), x340Var2, 48);
                return rih1Var;
            case 2:
                vwt0 vwt0Var = (vwt0) obj2;
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                xwt0 xwt0Var = (xwt0) obj10;
                if (vwt0Var.b) {
                    x1p1.b(xwt0Var.d, apo.r(-1172954205, new wwt0(xwt0Var, vwt0Var, (byte) 2), b0kVar), apo.r(1518009218, new t1t0(xwt0Var, (byte) 9), b0kVar), apo.r(-85994655, new t1t0((am51) obj11, (byte) 10), b0kVar), apo.r(-1689998528, new kpt0((dfm) obj9, (byte) 1), b0kVar), apo.r(1000964895, new t1t0((qm51) obj8, (byte) 11), b0kVar), apo.r(-603038978, new hws0((wy61) obj7, vwt0Var, (byte) 9), b0kVar), b0kVar, 1797552);
                }
                return rih1Var;
            default:
                ksw kswVar2 = (ksw) obj;
                o6j1 o6j1Var = (o6j1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                String str9 = o6j1Var.a;
                x340 x340Var3 = (b0k) obj4;
                boolean zG4 = x340Var3.g(str9);
                sjf1 sjf1Var = (sjf1) obj11;
                Object objT9 = x340Var3.T();
                if (zG4 || objT9 == m4cVar2) {
                    abu0 abu0Var = (abu0) sjf1Var.invoke();
                    objT9 = abu0Var != null ? abu0Var.e(str9, false) : null;
                    x340Var3.s0(objT9);
                }
                zau0 zau0Var = (zau0) objT9;
                Object objT10 = x340Var3.T();
                if (objT10 == m4cVar2) {
                    objT10 = v8r.q(Boolean.FALSE);
                    x340Var3.s0(objT10);
                }
                ven0 ven0Var3 = (ven0) objT10;
                tl7 tl7Var2 = (tl7) ((Function0) obj10).invoke();
                boolean zI3 = x340Var3.i(ven0Var3) | x340Var3.i(zau0Var) | x340Var3.g(sjf1Var);
                Object objT11 = x340Var3.T();
                if (zI3 || objT11 == m4cVar2) {
                    objT11 = new e6j1(zau0Var, ven0Var3, sjf1Var, (byte) 0);
                    x340Var3.s0(objT11);
                }
                Function0 function2 = (Function0) objT11;
                boolean zI4 = x340Var3.i(ven0Var3) | x340Var3.i(zau0Var) | x340Var3.g(sjf1Var);
                Object objT12 = x340Var3.T();
                if (zI4 || objT12 == m4cVar2) {
                    objT12 = new e6j1(zau0Var, ven0Var3, sjf1Var, (byte) 1);
                    x340Var3.s0(objT12);
                }
                i1o1.b(kswVar2, tl7Var2, str9, function2, (Function0) objT12, x340Var3, iIntValue2 & 14, 0);
                mod.b(oi7.a.a((gw70) obj9), apo.r(379368182, new wyy0(iu30Var3, o6j1Var, (iuj) obj8, zau0Var, ven0Var3, (idm) obj7, (byte) 20), x340Var3), x340Var3, 56);
                return rih1Var;
        }
    }
}
