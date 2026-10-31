package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableRefCount<T> extends Flowable<T> {
    public final ConnectableFlowable b;
    public final boolean c = true;
    public RefConnection d;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        public final FlowableRefCount a;
        public long b;
        public boolean c;
        public boolean d;

        public RefConnection(FlowableRefCount flowableRefCount) {
            this.a = flowableRefCount;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.c(this, (Disposable) obj);
            synchronized (this.a) {
                try {
                    if (this.d) {
                        this.a.b.e0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.e0(this);
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final FlowableRefCount b;
        public final RefConnection c;
        public pnc1 d;

        public RefCountSubscriber(gnc1 gnc1Var, FlowableRefCount flowableRefCount, RefConnection refConnection) {
            this.a = gnc1Var;
            this.b = flowableRefCount;
            this.c = refConnection;
        }

        @Override // p.pnc1
        public final void cancel() {
            this.d.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount flowableRefCount = this.b;
                RefConnection refConnection = this.c;
                synchronized (flowableRefCount) {
                    try {
                        RefConnection refConnection2 = flowableRefCount.d;
                        if (refConnection2 != null && refConnection2 == refConnection) {
                            long j = refConnection.b - 1;
                            refConnection.b = j;
                            if (j == 0 && refConnection.c) {
                                flowableRefCount.e0(refConnection);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.b.d0(this.c);
                this.a.onComplete();
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.b(th);
            } else {
                this.b.d0(this.c);
                this.a.onError(th);
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.d, pnc1Var)) {
                this.d = pnc1Var;
                this.a.onSubscribe(this);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            this.d.request(j);
        }
    }

    public FlowableRefCount(ConnectableFlowable connectableFlowable) {
        this.b = connectableFlowable;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        RefConnection refConnection;
        boolean z;
        synchronized (this) {
            try {
                refConnection = this.d;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.d = refConnection;
                }
                long j = refConnection.b + 1;
                refConnection.b = j;
                if (refConnection.c || j != (this.c ? 1L : 0L)) {
                    z = false;
                } else {
                    z = true;
                    refConnection.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.subscribe((FlowableSubscriber) new RefCountSubscriber(gnc1Var, this, refConnection));
        if (z) {
            this.b.d0(refConnection);
        }
    }

    public final void d0(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (this.d == refConnection) {
                    long j = refConnection.b - 1;
                    refConnection.b = j;
                    if (j == 0) {
                        this.d = null;
                        this.b.e0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e0(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.b == 0 && refConnection == this.d) {
                    this.d = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.a(refConnection);
                    if (disposable == null) {
                        refConnection.d = true;
                    } else {
                        this.b.e0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
