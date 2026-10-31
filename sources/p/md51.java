package p;

import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class md51 implements UnaryOperator {
    public final /* synthetic */ long a;

    public md51(long j) {
        this.a = j;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((l270) obj).f(this.a, TimeUnit.SECONDS);
    }
}
