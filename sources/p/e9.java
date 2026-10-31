package p;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class e9 extends dqz0 {
    @Override // p.dqz0
    public final int a(int i) {
        return (l().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // p.dqz0
    public final double b() {
        return l().nextDouble();
    }

    @Override // p.dqz0
    public final float e() {
        return l().nextFloat();
    }

    @Override // p.dqz0
    public final int f() {
        return l().nextInt();
    }

    @Override // p.dqz0
    public final int g(int i) {
        return l().nextInt(i);
    }

    @Override // p.dqz0
    public final long i() {
        return l().nextLong();
    }

    public Random l() {
        return ThreadLocalRandom.current();
    }
}
