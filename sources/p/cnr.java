package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cnr {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(Boolean bool, String str, String str2) {
        LinkedHashMap linkedHashMap = this.a;
        Map map = (Map) linkedHashMap.get(str);
        if (map == null || map.isEmpty()) {
            linkedHashMap.put(str, sqg0.I(new mmr0[]{new mmr0(str2, bool)}));
            return;
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) linkedHashMap.get(str);
        if (linkedHashMap2 != null) {
            linkedHashMap2.put(str2, bool);
        }
    }

    public final Object b(String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a.get(str);
        if (linkedHashMap != null) {
            return linkedHashMap.get(str2);
        }
        return null;
    }
}
