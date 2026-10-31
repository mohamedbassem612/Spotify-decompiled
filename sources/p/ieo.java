package p;

import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ieo implements UnaryOperator {
    public static final ieo a = new ieo();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return ((l270) obj).f(30L, timeUnit).g(30L, timeUnit);
    }
}
