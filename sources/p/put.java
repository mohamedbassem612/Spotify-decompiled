package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class put extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sut b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ put(sut sutVar, Set set, Set set2, byte b) {
        super(0);
        this.a = b;
        this.b = sutVar;
        this.c = set;
        this.d = set2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Set set = this.d;
        Set set2 = this.c;
        sut sutVar = this.b;
        switch (b) {
            case 0:
                sutVar.getClass();
                Set setV0 = dm61.v0(sut.g(set2), set);
                Set set3 = set2;
                int iS = zno1.s(q7h.U(set3, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj : set3) {
                    linkedHashMap.put(((cut) obj).a, obj);
                }
                ArrayList<cut> arrayList = new ArrayList();
                Iterator it = setV0.iterator();
                while (it.hasNext()) {
                    cut cutVar = (cut) linkedHashMap.get((String) it.next());
                    if (cutVar != null) {
                        arrayList.add(cutVar);
                    }
                }
                for (cut cutVar2 : arrayList) {
                    sutVar.h.put(cutVar2.a, fn31.T(sutVar.g, (o8n) null, 0, new nut(sutVar, cutVar2, null, (byte) 1), 3));
                    sutVar.i.put(cutVar2.a, Collections.singleton(cutVar2.c));
                }
                break;
            default:
                sutVar.getClass();
                Set setG = sut.g(set2);
                LinkedHashMap linkedHashMap2 = sutVar.i;
                LinkedHashSet linkedHashSetV0 = o7h.v0(setG, set);
                Set set4 = set2;
                int iS2 = zno1.s(q7h.U(set4, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj2 : set4) {
                    linkedHashMap3.put(((cut) obj2).a, obj2);
                }
                ArrayList<cut> arrayList2 = new ArrayList();
                Iterator it2 = linkedHashSetV0.iterator();
                while (it2.hasNext()) {
                    cut cutVar3 = (cut) linkedHashMap3.get((String) it2.next());
                    if (cutVar3 != null) {
                        arrayList2.add(cutVar3);
                    }
                }
                for (cut cutVar4 : arrayList2) {
                    w7x w7xVar = (Set) linkedHashMap2.get(cutVar4.a);
                    if (w7xVar == null) {
                        w7xVar = w7x.a;
                    }
                    linkedHashMap2.put(cutVar4.a, dm61.x0(cutVar4.c, w7xVar));
                }
                break;
        }
        return rih1Var;
    }
}
