package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b6h1 {
    public final iu30 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public b6h1(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = this.a.invoke(obj);
        linkedHashMap.put(obj, objInvoke);
        return objInvoke;
    }
}
