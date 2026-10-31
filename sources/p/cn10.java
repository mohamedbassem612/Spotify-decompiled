package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cn10 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ en10 b;

    public /* synthetic */ cn10(en10 en10Var, byte b) {
        this.a = b;
        this.b = en10Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        zl10 yl10Var;
        byte b = this.a;
        sua suaVar = ey71.a;
        rd rdVar = rd.a;
        en10 en10Var = this.b;
        fvw0 fvw0Var = null;
        switch (b) {
            case 0:
                List listL1 = o7h.l1((Set) obj);
                lm10 lm10Var = en10Var.a;
                if (en10Var.h) {
                    List list = listL1;
                    int iS = zno1.s(q7h.U(list, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                    for (Object obj2 : list) {
                        linkedHashMap.put(obj2, new tl10(((bm10) obj2).a(), rdVar));
                    }
                    return new gpb1(gio1.b(linkedHashMap));
                }
                ezc ezcVar = en10Var.b.a;
                lm10 lm10Var2 = lm10Var;
                Collection collectionValues = lm10Var2.c.values();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    omd omdVar = ((n60) it.next()).e;
                    if (omdVar != null) {
                        linkedHashSet.add(omdVar);
                    }
                }
                ArrayList arrayList = new ArrayList(q7h.U(linkedHashSet, 10));
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    arrayList.add((zob1) en10Var.e.invoke((omd) it2.next()));
                }
                huz huzVar = new huz(rih1.a, (byte) 10);
                x010 x010Var = arrayList.isEmpty() ? new x010(ezcVar, huzVar, new qr0(en10Var, listL1, (lnm) null, (byte) 19), (byte) 1) : h5p1.s(ezcVar, new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 14), huzVar, new w63(en10Var, listL1, (lnm) null, (byte) 6));
                LinkedHashMap linkedHashMapB = b7x.a;
                try {
                    cvw0 cvw0Var = (cvw0) en10Var.g.get();
                    if (cvw0Var != null && (fvw0Var = (gvw0) cvw0Var.c.h()) == null) {
                        fvw0Var = new fvw0(nuw0.a);
                    }
                    if (fvw0Var instanceof evw0) {
                        linkedHashMapB = ((evw0) fvw0Var).a.b();
                    }
                    break;
                } catch (Throwable th) {
                    n57.g("ProductStateProvider not ready when evaluating feature access for ".concat(lm10Var2.a), th);
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add((pmd) ((zob1) it3.next()).getValue());
                }
                return new gpb1(d5p1.t(x010Var, en10Var.f, suaVar, en10Var.a(listL1, linkedHashMapB, yto.t(arrayList2))));
            default:
                List listL2 = o7h.l1((Set) obj);
                e1i1 e1i1Var = e1i1.d;
                if (en10Var.h) {
                    List list2 = listL2;
                    int iS2 = zno1.s(q7h.U(list2, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                    for (Object obj3 : list2) {
                        linkedHashMap2.put(obj3, new yl10(((bm10) obj3).a(), rdVar, new f1i1(e1i1Var)));
                    }
                    return new gpb1(gio1.b(linkedHashMap2));
                }
                u601 u601VarB = en10Var.b(listL2);
                jge jgeVarE = hu20.e(u601VarB.a(), new db3(en10Var, (lnm) null));
                Map map = (Map) u601VarB.getValue();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    vl10 vl10Var = (vl10) entry.getValue();
                    if (vl10Var instanceof ul10) {
                        ul10 ul10Var = (ul10) vl10Var;
                        yl10Var = new zl10(ul10Var.a, ul10Var.b);
                    } else {
                        if (!(vl10Var instanceof tl10)) {
                            eg.o();
                            return null;
                        }
                        tl10 tl10Var = (tl10) vl10Var;
                        td tdVar = tl10Var.b;
                        yl10Var = new yl10(tl10Var.a, tdVar, (!(tdVar instanceof md) || (tdVar instanceof id) || (tdVar instanceof jd)) ? new f1i1(e1i1Var) : g1i1.c);
                    }
                    linkedHashMap3.put(key, yl10Var);
                }
                return new gpb1(d5p1.t(jgeVarE, en10Var.f, suaVar, linkedHashMap3));
        }
    }
}
