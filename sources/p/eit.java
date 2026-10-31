package p;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eit {
    public static final /* synthetic */ mma0[] j = {new cey0(eit.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), new cey0(eit.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final qoe0 d;
    public final qoe0 e;
    public final ffr f;
    public final toe0 g;
    public final toe0 h;
    public final /* synthetic */ fit i;

    public eit(fit fitVar, List list, List list2, List list3) {
        this.i = fitVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            ajn0 ajn0VarY = dem1.y((zjn0) fitVar.b.c, ((yfy0) ((t8) obj)).f);
            Object arrayList = linkedHashMap.get(ajn0VarY);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(ajn0VarY, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = a(linkedHashMap);
        fit fitVar2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            ajn0 ajn0VarY2 = dem1.y((zjn0) fitVar2.b.c, ((ggy0) ((t8) obj2)).f);
            Object arrayList2 = linkedHashMap2.get(ajn0VarY2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(ajn0VarY2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = a(linkedHashMap2);
        ((u321) ((ks6) this.i.b.b).c).getClass();
        fit fitVar3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            ajn0 ajn0VarY3 = dem1.y((zjn0) fitVar3.b.c, ((tgy0) ((t8) obj3)).e);
            Object arrayList3 = linkedHashMap3.get(ajn0VarY3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(ajn0VarY3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = a(linkedHashMap3);
        byte b = 0;
        this.d = ((voe0) ((s1c1) ((ks6) this.i.b.b).a)).a(new cit(this, b));
        byte b2 = 1;
        this.e = ((voe0) ((s1c1) ((ks6) this.i.b.b).a)).a(new cit(this, b2));
        this.f = ((voe0) ((s1c1) ((ks6) this.i.b.b).a)).b(new cit(this, (byte) 2));
        fit fitVar4 = this.i;
        s1c1 s1c1Var = (s1c1) ((ks6) fitVar4.b.b).a;
        dit ditVar = new dit(this, fitVar4, b);
        voe0 voe0Var = (voe0) s1c1Var;
        voe0Var.getClass();
        this.g = new toe0(voe0Var, ditVar);
        fit fitVar5 = this.i;
        s1c1 s1c1Var2 = (s1c1) ((ks6) fitVar5.b.b).a;
        dit ditVar2 = new dit(this, fitVar5, b2);
        voe0 voe0Var2 = (voe0) s1c1Var2;
        voe0Var2.getClass();
        this.h = new toe0(voe0Var2, ditVar2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<t8> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
            for (t8 t8Var : iterable) {
                int iA = t8Var.a();
                int iK = w4c0.k(iA) + iA;
                if (iK > 4096) {
                    iK = 4096;
                }
                w4c0 w4c0VarY = w4c0.y(byteArrayOutputStream, iK);
                w4c0VarY.Y(iA);
                t8Var.d(w4c0VarY);
                w4c0VarY.F();
                arrayList.add(rih1.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
