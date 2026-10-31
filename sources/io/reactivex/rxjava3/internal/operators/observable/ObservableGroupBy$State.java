package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableGroupBy$State<T, K> extends AtomicInteger implements Disposable, ObservableSource<T> {
    public final Object a;
    public final SpscLinkedArrayQueue b;
    public final ObservableGroupBy.GroupByObserver c;
    public final boolean d;
    public volatile boolean e;
    public Throwable f;
    public final AtomicBoolean g = new AtomicBoolean();
    public final AtomicReference h = new AtomicReference();
    public final AtomicInteger i = new AtomicInteger();

    public ObservableGroupBy$State(int i, ObservableGroupBy.GroupByObserver groupByObserver, Object obj, boolean z) {
        this.b = new SpscLinkedArrayQueue(i);
        this.c = groupByObserver;
        this.a = obj;
        this.d = z;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.b;
        boolean z = this.d;
        Observer observer = (Observer) this.h.get();
        int iAddAndGet = 1;
        while (true) {
            if (observer != null) {
                while (true) {
                    boolean z2 = this.e;
                    Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z3 = objPoll == null;
                    SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.b;
                    AtomicReference atomicReference = this.h;
                    if (this.g.get()) {
                        spscLinkedArrayQueue2.clear();
                        atomicReference.lazySet(null);
                        if ((this.i.get() & 2) == 0) {
                            ObservableGroupBy.GroupByObserver groupByObserver = this.c;
                            Object obj = this.a;
                            if (obj == null) {
                                obj = ObservableGroupBy.GroupByObserver.i;
                            }
                            groupByObserver.f.remove(obj);
                            if (groupByObserver.decrementAndGet() == 0) {
                                groupByObserver.g.dispose();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th = this.f;
                            if (th != null) {
                                spscLinkedArrayQueue2.clear();
                                atomicReference.lazySet(null);
                                observer.onError(th);
                                return;
                            } else if (z3) {
                                atomicReference.lazySet(null);
                                observer.onComplete();
                                return;
                            }
                        } else if (z3) {
                            Throwable th2 = this.f;
                            atomicReference.lazySet(null);
                            if (th2 != null) {
                                observer.onError(th2);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    }
                    if (z3) {
                        break;
                    } else {
                        observer.onNext(objPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (observer == null) {
                observer = (Observer) this.h.get();
            }
        }
    }

    public final boolean b() {
        AtomicInteger atomicInteger = this.i;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 2);
    }

    public void dispose() {
        if (this.g.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.h.lazySet(null);
            if ((this.i.get() & 2) == 0) {
                Object obj = this.a;
                if (obj == null) {
                    obj = ObservableGroupBy.GroupByObserver.i;
                }
                ObservableGroupBy.GroupByObserver groupByObserver = this.c;
                groupByObserver.f.remove(obj);
                if (groupByObserver.decrementAndGet() == 0) {
                    groupByObserver.g.dispose();
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.g.get();
    }

    public void subscribe(Observer<? super T> observer) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.i;
            i = atomicInteger.get();
            if ((i & 1) != 0) {
                EmptyDisposable.c(new IllegalStateException("Only one Observer allowed!"), observer);
                return;
            }
        } while (!atomicInteger.compareAndSet(i, i | 1));
        observer.onSubscribe(this);
        AtomicReference atomicReference = this.h;
        atomicReference.lazySet(observer);
        if (this.g.get()) {
            atomicReference.lazySet(null);
        } else {
            a();
        }
    }
}
