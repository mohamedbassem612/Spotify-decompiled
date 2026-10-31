package p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class eho1 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final void a(int i, long j) {
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = a;
        Object cho1Var = concurrentHashMap.get(numValueOf);
        if (cho1Var == null) {
            cho1Var = new cho1();
        }
        cho1 cho1Var2 = (cho1) cho1Var;
        cho1Var2.a++;
        cho1Var2.b += j;
        cho1Var2.c = Math.max(j, cho1Var2.c);
        concurrentHashMap.put(numValueOf, cho1Var2);
    }
}
