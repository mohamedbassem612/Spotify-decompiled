package p;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lc31 {
    public final yqg a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicLong c = new AtomicLong(0);

    public lc31(yqg yqgVar) {
        this.a = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        kc31 kc31Var;
        if (onmVar instanceof kc31) {
            kc31Var = (kc31) onmVar;
            int i = kc31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kc31Var.c = i - Integer.MIN_VALUE;
            } else {
                kc31Var = new kc31(this, onmVar);
            }
        } else {
            kc31Var = new kc31(this, onmVar);
        }
        Object obj = kc31Var.a;
        int i2 = kc31Var.c;
        AtomicInteger atomicInteger = this.b;
        yqg yqgVar = this.a;
        AtomicLong atomicLong = this.c;
        if (i2 == 0) {
            hm5.M(obj);
            long jB = yqgVar.b() - atomicLong.get();
            if (atomicLong.get() > 0 && jB > 60000) {
                atomicInteger.set(0);
                atomicLong.set(0L);
            }
            int i3 = atomicInteger.get();
            long jMin = i3 == 0 ? 0L : Math.min((long) (Math.pow(2.0d, i3 - 1) * 200.0d), 3200L);
            if (jMin > 0) {
                kc31Var.c = 1;
                Object objI = hap1.i(jMin, kc31Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        atomicInteger.incrementAndGet();
        atomicLong.set(yqgVar.b());
        return rih1.a;
    }
}
