package p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oms {
    public final bl3 a;
    public final q8n b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public oms(bl3 bl3Var, q8n q8nVar) {
        this.a = bl3Var;
        this.b = q8nVar;
    }

    public final mr20 a(ak3 ak3Var) {
        ConcurrentHashMap concurrentHashMap = this.c;
        Object obj = concurrentHashMap.get(ak3Var);
        if (obj == null) {
            ve01 ve01VarR = d5p1.r(this.a.n(ak3Var), smo1.e(ha71.A(guo1.B(), this.b)), new alb1(0L, Long.MAX_VALUE), 1);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(ak3Var, ve01VarR);
            obj = objPutIfAbsent == null ? ve01VarR : objPutIfAbsent;
        }
        return (mr20) obj;
    }
}
