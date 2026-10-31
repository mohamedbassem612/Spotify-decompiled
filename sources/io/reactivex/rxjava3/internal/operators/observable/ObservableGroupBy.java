package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observables.GroupedObservable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableGroupBy<T, K, V> extends AbstractObservableWithUpstream<T, GroupedObservable<K, V>> {
    public final Function b;
    public final Function c;
    public final int d;
    public final boolean e;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {
        public static final Object i = new Object();
        public final Observer a;
        public final Function b;
        public final Function c;
        public final int d;
        public final boolean e;
        public Disposable g;
        public final AtomicBoolean h = new AtomicBoolean();
        public final ConcurrentHashMap f = new ConcurrentHashMap();

        public GroupByObserver(Observer observer, Function function, Function function2, int i2, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = function2;
            this.d = i2;
            this.e = z;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.g.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.h.get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            ConcurrentHashMap concurrentHashMap = this.f;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((GroupedUnicast) it.next()).onComplete();
            }
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            ConcurrentHashMap concurrentHashMap = this.f;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((GroupedUnicast) it.next()).onError(th);
            }
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            boolean z;
            Observer observer = this.a;
            try {
                Object objApply = this.b.apply(obj);
                Object obj2 = i;
                Object obj3 = objApply != null ? objApply : obj2;
                ConcurrentHashMap concurrentHashMap = this.f;
                GroupedUnicast groupedUnicastA = (GroupedUnicast) concurrentHashMap.get(obj3);
                if (groupedUnicastA != null) {
                    z = false;
                } else {
                    if (this.h.get()) {
                        return;
                    }
                    groupedUnicastA = GroupedUnicast.a(this.d, this, objApply, this.e);
                    concurrentHashMap.put(obj3, groupedUnicastA);
                    getAndIncrement();
                    z = true;
                }
                try {
                    Object objApply2 = this.c.apply(obj);
                    Objects.requireNonNull(objApply2, "The value supplied is null");
                    groupedUnicastA.onNext(objApply2);
                    if (z) {
                        observer.onNext(groupedUnicastA);
                        if (groupedUnicastA.b.b()) {
                            if (objApply == null) {
                                objApply = obj2;
                            }
                            concurrentHashMap.remove(objApply);
                            if (decrementAndGet() == 0) {
                                this.g.dispose();
                            }
                            groupedUnicastA.onComplete();
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.a(th);
                    this.g.dispose();
                    if (z) {
                        observer.onNext(groupedUnicastA);
                    }
                    onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                this.g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.g, disposable)) {
                this.g = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableGroupBy(Observable observable, Function function, Function function2, int i, boolean z) {
        super(observable);
        this.b = function;
        this.c = function2;
        this.d = i;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new GroupByObserver(observer, this.b, this.c, this.d, this.e));
    }
}
