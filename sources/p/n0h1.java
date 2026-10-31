package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n0h1 {
    public final LinkedHashMap a;

    public n0h1(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final n0h1 a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            q8a0 q8a0Var = (q8a0) entry.getValue();
            linkedHashMap2.put(key, new q8a0(q8a0Var.a, q8a0Var.b, q8a0Var.c, true, true));
        }
        return new n0h1(linkedHashMap2);
    }
}
