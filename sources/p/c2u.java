package p;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class c2u {
    public static final UUID a;

    static {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        a = new UUID((threadLocalRandomCurrent.nextLong() & (-61441)) | 16384, (threadLocalRandomCurrent.nextLong() & 4611686018427387903L) | Long.MIN_VALUE);
    }

    public static UUID a() {
        return a;
    }
}
