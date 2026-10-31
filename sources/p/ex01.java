package p;

import io.reactivex.rxjava3.functions.BiFunction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ex01 implements BiFunction {
    public final Set a;

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj;
        bx01 bx01Var = (bx01) obj2;
        Set set = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : set) {
            f7h f7hVar = (f7h) map.get((String) obj3);
            if (f7hVar == null || !f7hVar.a) {
                arrayList.add(obj3);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj4 : arrayList) {
            linkedHashMap.put(obj4, bx01Var.a.containsKey((String) obj4) ? vw01.b : vw01.a);
        }
        return linkedHashMap;
    }
}
