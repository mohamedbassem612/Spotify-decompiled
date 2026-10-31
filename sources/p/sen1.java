package p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sen1 {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final byte e;

    public sen1(tgo1 tgo1Var) {
        this.e = tgo1Var.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = jCurrentTimeMillis;
        this.b = jCurrentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
