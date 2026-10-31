package com.spotify.mobius.rx3;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import p.lxh1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
abstract class Transformers {

    /* JADX INFO: renamed from: com.spotify.mobius.rx3.Transformers$1, reason: invalid class name */
    class AnonymousClass1 implements ObservableTransformer<Object, Object> {
        public final /* synthetic */ Scheduler a;
        public final /* synthetic */ Action b;

        public AnonymousClass1(Scheduler scheduler, Action action) {
            this.a = scheduler;
            this.b = action;
        }

        public final ObservableSource apply(Observable observable) {
            return observable.flatMapCompletable(new Function<Object, CompletableSource>() { // from class: com.spotify.mobius.rx3.Transformers.1.1
                public final Object apply(Object obj) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    Scheduler scheduler = anonymousClass1.a;
                    Action action = anonymousClass1.b;
                    return scheduler == null ? new CompletableFromAction(action) : new CompletableFromAction(action).s(scheduler);
                }
            }).w();
        }
    }

    /* JADX INFO: renamed from: com.spotify.mobius.rx3.Transformers$3, reason: invalid class name */
    class AnonymousClass3 implements ObservableTransformer<Object, Object> {
        public final /* synthetic */ Function a;
        public final /* synthetic */ Scheduler b;

        public AnonymousClass3(Function function, Scheduler scheduler) {
            this.a = function;
            this.b = scheduler;
        }

        public final ObservableSource apply(Observable observable) {
            return observable.flatMap(new Function<Object, ObservableSource<Object>>() { // from class: com.spotify.mobius.rx3.Transformers.3.1
                public final Object apply(final Object obj) {
                    Observable observableFromSupplier = Observable.fromSupplier(new Supplier<Object>() { // from class: com.spotify.mobius.rx3.Transformers.3.1.1
                        public final Object get() {
                            return AnonymousClass3.this.a.apply(obj);
                        }
                    });
                    Scheduler scheduler = AnonymousClass3.this.b;
                    return scheduler == null ? observableFromSupplier : observableFromSupplier.subscribeOn(scheduler);
                }
            });
        }
    }

    public static ObservableTransformer a(Scheduler scheduler, Action action) {
        return new AnonymousClass1(scheduler, action);
    }

    public static ObservableTransformer b(Action action) {
        return new AnonymousClass1(null, action);
    }

    public static ObservableTransformer c(Consumer consumer) {
        return new 2(consumer, (Scheduler) null);
    }

    public static ObservableTransformer d(Consumer consumer, Scheduler scheduler) {
        return new 2(consumer, scheduler);
    }

    public static ObservableTransformer e(Function function) {
        return new AnonymousClass3(function, null);
    }

    public static ObservableTransformer f(lxh1 lxh1Var, Scheduler scheduler) {
        return new AnonymousClass3(lxh1Var, scheduler);
    }
}
