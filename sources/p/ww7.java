package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ww7 {
    public final LinkedHashMap a;

    public ww7(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Float.valueOf(zko1.o(((Number) entry.getValue()).floatValue())));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((Number) entry2.getValue()).floatValue() > 0.0f) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.a = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ww7) {
            return this.a.equals(((ww7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AudioMix(volumes=" + this.a + ")";
    }
}
