package p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q0b1 implements u260 {
    public final kly0 a;
    public final yd91 b;
    public final x010 c;
    public final ke71 d;

    public q0b1(jxp jxpVar, ay0 ay0Var, String str, lza1 lza1Var) {
        Object objPutIfAbsent;
        this.a = jxpVar;
        ConcurrentHashMap concurrentHashMap = lza1.a;
        Object objB = concurrentHashMap.get(str);
        if (objB == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (objB = gio1.b(Boolean.TRUE)))) != null) {
            objB = objPutIfAbsent;
        }
        this.b = new yd91(3, new gga1(this, (byte) 5));
        this.c = new x010(ay0Var.i, (wen0) objB, new ap51(3, (lnm) null, (byte) 5), (byte) 1);
        this.d = o381.a;
    }

    @Override // p.xe91
    public final l381 c() {
        return this.d;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.b;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.c;
    }
}
