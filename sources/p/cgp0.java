package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cgp0 implements Function {
    public final byte a;
    public final short b;
    public final Scheduler c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public cgp0(int i, long j, Scheduler scheduler) {
        this.a = i;
        this.b = (int) j;
        this.c = scheduler;
    }

    public final Object apply(Object obj) {
        return ((Observable) obj).zipWith(Observable.range(1, this.a + 1), new ncn0((byte) 26)).flatMap(new m6k0(this, (byte) 20));
    }
}
