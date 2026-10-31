package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableSampleTimed$SampleTimedEmitLast<T> extends ObservableSampleTimed.SampleTimedObserver<T> {
    public final AtomicInteger g;

    public ObservableSampleTimed$SampleTimedEmitLast(SerializedObserver serializedObserver, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(serializedObserver, j, timeUnit, scheduler);
        this.g = new AtomicInteger(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Object andSet = getAndSet(null);
        SerializedObserver serializedObserver = ((ObservableSampleTimed.SampleTimedObserver) this).a;
        if (andSet != null) {
            serializedObserver.onNext(andSet);
        }
        if (this.g.decrementAndGet() == 0) {
            serializedObserver.onComplete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void run() {
        AtomicInteger atomicInteger = this.g;
        if (atomicInteger.incrementAndGet() == 2) {
            Object andSet = getAndSet(null);
            SerializedObserver serializedObserver = ((ObservableSampleTimed.SampleTimedObserver) this).a;
            if (andSet != null) {
                serializedObserver.onNext(andSet);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                serializedObserver.onComplete();
            }
        }
    }
}
