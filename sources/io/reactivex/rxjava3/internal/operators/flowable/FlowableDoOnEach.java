package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Consumer c;
    public final Consumer d;
    public final Action e;
    public final Action f;

    public static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        public final Consumer f;
        public final Consumer g;
        public final Action h;
        public final Action i;

        public DoOnEachConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f = consumer;
            this.g = consumer2;
            this.h = action;
            this.i = action2;
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public final boolean f(Object obj) {
            if (this.d) {
                return false;
            }
            try {
                this.f.accept(obj);
                return this.a.f(obj);
            } catch (Throwable th) {
                b(th);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, p.gnc1
        public final void onComplete() {
            if (this.d) {
                return;
            }
            try {
                this.h.run();
                this.d = true;
                this.a.onComplete();
                try {
                    this.i.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, p.gnc1
        public final void onError(Throwable th) {
            ConditionalSubscriber conditionalSubscriber = this.a;
            if (this.d) {
                RxJavaPlugins.b(th);
                return;
            }
            this.d = true;
            try {
                this.g.accept(th);
                conditionalSubscriber.onError(th);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                conditionalSubscriber.onError(new CompositeException(th, th2));
            }
            try {
                this.i.run();
            } catch (Throwable th3) {
                Exceptions.a(th3);
                RxJavaPlugins.b(th3);
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            int i = this.e;
            ConditionalSubscriber conditionalSubscriber = this.a;
            if (i != 0) {
                conditionalSubscriber.onNext(null);
                return;
            }
            try {
                this.f.accept(obj);
                conditionalSubscriber.onNext(obj);
            } catch (Throwable th) {
                b(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() throws Exception {
            Consumer consumer = this.g;
            try {
                Object objPoll = this.c.poll();
                Action action = this.i;
                if (objPoll == null) {
                    if (this.e == 1) {
                        this.h.run();
                        action.run();
                    }
                    return objPoll;
                }
                try {
                    this.f.accept(objPoll);
                    action.run();
                    return objPoll;
                } catch (Throwable th) {
                    try {
                        Exceptions.a(th);
                        try {
                            consumer.accept(th);
                            Throwable th2 = ExceptionHelper.a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th3) {
                            Exceptions.a(th3);
                            throw new CompositeException(th, th3);
                        }
                    } catch (Throwable th4) {
                        action.run();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                Exceptions.a(th5);
                try {
                    consumer.accept(th5);
                    Throwable th6 = ExceptionHelper.a;
                    if (th5 instanceof Exception) {
                        throw th5;
                    }
                    throw th5;
                } catch (Throwable th7) {
                    Exceptions.a(th7);
                    throw new CompositeException(th5, th7);
                }
            }
        }
    }

    public FlowableDoOnEach(Flowable flowable, Consumer consumer, Consumer consumer2, Action action, Action action2) {
        super(flowable);
        this.c = consumer;
        this.d = consumer2;
        this.e = action;
        this.f = action2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        Flowable flowable = this.b;
        Consumer consumer = this.c;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new DoOnEachConditionalSubscriber((ConditionalSubscriber) gnc1Var, consumer, this.d, this.e, this.f));
        } else {
            flowable.subscribe((FlowableSubscriber) new DoOnEachSubscriber(gnc1Var, consumer, this.d, this.e, this.f));
        }
    }
}
