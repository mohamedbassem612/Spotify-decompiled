package p;

import java.util.function.LongUnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gsw0 implements LongUnaryOperator {
    public static final gsw0 a = new gsw0();

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        eg.m("Reaction request IDs exhausted");
        return 0L;
    }
}
