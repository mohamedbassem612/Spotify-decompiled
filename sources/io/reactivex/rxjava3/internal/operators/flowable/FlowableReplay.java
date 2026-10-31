package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.dv20;
import p.eg;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> {
    public static final Supplier f = new DefaultUnboundedFactory();
    public final Flowable b;
    public final AtomicReference c;
    public final Supplier d;
    public final moy0 e;

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        public Node a;
        public int b;
        public long c;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void b() {
            long j = this.c + 1;
            this.c = j;
            Node node = new Node(j, NotificationLite.a);
            this.a.set(node);
            this.a = node;
            this.b++;
            Node node2 = get();
            if (node2.a != null) {
                Node node3 = new Node(0L, null);
                node3.lazySet(node2.get());
                set(node3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void d(Throwable th) {
            Object objE = NotificationLite.e(th);
            long j = this.c + 1;
            this.c = j;
            Node node = new Node(j, objE);
            this.a.set(node);
            this.a = node;
            this.b++;
            Node node2 = get();
            if (node2.a != null) {
                Node node3 = new Node(0L, null);
                node3.lazySet(node2.get());
                set(node3);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void e(Object obj) {
            long j = this.c + 1;
            this.c = j;
            Node node = new Node(j, obj);
            this.a.set(node);
            this.a = node;
            this.b++;
            SizeBoundReplayBuffer sizeBoundReplayBuffer = (SizeBoundReplayBuffer) this;
            if (sizeBoundReplayBuffer.b > sizeBoundReplayBuffer.d) {
                Node node2 = sizeBoundReplayBuffer.get().get();
                if (node2 == null) {
                    eg.m("Empty list!");
                } else {
                    sizeBoundReplayBuffer.b--;
                    sizeBoundReplayBuffer.set(node2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void i(InnerSubscription innerSubscription) {
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.e) {
                        innerSubscription.f = true;
                        return;
                    }
                    innerSubscription.e = true;
                    while (true) {
                        long j = innerSubscription.get();
                        boolean z = j == Long.MAX_VALUE;
                        Node node = (Node) innerSubscription.c;
                        if (node == null) {
                            node = get();
                            innerSubscription.c = node;
                            BackpressureHelper.a(innerSubscription.d, node.b);
                        }
                        long j2 = 0;
                        while (j != 0) {
                            if (!innerSubscription.isDisposed()) {
                                Node node2 = node.get();
                                if (node2 == null) {
                                    break;
                                }
                                Object obj = node2.a;
                                try {
                                    if (NotificationLite.b(obj, innerSubscription.b)) {
                                        innerSubscription.c = null;
                                        return;
                                    } else {
                                        j2++;
                                        j--;
                                        node = node2;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.a(th);
                                    innerSubscription.c = null;
                                    innerSubscription.dispose();
                                    if (NotificationLite.h(obj) || NotificationLite.g(obj)) {
                                        RxJavaPlugins.b(th);
                                        return;
                                    } else {
                                        innerSubscription.b.onError(th);
                                        return;
                                    }
                                }
                            } else {
                                innerSubscription.c = null;
                                return;
                            }
                        }
                        if (j == 0 && innerSubscription.isDisposed()) {
                            innerSubscription.c = null;
                            return;
                        }
                        if (j2 != 0) {
                            innerSubscription.c = node;
                            if (!z) {
                                BackpressureHelper.f(innerSubscription, j2);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.f) {
                                    innerSubscription.e = false;
                                    return;
                                }
                                innerSubscription.f = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public static final class DefaultUnboundedFactory implements Supplier<Object> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class InnerSubscription<T> extends AtomicLong implements pnc1, Disposable {
        public final ReplaySubscriber a;
        public final gnc1 b;
        public Serializable c;
        public final AtomicLong d = new AtomicLong();
        public boolean e;
        public boolean f;

        public InnerSubscription(ReplaySubscriber replaySubscriber, gnc1 gnc1Var) {
            this.a = replaySubscriber;
            this.b = gnc1Var;
        }

        @Override // p.pnc1
        public final void cancel() {
            dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                ReplaySubscriber replaySubscriber = this.a;
                replaySubscriber.b(this);
                replaySubscriber.a();
                this.c = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (!SubscriptionHelper.e(j) || BackpressureHelper.b(this, j) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.a(this.d, j);
            ReplaySubscriber replaySubscriber = this.a;
            replaySubscriber.a();
            replaySubscriber.a.i(this);
        }
    }

    public static final class Node extends AtomicReference<Node> {
        public final Object a;
        public final long b;

        public Node(long j, Object obj) {
            this.a = obj;
            this.b = j;
        }
    }

    public interface ReplayBuffer<T> {
        void b();

        void d(Throwable th);

        void e(Object obj);

        void i(InnerSubscription innerSubscription);
    }

    public static final class ReplayBufferSupplier<T> implements Supplier<ReplayBuffer<T>> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new SizeBoundReplayBuffer();
        }
    }

    public static final class ReplayPublisher<T> implements moy0 {
        public final AtomicReference a;
        public final Supplier b;

        public ReplayPublisher(AtomicReference atomicReference, Supplier supplier) {
            this.a = atomicReference;
            this.b = supplier;
        }

        @Override // p.moy0
        public void subscribe(gnc1 gnc1Var) {
            ReplaySubscriber replaySubscriber;
            InnerSubscription[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            loop0: while (true) {
                AtomicReference atomicReference = this.a;
                replaySubscriber = (ReplaySubscriber) atomicReference.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber replaySubscriber2 = new ReplaySubscriber((ReplayBuffer) this.b.get(), atomicReference);
                    do {
                        if (atomicReference.compareAndSet(null, replaySubscriber2)) {
                            replaySubscriber = replaySubscriber2;
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    EmptySubscription.c(th, gnc1Var);
                    return;
                }
            }
            InnerSubscription innerSubscription = new InnerSubscription(replaySubscriber, gnc1Var);
            gnc1Var.onSubscribe(innerSubscription);
            AtomicReference atomicReference2 = replaySubscriber.c;
            do {
                innerSubscriptionArr = (InnerSubscription[]) atomicReference2.get();
                if (innerSubscriptionArr == ReplaySubscriber.i) {
                    break;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!dv20.o(atomicReference2, innerSubscriptionArr, innerSubscriptionArr2));
            if (innerSubscription.isDisposed()) {
                replaySubscriber.b(innerSubscription);
            } else {
                replaySubscriber.a();
                replaySubscriber.a.i(innerSubscription);
            }
        }
    }

    public static final class ReplaySubscriber<T> extends AtomicReference<pnc1> implements FlowableSubscriber<T>, Disposable {
        public static final InnerSubscription[] h = new InnerSubscription[0];
        public static final InnerSubscription[] i = new InnerSubscription[0];
        public final ReplayBuffer a;
        public boolean b;
        public long f;
        public final AtomicReference g;
        public final AtomicInteger e = new AtomicInteger();
        public final AtomicReference c = new AtomicReference(h);
        public final AtomicBoolean d = new AtomicBoolean();

        public ReplaySubscriber(ReplayBuffer replayBuffer, AtomicReference atomicReference) {
            this.a = replayBuffer;
            this.g = atomicReference;
        }

        public final void a() {
            AtomicInteger atomicInteger = this.e;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                pnc1 pnc1Var = get();
                if (pnc1Var != null) {
                    long j = this.f;
                    long jMax = j;
                    for (InnerSubscription innerSubscription : (InnerSubscription[]) this.c.get()) {
                        jMax = Math.max(jMax, innerSubscription.d.get());
                    }
                    long j2 = jMax - j;
                    if (j2 != 0) {
                        this.f = jMax;
                        pnc1Var.request(j2);
                    }
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(InnerSubscription innerSubscription) {
            InnerSubscription[] innerSubscriptionArr;
            while (true) {
                AtomicReference atomicReference = this.c;
                InnerSubscription[] innerSubscriptionArr2 = (InnerSubscription[]) atomicReference.get();
                int length = innerSubscriptionArr2.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerSubscriptionArr2[i2].equals(innerSubscription)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr = h;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr2, 0, innerSubscriptionArr3, 0, i2);
                    System.arraycopy(innerSubscriptionArr2, i2 + 1, innerSubscriptionArr3, i2, (length - i2) - 1);
                    innerSubscriptionArr = innerSubscriptionArr3;
                }
                while (!atomicReference.compareAndSet(innerSubscriptionArr2, innerSubscriptionArr)) {
                    if (atomicReference.get() != innerSubscriptionArr2) {
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.c.set(i);
            dv20.m(this.g, this);
            SubscriptionHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c.get() == i;
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            ReplayBuffer replayBuffer = this.a;
            replayBuffer.b();
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.c.getAndSet(i)) {
                replayBuffer.i(innerSubscription);
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.b(th);
                return;
            }
            this.b = true;
            ReplayBuffer replayBuffer = this.a;
            replayBuffer.d(th);
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.c.getAndSet(i)) {
                replayBuffer.i(innerSubscription);
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.b) {
                return;
            }
            ReplayBuffer replayBuffer = this.a;
            replayBuffer.e(obj);
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.c.get()) {
                replayBuffer.i(innerSubscription);
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this, pnc1Var)) {
                a();
                for (InnerSubscription innerSubscription : (InnerSubscription[]) this.c.get()) {
                    this.a.i(innerSubscription);
                }
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        public final boolean d;

        public SizeBoundReplayBuffer() {
            Node node = new Node(0L, null);
            this.a = node;
            set(node);
            this.d = true;
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        public volatile int a;

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void b() {
            add(NotificationLite.a);
            this.a++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void d(Throwable th) {
            add(NotificationLite.e(th));
            this.a++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void e(Object obj) {
            add(obj);
            this.a++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void i(InnerSubscription innerSubscription) {
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.e) {
                        innerSubscription.f = true;
                        return;
                    }
                    innerSubscription.e = true;
                    gnc1 gnc1Var = innerSubscription.b;
                    while (!innerSubscription.isDisposed()) {
                        int i = this.a;
                        Integer num = (Integer) innerSubscription.c;
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j = innerSubscription.get();
                        long j2 = j;
                        long j3 = 0;
                        while (j2 != 0 && iIntValue < i) {
                            Object obj = get(iIntValue);
                            try {
                                if (NotificationLite.b(obj, gnc1Var) || innerSubscription.isDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j2--;
                                j3++;
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                innerSubscription.dispose();
                                if (NotificationLite.h(obj) || NotificationLite.g(obj)) {
                                    RxJavaPlugins.b(th);
                                    return;
                                } else {
                                    gnc1Var.onError(th);
                                    return;
                                }
                            }
                        }
                        if (j3 != 0) {
                            innerSubscription.c = Integer.valueOf(iIntValue);
                            if (j != Long.MAX_VALUE) {
                                BackpressureHelper.f(innerSubscription, j3);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.f) {
                                    innerSubscription.e = false;
                                    return;
                                }
                                innerSubscription.f = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public FlowableReplay(moy0 moy0Var, Flowable flowable, AtomicReference atomicReference, Supplier supplier) {
        this.e = moy0Var;
        this.b = flowable;
        this.c = atomicReference;
        this.d = supplier;
    }

    public static FlowableReplay f0(Flowable flowable) {
        return g0(flowable, new ReplayBufferSupplier());
    }

    public static FlowableReplay g0(Flowable flowable, Supplier supplier) {
        AtomicReference atomicReference = new AtomicReference();
        return new FlowableReplay(new ReplayPublisher(atomicReference, supplier), flowable, atomicReference, supplier);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.e.subscribe(gnc1Var);
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public final void d0(Consumer consumer) {
        ReplaySubscriber replaySubscriber;
        loop0: while (true) {
            AtomicReference atomicReference = this.c;
            replaySubscriber = (ReplaySubscriber) atomicReference.get();
            if (replaySubscriber != null && !replaySubscriber.isDisposed()) {
                break;
            }
            try {
                ReplaySubscriber replaySubscriber2 = new ReplaySubscriber((ReplayBuffer) this.d.get(), atomicReference);
                do {
                    if (atomicReference.compareAndSet(replaySubscriber, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break loop0;
                    }
                } while (atomicReference.get() == replaySubscriber);
            } catch (Throwable th) {
                Exceptions.a(th);
                throw ExceptionHelper.f(th);
            }
        }
        AtomicBoolean atomicBoolean = replaySubscriber.d;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            consumer.accept(replaySubscriber);
            if (z) {
                this.b.subscribe((FlowableSubscriber) replaySubscriber);
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            Exceptions.a(th2);
            throw ExceptionHelper.f(th2);
        }
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public final void e0() {
        AtomicReference atomicReference = this.c;
        ReplaySubscriber replaySubscriber = (ReplaySubscriber) atomicReference.get();
        if (replaySubscriber == null || !replaySubscriber.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(replaySubscriber, null) && atomicReference.get() == replaySubscriber) {
        }
    }
}
