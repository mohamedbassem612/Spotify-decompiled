package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.ObservableQueueDrain;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class QueueDrainObserver<T, U, V> extends QueueDrainSubscriberPad2 implements Observer<T>, ObservableQueueDrain<U, V> {
    public final SerializedObserver b;
    public final MpscLinkedQueue c;
    public volatile boolean d;
    public volatile boolean e;

    public QueueDrainObserver(SerializedObserver serializedObserver, MpscLinkedQueue mpscLinkedQueue) {
        this.b = serializedObserver;
        this.c = mpscLinkedQueue;
    }

    @Override // io.reactivex.rxjava3.internal.util.ObservableQueueDrain
    public void a(Observer observer, Object obj) {
        this.b.onNext((Collection) obj);
    }

    public final boolean b() {
        return this.a.getAndIncrement() == 0;
    }

    public final void c(Object obj, Disposable disposable) {
        AtomicInteger atomicInteger = this.a;
        int i = atomicInteger.get();
        SerializedObserver serializedObserver = this.b;
        MpscLinkedQueue mpscLinkedQueue = this.c;
        if (i == 0 && atomicInteger.compareAndSet(0, 1)) {
            a(serializedObserver, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            mpscLinkedQueue.offer(obj);
            if (!b()) {
                return;
            }
        }
        QueueDrainHelper.c(mpscLinkedQueue, serializedObserver, disposable, this);
    }

    public final void f(Object obj, Disposable disposable) {
        AtomicInteger atomicInteger = this.a;
        int i = atomicInteger.get();
        SerializedObserver serializedObserver = this.b;
        MpscLinkedQueue mpscLinkedQueue = this.c;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            mpscLinkedQueue.offer(obj);
            if (!b()) {
                return;
            }
        } else if (mpscLinkedQueue.isEmpty()) {
            a(serializedObserver, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            mpscLinkedQueue.offer(obj);
        }
        QueueDrainHelper.c(mpscLinkedQueue, serializedObserver, disposable, this);
    }

    public final int g(int i) {
        return this.a.addAndGet(i);
    }
}
