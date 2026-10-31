package p;

import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ydt0 extends e9 {
    @Override // p.dqz0
    public final double c(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // p.dqz0
    public final int h(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p.dqz0
    public final long j(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // p.dqz0
    public final long k(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
