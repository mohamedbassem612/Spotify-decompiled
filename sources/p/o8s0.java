package p;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class o8s0 {
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (n8s0 n8s0Var : n8s0.b) {
            Class cls = n8s0Var.a;
            Class cls2 = n8s0Var.a;
            map3.put(cls, n8s0Var);
            map.put(cls2.getSimpleName(), n8s0Var);
            map2.put(cls2.getName(), n8s0Var);
        }
        c = Collections.unmodifiableMap(map3);
        b = Collections.unmodifiableMap(map2);
        a = Collections.unmodifiableMap(map);
    }
}
