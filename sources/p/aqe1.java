package p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aqe1 implements vr20 {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ ssw0 d;
    public final /* synthetic */ long e;

    public aqe1(p811 p811Var, AtomicInteger atomicInteger, p811 p811Var2, ssw0 ssw0Var, long j) {
        this.a = p811Var;
        this.b = atomicInteger;
        this.c = p811Var2;
        this.d = ssw0Var;
        this.e = j;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        p811 p811Var = this.a;
        p811Var.a = obj;
        AtomicInteger atomicInteger = this.b;
        atomicInteger.incrementAndGet();
        p811 p811Var2 = this.c;
        Object obj2 = p811Var2.a;
        if (obj2 == null || !((faa0) obj2).isActive()) {
            long j = this.e;
            ssw0 ssw0Var = this.d;
            p811Var2.a = c921.y(ssw0Var, (o8n) null, 0, new zpe1(atomicInteger, ssw0Var, p811Var, j, null), 3);
        }
        return rih1.a;
    }
}
