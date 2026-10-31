package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
final class ObservableWindowSubscribeIntercept<T> extends Observable<T> {
    public final UnicastSubject a;
    public final AtomicBoolean b = new AtomicBoolean();

    public ObservableWindowSubscribeIntercept(UnicastSubject unicastSubject) {
        this.a = unicastSubject;
    }

    public final boolean a() {
        AtomicBoolean atomicBoolean = this.b;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }

    public final void subscribeActual(Observer observer) {
        this.a.subscribe(observer);
        this.b.set(true);
    }
}
