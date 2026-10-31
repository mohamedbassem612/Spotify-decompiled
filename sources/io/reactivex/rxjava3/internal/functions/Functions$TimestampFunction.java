package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Functions$TimestampFunction<T> implements Function<T, Timed<T>> {
    public final TimeUnit a;

    public Functions$TimestampFunction(TimeUnit timeUnit, Scheduler scheduler) {
        this.a = timeUnit;
    }

    public final Object apply(Object obj) {
        TimeUnit timeUnit = this.a;
        return new Timed(obj, Scheduler.a(timeUnit), timeUnit);
    }
}
