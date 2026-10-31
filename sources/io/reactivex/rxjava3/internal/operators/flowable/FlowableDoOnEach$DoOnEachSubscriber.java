package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableDoOnEach$DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {
    public final Consumer f;
    public final Consumer g;
    public final Action h;
    public final Action i;

    public FlowableDoOnEach$DoOnEachSubscriber(gnc1 gnc1Var, Consumer consumer, Consumer consumer2, Action action, Action action2) {
        super(gnc1Var);
        this.f = consumer;
        this.g = consumer2;
        this.h = action;
        this.i = action2;
    }

    public final void onComplete() {
        if (((BasicFuseableSubscriber) this).d) {
            return;
        }
        try {
            this.h.run();
            ((BasicFuseableSubscriber) this).d = true;
            ((BasicFuseableSubscriber) this).a.onComplete();
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

    public final void onError(Throwable th) {
        gnc1 gnc1Var = ((BasicFuseableSubscriber) this).a;
        if (((BasicFuseableSubscriber) this).d) {
            RxJavaPlugins.b(th);
            return;
        }
        ((BasicFuseableSubscriber) this).d = true;
        try {
            this.g.accept(th);
            gnc1Var.onError(th);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            gnc1Var.onError(new CompositeException(new Throwable[]{th, th2}));
        }
        try {
            this.i.run();
        } catch (Throwable th3) {
            Exceptions.a(th3);
            RxJavaPlugins.b(th3);
        }
    }

    public final void onNext(Object obj) {
        if (((BasicFuseableSubscriber) this).d) {
            return;
        }
        int i = ((BasicFuseableSubscriber) this).e;
        gnc1 gnc1Var = ((BasicFuseableSubscriber) this).a;
        if (i != 0) {
            gnc1Var.onNext((Object) null);
            return;
        }
        try {
            this.f.accept(obj);
            gnc1Var.onNext(obj);
        } catch (Throwable th) {
            b(th);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: io.reactivex.rxjava3.exceptions.CompositeException */
    public final Object poll() throws Exception {
        Consumer consumer = this.g;
        try {
            Object objPoll = ((BasicFuseableSubscriber) this).c.poll();
            Action action = this.i;
            if (objPoll == null) {
                if (((BasicFuseableSubscriber) this).e == 1) {
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
                        throw new CompositeException(new Throwable[]{th, th3});
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
                throw new CompositeException(new Throwable[]{th5, th7});
            }
        }
    }
}
