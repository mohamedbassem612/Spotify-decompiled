package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cfi0 extends hab0 implements hu30 {
    public static final cfi0 b;
    public static final cfi0 c;
    public final /* synthetic */ byte a;

    static {
        int i = 10;
        b = new cfi0(i, (byte) 0);
        c = new cfi0(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cfi0(int i, byte b2) {
        super(i);
        this.a = b2;
    }

    public final Object f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        switch (this.a) {
            case 0:
                return new xei0((nbw0) obj, (yo60) obj2, (jo70) obj3, (prl) obj5, (xkk1) obj6, (e2k1) obj7, (w281) obj8, (xkk1) obj9, (l1z) obj10, (mtl) obj4, (hzy) null, 1024);
            default:
                uia uiaVar = (uia) obj;
                uia uiaVar2 = (uia) obj2;
                hll hllVar = (hll) obj3;
                hll hllVar2 = (hll) obj4;
                vjk0 vjk0Var = (vjk0) obj5;
                vjk0 vjk0Var2 = (vjk0) obj6;
                vjk0 vjk0Var3 = (vjk0) obj7;
                vjk0 vjk0Var4 = (vjk0) obj8;
                Map map = (Map) obj9;
                cw21 cw21Var = (cw21) obj10;
                ArrayList arrayListO0 = o7h.o0(p7h.M(new Map[]{vjk0Var != null ? vjk0Var.b : null, vjk0Var2 != null ? vjk0Var2.b : null, vjk0Var3 != null ? vjk0Var3.b : null, vjk0Var4 != null ? vjk0Var4.b : null}));
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListO0.iterator();
                while (it.hasNext()) {
                    r7h.W(((Map) it.next()).values(), arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj11 : arrayList) {
                    g79 g79Var = ((i79) obj11).a;
                    Object arrayList2 = linkedHashMap.get(g79Var);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(g79Var, arrayList2);
                    }
                    ((List) arrayList2).add(obj11);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    g79 g79Var2 = (g79) entry.getKey();
                    i79 i79Var = (i79) o7h.X0(o7h.j0((List) entry.getValue()));
                    mmr0 mmr0Var = i79Var != null ? new mmr0(g79Var2, i79Var) : null;
                    if (mmr0Var != null) {
                        arrayList3.add(mmr0Var);
                    }
                }
                Map mapT = sqg0.T(arrayList3);
                return new iok0(uiaVar2, uiaVar, jfv.h(hllVar2.a), jfv.h(hllVar.a), map, vjk0Var2 != null ? vjk0Var2.a : null, vjk0Var != null ? vjk0Var.a : null, vjk0Var3 != null ? vjk0Var3.a : null, vjk0Var4 != null ? vjk0Var4.a : null, !mapT.isEmpty() ? mapT : null, cw21Var);
        }
    }
}
