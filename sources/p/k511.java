package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k511 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final dma1 a;

    public k511(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public final wen0 a(String str) {
        wen0 wen0Var;
        LinkedHashMap linkedHashMap = b;
        synchronized (linkedHashMap) {
            try {
                Object objB = linkedHashMap.get(str);
                if (objB == null) {
                    objB = gio1.b(Boolean.valueOf(!this.a.a(l511.a).contains(str)));
                    linkedHashMap.put(str, objB);
                }
                wen0Var = (wen0) objB;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wen0Var;
    }
}
