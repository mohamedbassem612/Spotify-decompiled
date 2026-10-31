package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lw81 implements man {
    public final yqg a;
    public final Scheduler b;

    public lw81(yqg yqgVar, Scheduler scheduler) {
        this.a = yqgVar;
        this.b = scheduler;
    }

    public final Observable a(long j) {
        return Observable.interval(0L, 1L, TimeUnit.SECONDS, this.b).map(new o0g(j, this, (byte) 13)).takeUntil(e4x0.Z);
    }
}
