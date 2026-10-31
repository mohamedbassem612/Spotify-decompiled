package p;

import androidx.constraintlayout.core.parser.CLParsingException;
import com.comscore.streaming.ContentMediaFormat;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class uhl {
    public final eic a;
    public int b;
    public int c;

    public uhl(eic eicVar) {
        new ArrayList();
        eic eicVarL = eicVar != null ? eicVar.L() : null;
        this.a = eicVarL == null ? new eic(new char[0]) : eicVarL;
        this.c = 1000;
    }

    public static shl g(uhl uhlVar, nnb0[] nnb0VarArr) throws CLParsingException {
        onb0 onb0Var = new onb0(Integer.valueOf(uhlVar.f()));
        yhc yhcVar = new yhc(new char[0]);
        for (nnb0 nnb0Var : nnb0VarArr) {
            yhcVar.n(gic.n(nnb0Var.a().toString()));
        }
        eic eicVarB = uhlVar.b(onb0Var);
        eicVarB.K("type", "barrier");
        eicVarB.K("direction", "top");
        eicVarB.J("margin", 0.0f);
        eicVarB.I("contains", yhcVar);
        uhlVar.i(12);
        for (nnb0 nnb0Var2 : nnb0VarArr) {
            uhlVar.i(nnb0Var2.hashCode());
        }
        uhlVar.i(Float.hashCode(0.0f));
        return new shl(((nnb0) onb0Var).a, 0, onb0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:192:0x035b  */
    /* JADX WARN: Code duplicated, block: B:194:0x035f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0373  */
    /* JADX WARN: Code duplicated, block: B:200:0x0377  */
    /* JADX WARN: Code duplicated, block: B:204:0x038b  */
    /* JADX WARN: Code duplicated, block: B:206:0x038f  */
    /* JADX WARN: Code duplicated, block: B:223:0x041e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0494  */
    /* JADX WARN: Code duplicated, block: B:253:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:265:0x051b  */
    /* JADX WARN: Code duplicated, block: B:293:0x0594  */
    /* JADX WARN: Code duplicated, block: B:310:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:339:0x0699  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:362:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:416:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:456:0x0830  */
    /* JADX WARN: Code duplicated, block: B:536:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:636:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:724:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:743:0x0e35  */
    /* JADX WARN: Code duplicated, block: B:7:0x0042  */
    /* JADX WARN: Code duplicated, block: B:817:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0195 A[PHI: r17
      0x0195: PHI (r17v21 java.util.Iterator) = 
      (r17v7 java.util.Iterator)
      (r17v8 java.util.Iterator)
      (r17v9 java.util.Iterator)
      (r17v10 java.util.Iterator)
      (r17v11 java.util.Iterator)
      (r17v12 java.util.Iterator)
      (r17v13 java.util.Iterator)
      (r17v14 java.util.Iterator)
      (r17v15 java.util.Iterator)
      (r17v16 java.util.Iterator)
      (r17v17 java.util.Iterator)
      (r17v18 java.util.Iterator)
      (r17v19 java.util.Iterator)
      (r17v22 java.util.Iterator)
     binds: [B:149:0x0249, B:145:0x023c, B:141:0x022f, B:137:0x0222, B:133:0x0215, B:129:0x0208, B:125:0x01fb, B:121:0x01ec, B:117:0x01de, B:113:0x01ce, B:109:0x01be, B:105:0x01b0, B:101:0x01a0, B:98:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(ynb1 ynb1Var) throws CLParsingException {
        eic eicVar;
        Iterator it;
        ril rilVar;
        eic eicVar2;
        String strE;
        eic eicVar3;
        String strE2;
        String str;
        String strC;
        byte b;
        ril rilVar2;
        Iterator it2;
        ril rilVar3;
        Iterator it3;
        int i;
        float fU;
        float fB;
        float f;
        float fB2;
        float fB3;
        float fU2;
        String strD;
        Iterator it4;
        byte b2;
        ril rilVar4;
        String str2;
        String strD2;
        String str3;
        String strB;
        Float fValueOf;
        Float f2;
        Float fValueOf2;
        String strD3;
        String str4;
        String strB2;
        int i2;
        int i3;
        int iW;
        int i4;
        Float fValueOf3;
        Float f3;
        Float fValueOf4;
        ril rilVar5;
        yhc yhcVar;
        float fU3;
        float fB4;
        float fB5;
        HashMap map;
        HashMap map2;
        HashMap map3;
        ril rilVar6 = new ril();
        rilVar6.a = new HashMap();
        rilVar6.b = new HashMap();
        rilVar6.c = new HashMap();
        eic eicVar4 = this.a;
        Iterator it5 = eicVar4.H().iterator();
        while (it5.hasNext()) {
            String str5 = (String) it5.next();
            aic aicVarS = eicVar4.s(str5);
            str5.getClass();
            switch (str5) {
                case "Helpers":
                    eicVar = eicVar4;
                    it = it5;
                    rilVar = rilVar6;
                    if (!(aicVarS instanceof yhc)) {
                        break;
                    } else {
                        yhc yhcVar2 = (yhc) aicVarS;
                        for (int i5 = 0; i5 < yhcVar2.e.size(); i5++) {
                            aic aicVarR = yhcVar2.r(i5);
                            if (aicVarR instanceof yhc) {
                                yhc yhcVar3 = (yhc) aicVarR;
                                if (yhcVar3.e.size() > 1) {
                                    switch (yhcVar3.B(0)) {
                                        case "vGuideline":
                                            aic aicVarR2 = yhcVar3.r(1);
                                            if (!(aicVarR2 instanceof eic) || (strE = (eicVar2 = (eic) aicVarR2).E("id")) == null) {
                                                break;
                                            } else {
                                                anm1.J(1, ynb1Var, strE, eicVar2);
                                                break;
                                            }
                                            break;
                                        case "hChain":
                                            anm1.F(0, ynb1Var, rilVar, yhcVar3);
                                            break;
                                        case "vChain":
                                            anm1.F(1, ynb1Var, rilVar, yhcVar3);
                                            break;
                                        case "hGuideline":
                                            aic aicVarR3 = yhcVar3.r(1);
                                            if ((aicVarR3 instanceof eic) && (strE2 = (eicVar3 = (eic) aicVarR3).E("id")) != null) {
                                                anm1.J(0, ynb1Var, strE2, eicVar3);
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    break;
                case "Generate":
                    eicVar = eicVar4;
                    it = it5;
                    rilVar = rilVar6;
                    if (!(aicVarS instanceof eic)) {
                        break;
                    } else {
                        eic eicVar5 = (eic) aicVarS;
                        for (String str6 : eicVar5.H()) {
                            aic aicVarS2 = eicVar5.s(str6);
                            HashMap map4 = rilVar.c;
                            ArrayList arrayList = map4.containsKey(str6) ? (ArrayList) map4.get(str6) : null;
                            if (arrayList != null && (aicVarS2 instanceof eic)) {
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    anm1.K(ynb1Var, rilVar, (String) it6.next(), (eic) aicVarS2);
                                }
                            }
                        }
                        break;
                    }
                    break;
                case "Variables":
                    eicVar = eicVar4;
                    it = it5;
                    rilVar = rilVar6;
                    if (!(aicVarS instanceof eic)) {
                        continue;
                        break;
                    } else {
                        eic eicVar6 = (eic) aicVarS;
                        for (String str7 : eicVar6.H()) {
                            aic aicVarS3 = eicVar6.s(str7);
                            if (aicVarS3 instanceof cic) {
                                rilVar.b(aicVarS3.i(), str7);
                            } else if (aicVarS3 instanceof eic) {
                                eic eicVar7 = (eic) aicVarS3;
                                if (eicVar7.G("from") && eicVar7.G("to")) {
                                    float fA = rilVar.a(eicVar7.s("from"));
                                    float fA2 = rilVar.a(eicVar7.s("to"));
                                    String strE3 = eicVar7.E("prefix");
                                    String strE4 = eicVar7.E("postfix");
                                    HashMap map5 = rilVar.b;
                                    if (map5.containsKey(str7)) {
                                        map5.get(str7);
                                    }
                                    oil oilVar = new oil();
                                    oilVar.a = false;
                                    oilVar.d = 0.0f;
                                    if (strE3 == null) {
                                        strE3 = "";
                                    }
                                    oilVar.b = strE3;
                                    if (strE4 == null) {
                                        strE4 = "";
                                    }
                                    oilVar.c = strE4;
                                    oilVar.e = fA2;
                                    map5.put(str7, oilVar);
                                    HashMap map6 = rilVar.c;
                                    ArrayList arrayList2 = new ArrayList();
                                    int i6 = (int) fA;
                                    int i7 = (int) fA2;
                                    int i8 = i6;
                                    while (i6 <= i7) {
                                        arrayList2.add(oilVar.b + i8 + oilVar.c);
                                        i8++;
                                        i6++;
                                    }
                                    map6.put(str7, arrayList2);
                                } else if (eicVar7.G("from") && eicVar7.G("step")) {
                                    float fA3 = rilVar.a(eicVar7.s("from"));
                                    float fA4 = rilVar.a(eicVar7.s("step"));
                                    HashMap map7 = rilVar.b;
                                    if (map7.containsKey(str7)) {
                                        map7.get(str7);
                                    }
                                    qil qilVar = new qil();
                                    qilVar.a = fA4;
                                    qilVar.b = fA3;
                                    map7.put(str7, qilVar);
                                } else if (eicVar7.G("ids")) {
                                    aic aicVarS4 = eicVar7.s("ids");
                                    if (!(aicVarS4 instanceof yhc)) {
                                        throw new CLParsingException("no array found for key <ids>, found [" + aicVarS4.k() + "] : " + aicVarS4, eicVar7);
                                    }
                                    yhc yhcVar4 = (yhc) aicVarS4;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (int i9 = 0; i9 < yhcVar4.e.size(); i9++) {
                                        arrayList3.add(yhcVar4.B(i9));
                                    }
                                    rilVar.c(str7, arrayList3);
                                } else if (eicVar7.G("tag")) {
                                    String strC2 = eicVar7.C("tag");
                                    HashMap map8 = ynb1Var.e;
                                    rilVar.c(str7, map8.containsKey(strC2) ? (ArrayList) map8.get(strC2) : null);
                                }
                            } else {
                                continue;
                            }
                        }
                        break;
                    }
                    break;
                default:
                    if (!(aicVarS instanceof eic)) {
                        eicVar = eicVar4;
                        it = it5;
                        rilVar = rilVar6;
                        if (aicVarS instanceof cic) {
                            rilVar.b(aicVarS.i(), str5);
                        }
                        break;
                    } else {
                        eic eicVar8 = (eic) aicVarS;
                        Iterator it7 = eicVar8.H().iterator();
                        while (true) {
                            str = "type";
                            if (!it7.hasNext()) {
                                strC = null;
                            } else if (((String) it7.next()).equals("type")) {
                                strC = eicVar8.C("type");
                            }
                        }
                        if (strC == null) {
                            eicVar = eicVar4;
                            it = it5;
                            rilVar = rilVar6;
                            anm1.K(ynb1Var, rilVar, str5, eicVar8);
                            break;
                        } else {
                            switch (strC) {
                                case "vGuideline":
                                    b = 0;
                                    break;
                                case "column":
                                    b = 1;
                                    break;
                                case "hChain":
                                    b = 2;
                                    break;
                                case "vChain":
                                    b = 3;
                                    break;
                                case "barrier":
                                    b = 4;
                                    break;
                                case "row":
                                    b = 5;
                                    break;
                                case "grid":
                                    b = 6;
                                    break;
                                case "hFlow":
                                    b = 7;
                                    break;
                                case "vFlow":
                                    b = 8;
                                    break;
                                case "hGuideline":
                                    b = 9;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            eicVar = eicVar4;
                            switch (b) {
                                case 0:
                                    it = it5;
                                    rilVar = rilVar6;
                                    anm1.J(1, ynb1Var, str5, eicVar8);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    it = it5;
                                    rilVar = rilVar6;
                                    dil dilVarB = ynb1Var.b(str5);
                                    od10 od10Var = dilVarB.c;
                                    if (od10Var == null || !(od10Var instanceof og50)) {
                                        og50 og50Var = new og50(ynb1Var, strC.charAt(0) == 'r' ? 10 : strC.charAt(0) == 'c' ? 11 : 9);
                                        dilVarB.c = og50Var;
                                        dilVarB.a(og50Var.b());
                                    }
                                    og50 og50Var2 = (og50) dilVarB.c;
                                    for (String str8 : eicVar8.H()) {
                                        str8.getClass();
                                        switch (str8) {
                                            case "orientation":
                                                og50Var2.o0 = eicVar8.s(str8).i();
                                                break;
                                            case "padding":
                                                aic aicVarS5 = eicVar8.s(str8);
                                                if (aicVarS5 instanceof yhc) {
                                                    yhc yhcVar5 = (yhc) aicVarS5;
                                                    if (yhcVar5.e.size() > 1) {
                                                        yhcVar5.w(0);
                                                        yhcVar5.w(1);
                                                        if (yhcVar5.e.size() > 2) {
                                                            yhcVar5.w(2);
                                                            try {
                                                                try {
                                                                    ((yhc) aicVarS5).w(3);
                                                                    break;
                                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                                }
                                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                            }
                                                        }
                                                    } else {
                                                        aicVarS5.i();
                                                    }
                                                } else {
                                                    aicVarS5.i();
                                                }
                                                og50Var2.getClass();
                                                break;
                                            case "contains":
                                                yhc yhcVarT = eicVar8.t(str8);
                                                if (yhcVarT != null) {
                                                    for (int i10 = 0; i10 < yhcVarT.e.size(); i10++) {
                                                        og50Var2.X(ynb1Var.b(yhcVarT.r(i10).d()));
                                                    }
                                                }
                                                break;
                                            case "hGap":
                                                og50Var2.r0 = ynb1Var.a.b(eicVar8.s(str8).e());
                                                break;
                                            case "rows":
                                                int i11 = eicVar8.s(str8).i();
                                                if (i11 > 0) {
                                                    if (og50Var2.l0 != 11) {
                                                        og50Var2.p0 = i11;
                                                    }
                                                }
                                                break;
                                            case "vGap":
                                                og50Var2.s0 = ynb1Var.a.b(eicVar8.s(str8).e());
                                                break;
                                            case "skips":
                                                String strD4 = eicVar8.s(str8).d();
                                                if (strD4.contains("x") && strD4.contains(":")) {
                                                    og50Var2.w0 = strD4;
                                                }
                                                break;
                                            case "spans":
                                                String strD5 = eicVar8.s(str8).d();
                                                if (strD5.contains("x") && strD5.contains(":")) {
                                                    og50Var2.v0 = strD5;
                                                }
                                                break;
                                            case "rowWeights":
                                                String strD6 = eicVar8.s(str8).d();
                                                if (strD6.contains(",")) {
                                                    og50Var2.t0 = strD6;
                                                }
                                                break;
                                            case "columns":
                                                int i12 = eicVar8.s(str8).i();
                                                if (i12 > 0 && og50Var2.l0 != 10) {
                                                    og50Var2.q0 = i12;
                                                }
                                                break;
                                            case "columnWeights":
                                                String strD7 = eicVar8.s(str8).d();
                                                if (strD7.contains(",")) {
                                                    og50Var2.u0 = strD7;
                                                }
                                                break;
                                            default:
                                                anm1.i(str8, eicVar8, ynb1Var.b(str5), rilVar, ynb1Var);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                case 3:
                                    rilVar2 = rilVar6;
                                    it = it5;
                                    wbe wbeVarG = strC.charAt(0) == 'h' ? ynb1Var.g() : ynb1Var.j();
                                    wbeVarG.a = str5;
                                    Iterator it8 = eicVar8.H().iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            String str9 = (String) it8.next();
                                            str9.getClass();
                                            switch (str9) {
                                                case "bottom":
                                                case "end":
                                                case "top":
                                                case "left":
                                                case "right":
                                                case "start":
                                                    it2 = it8;
                                                    rilVar3 = rilVar2;
                                                    anm1.G(str9, eicVar8, wbeVarG, rilVar3, ynb1Var);
                                                    rilVar2 = rilVar3;
                                                    it8 = it2;
                                                    break;
                                                case "contains":
                                                    aic aicVarS6 = eicVar8.s(str9);
                                                    if (aicVarS6 instanceof yhc) {
                                                        yhc yhcVar6 = (yhc) aicVarS6;
                                                        if (yhcVar6.e.size() >= 1) {
                                                            int i13 = 0;
                                                            while (i13 < yhcVar6.e.size()) {
                                                                aic aicVarR4 = yhcVar6.r(i13);
                                                                if (aicVarR4 instanceof yhc) {
                                                                    yhc yhcVar7 = (yhc) aicVarR4;
                                                                    if (yhcVar7.e.size() > 0) {
                                                                        String strD8 = yhcVar7.r(0).d();
                                                                        it3 = it8;
                                                                        int size = yhcVar7.e.size();
                                                                        i = i13;
                                                                        if (size != 2) {
                                                                            if (size == 3) {
                                                                                fU2 = yhcVar7.u(1);
                                                                                fB = ynb1Var.d().b(yhcVar7.u(2));
                                                                                fB3 = fB;
                                                                            } else if (size == 4) {
                                                                                fU2 = yhcVar7.u(1);
                                                                                float fB6 = ynb1Var.d().b(yhcVar7.u(2));
                                                                                fB = ynb1Var.a.b(yhcVar7.u(3));
                                                                                fB3 = fB6;
                                                                            } else if (size != 6) {
                                                                                fB = Float.NaN;
                                                                                f = Float.NaN;
                                                                                fB2 = Float.NaN;
                                                                                fU = Float.NaN;
                                                                                fB3 = Float.NaN;
                                                                            } else {
                                                                                float fU4 = yhcVar7.u(1);
                                                                                fB3 = ynb1Var.d().b(yhcVar7.u(2));
                                                                                float fB7 = ynb1Var.a.b(yhcVar7.u(3));
                                                                                float fB8 = ynb1Var.a.b(yhcVar7.u(4));
                                                                                fB2 = ynb1Var.a.b(yhcVar7.u(5));
                                                                                fB = fB7;
                                                                                fU = fU4;
                                                                                f = fB8;
                                                                            }
                                                                            fU = fU2;
                                                                            f = Float.NaN;
                                                                            fB2 = Float.NaN;
                                                                        } else {
                                                                            fU = yhcVar7.u(1);
                                                                            fB = Float.NaN;
                                                                            f = Float.NaN;
                                                                            fB2 = Float.NaN;
                                                                            fB3 = Float.NaN;
                                                                        }
                                                                        wbeVarG.X(strD8);
                                                                        String string = strD8.toString();
                                                                        if (!Float.isNaN(fU)) {
                                                                            wbeVarG.o0.put(string, Float.valueOf(fU));
                                                                        }
                                                                        if (!Float.isNaN(fB3)) {
                                                                            wbeVarG.p0.put(string, Float.valueOf(fB3));
                                                                        }
                                                                        if (!Float.isNaN(fB)) {
                                                                            wbeVarG.q0.put(string, Float.valueOf(fB));
                                                                        }
                                                                        if (!Float.isNaN(f)) {
                                                                            HashMap map9 = wbeVarG.r0;
                                                                            if (map9 == null) {
                                                                                map9 = new HashMap();
                                                                                wbeVarG.r0 = map9;
                                                                            }
                                                                            map9.put(string, Float.valueOf(f));
                                                                        }
                                                                        if (!Float.isNaN(fB2)) {
                                                                            HashMap map10 = wbeVarG.s0;
                                                                            if (map10 == null) {
                                                                                map10 = new HashMap();
                                                                                wbeVarG.s0 = map10;
                                                                            }
                                                                            map10.put(string, Float.valueOf(fB2));
                                                                        }
                                                                    } else {
                                                                        it3 = it8;
                                                                        i = i13;
                                                                    }
                                                                } else {
                                                                    it3 = it8;
                                                                    i = i13;
                                                                    wbeVarG.X(aicVarR4.d());
                                                                }
                                                                i13 = i + 1;
                                                                it8 = it3;
                                                            }
                                                            it2 = it8;
                                                            rilVar3 = rilVar2;
                                                            rilVar2 = rilVar3;
                                                            it8 = it2;
                                                            break;
                                                        }
                                                    }
                                                    PrintStream printStream = System.err;
                                                    StringBuilder sbG = dv20.g(str5, " contains should be an array \"");
                                                    sbG.append(aicVarS6.d());
                                                    sbG.append("\"");
                                                    printStream.println(sbG.toString());
                                                    break;
                                                case "style":
                                                    aic aicVarS7 = eicVar8.s(str9);
                                                    if (aicVarS7 instanceof yhc) {
                                                        yhc yhcVar8 = (yhc) aicVarS7;
                                                        if (yhcVar8.e.size() > 1) {
                                                            strD = yhcVar8.B(0);
                                                            wbeVarG.n0 = yhcVar8.u(1);
                                                        } else {
                                                            strD = aicVarS7.d();
                                                        }
                                                    } else {
                                                        strD = aicVarS7.d();
                                                    }
                                                    if (strD.equals("packed")) {
                                                        wbeVarG.t0 = qlb1.c;
                                                    } else if (strD.equals("spread_inside")) {
                                                        wbeVarG.t0 = qlb1.b;
                                                    } else {
                                                        wbeVarG.t0 = qlb1.a;
                                                    }
                                                    it2 = it8;
                                                    rilVar3 = rilVar2;
                                                    rilVar2 = rilVar3;
                                                    it8 = it2;
                                                    break;
                                                default:
                                                    it2 = it8;
                                                    rilVar3 = rilVar2;
                                                    rilVar2 = rilVar3;
                                                    it8 = it2;
                                                    break;
                                            }
                                        }
                                        rilVar = rilVar2;
                                        break;
                                    }
                                    break;
                                case 4:
                                    rilVar2 = rilVar6;
                                    it = it5;
                                    boolean z = ynb1Var.b;
                                    dil dilVarB2 = ynb1Var.b(str5);
                                    od10 od10Var2 = dilVarB2.c;
                                    if (od10Var2 == null || !(od10Var2 instanceof d9a)) {
                                        d9a d9aVar = new d9a(ynb1Var, 5);
                                        d9aVar.n0 = 4;
                                        dilVarB2.c = d9aVar;
                                        dilVarB2.a(d9aVar.b());
                                    }
                                    d9a d9aVar2 = (d9a) dilVarB2.c;
                                    for (String str10 : eicVar8.H()) {
                                        str10.getClass();
                                        switch (str10) {
                                            case "margin":
                                                aic aicVarA = eicVar8.A(str10);
                                                float fE = aicVarA instanceof cic ? aicVarA.e() : Float.NaN;
                                                if (!Float.isNaN(fE)) {
                                                    d9aVar2.y(Float.valueOf(ynb1Var.a.b(fE)));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                                break;
                                            case "direction":
                                                switch (eicVar8.C(str10)) {
                                                    case "bottom":
                                                        d9aVar2.n0 = 6;
                                                        break;
                                                    case "end":
                                                        if (!z) {
                                                            d9aVar2.n0 = 1;
                                                            break;
                                                        } else {
                                                            d9aVar2.n0 = 2;
                                                            break;
                                                        }
                                                        break;
                                                    case "top":
                                                        d9aVar2.n0 = 5;
                                                        break;
                                                    case "left":
                                                        d9aVar2.n0 = 1;
                                                        break;
                                                    case "right":
                                                        d9aVar2.n0 = 2;
                                                        break;
                                                    case "start":
                                                        if (!z) {
                                                            d9aVar2.n0 = 2;
                                                            break;
                                                        } else {
                                                            d9aVar2.n0 = 1;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                break;
                                            case "contains":
                                                yhc yhcVarT2 = eicVar8.t(str10);
                                                if (yhcVarT2 == null) {
                                                    break;
                                                } else {
                                                    for (int i14 = 0; i14 < yhcVarT2.e.size(); i14++) {
                                                        d9aVar2.X(ynb1Var.b(yhcVarT2.r(i14).d()));
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    rilVar = rilVar2;
                                    break;
                                case 7:
                                case 8:
                                    Float fValueOf5 = Float.valueOf(0.5f);
                                    boolean z2 = strC.charAt(0) == 'v';
                                    dil dilVarB3 = ynb1Var.b(str5);
                                    it = it5;
                                    od10 od10Var3 = dilVarB3.c;
                                    if (od10Var3 == null || !(od10Var3 instanceof cw20)) {
                                        cw20 cw20Var = z2 ? new cw20(ynb1Var, 8) : new cw20(ynb1Var, 7);
                                        dilVarB3.c = cw20Var;
                                        dilVarB3.a(cw20Var.b());
                                    }
                                    cw20 cw20Var2 = (cw20) dilVarB3.c;
                                    Iterator it9 = eicVar8.H().iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            String str11 = (String) it9.next();
                                            str11.getClass();
                                            switch (str11.hashCode()) {
                                                case -1254185091:
                                                    it4 = it9;
                                                    if (str11.equals("hAlign")) {
                                                        b2 = 0;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -1237307863:
                                                    it4 = it9;
                                                    if (str11.equals("hStyle")) {
                                                        b2 = 1;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -1198076529:
                                                    it4 = it9;
                                                    if (str11.equals("hFlowBias")) {
                                                        b2 = 2;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -853376977:
                                                    it4 = it9;
                                                    if (str11.equals("vAlign")) {
                                                        b2 = 3;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -836499749:
                                                    it4 = it9;
                                                    if (str11.equals("vStyle")) {
                                                        b2 = 4;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -806339567:
                                                    it4 = it9;
                                                    if (str11.equals("padding")) {
                                                        b2 = 5;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -732635235:
                                                    it4 = it9;
                                                    if (str11.equals("vFlowBias")) {
                                                        b2 = 6;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -567445985:
                                                    it4 = it9;
                                                    if (str11.equals("contains")) {
                                                        b2 = 7;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case -488900360:
                                                    it4 = it9;
                                                    if (str11.equals("maxElement")) {
                                                        b2 = 8;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 3169614:
                                                    it4 = it9;
                                                    if (str11.equals("hGap")) {
                                                        b2 = 9;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 3575610:
                                                    it4 = it9;
                                                    if (str11.equals(str)) {
                                                        b2 = 10;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 3586688:
                                                    it4 = it9;
                                                    if (str11.equals("vGap")) {
                                                        b2 = 11;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                case 3657802:
                                                    it4 = it9;
                                                    if (str11.equals("wrap")) {
                                                        b2 = 12;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    break;
                                                default:
                                                    it4 = it9;
                                                    b2 = -1;
                                                    break;
                                            }
                                            switch (b2) {
                                                case 0:
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    String strD9 = eicVar8.s(str11).d();
                                                    if (strD9.equals("end")) {
                                                        cw20Var2.z0 = (byte) 1;
                                                    } else if (strD9.equals("start")) {
                                                        cw20Var2.z0 = (byte) 0;
                                                    } else {
                                                        cw20Var2.z0 = (byte) 2;
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 1:
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    aic aicVarS8 = eicVar8.s(str11);
                                                    if (aicVarS8 instanceof yhc) {
                                                        yhc yhcVar9 = (yhc) aicVarS8;
                                                        if (yhcVar9.e.size() > 1) {
                                                            String strB3 = yhcVar9.B(0);
                                                            strD2 = yhcVar9.B(1);
                                                            strB = yhcVar9.e.size() > 2 ? yhcVar9.B(2) : "";
                                                            str3 = strB3;
                                                        } else {
                                                            strD2 = aicVarS8.d();
                                                            str3 = "";
                                                            strB = str3;
                                                        }
                                                    } else {
                                                        strD2 = aicVarS8.d();
                                                        str3 = "";
                                                        strB = str3;
                                                    }
                                                    if (!strD2.equals("")) {
                                                        cw20Var2.v0 = qlb1.a(strD2);
                                                    }
                                                    if (!str3.equals("")) {
                                                        cw20Var2.w0 = qlb1.a(str3);
                                                    }
                                                    if (!strB.equals("")) {
                                                        cw20Var2.x0 = qlb1.a(strB);
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 2:
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    aic aicVarS9 = eicVar8.s(str11);
                                                    if (aicVarS9 instanceof yhc) {
                                                        yhc yhcVar10 = (yhc) aicVarS9;
                                                        if (yhcVar10.e.size() > 1) {
                                                            Float fValueOf6 = Float.valueOf(yhcVar10.u(0));
                                                            fValueOf = Float.valueOf(yhcVar10.u(1));
                                                            fValueOf2 = yhcVar10.e.size() > 2 ? Float.valueOf(yhcVar10.u(2)) : fValueOf5;
                                                            f2 = fValueOf6;
                                                        } else {
                                                            fValueOf = Float.valueOf(aicVarS9.e());
                                                            f2 = fValueOf5;
                                                            fValueOf2 = f2;
                                                        }
                                                    } else {
                                                        fValueOf = Float.valueOf(aicVarS9.e());
                                                        f2 = fValueOf5;
                                                        fValueOf2 = f2;
                                                    }
                                                    cw20Var2.h = fValueOf.floatValue();
                                                    if (f2.floatValue() != 0.5f) {
                                                        cw20Var2.K0 = f2.floatValue();
                                                    }
                                                    if (fValueOf2.floatValue() != 0.5f) {
                                                        cw20Var2.L0 = fValueOf2.floatValue();
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 3:
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    switch (eicVar8.s(str11).d()) {
                                                        case "baseline":
                                                            cw20Var2.y0 = (byte) 3;
                                                            break;
                                                        case "bottom":
                                                            cw20Var2.y0 = (byte) 1;
                                                            break;
                                                        case "top":
                                                            cw20Var2.y0 = (byte) 0;
                                                            break;
                                                        default:
                                                            cw20Var2.y0 = (byte) 2;
                                                            break;
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 4:
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    aic aicVarS10 = eicVar8.s(str11);
                                                    if (aicVarS10 instanceof yhc) {
                                                        yhc yhcVar11 = (yhc) aicVarS10;
                                                        if (yhcVar11.e.size() > 1) {
                                                            String strB4 = yhcVar11.B(0);
                                                            strD3 = yhcVar11.B(1);
                                                            strB2 = yhcVar11.e.size() > 2 ? yhcVar11.B(2) : "";
                                                            str4 = strB4;
                                                        } else {
                                                            strD3 = aicVarS10.d();
                                                            str4 = "";
                                                            strB2 = str4;
                                                        }
                                                    } else {
                                                        strD3 = aicVarS10.d();
                                                        str4 = "";
                                                        strB2 = str4;
                                                    }
                                                    if (!strD3.equals("")) {
                                                        cw20Var2.s0 = qlb1.a(strD3);
                                                    }
                                                    if (!str4.equals("")) {
                                                        cw20Var2.t0 = qlb1.a(str4);
                                                    }
                                                    if (!strB2.equals("")) {
                                                        cw20Var2.u0 = qlb1.a(strB2);
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 5:
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    aic aicVarS11 = eicVar8.s(str11);
                                                    if (aicVarS11 instanceof yhc) {
                                                        yhc yhcVar12 = (yhc) aicVarS11;
                                                        if (yhcVar12.e.size() > 1) {
                                                            int iW2 = yhcVar12.w(0);
                                                            iW = yhcVar12.w(1);
                                                            if (yhcVar12.e.size() > 2) {
                                                                int iW3 = yhcVar12.w(2);
                                                                try {
                                                                    i2 = ((yhc) aicVarS11).w(3);
                                                                    i4 = iW3;
                                                                    i3 = iW2;
                                                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                                                    i4 = iW3;
                                                                    i3 = iW2;
                                                                    i2 = 0;
                                                                }
                                                            } else {
                                                                i2 = iW;
                                                                i3 = iW2;
                                                                i4 = i3;
                                                            }
                                                        } else {
                                                            i2 = aicVarS11.i();
                                                            i3 = i2;
                                                            iW = i3;
                                                            i4 = iW;
                                                        }
                                                    } else {
                                                        i2 = aicVarS11.i();
                                                        i3 = i2;
                                                        iW = i3;
                                                        i4 = iW;
                                                    }
                                                    cw20Var2.C0 = i3;
                                                    cw20Var2.E0 = iW;
                                                    cw20Var2.D0 = i4;
                                                    cw20Var2.F0 = i2;
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 6:
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    aic aicVarS12 = eicVar8.s(str11);
                                                    if (aicVarS12 instanceof yhc) {
                                                        yhc yhcVar13 = (yhc) aicVarS12;
                                                        if (yhcVar13.e.size() > 1) {
                                                            Float fValueOf7 = Float.valueOf(yhcVar13.u(0));
                                                            fValueOf3 = Float.valueOf(yhcVar13.u(1));
                                                            fValueOf4 = yhcVar13.e.size() > 2 ? Float.valueOf(yhcVar13.u(2)) : fValueOf5;
                                                            f3 = fValueOf7;
                                                        } else {
                                                            fValueOf3 = Float.valueOf(aicVarS12.e());
                                                            f3 = fValueOf5;
                                                            fValueOf4 = f3;
                                                        }
                                                    } else {
                                                        fValueOf3 = Float.valueOf(aicVarS12.e());
                                                        f3 = fValueOf5;
                                                        fValueOf4 = f3;
                                                    }
                                                    try {
                                                        cw20Var2.i = fValueOf3.floatValue();
                                                        if (f3.floatValue() != 0.5f) {
                                                            cw20Var2.I0 = f3.floatValue();
                                                        }
                                                        if (fValueOf4.floatValue() != 0.5f) {
                                                            cw20Var2.J0 = fValueOf4.floatValue();
                                                        }
                                                    } catch (NumberFormatException unused4) {
                                                    }
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 7:
                                                    aic aicVarS13 = eicVar8.s(str11);
                                                    if (aicVarS13 instanceof yhc) {
                                                        yhc yhcVar14 = (yhc) aicVarS13;
                                                        str2 = str;
                                                        if (yhcVar14.e.size() >= 1) {
                                                            int i15 = 0;
                                                            while (i15 < yhcVar14.e.size()) {
                                                                aic aicVarR5 = yhcVar14.r(i15);
                                                                int i16 = i15;
                                                                if (aicVarR5 instanceof yhc) {
                                                                    yhc yhcVar15 = (yhc) aicVarR5;
                                                                    if (yhcVar15.e.size() > 0) {
                                                                        String strD10 = yhcVar15.r(0).d();
                                                                        yhcVar = yhcVar14;
                                                                        int size2 = yhcVar15.e.size();
                                                                        rilVar5 = rilVar6;
                                                                        if (size2 == 2) {
                                                                            fU3 = yhcVar15.u(1);
                                                                            fB4 = Float.NaN;
                                                                        } else if (size2 != 3) {
                                                                            if (size2 != 4) {
                                                                                fU3 = Float.NaN;
                                                                                fB4 = Float.NaN;
                                                                            } else {
                                                                                float fU5 = yhcVar15.u(1);
                                                                                fB5 = ynb1Var.a.b(yhcVar15.u(2));
                                                                                fB4 = ynb1Var.a.b(yhcVar15.u(3));
                                                                                fU3 = fU5;
                                                                            }
                                                                            cw20Var2.X(strD10);
                                                                            if (!Float.isNaN(fU3)) {
                                                                                map3 = cw20Var2.o0;
                                                                                if (map3 == null) {
                                                                                    map3 = new HashMap();
                                                                                    cw20Var2.o0 = map3;
                                                                                }
                                                                                map3.put(strD10, Float.valueOf(fU3));
                                                                            }
                                                                            if (!Float.isNaN(fB5)) {
                                                                                map2 = cw20Var2.p0;
                                                                                if (map2 == null) {
                                                                                    map2 = new HashMap();
                                                                                    cw20Var2.p0 = map2;
                                                                                }
                                                                                map2.put(strD10, Float.valueOf(fB5));
                                                                            }
                                                                            if (Float.isNaN(fB4)) {
                                                                                map = cw20Var2.q0;
                                                                                if (map == null) {
                                                                                    map = new HashMap();
                                                                                    cw20Var2.q0 = map;
                                                                                }
                                                                                map.put(strD10, Float.valueOf(fB4));
                                                                            }
                                                                        } else {
                                                                            fU3 = yhcVar15.u(1);
                                                                            fB4 = ynb1Var.a.b(yhcVar15.u(2));
                                                                        }
                                                                        fB5 = fB4;
                                                                        cw20Var2.X(strD10);
                                                                        if (!Float.isNaN(fU3)) {
                                                                            map3 = cw20Var2.o0;
                                                                            if (map3 == null) {
                                                                                map3 = new HashMap();
                                                                                cw20Var2.o0 = map3;
                                                                            }
                                                                            map3.put(strD10, Float.valueOf(fU3));
                                                                        }
                                                                        if (!Float.isNaN(fB5)) {
                                                                            map2 = cw20Var2.p0;
                                                                            if (map2 == null) {
                                                                                map2 = new HashMap();
                                                                                cw20Var2.p0 = map2;
                                                                            }
                                                                            map2.put(strD10, Float.valueOf(fB5));
                                                                        }
                                                                        if (Float.isNaN(fB4)) {
                                                                            map = cw20Var2.q0;
                                                                            if (map == null) {
                                                                                map = new HashMap();
                                                                                cw20Var2.q0 = map;
                                                                            }
                                                                            map.put(strD10, Float.valueOf(fB4));
                                                                        }
                                                                    } else {
                                                                        rilVar5 = rilVar6;
                                                                        yhcVar = yhcVar14;
                                                                    }
                                                                } else {
                                                                    rilVar5 = rilVar6;
                                                                    yhcVar = yhcVar14;
                                                                    cw20Var2.X(aicVarR5.d());
                                                                }
                                                                i15 = i16 + 1;
                                                                yhcVar14 = yhcVar;
                                                                rilVar6 = rilVar5;
                                                            }
                                                            rilVar4 = rilVar6;
                                                            it9 = it4;
                                                            str = str2;
                                                            rilVar6 = rilVar4;
                                                            break;
                                                        }
                                                    }
                                                    rilVar2 = rilVar6;
                                                    PrintStream printStream2 = System.err;
                                                    StringBuilder sbG2 = dv20.g(str5, " contains should be an array \"");
                                                    sbG2.append(aicVarS13.d());
                                                    sbG2.append("\"");
                                                    printStream2.println(sbG2.toString());
                                                    break;
                                                case 8:
                                                    cw20Var2.G0 = eicVar8.s(str11).i();
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 9:
                                                    cw20Var2.B0 = eicVar8.s(str11).i();
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 10:
                                                    if (eicVar8.s(str11).d().equals("hFlow")) {
                                                        cw20Var2.H0 = false;
                                                    } else {
                                                        cw20Var2.H0 = true;
                                                    }
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 11:
                                                    cw20Var2.A0 = eicVar8.s(str11).i();
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                case 12:
                                                    String strD11 = eicVar8.s(str11).d();
                                                    HashMap map11 = nnb1.a;
                                                    cw20Var2.r0 = map11.containsKey(strD11) ? ((Integer) map11.get(strD11)).intValue() : -1;
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                                default:
                                                    anm1.i(str11, eicVar8, ynb1Var.b(str5), rilVar6, ynb1Var);
                                                    rilVar4 = rilVar6;
                                                    str2 = str;
                                                    it9 = it4;
                                                    str = str2;
                                                    rilVar6 = rilVar4;
                                                    break;
                                            }
                                        } else {
                                            rilVar2 = rilVar6;
                                        }
                                        rilVar = rilVar2;
                                        break;
                                    }
                                    break;
                                case 9:
                                    anm1.J(0, ynb1Var, str5, eicVar8);
                                default:
                                    it = it5;
                                    rilVar = rilVar6;
                                    break;
                            }
                        }
                    }
                    break;
            }
            rilVar6 = rilVar;
            eicVar4 = eicVar;
            it5 = it;
        }
    }

    public final eic b(nnb0 nnb0Var) throws CLParsingException {
        String string = nnb0Var.a().toString();
        eic eicVar = this.a;
        if (eicVar.y(string) == null) {
            eicVar.I(string, new eic(new char[0]));
        }
        aic aicVarS = eicVar.s(string);
        if (aicVarS instanceof eic) {
            return (eic) aicVarS;
        }
        StringBuilder sbT = l1d.t("no object found for key <", string, ">, found [");
        sbT.append(aicVarS.k());
        sbT.append("] : ");
        sbT.append(aicVarS);
        throw new CLParsingException(sbT.toString(), eicVar);
    }

    public final void c(ihl ihlVar, iu30 iu30Var) {
        iu30Var.invoke(new dhl(ihlVar.c, b(ihlVar)));
    }

    public final thl d(float f) throws CLParsingException {
        Integer numValueOf = Integer.valueOf(f());
        onb0 onb0Var = new onb0(numValueOf);
        eic eicVarB = b(onb0Var);
        eicVarB.K("type", "vGuideline");
        eicVarB.J("end", f);
        i(5);
        i(Float.hashCode(f));
        return new thl(numValueOf, 0, onb0Var);
    }

    public final shl e() throws CLParsingException {
        Integer numValueOf = Integer.valueOf(f());
        onb0 onb0Var = new onb0(numValueOf);
        eic eicVarB = b(onb0Var);
        eicVarB.K("type", "hGuideline");
        eicVarB.J("percent", 0.4f);
        i(8);
        i(Float.hashCode(0.4f));
        return new shl(numValueOf, 0, onb0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhl)) {
            return false;
        }
        return this.a.equals(((uhl) obj).a);
    }

    public final int f() {
        int i = this.c;
        this.c = i + 1;
        return i;
    }

    public final onb0 h(nnb0[] nnb0VarArr, ybe ybeVar) throws CLParsingException {
        onb0 onb0Var = new onb0(Integer.valueOf(f()));
        yhc yhcVar = new yhc(new char[0]);
        for (nnb0 nnb0Var : nnb0VarArr) {
            nnb0Var.b.get(vbe.class.getSimpleName());
            yhcVar.n(gic.n(nnb0Var.a().toString()));
        }
        yhc yhcVar2 = new yhc(new char[0]);
        yhcVar2.n(gic.n(ybeVar.a));
        Float f = ybeVar.b;
        yhcVar2.n(new cic(f != null ? f.floatValue() : 0.5f));
        eic eicVarB = b(onb0Var);
        eicVarB.K("type", "vChain");
        eicVarB.I("contains", yhcVar);
        eicVarB.I("style", yhcVar2);
        i(17);
        for (nnb0 nnb0Var2 : nnb0VarArr) {
            i(nnb0Var2.hashCode());
        }
        i(ybeVar.hashCode());
        return onb0Var;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(int i) {
        this.b = ((this.b * ContentMediaFormat.PREVIEW_MOVIE) + i) % 1000000007;
    }
}
