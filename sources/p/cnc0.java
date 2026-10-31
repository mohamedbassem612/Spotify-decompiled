package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cnc0 {
    public final dt90 a;
    public final Map b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public cnc0(dt90 dt90Var, Map map, Map map2) {
        this.a = dt90Var;
        this.b = map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new fc3(entry, (byte) 14));
        }
        this.c = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry2 : map.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), new s2c0(entry2, (byte) 6));
        }
        this.d = linkedHashMap2;
    }
}
