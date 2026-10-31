package p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r8n0 {
    public final vpp0 a;
    public final eu4 b;
    public final q8n c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public r8n0(vpp0 vpp0Var, eu4 eu4Var, q8n q8nVar) {
        this.a = vpp0Var;
        this.b = eu4Var;
        this.c = q8nVar;
    }

    public final p8n0 a(String str) {
        Object objPutIfAbsent;
        if (!this.b.i()) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.d;
        Object p8n0Var = concurrentHashMap.get(str);
        if (p8n0Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (p8n0Var = new p8n0(str, this.a, this.c)))) != null) {
            p8n0Var = objPutIfAbsent;
        }
        return (p8n0) p8n0Var;
    }
}
