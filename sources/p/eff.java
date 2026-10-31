package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eff extends hab0 implements vu30 {
    public final /* synthetic */ asf N0;
    public final /* synthetic */ j780 O0;
    public final /* synthetic */ h7f P0;
    public final /* synthetic */ ig31 Q0;
    public final /* synthetic */ njf R0;
    public final /* synthetic */ hn50 S0;
    public final /* synthetic */ h001 T0;
    public final /* synthetic */ xif U0;
    public final /* synthetic */ yyh V0;
    public final /* synthetic */ ysd1 W0;
    public final /* synthetic */ ahs0 X;
    public final /* synthetic */ zlp0 X0;
    public final /* synthetic */ f5f Y;
    public final /* synthetic */ cbd0 Y0;
    public final /* synthetic */ u7i1 Z;
    public final /* synthetic */ bgd0 Z0;
    public final /* synthetic */ ncf a;
    public final /* synthetic */ tvu0 a1;
    public final /* synthetic */ uff b;
    public final /* synthetic */ uuu0 b1;
    public final /* synthetic */ w4i1 c;
    public final /* synthetic */ onu0 c1;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ String d1;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ bzi0 g;
    public final /* synthetic */ r171 h;
    public final /* synthetic */ y0f i;
    public final /* synthetic */ ymq0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eff(ncf ncfVar, uff uffVar, w4i1 w4i1Var, ven0 ven0Var, ven0 ven0Var2, iu30 iu30Var, bzi0 bzi0Var, r171 r171Var, y0f y0fVar, ymq0 ymq0Var, ahs0 ahs0Var, f5f f5fVar, u7i1 u7i1Var, asf asfVar, j780 j780Var, h7f h7fVar, ig31 ig31Var, njf njfVar, hn50 hn50Var, h001 h001Var, xif xifVar, yyh yyhVar, ysd1 ysd1Var, zlp0 zlp0Var, cbd0 cbd0Var, bgd0 bgd0Var, tvu0 tvu0Var, uuu0 uuu0Var, onu0 onu0Var, String str) {
        super(2);
        this.a = ncfVar;
        this.b = uffVar;
        this.c = w4i1Var;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = iu30Var;
        this.g = bzi0Var;
        this.h = r171Var;
        this.i = y0fVar;
        this.t = ymq0Var;
        this.X = ahs0Var;
        this.Y = f5fVar;
        this.Z = u7i1Var;
        this.N0 = asfVar;
        this.O0 = j780Var;
        this.P0 = h7fVar;
        this.Q0 = ig31Var;
        this.R0 = njfVar;
        this.S0 = hn50Var;
        this.T0 = h001Var;
        this.U0 = xifVar;
        this.V0 = yyhVar;
        this.W0 = ysd1Var;
        this.X0 = zlp0Var;
        this.Y0 = cbd0Var;
        this.Z0 = bgd0Var;
        this.a1 = tvu0Var;
        this.b1 = uuu0Var;
        this.c1 = onu0Var;
        this.d1 = str;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0277  */
    /* JADX WARN: Code duplicated, block: B:162:0x033b  */
    /* JADX WARN: Code duplicated, block: B:165:0x036f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0371  */
    /* JADX WARN: Code duplicated, block: B:168:0x037b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0380  */
    /* JADX WARN: Code duplicated, block: B:171:0x0384  */
    /* JADX WARN: Code duplicated, block: B:173:0x038a  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:176:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:178:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:184:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:189:0x042b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0432  */
    /* JADX WARN: Code duplicated, block: B:192:0x0438  */
    /* JADX WARN: Code duplicated, block: B:194:0x0440  */
    /* JADX WARN: Code duplicated, block: B:196:0x0475  */
    /* JADX WARN: Code duplicated, block: B:198:0x047d  */
    /* JADX WARN: Code duplicated, block: B:200:0x049b  */
    /* JADX WARN: Code duplicated, block: B:202:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:204:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:206:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:208:0x050d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0511  */
    /* JADX WARN: Code duplicated, block: B:211:0x0542  */
    /* JADX WARN: Code duplicated, block: B:217:0x0583  */
    /* JADX WARN: Code duplicated, block: B:219:0x0588  */
    /* JADX WARN: Code duplicated, block: B:220:0x0596  */
    /* JADX WARN: Code duplicated, block: B:222:0x059a  */
    /* JADX WARN: Code duplicated, block: B:223:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:225:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:228:0x060f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0681  */
    /* JADX WARN: Code duplicated, block: B:420:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:434:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:435:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:437:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:455:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:456:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:457:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a5f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:461:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:462:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:468:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:478:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:481:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:483:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:485:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:486:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:488:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:491:0x0ad8  */
    /* JADX WARN: Code duplicated, block: B:494:0x0ae9 A[LOOP:10: B:489:0x0ad2->B:494:0x0ae9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:498:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:499:0x0af5  */
    /* JADX WARN: Code duplicated, block: B:502:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:507:0x0b1c  */
    /* JADX WARN: Code duplicated, block: B:526:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:529:0x0b75  */
    /* JADX WARN: Code duplicated, block: B:532:0x0b86  */
    /* JADX WARN: Code duplicated, block: B:535:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:537:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:569:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x0aeb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0ae7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        List list;
        String str;
        uff uffVar;
        String str2;
        boolean z;
        LinkedHashMap linkedHashMap;
        goe goeVar;
        Object next;
        ArrayList arrayList;
        pef pefVar;
        boolean zA;
        xks0 xks0Var;
        pef oefVar;
        int iC;
        pef oefVar2;
        List list2;
        cso1 sefVar;
        cso1 gefVar;
        b2j0 b2j0Var;
        int i;
        Integer numValueOf;
        t7q0 t7q0Var;
        fef fefVar;
        fef eefVar;
        w4i1 w4i1Var;
        mcf mcfVar;
        int i2;
        boolean z2;
        ven0 ven0Var;
        iu30 iu30Var;
        boolean zG;
        Object objT;
        Object obj3;
        xks0 xks0Var2;
        int i3;
        Iterator it;
        Object obj4;
        jwm jwmVar;
        Object next2;
        int size;
        int i4;
        Object next3;
        w4i1 w4i1Var2;
        v1j0 v1j0Var;
        tom tomVar;
        LinkedHashMap linkedHashMap2;
        tom tomVarA;
        String str3;
        nom nomVar;
        rom romVar;
        vol volVar;
        Set set;
        a2j0 u1j0Var;
        a2j0 z0j0Var;
        lpl lplVar;
        bpl bplVar;
        a2j0 a2j0VarM;
        a2j0 k1j0Var;
        String str4;
        int length;
        String strI;
        String str5;
        int length2;
        String strI2;
        String strL;
        jzr0 jzr0VarE;
        bms0 bms0Var;
        Boolean boolValueOf;
        String str6;
        jzr0 jzr0VarE2;
        fr2 fr2Var;
        hmp0 hmp0Var;
        bms0 bms0VarB;
        Object next4;
        hmp0 hmp0Var2;
        hmp0 hmp0Var3;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        ncf ncfVar = this.a;
        goe goeVar2 = ncfVar.a;
        boolean z3 = ncfVar.j1;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            x340Var2.i0(1024172194);
            boolean z4 = ((add) x340Var2.k(ade0.c)).a() && z3;
            uff uffVar2 = this.b;
            Context context = uffVar2.b;
            boolean z5 = uffVar2.m0;
            String str7 = uffVar2.e.c;
            boolean zB = ncfVar.b();
            Map map = ncfVar.W0;
            lte lteVar = uffVar2.o;
            boolean z6 = ncfVar.c;
            boolean z7 = ncfVar.Y;
            boolean z8 = ncfVar.N0;
            boolean z9 = ncfVar.c1;
            boolean z10 = ncfVar.g1;
            String str8 = this.d1;
            String str9 = !ihc1.y0(str8) ? str8 : null;
            boolean z11 = ncfVar.X0;
            boolean z12 = ncfVar.V0 && !z5;
            boolean z13 = uffVar2.V.h;
            ctf ctfVar = goeVar2.b;
            List list3 = goeVar2.e;
            List list4 = goeVar2.f;
            List list5 = list4;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj5 : list5) {
                boolean z14 = z5;
                Map map2 = map;
                if (u890.j(((tom) obj5).c.a, str7)) {
                    arrayList2.add(obj5);
                }
                z5 = z14;
                map = map2;
            }
            boolean z15 = z5;
            Map map3 = map;
            List listD1 = o7h.d1(arrayList2, 4);
            ArrayList arrayList3 = new ArrayList(q7h.U(listD1, 10));
            Iterator it2 = listD1.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((tom) it2.next()).a);
            }
            Set setP1 = o7h.p1(arrayList3);
            if (!z11 || (ctfVar instanceof btf)) {
                list = list5;
            } else {
                if (goeVar2.c.a()) {
                    list = list5;
                } else {
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it3 = list5.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                lpl lplVar2 = ((tom) it3.next()).f;
                                list = list5;
                                lpl lplVar3 = lplVar2 instanceof lpl ? lplVar2 : null;
                                if (lplVar3 != null && (hmp0Var3 = lplVar3.e) != null && hmp0Var3.c) {
                                    list5 = list;
                                }
                            }
                        }
                    }
                    list = list5;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                    lpl lplVar4 = ((tom) next4).f;
                    Iterator it5 = it4;
                    lpl lplVar5 = lplVar4 instanceof lpl ? lplVar4 : null;
                    if (lplVar5 != null && (hmp0Var2 = lplVar5.e) != null && hmp0Var2.c) {
                        break;
                    }
                    it4 = it5;
                }
                tom tomVar2 = (tom) next4;
                str = tomVar2 != null ? tomVar2.a : null;
            }
            fr2 fr2Var2 = fr2.PERMISSION_RESOLVED;
            if (z4) {
                str2 = "";
                linkedHashMap = new LinkedHashMap();
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    boolean z16 = z6;
                    vol volVar2 = ((tom) it6.next()).f;
                    vol volVar3 = volVar2 instanceof vol ? volVar2 : null;
                    String str10 = volVar3 != null ? volVar3.a : null;
                    if (str10 == null) {
                        str10 = str2;
                    }
                    if (str10.length() > 0) {
                        se11 se11Var = xq2.a;
                        uff uffVar3 = uffVar2;
                        if (nhc1.Y(str10, "[agent-command:permission_resolve]\n", false)) {
                            bms0VarB = xq2.b(ihc1.H0(str10, "[agent-command:permission_resolve]\n"));
                        } else {
                            jzr0 jzr0VarE3 = xq2.e(str10);
                            bms0VarB = (jzr0VarE3 == null || jzr0VarE3.a != fr2Var2) ? null : xq2.b(ihc1.Z0(ihc1.H0(str10, "[agent-event:permission_resolved]\n"), "\n\n"));
                        }
                        if (bms0VarB != null) {
                        }
                        uffVar2 = uffVar3;
                    }
                    z6 = z16;
                }
                uffVar = uffVar2;
                z = z6;
            } else {
                uffVar = uffVar2;
                str2 = "";
                z = z6;
                linkedHashMap = b7x.a;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                Object next5 = it7.next();
                Iterator it8 = it7;
                tom tomVar3 = (tom) next5;
                ncf ncfVar2 = ncfVar;
                lpl lplVar6 = tomVar3.f;
                x340 x340Var3 = x340Var2;
                nom nomVar2 = tomVar3.t;
                String str11 = str7;
                lpl lplVar7 = lplVar6 instanceof lpl ? lplVar6 : null;
                if ((lplVar7 == null || (hmp0Var = lplVar7.e) == null || !hmp0Var.d) && !u890.j(nomVar2, iom.a) && !(nomVar2 instanceof jom)) {
                    if (z4) {
                        vol volVar4 = tomVar3.f;
                        if (volVar4 instanceof vol) {
                            se11 se11Var2 = xq2.a;
                            String str12 = volVar4.a;
                            if (!nhc1.Y(str12, "[agent-command:", false) && ((jzr0VarE2 = xq2.e(str12)) == null || ((fr2Var = jzr0VarE2.a) != fr2.THINKING && fr2Var != fr2Var2))) {
                                arrayList4.add(next5);
                            }
                        } else {
                            arrayList4.add(next5);
                        }
                    } else {
                        arrayList4.add(next5);
                    }
                }
                it7 = it8;
                ncfVar = ncfVar2;
                str7 = str11;
                x340Var2 = x340Var3;
            }
            x340 x340Var4 = x340Var2;
            ncf ncfVar3 = ncfVar;
            String str13 = str7;
            p811 p811Var = new p811();
            p811Var.a = new ArrayList();
            p811 p811Var2 = new p811();
            ArrayList arrayList5 = new ArrayList();
            String str14 = str2;
            int i5 = 0;
            String str15 = str14;
            for (Object obj6 : arrayList4) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                int i7 = i5;
                tom tomVar4 = (tom) obj6;
                Long lValueOf = i7 == 0 ? null : Long.valueOf(((tom) arrayList4.get(i7 - 1)).d);
                long j = tomVar4.d;
                ArrayList arrayList6 = arrayList4;
                String str16 = tomVar4.a;
                if (lValueOf == null) {
                    tomVar = tomVar4;
                    linkedHashMap2 = linkedHashMap;
                } else {
                    tomVar = tomVar4;
                    linkedHashMap2 = linkedHashMap;
                    long jLongValue = lValueOf.longValue();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (Math.abs(timeUnit.toMillis(jLongValue) - timeUnit.toMillis(j)) / 3600000 >= 2) {
                    }
                    if (u890.j(str16, str)) {
                        qro1.t(arrayList5, z4, p811Var2, p811Var, new y1j0(str16));
                    }
                    tomVarA = tom.a(tomVar, (w4i1) null, (upl) null, (rom) null, (List) null, (List) null, (nom) null, setP1.contains(str16), 3071);
                    ArrayList arrayListK = goeVar2.k();
                    boolean z17 = ctfVar instanceof atf;
                    str3 = tomVarA.a;
                    nomVar = tomVarA.t;
                    romVar = tomVarA.g;
                    volVar = tomVarA.f;
                    String str17 = str;
                    if (volVar instanceof vol) {
                        if (z4) {
                            strL = volVar.a;
                            if (tomVarA.g()) {
                                jzr0VarE = xq2.e(strL);
                            } else {
                                jzr0VarE = null;
                            }
                            if (jzr0VarE != null) {
                                if (tomVarA.g()) {
                                    strL = b0o1.l(xq2.a(strL));
                                }
                                set = setP1;
                                k1j0Var = new v1j0(strL, tomVarA.a, tomVarA.b, tomVarA.c, tomVarA.d, qro1.r(romVar), qro1.s(nomVar), tomVarA.h, tomVarA.X, tomVarA.g(), tomVarA.i);
                                z0j0Var = k1j0Var;
                            } else if (jzr0VarE.a == fr2.PERMISSION_REQUEST) {
                                hv2 hv2Var = ((yq2) jzr0VarE.b).a;
                                String str18 = hv2Var.b;
                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                bms0Var = (bms0) linkedHashMap3.get(str18);
                                String str19 = tomVarA.a;
                                String str20 = tomVarA.b;
                                String str21 = hv2Var.c;
                                String str22 = hv2Var.d;
                                List list6 = hv2Var.e;
                                boolean z18 = hv2Var.a;
                                if (bms0Var != null) {
                                    boolValueOf = Boolean.valueOf(bms0Var.b);
                                } else {
                                    boolValueOf = null;
                                }
                                if (bms0Var != null) {
                                    str6 = bms0Var.c;
                                } else {
                                    str6 = null;
                                }
                                a2j0VarM = new y0j0(str19, str20, str18, str21, str22, list6, z18 ? 1 : 0, boolValueOf, str6);
                                set = setP1;
                                linkedHashMap2 = linkedHashMap3;
                            } else {
                                z0j0Var = new x0j0(str3, Collections.singletonList(jzr0VarE), false);
                                set = setP1;
                            }
                        } else {
                            set = setP1;
                            a2j0VarM = qro1.w(tomVarA);
                        }
                        z0j0Var = a2j0VarM;
                    } else {
                        set = setP1;
                        if (volVar instanceof lpl) {
                            lplVar = (lpl) volVar;
                            bplVar = lplVar.d;
                            if (bplVar instanceof bpl) {
                                bpl bplVar2 = bplVar;
                                u1j0Var = new c1j0(lplVar.a, bplVar2.a, bplVar2.b, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                            } else {
                                if (bplVar instanceof hpl) {
                                    String str23 = tomVarA.b;
                                    String str24 = lplVar.a;
                                    hpl hplVar = (hpl) bplVar;
                                    str5 = hplVar.c;
                                    String str25 = hplVar.a;
                                    String str26 = hplVar.b;
                                    String str27 = hplVar.d;
                                    length2 = str5.length();
                                    strI2 = hplVar.b;
                                    if (length2 > 0) {
                                        strI2 = xcg1.i(strI2, "?uid=", str5);
                                    }
                                    k1j0Var = new l1j0(str24, str25, str26, str27, strI2, tomVarA, str3, str23, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                                } else if (bplVar instanceof jpl) {
                                    String str28 = tomVarA.b;
                                    String str29 = lplVar.a;
                                    jpl jplVar = (jpl) bplVar;
                                    str4 = jplVar.b;
                                    String str30 = jplVar.a;
                                    String str31 = jplVar.c;
                                    length = str4.length();
                                    strI = jplVar.a;
                                    if (length > 0) {
                                        strI = xcg1.i(strI, "?uid=", str4);
                                    }
                                    k1j0Var = new n1j0(str29, str30, str31, strI, tomVarA, str3, str28, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                                } else if (bplVar instanceof ipl) {
                                    k1j0Var = new m1j0(lplVar.a, ((ipl) bplVar).a, tomVarA, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                                } else if ((bplVar instanceof gpl) || !z13) {
                                    z0j0Var = a2j0VarM;
                                } else {
                                    k1j0Var = new k1j0(lplVar.a, ((gpl) bplVar).a, arrayListK, z17, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                                }
                                z0j0Var = k1j0Var;
                            }
                        } else if (volVar instanceof uol) {
                            z0j0Var = new z0j0(str3, tomVarA.c, ((uol) volVar).a);
                        } else if (volVar instanceof apl) {
                            u1j0Var = new o1j0((apl) volVar, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X, tomVarA.i);
                        } else {
                            if (volVar instanceof npl) {
                                eg.o();
                                return null;
                            }
                            npl nplVar = (npl) volVar;
                            u1j0Var = new u1j0(nplVar.a, nplVar.b, nplVar.c, nplVar.d, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                        }
                        z0j0Var = u1j0Var;
                    }
                    qro1.t(arrayList5, z4, p811Var2, p811Var, z0j0Var);
                    str9 = str9;
                    if (u890.j(str16, str9)) {
                        qro1.t(arrayList5, z4, p811Var2, p811Var, new z1j0(str16));
                    }
                    context = context;
                    i5 = i6;
                    str = str17;
                    setP1 = set;
                    goeVar2 = goeVar2;
                    arrayList4 = arrayList6;
                    linkedHashMap = linkedHashMap2;
                }
                String strA = lteVar.a(j);
                String str32 = str16 + "_" + j;
                if (!ihc1.y0(str14)) {
                    qro1.t(arrayList5, z4, p811Var2, p811Var, new a1j0(str15, str14));
                }
                str15 = str32;
                str14 = strA;
                if (u890.j(str16, str)) {
                    qro1.t(arrayList5, z4, p811Var2, p811Var, new y1j0(str16));
                }
                tomVarA = tom.a(tomVar, (w4i1) null, (upl) null, (rom) null, (List) null, (List) null, (nom) null, setP1.contains(str16), 3071);
                ArrayList arrayListK2 = goeVar2.k();
                boolean z19 = ctfVar instanceof atf;
                str3 = tomVarA.a;
                nomVar = tomVarA.t;
                romVar = tomVarA.g;
                volVar = tomVarA.f;
                String str110 = str;
                if (volVar instanceof vol) {
                    if (z4) {
                        strL = volVar.a;
                        if (tomVarA.g()) {
                            jzr0VarE = xq2.e(strL);
                        } else {
                            jzr0VarE = null;
                        }
                        if (jzr0VarE != null) {
                            if (tomVarA.g()) {
                                strL = b0o1.l(xq2.a(strL));
                            }
                            set = setP1;
                            k1j0Var = new v1j0(strL, tomVarA.a, tomVarA.b, tomVarA.c, tomVarA.d, qro1.r(romVar), qro1.s(nomVar), tomVarA.h, tomVarA.X, tomVarA.g(), tomVarA.i);
                            z0j0Var = k1j0Var;
                        } else if (jzr0VarE.a == fr2.PERMISSION_REQUEST) {
                            hv2 hv2Var2 = ((yq2) jzr0VarE.b).a;
                            String str111 = hv2Var2.b;
                            LinkedHashMap linkedHashMap4 = linkedHashMap2;
                            bms0Var = (bms0) linkedHashMap4.get(str111);
                            String str112 = tomVarA.a;
                            String str210 = tomVarA.b;
                            String str211 = hv2Var2.c;
                            String str212 = hv2Var2.d;
                            List list7 = hv2Var2.e;
                            boolean z110 = hv2Var2.a;
                            if (bms0Var != null) {
                                boolValueOf = Boolean.valueOf(bms0Var.b);
                            } else {
                                boolValueOf = null;
                            }
                            if (bms0Var != null) {
                                str6 = bms0Var.c;
                            } else {
                                str6 = null;
                            }
                            a2j0VarM = new y0j0(str112, str210, str111, str211, str212, list7, z110 ? 1 : 0, boolValueOf, str6);
                            set = setP1;
                            linkedHashMap2 = linkedHashMap4;
                        } else {
                            z0j0Var = new x0j0(str3, Collections.singletonList(jzr0VarE), false);
                            set = setP1;
                        }
                    } else {
                        set = setP1;
                        a2j0VarM = qro1.w(tomVarA);
                    }
                    z0j0Var = a2j0VarM;
                } else {
                    set = setP1;
                    if (volVar instanceof lpl) {
                        lplVar = (lpl) volVar;
                        bplVar = lplVar.d;
                        if (bplVar instanceof bpl) {
                            bpl bplVar3 = bplVar;
                            u1j0Var = new c1j0(lplVar.a, bplVar3.a, bplVar3.b, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                        } else {
                            if (bplVar instanceof hpl) {
                                String str213 = tomVarA.b;
                                String str214 = lplVar.a;
                                hpl hplVar2 = (hpl) bplVar;
                                str5 = hplVar2.c;
                                String str215 = hplVar2.a;
                                String str216 = hplVar2.b;
                                String str217 = hplVar2.d;
                                length2 = str5.length();
                                strI2 = hplVar2.b;
                                if (length2 > 0) {
                                    strI2 = xcg1.i(strI2, "?uid=", str5);
                                }
                                k1j0Var = new l1j0(str214, str215, str216, str217, strI2, tomVarA, str3, str213, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                            } else if (bplVar instanceof jpl) {
                                String str218 = tomVarA.b;
                                String str219 = lplVar.a;
                                jpl jplVar2 = (jpl) bplVar;
                                str4 = jplVar2.b;
                                String str33 = jplVar2.a;
                                String str34 = jplVar2.c;
                                length = str4.length();
                                strI = jplVar2.a;
                                if (length > 0) {
                                    strI = xcg1.i(strI, "?uid=", str4);
                                }
                                k1j0Var = new n1j0(str219, str33, str34, strI, tomVarA, str3, str218, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                            } else if (bplVar instanceof ipl) {
                                k1j0Var = new m1j0(lplVar.a, ((ipl) bplVar).a, tomVarA, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                            } else {
                                a2j0VarM = bplVar instanceof gpl ? qro1.m(tomVarA) : qro1.m(tomVarA);
                                z0j0Var = a2j0VarM;
                            }
                            z0j0Var = k1j0Var;
                        }
                    } else if (volVar instanceof uol) {
                        z0j0Var = new z0j0(str3, tomVarA.c, ((uol) volVar).a);
                    } else if (volVar instanceof apl) {
                        u1j0Var = new o1j0((apl) volVar, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X, tomVarA.i);
                    } else {
                        if (volVar instanceof npl) {
                            eg.o();
                            return null;
                        }
                        npl nplVar2 = (npl) volVar;
                        u1j0Var = new u1j0(nplVar2.a, nplVar2.b, nplVar2.c, nplVar2.d, str3, tomVarA.b, tomVarA.c, tomVarA.d, qro1.s(nomVar), tomVarA.h, qro1.r(romVar), tomVarA.X);
                    }
                    z0j0Var = u1j0Var;
                }
                qro1.t(arrayList5, z4, p811Var2, p811Var, z0j0Var);
                str9 = str9;
                if (u890.j(str16, str9)) {
                    qro1.t(arrayList5, z4, p811Var2, p811Var, new z1j0(str16));
                }
                context = context;
                i5 = i6;
                str = str110;
                setP1 = set;
                goeVar2 = goeVar2;
                arrayList4 = arrayList6;
                linkedHashMap = linkedHashMap2;
            }
            goe goeVar3 = goeVar2;
            Context context2 = context;
            qro1.u(arrayList5, p811Var, p811Var2, false);
            if (!ihc1.y0(str14)) {
                arrayList5.add(new a1j0(str15, str14));
            }
            if (z4 && z10) {
                arrayList5.add(0, x1j0.a);
            }
            if (z12) {
                arrayList5.add(0, b1j0.a);
            }
            List listL1 = o7h.l1(arrayList5);
            if (z4) {
                goeVar = goeVar3;
                String str35 = goeVar.a;
                tom tomVarN = qro1.n(list4);
                if (tomVarN == null) {
                    i4 = 0;
                } else {
                    if (!tomVarN.g()) {
                        tomVarN = null;
                    }
                    if (tomVarN != null) {
                        jom jomVar = tomVarN.t;
                        jom jomVar2 = jomVar instanceof jom ? jomVar : null;
                        if (jomVar2 != null) {
                            i4 = jomVar2.a;
                        } else {
                            i4 = 0;
                        }
                    } else {
                        i4 = 0;
                    }
                }
                String string = z9 ? context2.getString(2131953340) : (i4 == 2 || i4 == 3) ? context2.getString(2131953339) : null;
                if (string == null) {
                    v1j0Var = null;
                } else {
                    Iterator it9 = list.iterator();
                    do {
                        if (!it9.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it9.next();
                    } while (!((tom) next3).g());
                    tom tomVar5 = (tom) next3;
                    if (tomVar5 == null || (w4i1Var2 = tomVar5.c) == null) {
                        w4i1Var2 = w4i1.f;
                    }
                    w4i1 w4i1Var3 = w4i1Var2;
                    tom tomVarN2 = qro1.n(list4);
                    tom tomVar6 = (tomVarN2 == null || !tomVarN2.g()) ? null : tomVarN2;
                    if (tomVar6 != null) {
                        v1j0 v1j0VarW = qro1.w(tom.a(tomVar6, (w4i1) null, new vol(string, (String) null), (rom) null, (List) null, (List) null, kom.a, false, 3551));
                        v1j0Var = new v1j0(v1j0VarW.a, v1j0VarW.b, v1j0VarW.c, v1j0VarW.d, v1j0VarW.e, v1j0VarW.f, v1j0VarW.g, v1j0VarW.h, v1j0VarW.i, true, v1j0VarW.k);
                    } else {
                        tom tomVar7 = (tom) o7h.s0(list4);
                        v1j0Var = new v1j0(string, "pairing-needed-initial", str35, w4i1Var3, tomVar7 != null ? tomVar7.d : 0L, (t1j0) s1j0.a, (j1j0) g1j0.a, (List) z6x.a, false, (List) null, 1024);
                    }
                }
                if (v1j0Var != null) {
                    listL1 = o7h.N0(listL1, Collections.singletonList(v1j0Var));
                }
            } else {
                goeVar = goeVar3;
            }
            List list8 = listL1;
            ctf ctfVar2 = goeVar.b;
            boolean z20 = (!z || list4.isEmpty() || z8) ? false : true;
            List list9 = list3;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj7 : list9) {
                String str36 = str13;
                if (!u890.j(((jwm) obj7).a.a, str36)) {
                    arrayList7.add(obj7);
                }
                str13 = str36;
            }
            String str37 = str13;
            Iterator it10 = list9.iterator();
            do {
                if (!it10.hasNext()) {
                    next = null;
                    break;
                }
                next = it10.next();
            } while (!u890.j(((jwm) next).a.a, str37));
            jwm jwmVar2 = (jwm) next;
            if (jwmVar2 == null) {
                jwmVar2 = new jwm(14, w4i1.f);
                n57.s("Chat does not contain current user: " + wwo1.z(list3.size(), str37) + " (type=" + ctfVar + ")");
            }
            b2j0 b2j0Var2 = new b2j0(list8, ctfVar2, z20, zB, z7, jwmVar2, arrayList7, map3);
            x340 x340Var5 = x340Var4;
            x340Var5.r(false);
            ncf ncfVar4 = ncfVar3;
            t7q0 t7q0Var2 = ncfVar4.S0;
            boolean z21 = ncfVar4.d;
            w4i1 w4i1Var4 = ncfVar4.b;
            acf acfVar = ncfVar4.e;
            mcf mcfVar2 = ncfVar4.g;
            List list10 = goeVar.e;
            f8j0 f8j0Var = goeVar.Y;
            btf btfVar = goeVar.b;
            zks0 zks0Var = goeVar.c;
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            Iterator it11 = list10.iterator();
            while (it11.hasNext()) {
                Object next6 = it11.next();
                Iterator it12 = it11;
                x340 x340Var6 = x340Var5;
                if (u890.j(((jwm) next6).a.a, w4i1Var4.a)) {
                    arrayList9.add(next6);
                } else {
                    arrayList8.add(next6);
                }
                it11 = it12;
                x340Var5 = x340Var6;
            }
            x340 x340Var7 = x340Var5;
            jwm jwmVar3 = (jwm) o7h.q0(arrayList9);
            boolean z22 = mcfVar2 instanceof icf;
            xks0 xks0Var3 = xks0.g;
            xks0 xks0Var4 = xks0.f;
            atf atfVar = atf.a;
            lcf lcfVar = lcf.a;
            if (z22) {
                sefVar = new hef(z21);
                arrayList = arrayList8;
            } else {
                arrayList = arrayList8;
                if (mcfVar2 instanceof hcf) {
                    hcf hcfVar = (hcf) mcfVar2;
                    gefVar = new gef(hcfVar.a.getRequestId(), hcfVar.b);
                } else if (u890.j(mcfVar2, lcfVar)) {
                    gefVar = tef.b;
                } else {
                    if (mcfVar2 instanceof jcf) {
                        gefVar = ief.b;
                    } else {
                        if (!u890.j(mcfVar2, kcf.a)) {
                            eg.o();
                            return null;
                        }
                        lcfVar = lcfVar;
                        boolean z23 = ncfVar4.h;
                        nlv nlvVar = ncfVar4.f;
                        boolean zJ = u890.j(btfVar, atfVar);
                        pef pefVar2 = pef.b;
                        if (zJ) {
                            mcfVar2 = mcfVar2;
                            ncfVar4 = ncfVar4;
                            if (u890.j(f8j0Var, new d8j0(2))) {
                                b2j0Var2 = b2j0Var2;
                                oefVar = pefVar2;
                            }
                            sefVar = new sef(oefVar);
                        } else {
                            ncfVar4 = ncfVar4;
                            mcfVar2 = mcfVar2;
                        }
                        boolean zJ2 = u890.j(btfVar, atfVar);
                        pef pefVar3 = qef.b;
                        if (zJ2) {
                            pefVar = pefVar3;
                            if (u890.j(f8j0Var, new d8j0(3))) {
                                b2j0Var2 = b2j0Var2;
                            }
                            oefVar = pefVar;
                            sefVar = new sef(oefVar);
                        } else {
                            pefVar = pefVar3;
                        }
                        if (u890.j(btfVar, atfVar) && u890.j(f8j0Var, new d8j0(6))) {
                            pefVar2 = kef.b;
                            b2j0Var2 = b2j0Var2;
                            oefVar = pefVar2;
                        } else {
                            if (u890.j(f8j0Var, new d8j0(4))) {
                                oefVar = new ref(btfVar, true, z21);
                            } else {
                                boolean zJ3 = u890.j(f8j0Var, new d8j0(5));
                                xks0 xks0Var5 = xks0.b;
                                pef pefVar4 = lef.b;
                                pef pefVar5 = nef.b;
                                if (!zJ3) {
                                    b2j0Var2 = b2j0Var2;
                                    boolean zJ4 = u890.j(f8j0Var, new d8j0(8));
                                    pef pefVar6 = mef.b;
                                    if (zJ4) {
                                        oefVar = pefVar6;
                                    } else if (!u890.j(btfVar, atfVar) || acfVar.a.isEmpty()) {
                                        if (u890.j(btfVar, atfVar) && !arrayList.isEmpty()) {
                                            Iterator it13 = arrayList.iterator();
                                            while (true) {
                                                if (it13.hasNext()) {
                                                    Iterator it14 = it13;
                                                    if (u890.j(((jwm) it13.next()).c, ewm.a)) {
                                                        oefVar = pefVar;
                                                    } else {
                                                        it13 = it14;
                                                    }
                                                }
                                            }
                                        }
                                        if (goeVar.l()) {
                                            btf btfVar2 = btfVar instanceof btf ? btfVar : null;
                                            if ((btfVar2 == null || (list2 = btfVar2.b) == null) ? false : !list2.isEmpty()) {
                                                oefVar = new ref(btfVar, bpo1.w(goeVar, w4i1Var4.a), z21);
                                            } else {
                                                zA = zks0Var.a();
                                                xks0Var = zks0Var.b;
                                                if (!zA) {
                                                    oefVar2 = new oef(z21, nlvVar);
                                                } else {
                                                    if (xks0Var != xks0Var5) {
                                                    }
                                                    if (zks0Var.h()) {
                                                        oefVar = new ref(btfVar, bpo1.w(goeVar, w4i1Var4.a), z21);
                                                    } else if (zks0Var.g()) {
                                                        iC = l1d.C(zks0Var.a);
                                                        if (iC == 0) {
                                                            oefVar = pefVar5;
                                                        } else {
                                                            oefVar = pefVar5;
                                                        }
                                                    } else if (xks0Var == xks0Var4) {
                                                        oefVar = pefVar5;
                                                    } else if (xks0Var == xks0Var3) {
                                                        oefVar = jef.b;
                                                    } else {
                                                        oefVar = new oef(z21, nlvVar);
                                                    }
                                                }
                                                oefVar = oefVar2;
                                            }
                                        } else {
                                            zA = zks0Var.a();
                                            xks0Var = zks0Var.b;
                                            if (!zA || z23) {
                                                oefVar2 = new oef(z21, nlvVar);
                                            } else if (xks0Var != xks0Var5 && ((t7q0Var2 instanceof f7q0) || (t7q0Var2 instanceof h7q0))) {
                                                oefVar2 = new oef(z21, nlvVar);
                                            } else if (zks0Var.h()) {
                                                oefVar = new ref(btfVar, bpo1.w(goeVar, w4i1Var4.a), z21);
                                            } else if (zks0Var.g()) {
                                                iC = l1d.C(zks0Var.a);
                                                if (iC == 0 && iC != 1) {
                                                    if (iC != 2) {
                                                        if (iC == 3) {
                                                            oefVar = pefVar4;
                                                        } else if (iC != 4) {
                                                            eg.o();
                                                            return null;
                                                        }
                                                    } else if (u890.j(w4i1Var4.a, zks0Var.c)) {
                                                        oefVar = pefVar6;
                                                    }
                                                }
                                                oefVar = pefVar5;
                                            } else if (xks0Var == xks0Var4) {
                                                oefVar = pefVar5;
                                            } else if (xks0Var == xks0Var3) {
                                                oefVar = jef.b;
                                            } else {
                                                oefVar = new oef(z21, nlvVar);
                                            }
                                            oefVar = oefVar2;
                                        }
                                    } else {
                                        oefVar = pefVar2;
                                    }
                                } else if (z23 || (zks0Var.b == xks0Var5 && ((t7q0Var2 instanceof f7q0) || (t7q0Var2 instanceof h7q0)))) {
                                    oefVar = new oef(z21, nlvVar);
                                } else if (zks0Var.a == 4) {
                                    b2j0Var2 = b2j0Var2;
                                    oefVar = pefVar4;
                                } else {
                                    b2j0Var2 = b2j0Var2;
                                    oefVar = pefVar5;
                                }
                            }
                            b2j0Var2 = b2j0Var2;
                        }
                        sefVar = new sef(oefVar);
                    }
                    String str38 = goeVar.a;
                    ctf ctfVar3 = goeVar.b;
                    if (zks0Var.g()) {
                        b2j0Var = b2j0Var2;
                        i = 1;
                        size = b2j0Var.a.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        numValueOf = Integer.valueOf(size);
                    } else {
                        b2j0Var = b2j0Var2;
                        i = 1;
                        numValueOf = null;
                    }
                    ncf ncfVar5 = ncfVar4;
                    boolean z24 = ncfVar5.Z;
                    if (!(t7q0Var2 instanceof f7q0) || (t7q0Var2 instanceof h7q0)) {
                        t7q0Var = t7q0Var2;
                    } else {
                        t7q0Var = null;
                    }
                    boolean z25 = ncfVar5.Y0;
                    if (acfVar.c.isEmpty()) {
                        fefVar = def.a;
                    } else {
                        if (acfVar.b) {
                            fefVar = cef.a;
                        } else {
                            eefVar = new eef(acfVar.c);
                        }
                        if (z3) {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                next2 = it.next();
                                if (sqe.v(((jwm) next2).a)) {
                                    obj4 = next2;
                                    break;
                                }
                            }
                            jwmVar = (jwm) obj4;
                            if (jwmVar != null) {
                                w4i1Var = jwmVar.a;
                            } else {
                                w4i1Var = null;
                            }
                        } else {
                            w4i1Var = null;
                        }
                        uu2 uu2Var = ncfVar5.f1;
                        h5f h5fVar = ncfVar5.h1;
                        List list11 = ncfVar5.i1;
                        zks0 zks0Var2 = goeVar.c;
                        mcfVar = mcfVar2;
                        if (!u890.j(mcfVar, lcfVar) || u890.j(mcfVar, jcf.a)) {
                            i2 = i;
                        } else if (u890.j(btfVar, atfVar) || (xks0Var2 = zks0Var.b) == xks0.d || xks0Var2 == xks0.e || xks0Var2 == xks0Var4 || xks0Var2 == xks0Var3) {
                            i2 = 2;
                        } else {
                            if (zks0Var.g()) {
                                i3 = 3;
                                if (zks0Var.a == 3 && u890.j(zks0Var.c, w4i1Var4.a)) {
                                    i2 = 2;
                                }
                            } else {
                                i3 = 3;
                            }
                            if (zks0Var.g()) {
                                i2 = i3;
                            } else {
                                i2 = 2;
                            }
                        }
                        uef uefVar = new uef(sefVar, str38, ctfVar3, numValueOf, z24, jwmVar3, b2j0Var, arrayList, t7q0Var, w4i1Var, eefVar, z25, uu2Var, h5fVar, list11, zks0Var2, i2, goeVar.X);
                        uff uffVar4 = uffVar;
                        d0r d0rVar = uffVar4.c;
                        String str39 = this.c.b;
                        quc0 quc0Var = uffVar4.h;
                        if (z15 && ((Boolean) this.d.getValue()).booleanValue()) {
                            z2 = i;
                        } else {
                            z2 = 0;
                        }
                        i2j0 i2j0Var = uffVar4.s;
                        bqm bqmVar = uffVar4.C;
                        gv2 gv2Var = uffVar4.H;
                        idd1 idd1Var = uffVar4.p0;
                        ynb0 ynb0Var = uffVar4.b0;
                        res resVar = uffVar4.f0;
                        rwj rwjVar = uffVar4.g0;
                        boolean z26 = uffVar4.m0;
                        boolean z27 = !z26;
                        ven0Var = this.e;
                        boolean zG2 = x340Var7.g(ven0Var);
                        iu30Var = this.f;
                        zG = zG2 | x340Var7.g(iu30Var);
                        objT = x340Var7.T();
                        if (zG || objT == fkj0.X) {
                            obj3 = objT;
                            gp0 gp0Var = new gp0(iu30Var, ven0Var, (byte) 4);
                            x340Var7.s0(gp0Var);
                            obj3 = gp0Var;
                        }
                        obj3 = objT;
                        zso1.f(uefVar, (iu30) obj3, d0rVar, str39, quc0Var, this.g, z2, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, i2j0Var, this.R0, this.S0, this.T0, this.U0, bqmVar, this.V0, this.W0, gv2Var, this.X0, this.Y0, this.Z0, this.a1, this.b1, this.c1, idd1Var, ynb0Var, resVar, rwjVar, null, z27, z27, z27, z27, z27, z26, z27, z27, z27, z27, z27, z27, z27, z27, z27, x340Var7, 0);
                    }
                    eefVar = fefVar;
                    if (z3) {
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            next2 = it.next();
                            if (sqe.v(((jwm) next2).a)) {
                                obj4 = next2;
                                break;
                            }
                        }
                        jwmVar = (jwm) obj4;
                        if (jwmVar != null) {
                            w4i1Var = jwmVar.a;
                        } else {
                            w4i1Var = null;
                        }
                    } else {
                        w4i1Var = null;
                    }
                    uu2 uu2Var2 = ncfVar5.f1;
                    h5f h5fVar2 = ncfVar5.h1;
                    List list12 = ncfVar5.i1;
                    zks0 zks0Var3 = goeVar.c;
                    mcfVar = mcfVar2;
                    if (u890.j(mcfVar, lcfVar)) {
                        i2 = i;
                    } else {
                        i2 = i;
                    }
                    uef uefVar2 = new uef(sefVar, str38, ctfVar3, numValueOf, z24, jwmVar3, b2j0Var, arrayList, t7q0Var, w4i1Var, eefVar, z25, uu2Var2, h5fVar2, list12, zks0Var3, i2, goeVar.X);
                    uff uffVar5 = uffVar;
                    d0r d0rVar2 = uffVar5.c;
                    String str310 = this.c.b;
                    quc0 quc0Var2 = uffVar5.h;
                    if (z15) {
                        z2 = 0;
                    } else {
                        z2 = 0;
                    }
                    i2j0 i2j0Var2 = uffVar5.s;
                    bqm bqmVar2 = uffVar5.C;
                    gv2 gv2Var2 = uffVar5.H;
                    idd1 idd1Var2 = uffVar5.p0;
                    ynb0 ynb0Var2 = uffVar5.b0;
                    res resVar2 = uffVar5.f0;
                    rwj rwjVar2 = uffVar5.g0;
                    boolean z28 = uffVar5.m0;
                    boolean z29 = !z28;
                    ven0Var = this.e;
                    boolean zG3 = x340Var7.g(ven0Var);
                    iu30Var = this.f;
                    zG = zG3 | x340Var7.g(iu30Var);
                    objT = x340Var7.T();
                    if (zG) {
                        obj3 = objT;
                        gp0 gp0Var2 = new gp0(iu30Var, ven0Var, (byte) 4);
                        x340Var7.s0(gp0Var2);
                        obj3 = gp0Var2;
                    } else {
                        obj3 = objT;
                        gp0 gp0Var3 = new gp0(iu30Var, ven0Var, (byte) 4);
                        x340Var7.s0(gp0Var3);
                        obj3 = gp0Var3;
                    }
                    obj3 = objT;
                    zso1.f(uefVar2, (iu30) obj3, d0rVar2, str310, quc0Var2, this.g, z2, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, i2j0Var2, this.R0, this.S0, this.T0, this.U0, bqmVar2, this.V0, this.W0, gv2Var2, this.X0, this.Y0, this.Z0, this.a1, this.b1, this.c1, idd1Var2, ynb0Var2, resVar2, rwjVar2, null, z29, z29, z29, z29, z29, z28, z29, z29, z29, z29, z29, z29, z29, z29, z29, x340Var7, 0);
                }
                sefVar = gefVar;
            }
            String str311 = goeVar.a;
            ctf ctfVar4 = goeVar.b;
            if (zks0Var.g()) {
                b2j0Var = b2j0Var2;
                i = 1;
                size = b2j0Var.a.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                numValueOf = Integer.valueOf(size);
            } else {
                b2j0Var = b2j0Var2;
                i = 1;
                numValueOf = null;
            }
            ncf ncfVar6 = ncfVar4;
            boolean z210 = ncfVar6.Z;
            if (t7q0Var2 instanceof f7q0) {
                t7q0Var = t7q0Var2;
            } else {
                t7q0Var = t7q0Var2;
            }
            boolean z211 = ncfVar6.Y0;
            if (acfVar.c.isEmpty()) {
                if (acfVar.b) {
                    fefVar = cef.a;
                } else {
                    eefVar = new eef(acfVar.c);
                }
                if (z3) {
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        next2 = it.next();
                        if (sqe.v(((jwm) next2).a)) {
                            obj4 = next2;
                            break;
                        }
                    }
                    jwmVar = (jwm) obj4;
                    if (jwmVar != null) {
                        w4i1Var = jwmVar.a;
                    } else {
                        w4i1Var = null;
                    }
                } else {
                    w4i1Var = null;
                }
                uu2 uu2Var3 = ncfVar6.f1;
                h5f h5fVar3 = ncfVar6.h1;
                List list13 = ncfVar6.i1;
                zks0 zks0Var4 = goeVar.c;
                mcfVar = mcfVar2;
                if (u890.j(mcfVar, lcfVar)) {
                    i2 = i;
                } else {
                    i2 = i;
                }
                uef uefVar3 = new uef(sefVar, str311, ctfVar4, numValueOf, z210, jwmVar3, b2j0Var, arrayList, t7q0Var, w4i1Var, eefVar, z211, uu2Var3, h5fVar3, list13, zks0Var4, i2, goeVar.X);
                uff uffVar6 = uffVar;
                d0r d0rVar3 = uffVar6.c;
                String str312 = this.c.b;
                quc0 quc0Var3 = uffVar6.h;
                if (z15) {
                    z2 = 0;
                } else {
                    z2 = 0;
                }
                i2j0 i2j0Var3 = uffVar6.s;
                bqm bqmVar3 = uffVar6.C;
                gv2 gv2Var3 = uffVar6.H;
                idd1 idd1Var3 = uffVar6.p0;
                ynb0 ynb0Var3 = uffVar6.b0;
                res resVar3 = uffVar6.f0;
                rwj rwjVar3 = uffVar6.g0;
                boolean z212 = uffVar6.m0;
                boolean z213 = !z212;
                ven0Var = this.e;
                boolean zG4 = x340Var7.g(ven0Var);
                iu30Var = this.f;
                zG = zG4 | x340Var7.g(iu30Var);
                objT = x340Var7.T();
                if (zG) {
                    obj3 = objT;
                    gp0 gp0Var4 = new gp0(iu30Var, ven0Var, (byte) 4);
                    x340Var7.s0(gp0Var4);
                    obj3 = gp0Var4;
                } else {
                    obj3 = objT;
                    gp0 gp0Var5 = new gp0(iu30Var, ven0Var, (byte) 4);
                    x340Var7.s0(gp0Var5);
                    obj3 = gp0Var5;
                }
                obj3 = objT;
                zso1.f(uefVar3, (iu30) obj3, d0rVar3, str312, quc0Var3, this.g, z2, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, i2j0Var3, this.R0, this.S0, this.T0, this.U0, bqmVar3, this.V0, this.W0, gv2Var3, this.X0, this.Y0, this.Z0, this.a1, this.b1, this.c1, idd1Var3, ynb0Var3, resVar3, rwjVar3, null, z213, z213, z213, z213, z213, z212, z213, z213, z213, z213, z213, z213, z213, z213, z213, x340Var7, 0);
            } else {
                fefVar = def.a;
            }
            eefVar = fefVar;
            if (z3) {
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    next2 = it.next();
                    if (sqe.v(((jwm) next2).a)) {
                        obj4 = next2;
                        break;
                    }
                }
                jwmVar = (jwm) obj4;
                if (jwmVar != null) {
                    w4i1Var = jwmVar.a;
                } else {
                    w4i1Var = null;
                }
            } else {
                w4i1Var = null;
            }
            uu2 uu2Var4 = ncfVar6.f1;
            h5f h5fVar4 = ncfVar6.h1;
            List list14 = ncfVar6.i1;
            zks0 zks0Var5 = goeVar.c;
            mcfVar = mcfVar2;
            if (u890.j(mcfVar, lcfVar)) {
                i2 = i;
            } else {
                i2 = i;
            }
            uef uefVar4 = new uef(sefVar, str311, ctfVar4, numValueOf, z210, jwmVar3, b2j0Var, arrayList, t7q0Var, w4i1Var, eefVar, z211, uu2Var4, h5fVar4, list14, zks0Var5, i2, goeVar.X);
            uff uffVar7 = uffVar;
            d0r d0rVar4 = uffVar7.c;
            String str313 = this.c.b;
            quc0 quc0Var4 = uffVar7.h;
            if (z15) {
                z2 = 0;
            } else {
                z2 = 0;
            }
            i2j0 i2j0Var4 = uffVar7.s;
            bqm bqmVar4 = uffVar7.C;
            gv2 gv2Var4 = uffVar7.H;
            idd1 idd1Var4 = uffVar7.p0;
            ynb0 ynb0Var4 = uffVar7.b0;
            res resVar4 = uffVar7.f0;
            rwj rwjVar4 = uffVar7.g0;
            boolean z214 = uffVar7.m0;
            boolean z215 = !z214;
            ven0Var = this.e;
            boolean zG5 = x340Var7.g(ven0Var);
            iu30Var = this.f;
            zG = zG5 | x340Var7.g(iu30Var);
            objT = x340Var7.T();
            if (zG) {
                obj3 = objT;
                gp0 gp0Var6 = new gp0(iu30Var, ven0Var, (byte) 4);
                x340Var7.s0(gp0Var6);
                obj3 = gp0Var6;
            } else {
                obj3 = objT;
                gp0 gp0Var7 = new gp0(iu30Var, ven0Var, (byte) 4);
                x340Var7.s0(gp0Var7);
                obj3 = gp0Var7;
            }
            obj3 = objT;
            zso1.f(uefVar4, (iu30) obj3, d0rVar4, str313, quc0Var4, this.g, z2, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, i2j0Var4, this.R0, this.S0, this.T0, this.U0, bqmVar4, this.V0, this.W0, gv2Var4, this.X0, this.Y0, this.Z0, this.a1, this.b1, this.c1, idd1Var4, ynb0Var4, resVar4, rwjVar4, null, z215, z215, z215, z215, z215, z214, z215, z215, z215, z215, z215, z215, z215, z215, z215, x340Var7, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
