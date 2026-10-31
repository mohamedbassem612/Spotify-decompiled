package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Action c;

    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {
        public final ConditionalSubscriber a;
        public final Action b;
        public pnc1 c;
        public QueueSubscription d;
        public boolean e;

        public DoFinallyConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Action action) {
            this.a = conditionalSubscriber;
            this.b = action;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            QueueSubscription queueSubscription = this.d;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iA = queueSubscription.a(i);
            if (iA != 0) {
                this.e = iA == 1;
            }
            return iA;
        }

        public final void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        @Override // p.pnc1
        public final void cancel() {
            this.c.cancel();
            b();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.d.clear();
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public final boolean f(Object obj) {
            return this.a.f(obj);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.a.onComplete();
            b();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.a.onError(th);
            b();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                if (pnc1Var instanceof QueueSubscription) {
                    this.d = (QueueSubscription) pnc1Var;
                }
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.d.poll();
            if (objPoll == null && this.e) {
                b();
            }
            return objPoll;
        }

        @Override // p.pnc1
        public final void request(long j) {
            this.c.request(j);
        }
    }

    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final Action b;
        public pnc1 c;
        public QueueSubscription d;
        public boolean e;

        public DoFinallySubscriber(gnc1 gnc1Var, Action action) {
            this.a = gnc1Var;
            this.b = action;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            QueueSubscription queueSubscription = this.d;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iA = queueSubscription.a(i);
            if (iA != 0) {
                this.e = iA == 1;
            }
            return iA;
        }

        public final void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        @Override // p.pnc1
        public final void cancel() {
            this.c.cancel();
            b();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.d.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.a.onComplete();
            b();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.a.onError(th);
            b();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                if (pnc1Var instanceof QueueSubscription) {
                    this.d = (QueueSubscription) pnc1Var;
                }
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.d.poll();
            if (objPoll == null && this.e) {
                b();
            }
            return objPoll;
        }

        @Override // p.pnc1
        public final void request(long j) {
            this.c.request(j);
        }
    }

    public FlowableDoFinally(Flowable flowable, Action action) {
        super(flowable);
        this.c = action;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        Action action = this.c;
        Flowable flowable = this.b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DoFinallyConditionalSubscriber((ConditionalSubscriber) gnc1Var, action));
        } else {
            flowable.subscribe((FlowableSubscriber) new DoFinallySubscriber(gnc1Var, action));
        }
    }
}
