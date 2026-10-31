package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDelay;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnEach;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInterval;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRange;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeat;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScalarXMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZip;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapSingle;
import io.reactivex.rxjava3.internal.subscribers.DisposableAutoReleaseSubscriber;
import io.reactivex.rxjava3.internal.subscribers.LambdaSubscriber;
import io.reactivex.rxjava3.internal.subscribers.StrictSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.ScalarSupplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p.f4i1;
import p.gnc1;
import p.hhg1;
import p.l1d;
import p.moy0;
import rxdogtag2.m;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Flowable<T> implements moy0 {
    public static final int a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static Flowable D(Object... objArr) {
        Objects.requireNonNull(objArr, "items is null");
        if (objArr.length == 0) {
            return FlowableEmpty.b;
        }
        return objArr.length == 1 ? I(objArr[0]) : new FlowableFromArray(objArr);
    }

    public static FlowableFromIterable E(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new FlowableFromIterable(iterable);
    }

    public static Flowable F(moy0 moy0Var) {
        if (moy0Var instanceof Flowable) {
            return (Flowable) moy0Var;
        }
        Objects.requireNonNull(moy0Var, "publisher is null");
        return new FlowableFromPublisher(moy0Var);
    }

    public static FlowableInterval G(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableInterval(Math.max(0L, j), Math.max(0L, j2), timeUnit, scheduler);
    }

    public static Flowable H(Object obj, Object obj2) {
        Objects.requireNonNull(obj, "item1 is null");
        Objects.requireNonNull(obj2, "item2 is null");
        return D(obj, obj2);
    }

    public static FlowableJust I(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new FlowableJust(obj);
    }

    public static Flowable K(Flowable flowable, moy0 moy0Var) {
        Objects.requireNonNull(flowable, "source1 is null");
        Objects.requireNonNull(moy0Var, "source2 is null");
        return D(flowable, moy0Var).A(Functions.a, 2, a);
    }

    public static Flowable O(int i, int i2) {
        if (i2 < 0) {
            hhg1.n(f4i1.c(i2, "count >= 0 required but it was "));
            return null;
        }
        if (i2 == 0) {
            return FlowableEmpty.b;
        }
        if (i2 == 1) {
            return I(Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
            return new FlowableRange(i, i2);
        }
        hhg1.n("Integer overflow");
        return null;
    }

    public static Flowable a(moy0 moy0Var, Flowable flowable, Flowable flowable2, Flowable flowable3, Flowable flowable4, Flowable flowable5, Function6 function6) {
        Objects.requireNonNull(flowable, "source2 is null");
        Objects.requireNonNull(flowable2, "source3 is null");
        Objects.requireNonNull(flowable4, "source5 is null");
        Objects.requireNonNull(flowable5, "source6 is null");
        return i(new moy0[]{moy0Var, flowable, flowable2, flowable3, flowable4, flowable5}, Functions.t(function6), a);
    }

    public static FlowableTimer a0(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableTimer(Math.max(0L, j), timeUnit, scheduler);
    }

    public static Flowable c(moy0 moy0Var, Flowable flowable, Flowable flowable2, Flowable flowable3, Flowable flowable4, Function5 function5) {
        Objects.requireNonNull(moy0Var, "source1 is null");
        Objects.requireNonNull(flowable, "source2 is null");
        Objects.requireNonNull(flowable2, "source3 is null");
        Objects.requireNonNull(flowable3, "source4 is null");
        Objects.requireNonNull(flowable4, "source5 is null");
        return i(new moy0[]{moy0Var, flowable, flowable2, flowable3, flowable4}, Functions.s(function5), a);
    }

    public static Flowable d(moy0 moy0Var, Flowable flowable, Flowable flowable2, Flowable flowable3, Flowable flowable4, moy0 moy0Var2, Flowable flowable5, Flowable flowable6, Function8 function8) {
        Objects.requireNonNull(flowable2, "source3 is null");
        Objects.requireNonNull(flowable3, "source4 is null");
        Objects.requireNonNull(flowable4, "source5 is null");
        Objects.requireNonNull(flowable5, "source7 is null");
        return i(new moy0[]{moy0Var, flowable, flowable2, flowable3, flowable4, moy0Var2, flowable5, flowable6}, Functions.v(function8), a);
    }

    public static Flowable e(moy0 moy0Var, moy0 moy0Var2, Flowable flowable, Function3 function3) {
        Objects.requireNonNull(moy0Var, "source1 is null");
        Objects.requireNonNull(moy0Var2, "source2 is null");
        Objects.requireNonNull(flowable, "source3 is null");
        return i(new moy0[]{moy0Var, moy0Var2, flowable}, Functions.q(function3), a);
    }

    public static Flowable g(moy0 moy0Var, moy0 moy0Var2, Flowable flowable, moy0 moy0Var3, Function4 function4) {
        Objects.requireNonNull(moy0Var, "source1 is null");
        Objects.requireNonNull(moy0Var2, "source2 is null");
        Objects.requireNonNull(flowable, "source3 is null");
        Objects.requireNonNull(moy0Var3, "source4 is null");
        return i(new moy0[]{moy0Var, moy0Var2, flowable, moy0Var3}, Functions.r(function4), a);
    }

    public static Flowable h(moy0 moy0Var, moy0 moy0Var2, BiFunction biFunction) {
        Objects.requireNonNull(moy0Var, "source1 is null");
        Objects.requireNonNull(moy0Var2, "source2 is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return i(new moy0[]{moy0Var, moy0Var2}, Functions.p(biFunction), a);
    }

    public static Flowable i(moy0[] moy0VarArr, Function function, int i) {
        if (moy0VarArr.length == 0) {
            return FlowableEmpty.b;
        }
        ObjectHelper.a(i, "bufferSize");
        return new FlowableCombineLatest(moy0VarArr, function, i);
    }

    public static Flowable k(Flowable flowable, Flowable flowable2) {
        Objects.requireNonNull(flowable, "source1 is null");
        Objects.requireNonNull(flowable2, "source2 is null");
        return l(flowable, flowable2);
    }

    public static Flowable l(moy0... moy0VarArr) {
        if (moy0VarArr.length == 0) {
            return FlowableEmpty.b;
        }
        return moy0VarArr.length == 1 ? F(moy0VarArr[0]) : new FlowableConcatArray(moy0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable A(Function function, int i, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "maxConcurrency");
        ObjectHelper.a(i2, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new FlowableFlatMap(this, function, i, i2);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? FlowableEmpty.b : FlowableScalarXMap.a(obj, function);
    }

    public final Completable B(Function function) {
        ObjectHelper.a(Integer.MAX_VALUE, "maxConcurrency");
        return new FlowableFlatMapCompletableCompletable(this, function);
    }

    public final FlowableFlatMapSingle C(Function function, boolean z, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "maxConcurrency");
        return new FlowableFlatMapSingle(this, function, z, i);
    }

    public final FlowableMap J(Function function) {
        Objects.requireNonNull(function, "mapper is null");
        return new FlowableMap(this, function);
    }

    public final FlowableObserveOn L(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        int i = a;
        ObjectHelper.a(i, "bufferSize");
        return new FlowableObserveOn(this, scheduler, i);
    }

    public final FlowableOnErrorReturn M(Function function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return new FlowableOnErrorReturn(this, function);
    }

    public final FlowableOnErrorReturn N(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return M(Functions.g(obj));
    }

    public final Flowable P(long j) {
        if (j >= 0) {
            return j == 0 ? FlowableEmpty.b : new FlowableRepeat(this, j);
        }
        hhg1.n(l1d.l(j, "times >= 0 required but it was "));
        return null;
    }

    public final FlowableReplay Q() {
        ObjectHelper.a(1, "bufferSize");
        return FlowableReplay.f0(this);
    }

    public final FlowableRetryPredicate R(long j, Predicate predicate) {
        if (j >= 0) {
            Objects.requireNonNull(predicate, "predicate is null");
            return new FlowableRetryPredicate(this, j, predicate);
        }
        hhg1.n(l1d.l(j, "times >= 0 required but it was "));
        return null;
    }

    public final FlowableSampleTimed S(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableSampleTimed(this, j, timeUnit, scheduler);
    }

    public final Flowable T(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "other is null");
        return l(moy0Var, this);
    }

    public final Flowable U(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return l(I(obj), this);
    }

    public void V(gnc1 gnc1Var) {
        gnc1Var.onSubscribe(EmptySubscription.a);
        gnc1Var.onComplete();
    }

    public final FlowableSubscribeOn W(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableSubscribeOn(this, scheduler, !(this instanceof FlowableCreate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable X(Function function) {
        int i = a;
        ObjectHelper.a(i, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new FlowableSwitchMap(this, function, i);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? FlowableEmpty.b : FlowableScalarXMap.a(obj, function);
    }

    public final FlowableTimeoutTimed Y(long j, FlowableError flowableError) {
        return Z(j, TimeUnit.SECONDS, flowableError, Schedulers.b);
    }

    public final FlowableTimeoutTimed Z(long j, TimeUnit timeUnit, FlowableError flowableError, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableTimeoutTimed(this, j, timeUnit, scheduler, flowableError);
    }

    public final FlowableWithLatestFrom b0(moy0 moy0Var, BiFunction biFunction) {
        Objects.requireNonNull(moy0Var, "other is null");
        return new FlowableWithLatestFrom(this, biFunction, moy0Var);
    }

    public final FlowableZip c0(Flowable flowable, BiFunction biFunction) {
        Objects.requireNonNull(flowable, "other is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        Function functionP = Functions.p(biFunction);
        moy0[] moy0VarArr = {this, flowable};
        int i = a;
        ObjectHelper.a(i, "bufferSize");
        return new FlowableZip(moy0VarArr, functionP, i);
    }

    public final Flowable j(FlowableTransformer flowableTransformer) {
        Objects.requireNonNull(flowableTransformer, "composer is null");
        return F(flowableTransformer.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable m(Function function) {
        ObjectHelper.a(2, "prefetch");
        if (!(this instanceof ScalarSupplier)) {
            return new FlowableConcatMap(this, function);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? FlowableEmpty.b : FlowableScalarXMap.a(obj, function);
    }

    public final FlowableConcatMapEager n(Function function, int i, int i2) {
        ObjectHelper.a(i, "maxConcurrency");
        ObjectHelper.a(i2, "prefetch");
        return new FlowableConcatMapEager(this, function, i, i2, ErrorMode.a);
    }

    public final FlowableConcatMapEager o(Function function, boolean z, int i, int i2) {
        ObjectHelper.a(i, "maxConcurrency");
        ObjectHelper.a(i2, "prefetch");
        return new FlowableConcatMapEager(this, function, i, i2, z ? ErrorMode.c : ErrorMode.b);
    }

    public final FlowableConcatMapSingle p(Function function, boolean z, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "prefetch");
        return new FlowableConcatMapSingle(this, function, z ? ErrorMode.c : ErrorMode.b, i);
    }

    public final FlowableDebounceTimed q(long j, TimeUnit timeUnit) {
        Scheduler scheduler = Schedulers.b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableDebounceTimed(this, j, timeUnit, scheduler);
    }

    public final FlowableDelay r(long j, Scheduler scheduler) {
        Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new FlowableDelay(this, Math.max(0L, j), scheduler);
    }

    public final FlowableDistinctUntilChanged s(BiPredicate biPredicate) {
        Objects.requireNonNull(biPredicate, "comparer is null");
        return new FlowableDistinctUntilChanged(this, Functions.a, biPredicate);
    }

    public final void subscribe(FlowableSubscriber<? super T> flowableSubscriber) {
        Objects.requireNonNull(flowableSubscriber, "subscriber is null");
        try {
            m mVar = RxJavaPlugins.b;
            if (mVar != null) {
                try {
                    flowableSubscriber = (FlowableSubscriber<? super T>) ((gnc1) mVar.apply(this, flowableSubscriber));
                } catch (Throwable th) {
                    throw ExceptionHelper.f(th);
                }
            }
            Objects.requireNonNull(flowableSubscriber, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            V(flowableSubscriber);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final FlowableDistinctUntilChanged t(Function function) {
        Objects.requireNonNull(function, "keySelector is null");
        return new FlowableDistinctUntilChanged(this, function, ObjectHelper.a);
    }

    public final FlowableDoOnEach u(Consumer consumer, Consumer consumer2, Action action, Action action2) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onAfterTerminate is null");
        return new FlowableDoOnEach(this, consumer, consumer2, action, action2);
    }

    public final FlowableDoOnEach v(Consumer consumer) {
        Consumer consumer2 = Functions.d;
        Action action = Functions.c;
        return u(consumer, consumer2, action, action);
    }

    public final FlowableDoOnLifecycle w(Consumer consumer) {
        LongConsumer longConsumer = Functions.g;
        Action action = Functions.c;
        Objects.requireNonNull(longConsumer, "onRequest is null");
        Objects.requireNonNull(action, "onCancel is null");
        return new FlowableDoOnLifecycle(this, consumer, longConsumer, action);
    }

    public final FlowableFilter x(Predicate predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new FlowableFilter(this, predicate);
    }

    public final Single y(Object obj) {
        Objects.requireNonNull(obj, "defaultItem is null");
        return new FlowableElementAtSingle(this, obj);
    }

    public final Single z() {
        return new FlowableElementAtSingle(this, null);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.f, Functions.c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, action);
        subscribe((FlowableSubscriber) lambdaSubscriber);
        return lambdaSubscriber;
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, DisposableContainer disposableContainer) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseSubscriber disposableAutoReleaseSubscriber = new DisposableAutoReleaseSubscriber(consumer, consumer2, action, disposableContainer);
        disposableContainer.b(disposableAutoReleaseSubscriber);
        subscribe((FlowableSubscriber) disposableAutoReleaseSubscriber);
        return disposableAutoReleaseSubscriber;
    }

    @Override // p.moy0
    public final void subscribe(gnc1 gnc1Var) {
        if (gnc1Var instanceof FlowableSubscriber) {
            subscribe((FlowableSubscriber) gnc1Var);
        } else {
            Objects.requireNonNull(gnc1Var, "subscriber is null");
            subscribe((FlowableSubscriber) new StrictSubscriber(gnc1Var));
        }
    }

    public final Disposable subscribe() {
        return subscribe(Functions.d, Functions.f, Functions.c);
    }
}
