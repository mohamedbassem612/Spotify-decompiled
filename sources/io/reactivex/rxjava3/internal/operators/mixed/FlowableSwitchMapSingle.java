package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.mev;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {
    public final FlowableObserveOn b;
    public final mev c;

    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
        public static final SwitchMapSingleObserver X = new SwitchMapSingleObserver(null);
        public final gnc1 a;
        public final Function b;
        public final boolean c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicLong e = new AtomicLong();
        public final AtomicReference f = new AtomicReference();
        public pnc1 g;
        public volatile boolean h;
        public volatile boolean i;
        public long t;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            public final SwitchMapSingleSubscriber a;
            public volatile Object b;

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber switchMapSingleSubscriber) {
                this.a = switchMapSingleSubscriber;
            }

            public final void onError(Throwable th) {
                SwitchMapSingleSubscriber switchMapSingleSubscriber = this.a;
                AtomicReference atomicReference = switchMapSingleSubscriber.f;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.b(th);
                        return;
                    }
                }
                if (switchMapSingleSubscriber.d.a(th)) {
                    if (!switchMapSingleSubscriber.c) {
                        switchMapSingleSubscriber.g.cancel();
                        switchMapSingleSubscriber.a();
                    }
                    switchMapSingleSubscriber.b();
                }
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }

            public final void onSuccess(Object obj) {
                this.b = obj;
                this.a.b();
            }
        }

        public SwitchMapSingleSubscriber(gnc1 gnc1Var, Function function, boolean z) {
            this.a = gnc1Var;
            this.b = function;
            this.c = z;
        }

        public final void a() {
            AtomicReference atomicReference = this.f;
            SwitchMapSingleObserver switchMapSingleObserver = X;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.a(switchMapSingleObserver2);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            gnc1 gnc1Var = this.a;
            AtomicThrowable atomicThrowable = this.d;
            AtomicReference atomicReference = this.f;
            AtomicLong atomicLong = this.e;
            long j = this.t;
            int iAddAndGet = 1;
            while (!this.i) {
                if (atomicThrowable.get() != null && !this.c) {
                    atomicThrowable.e(gnc1Var);
                    return;
                }
                boolean z = this.h;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z2 = switchMapSingleObserver == null;
                if (z && z2) {
                    atomicThrowable.e(gnc1Var);
                    return;
                }
                if (z2 || switchMapSingleObserver.b == null || j == atomicLong.get()) {
                    this.t = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    gnc1Var.onNext(switchMapSingleObserver.b);
                    j++;
                }
            }
        }

        public final void cancel() {
            this.i = true;
            this.g.cancel();
            a();
            this.d.b();
        }

        public final void onComplete() {
            this.h = true;
            b();
        }

        public final void onError(Throwable th) {
            if (this.d.a(th)) {
                if (!this.c) {
                    a();
                }
                this.h = true;
                b();
            }
        }

        public final void onNext(Object obj) {
            SwitchMapSingleObserver switchMapSingleObserver = X;
            AtomicReference atomicReference = this.f;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver2 != null) {
                DisposableHelper.a(switchMapSingleObserver2);
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objApply;
                SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
                while (true) {
                    SwitchMapSingleObserver switchMapSingleObserver4 = (SwitchMapSingleObserver) atomicReference.get();
                    if (switchMapSingleObserver4 == switchMapSingleObserver) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(switchMapSingleObserver4, switchMapSingleObserver3)) {
                            singleSource.subscribe(switchMapSingleObserver3);
                            return;
                        }
                    } while (atomicReference.get() == switchMapSingleObserver4);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.g.cancel();
                atomicReference.getAndSet(switchMapSingleObserver);
                onError(th);
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.g, pnc1Var)) {
                this.g = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }

        public final void request(long j) {
            BackpressureHelper.a(this.e, j);
            b();
        }
    }

    public FlowableSwitchMapSingle(FlowableObserveOn flowableObserveOn, mev mevVar) {
        this.b = flowableObserveOn;
        this.c = mevVar;
    }

    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new SwitchMapSingleSubscriber(gnc1Var, this.c, false));
    }
}
