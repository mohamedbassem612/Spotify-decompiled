package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {
    public final moy0[] b;
    public final Iterable c;
    public final Function d;
    public final int e;

    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        public volatile boolean X;
        public final AtomicThrowable Y;
        public final gnc1 a;
        public final Function b;
        public final CombineLatestInnerSubscriber[] c;
        public final SpscLinkedArrayQueue d;
        public final Object[] e;
        public boolean f;
        public int g;
        public int h;
        public volatile boolean i;
        public final AtomicLong t;

        public CombineLatestCoordinator(gnc1 gnc1Var, Function function, int i, int i2) {
            this.a = gnc1Var;
            this.b = function;
            CombineLatestInnerSubscriber[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                combineLatestInnerSubscriberArr[i3] = new CombineLatestInnerSubscriber(this, i3, i2);
            }
            this.c = combineLatestInnerSubscriberArr;
            this.e = new Object[i];
            this.d = new SpscLinkedArrayQueue(i2);
            this.t = new AtomicLong();
            this.Y = new AtomicThrowable();
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            this.f = true;
            return 2;
        }

        public final void b() {
            for (CombineLatestInnerSubscriber combineLatestInnerSubscriber : this.c) {
                combineLatestInnerSubscriber.getClass();
                SubscriptionHelper.a(combineLatestInnerSubscriber);
            }
        }

        public final boolean c(boolean z, boolean z2, gnc1 gnc1Var, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            if (this.i) {
                b();
                spscLinkedArrayQueue.clear();
                this.Y.b();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable thD = ExceptionHelper.d(this.Y);
            if (thD != null && thD != ExceptionHelper.a) {
                b();
                spscLinkedArrayQueue.clear();
                gnc1Var.onError(thD);
                return true;
            }
            if (!z2) {
                return false;
            }
            b();
            gnc1Var.onComplete();
            return true;
        }

        @Override // p.pnc1
        public final void cancel() {
            this.i = true;
            b();
            d();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.d.clear();
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            boolean z = this.f;
            gnc1 gnc1Var = this.a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.d;
            int iAddAndGet = 1;
            if (z) {
                while (!this.i) {
                    Throwable th = this.Y.get();
                    if (th != null) {
                        spscLinkedArrayQueue.clear();
                        gnc1Var.onError(th);
                        return;
                    }
                    boolean z2 = this.X;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (!zIsEmpty) {
                        gnc1Var.onNext(null);
                    }
                    if (z2 && zIsEmpty) {
                        gnc1Var.onComplete();
                        return;
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
                return;
            }
            int iAddAndGet2 = 1;
            do {
                long j = this.t.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z3 = this.X;
                    Object objPoll = spscLinkedArrayQueue.poll();
                    boolean z4 = objPoll == null;
                    if (c(z3, z4, gnc1Var, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    try {
                        Object objApply = this.b.apply((Object[]) spscLinkedArrayQueue.poll());
                        Objects.requireNonNull(objApply, "The combiner returned a null value");
                        gnc1Var.onNext(objApply);
                        ((CombineLatestInnerSubscriber) objPoll).a();
                        j2++;
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        b();
                        ExceptionHelper.a(this.Y, th2);
                        gnc1Var.onError(ExceptionHelper.d(this.Y));
                        return;
                    }
                }
                if (j2 == j && c(this.X, spscLinkedArrayQueue.isEmpty(), gnc1Var, spscLinkedArrayQueue)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.t.addAndGet(-j2);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.d;
            Object objPoll = spscLinkedArrayQueue.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.b.apply((Object[]) spscLinkedArrayQueue.poll());
            Objects.requireNonNull(objApply, "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) objPoll).a();
            return objApply;
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.t, j);
                d();
            }
        }

        public void subscribe(moy0[] moy0VarArr, int i) {
            CombineLatestInnerSubscriber[] combineLatestInnerSubscriberArr = this.c;
            for (int i2 = 0; i2 < i && !this.X && !this.i; i2++) {
                moy0VarArr[i2].subscribe(combineLatestInnerSubscriberArr[i2]);
            }
        }
    }

    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<pnc1> implements FlowableSubscriber<T> {
        public final CombineLatestCoordinator a;
        public final int b;
        public final int c;
        public final int d;
        public int e;

        public CombineLatestInnerSubscriber(CombineLatestCoordinator combineLatestCoordinator, int i, int i2) {
            this.a = combineLatestCoordinator;
            this.b = i;
            this.c = i2;
            this.d = i2 - (i2 >> 2);
        }

        public final void a() {
            int i = this.e + 1;
            if (i != this.d) {
                this.e = i;
            } else {
                this.e = 0;
                get().request(i);
            }
        }

        @Override // p.gnc1
        public final void onComplete() {
            int i;
            CombineLatestCoordinator combineLatestCoordinator = this.a;
            int i2 = this.b;
            synchronized (combineLatestCoordinator) {
                try {
                    Object[] objArr = combineLatestCoordinator.e;
                    if (objArr[i2] != null && (i = combineLatestCoordinator.h + 1) != objArr.length) {
                        combineLatestCoordinator.h = i;
                    } else {
                        combineLatestCoordinator.X = true;
                        combineLatestCoordinator.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            CombineLatestCoordinator combineLatestCoordinator = this.a;
            if (!ExceptionHelper.a(combineLatestCoordinator.Y, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            combineLatestCoordinator.b();
            combineLatestCoordinator.X = true;
            combineLatestCoordinator.d();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            boolean z;
            CombineLatestCoordinator combineLatestCoordinator = this.a;
            int i = this.b;
            synchronized (combineLatestCoordinator) {
                try {
                    Object[] objArr = combineLatestCoordinator.e;
                    int i2 = combineLatestCoordinator.g;
                    if (objArr[i] == null) {
                        i2++;
                        combineLatestCoordinator.g = i2;
                    }
                    objArr[i] = obj;
                    if (objArr.length == i2) {
                        combineLatestCoordinator.d.b(combineLatestCoordinator.c[i], objArr.clone());
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                combineLatestCoordinator.c[i].a();
            } else {
                combineLatestCoordinator.d();
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            long j = this.c;
            if (SubscriptionHelper.d(this, pnc1Var)) {
                pnc1Var.request(j);
            }
        }
    }

    public FlowableCombineLatest(moy0[] moy0VarArr, Function function, int i) {
        this.b = moy0VarArr;
        this.c = null;
        this.d = function;
        this.e = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        int length;
        pnc1 pnc1Var = EmptySubscription.a;
        moy0[] moy0VarArr = this.b;
        if (moy0VarArr == null) {
            moy0VarArr = new moy0[8];
            try {
                length = 0;
                for (moy0 moy0Var : this.c) {
                    if (length == moy0VarArr.length) {
                        moy0[] moy0VarArr2 = new moy0[(length >> 2) + length];
                        System.arraycopy(moy0VarArr, 0, moy0VarArr2, 0, length);
                        moy0VarArr = moy0VarArr2;
                    }
                    int i = length + 1;
                    Objects.requireNonNull(moy0Var, "The Iterator returned a null Publisher");
                    moy0VarArr[length] = moy0Var;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                gnc1Var.onSubscribe(pnc1Var);
                gnc1Var.onError(th);
                return;
            }
        } else {
            length = moy0VarArr.length;
        }
        if (length == 0) {
            gnc1Var.onSubscribe(pnc1Var);
            gnc1Var.onComplete();
        } else {
            if (length == 1) {
                moy0VarArr[0].subscribe(new FlowableMap.MapSubscriber(gnc1Var, new SingletonArrayFunc(this)));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(gnc1Var, this.d, length, this.e);
            gnc1Var.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(moy0VarArr, length);
        }
    }

    public FlowableCombineLatest(Iterable iterable, Function function, int i) {
        this.b = null;
        this.c = iterable;
        this.d = function;
        this.e = i;
    }
}
