package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.fuseable.FuseToMaybe;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.jdk8.CompletionStageConsumer;
import io.reactivex.rxjava3.internal.jdk8.SingleFlattenStreamAsFlowable;
import io.reactivex.rxjava3.internal.jdk8.SingleFlattenStreamAsObservable;
import io.reactivex.rxjava3.internal.jdk8.SingleFromCompletionStage;
import io.reactivex.rxjava3.internal.jdk8.SingleMapOptional;
import io.reactivex.rxjava3.internal.observers.BiConsumerSingleObserver;
import io.reactivex.rxjava3.internal.observers.BlockingDisposableMultiObserver;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.observers.ConsumerSingleObserver;
import io.reactivex.rxjava3.internal.observers.DisposableAutoReleaseMultiObserver;
import io.reactivex.rxjava3.internal.observers.FutureMultiObserver;
import io.reactivex.rxjava3.internal.observers.SafeSingleObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromSingle;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToFlowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapSinglePublisher;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromFuture;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFromSingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElement;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableConcatMapSinglePublisher;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapSinglePublisher;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.rxjava3.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.rxjava3.internal.operators.single.SingleAmb;
import io.reactivex.rxjava3.internal.operators.single.SingleCache;
import io.reactivex.rxjava3.internal.operators.single.SingleContains;
import io.reactivex.rxjava3.internal.operators.single.SingleCreate;
import io.reactivex.rxjava3.internal.operators.single.SingleDefer;
import io.reactivex.rxjava3.internal.operators.single.SingleDelay;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithPublisher;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithSingle;
import io.reactivex.rxjava3.internal.operators.single.SingleDematerialize;
import io.reactivex.rxjava3.internal.operators.single.SingleDetach;
import io.reactivex.rxjava3.internal.operators.single.SingleDoAfterSuccess;
import io.reactivex.rxjava3.internal.operators.single.SingleDoAfterTerminate;
import io.reactivex.rxjava3.internal.operators.single.SingleDoFinally;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnDispose;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnError;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnEvent;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnSubscribe;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.rxjava3.internal.operators.single.SingleDoOnTerminate;
import io.reactivex.rxjava3.internal.operators.single.SingleEquals;
import io.reactivex.rxjava3.internal.operators.single.SingleError;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMap;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapBiSelector;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapIterableFlowable;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapIterableObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapNotification;
import io.reactivex.rxjava3.internal.operators.single.SingleFlatMapPublisher;
import io.reactivex.rxjava3.internal.operators.single.SingleFromCallable;
import io.reactivex.rxjava3.internal.operators.single.SingleFromPublisher;
import io.reactivex.rxjava3.internal.operators.single.SingleFromSupplier;
import io.reactivex.rxjava3.internal.operators.single.SingleFromUnsafeSource;
import io.reactivex.rxjava3.internal.operators.single.SingleHide;
import io.reactivex.rxjava3.internal.operators.single.SingleInternalHelper;
import io.reactivex.rxjava3.internal.operators.single.SingleJust;
import io.reactivex.rxjava3.internal.operators.single.SingleLift;
import io.reactivex.rxjava3.internal.operators.single.SingleMap;
import io.reactivex.rxjava3.internal.operators.single.SingleMaterialize;
import io.reactivex.rxjava3.internal.operators.single.SingleNever;
import io.reactivex.rxjava3.internal.operators.single.SingleObserveOn;
import io.reactivex.rxjava3.internal.operators.single.SingleOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.single.SingleOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.single.SingleResumeNext;
import io.reactivex.rxjava3.internal.operators.single.SingleSubscribeOn;
import io.reactivex.rxjava3.internal.operators.single.SingleTakeUntil;
import io.reactivex.rxjava3.internal.operators.single.SingleTimeInterval;
import io.reactivex.rxjava3.internal.operators.single.SingleTimeout;
import io.reactivex.rxjava3.internal.operators.single.SingleTimer;
import io.reactivex.rxjava3.internal.operators.single.SingleToFlowable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleUnsubscribeOn;
import io.reactivex.rxjava3.internal.operators.single.SingleUsing;
import io.reactivex.rxjava3.internal.operators.single.SingleZipArray;
import io.reactivex.rxjava3.internal.operators.single.SingleZipIterable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observers.TestObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import p.hhg1;
import p.moy0;
import p.us71;
import rxdogtag2.m;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Single<T> implements SingleSource<T> {
    public static <T> Single<T> amb(Iterable<? extends SingleSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return new SingleAmb(null, iterable);
    }

    @SafeVarargs
    public static <T> Single<T> ambArray(SingleSource<? extends T>... singleSourceArr) {
        Objects.requireNonNull(singleSourceArr, "sources is null");
        if (singleSourceArr.length == 0) {
            return error((Supplier<? extends Throwable>) SingleInternalHelper.a());
        }
        return singleSourceArr.length == 1 ? wrap(singleSourceArr[0]) : new SingleAmb(singleSourceArr, null);
    }

    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        return Flowable.D(singleSource, singleSource2, singleSource3, singleSource4).p(Functions.a, false, 2);
    }

    @SafeVarargs
    public static <T> Flowable<T> concatArray(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.D(singleSourceArr).p(Functions.a, false, 2);
    }

    @SafeVarargs
    public static <T> Flowable<T> concatArrayDelayError(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.D(singleSourceArr).p(Functions.a, true, 2);
    }

    @SafeVarargs
    public static <T> Flowable<T> concatArrayEager(SingleSource<? extends T>... singleSourceArr) {
        Flowable flowableD = Flowable.D(singleSourceArr);
        Function functionB = SingleInternalHelper.b();
        int i = Flowable.a;
        return flowableD.n(functionB, i, i);
    }

    @SafeVarargs
    public static <T> Flowable<T> concatArrayEagerDelayError(SingleSource<? extends T>... singleSourceArr) {
        Flowable flowableD = Flowable.D(singleSourceArr);
        Function functionB = SingleInternalHelper.b();
        int i = Flowable.a;
        return flowableD.o(functionB, true, i, i);
    }

    public static <T> Flowable<T> concatDelayError(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.E(iterable).p(Functions.a, true, 2);
    }

    public static <T> Flowable<T> concatEager(Iterable<? extends SingleSource<? extends T>> iterable) {
        FlowableFromIterable flowableFromIterableE = Flowable.E(iterable);
        Function functionB = SingleInternalHelper.b();
        int i = Flowable.a;
        return flowableFromIterableE.o(functionB, false, i, i);
    }

    public static <T> Flowable<T> concatEagerDelayError(Iterable<? extends SingleSource<? extends T>> iterable) {
        FlowableFromIterable flowableFromIterableE = Flowable.E(iterable);
        Function functionB = SingleInternalHelper.b();
        int i = Flowable.a;
        return flowableFromIterableE.o(functionB, true, i, i);
    }

    public static <T> Single<T> create(SingleOnSubscribe<T> singleOnSubscribe) {
        Objects.requireNonNull(singleOnSubscribe, "source is null");
        return new SingleCreate(singleOnSubscribe);
    }

    public static <T> Single<T> defer(Supplier<? extends SingleSource<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new SingleDefer(supplier);
    }

    public static <T> Single<T> error(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return error((Supplier<? extends Throwable>) Functions.h(th));
    }

    public static <T> Single<T> fromCallable(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return new SingleFromCallable(callable);
    }

    public static <T> Single<T> fromCompletionStage(CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return new SingleFromCompletionStage(completionStage);
    }

    public static <T> Single<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        int i = Flowable.a;
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return toSingle(new FlowableFromFuture(future, j, timeUnit));
    }

    public static <T> Single<T> fromMaybe(MaybeSource<T> maybeSource, T t) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        Objects.requireNonNull(t, "defaultItem is null");
        return new MaybeToSingle(maybeSource, t);
    }

    public static <T> Single<T> fromObservable(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "observable is null");
        return new ObservableSingleSingle(observableSource, null);
    }

    public static <T> Single<T> fromPublisher(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "publisher is null");
        return new SingleFromPublisher(moy0Var);
    }

    public static <T> Single<T> fromSupplier(Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new SingleFromSupplier(supplier);
    }

    public static <T> Single<T> just(T t) {
        Objects.requireNonNull(t, "item is null");
        return new SingleJust(t);
    }

    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        return Flowable.D(singleSource, singleSource2, singleSource3, singleSource4).C(Functions.a, false, Integer.MAX_VALUE);
    }

    @SafeVarargs
    public static <T> Flowable<T> mergeArray(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.D(singleSourceArr).C(Functions.a, false, Math.max(1, singleSourceArr.length));
    }

    @SafeVarargs
    public static <T> Flowable<T> mergeArrayDelayError(SingleSource<? extends T>... singleSourceArr) {
        return Flowable.D(singleSourceArr).C(Functions.a, true, Math.max(1, singleSourceArr.length));
    }

    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3, SingleSource<? extends T> singleSource4) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        return Flowable.D(singleSource, singleSource2, singleSource3, singleSource4).C(Functions.a, true, Integer.MAX_VALUE);
    }

    public static <T> Single<T> never() {
        return SingleNever.a;
    }

    public static <T> Single<Boolean> sequenceEqual(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        return new SingleEquals(singleSource, singleSource2);
    }

    public static <T> Flowable<T> switchOnNext(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "sources is null");
        return new FlowableSwitchMapSinglePublisher(moy0Var, Functions.a, false);
    }

    public static <T> Flowable<T> switchOnNextDelayError(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "sources is null");
        return new FlowableSwitchMapSinglePublisher(moy0Var, Functions.a, true);
    }

    private Single<T> timeout0(long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleTimeout(this, j, timeUnit, scheduler, singleSource);
    }

    public static Single<Long> timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleTimer(j, timeUnit, scheduler);
    }

    private static <T> Single<T> toSingle(Flowable<T> flowable) {
        return new FlowableSingleSingle(flowable);
    }

    public static <T> Single<T> unsafeCreate(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "onSubscribe is null");
        if (!(singleSource instanceof Single)) {
            return new SingleFromUnsafeSource(singleSource);
        }
        hhg1.n("unsafeCreate(Single) should be upgraded");
        return null;
    }

    public static <T, U> Single<T> using(Supplier<U> supplier, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer, boolean z) {
        Objects.requireNonNull(supplier, "resourceSupplier is null");
        Objects.requireNonNull(function, "sourceSupplier is null");
        Objects.requireNonNull(consumer, "resourceCleanup is null");
        return new SingleUsing(supplier, function, consumer, z);
    }

    public static <T> Single<T> wrap(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return singleSource instanceof Single ? (Single) singleSource : new SingleFromUnsafeSource(singleSource);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, SingleSource<? extends T8> singleSource8, SingleSource<? extends T9> singleSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(singleSource6, "source6 is null");
        Objects.requireNonNull(singleSource7, "source7 is null");
        Objects.requireNonNull(singleSource8, "source8 is null");
        Objects.requireNonNull(singleSource9, "source9 is null");
        Objects.requireNonNull(function9, "zipper is null");
        return zipArray(Functions.w(function9), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8, singleSource9);
    }

    @SafeVarargs
    public static <T, R> Single<R> zipArray(Function<? super Object[], ? extends R> function, SingleSource<? extends T>... singleSourceArr) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(singleSourceArr, "sources is null");
        return singleSourceArr.length == 0 ? error(new NoSuchElementException()) : new SingleZipArray(function, singleSourceArr);
    }

    public final Single<T> ambWith(SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return ambArray(this, singleSource);
    }

    public final T blockingGet() {
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        return (T) blockingMultiObserver.b();
    }

    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        subscribe(blockingMultiObserver);
        blockingMultiObserver.a(consumer, consumer2, Functions.c);
    }

    public final Single<T> cache() {
        return new SingleCache(this);
    }

    public final <U> Single<U> cast(Class<? extends U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (Single<U>) map(Functions.b(cls));
    }

    public final <R> Single<R> compose(SingleTransformer<? super T, ? extends R> singleTransformer) {
        Objects.requireNonNull(singleTransformer, "transformer is null");
        return wrap(singleTransformer.c(this));
    }

    public final <R> Single<R> concatMap(Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMap(this, function);
    }

    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function);
    }

    public final <R> Maybe<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function);
    }

    public final Flowable<T> concatWith(SingleSource<? extends T> singleSource) {
        return concat(this, singleSource);
    }

    public final Single<Boolean> contains(Object obj, BiPredicate<Object, Object> biPredicate) {
        Objects.requireNonNull(obj, "item is null");
        Objects.requireNonNull(biPredicate, "comparer is null");
        return new SingleContains(this, obj, biPredicate);
    }

    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleDelay(this, j, timeUnit, scheduler, z);
    }

    public final Single<T> delaySubscription(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "subscriptionIndicator is null");
        return new SingleDelayWithCompletable(this, completableSource);
    }

    public final <R> Maybe<R> dematerialize(Function<? super T, Notification<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return new SingleDematerialize(this, function);
    }

    public final Single<T> doAfterSuccess(Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onAfterSuccess is null");
        return new SingleDoAfterSuccess(this, consumer);
    }

    public final Single<T> doAfterTerminate(Action action) {
        Objects.requireNonNull(action, "onAfterTerminate is null");
        return new SingleDoAfterTerminate(this, action);
    }

    public final Single<T> doFinally(Action action) {
        Objects.requireNonNull(action, "onFinally is null");
        return new SingleDoFinally(this, action);
    }

    public final Single<T> doOnDispose(Action action) {
        Objects.requireNonNull(action, "onDispose is null");
        return new SingleDoOnDispose(this, action);
    }

    public final Single<T> doOnError(Consumer<? super Throwable> consumer) {
        Objects.requireNonNull(consumer, "onError is null");
        return new SingleDoOnError(this, consumer);
    }

    public final Single<T> doOnEvent(BiConsumer<? super T, ? super Throwable> biConsumer) {
        Objects.requireNonNull(biConsumer, "onEvent is null");
        return new SingleDoOnEvent(this, biConsumer);
    }

    public final Single<T> doOnLifecycle(Consumer<? super Disposable> consumer, Action action) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(action, "onDispose is null");
        return new SingleDoOnLifecycle(this, consumer, action);
    }

    public final Single<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        return new SingleDoOnSubscribe(this, consumer);
    }

    public final Single<T> doOnSuccess(Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        return new SingleDoOnSuccess(this, consumer);
    }

    public final Single<T> doOnTerminate(Action action) {
        Objects.requireNonNull(action, "onTerminate is null");
        return new SingleDoOnTerminate(this, action);
    }

    public final Maybe<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new MaybeFilterSingle(this, predicate);
    }

    public final <U, R> Single<R> flatMap(Function<? super T, ? extends SingleSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return new SingleFlatMapBiSelector(this, function, biFunction);
    }

    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapCompletable(this, function);
    }

    public final <R> Maybe<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapMaybe(this, function);
    }

    public final <R> Observable<R> flatMapObservable(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapObservable(this, function);
    }

    public final <R> Flowable<R> flatMapPublisher(Function<? super T, ? extends moy0> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapPublisher(this, function);
    }

    public final <U> Flowable<U> flattenAsFlowable(Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapIterableFlowable(this, function);
    }

    public final <U> Observable<U> flattenAsObservable(Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMapIterableObservable(this, function);
    }

    public final <R> Flowable<R> flattenStreamAsFlowable(Function<? super T, ? extends Stream<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlattenStreamAsFlowable(this, function);
    }

    public final <R> Observable<R> flattenStreamAsObservable(Function<? super T, ? extends Stream<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlattenStreamAsObservable(this, function);
    }

    public final Single<T> hide() {
        return new SingleHide(this);
    }

    public final Completable ignoreElement() {
        return new CompletableFromSingle(this);
    }

    public final <R> Single<R> lift(SingleOperator<? extends R, ? super T> singleOperator) {
        Objects.requireNonNull(singleOperator, "lift is null");
        return new SingleLift(this);
    }

    public final <R> Single<R> map(Function<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleMap(this, function);
    }

    public final <R> Maybe<R> mapOptional(Function<? super T, Optional<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleMapOptional(this, function);
    }

    public final Single<Notification<T>> materialize() {
        return new SingleMaterialize(this);
    }

    public final Flowable<T> mergeWith(SingleSource<? extends T> singleSource) {
        return merge(this, singleSource);
    }

    public final Single<T> observeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleObserveOn(this, scheduler);
    }

    public final <U> Maybe<U> ofType(Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        Maybe<T> maybeFilter = filter(Functions.f(cls));
        maybeFilter.getClass();
        return maybeFilter.f(Functions.b(cls));
    }

    public final Maybe<T> onErrorComplete(Predicate<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new SingleOnErrorComplete(this, predicate);
    }

    public final Single<T> onErrorResumeNext(Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return new SingleResumeNext(this, function);
    }

    public final Single<T> onErrorResumeWith(SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "fallback is null");
        return onErrorResumeNext(Functions.g(singleSource));
    }

    public final Single<T> onErrorReturn(Function<Throwable, ? extends T> function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return new SingleOnErrorReturn(this, function, null);
    }

    public final Single<T> onErrorReturnItem(T t) {
        Objects.requireNonNull(t, "item is null");
        return new SingleOnErrorReturn(this, null, t);
    }

    public final Single<T> onTerminateDetach() {
        return new SingleDetach(this);
    }

    public final Flowable<T> repeat() {
        return toFlowable().P(Long.MAX_VALUE);
    }

    public final Flowable<T> repeatUntil(BooleanSupplier booleanSupplier) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return new FlowableRepeatUntil(flowable, booleanSupplier);
    }

    public final Flowable<T> repeatWhen(Function<? super Flowable<Object>, ? extends moy0> function) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        Objects.requireNonNull(function, "handler is null");
        return new FlowableRepeatWhen(flowable, function);
    }

    public final Single<T> retry() {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        return toSingle(flowable.R(Long.MAX_VALUE, Functions.h));
    }

    public final Single<T> retryUntil(BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.n(booleanSupplier));
    }

    public final Single<T> retryWhen(Function<? super Flowable<Throwable>, ? extends moy0> function) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        Objects.requireNonNull(function, "handler is null");
        return toSingle(new FlowableRetryWhen(flowable, function));
    }

    public final void safeSubscribe(SingleObserver<? super T> singleObserver) {
        Objects.requireNonNull(singleObserver, "observer is null");
        subscribe((SingleObserver) new SafeSingleObserver(singleObserver));
    }

    public final Flowable<T> startWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return Flowable.k(Completable.y(completableSource).v(), toFlowable());
    }

    @Override // io.reactivex.rxjava3.core.SingleSource
    public final void subscribe(SingleObserver<? super T> singleObserver) {
        Objects.requireNonNull(singleObserver, "observer is null");
        m mVar = RxJavaPlugins.e;
        if (mVar != null) {
            try {
                singleObserver = (SingleObserver) mVar.apply(this, singleObserver);
            } catch (Throwable th) {
                throw ExceptionHelper.f(th);
            }
        }
        Objects.requireNonNull(singleObserver, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(singleObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.a(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void subscribeActual(SingleObserver<? super T> singleObserver);

    public final Single<T> subscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleSubscribeOn(this, scheduler);
    }

    public final <E extends SingleObserver<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final Single<T> takeUntil(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return takeUntil(new CompletableToFlowable(completableSource));
    }

    public final TestObserver<T> test(boolean z) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z) {
            testObserver.dispose();
        }
        subscribe((SingleObserver) testObserver);
        return testObserver;
    }

    public final Single<Timed<T>> timeInterval(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleTimeInterval(this, timeUnit, scheduler, true);
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "fallback is null");
        return timeout0(j, timeUnit, Schedulers.b, singleSource);
    }

    public final Single<Timed<T>> timestamp(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleTimeInterval(this, timeUnit, scheduler, false);
    }

    public final <R> R to(SingleConverter<T, ? extends R> singleConverter) {
        Objects.requireNonNull(singleConverter, "converter is null");
        us71.l(singleConverter);
        throw null;
    }

    public final CompletionStage<T> toCompletionStage() {
        return (CompletionStage) subscribeWith(new CompletionStageConsumer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable<T> toFlowable() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).b() : new SingleToFlowable(this);
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureMultiObserver());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Maybe<T> toMaybe() {
        return this instanceof FuseToMaybe ? new MaybeIgnoreElement(((MaybeIgnoreElementCompletable) ((FuseToMaybe) this)).a) : new MaybeFromSingle(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable<T> toObservable() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).a() : new SingleToObservable(this);
    }

    public final Single<T> unsubscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new SingleUnsubscribeOn(this, scheduler);
    }

    public final <U, R> Single<R> zipWith(SingleSource<U> singleSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return zip(this, singleSource, biFunction);
    }

    public final Single<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.b);
    }

    public final Maybe<T> onErrorComplete() {
        return onErrorComplete(Functions.h);
    }

    public static <T> Flowable<T> concatDelayError(moy0 moy0Var) {
        return Flowable.F(moy0Var).p(Functions.a, true, 2);
    }

    public final <U> Single<T> delaySubscription(SingleSource<U> singleSource) {
        Objects.requireNonNull(singleSource, "subscriptionIndicator is null");
        return new SingleDelayWithSingle(this, singleSource);
    }

    public static <T> Single<T> error(Supplier<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new SingleError(supplier);
    }

    public final Flowable<T> repeat(long j) {
        return toFlowable().P(j);
    }

    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe((SingleObserver) testObserver);
        return testObserver;
    }

    public final <U> Single<T> delaySubscription(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "subscriptionIndicator is null");
        return new SingleDelayWithObservable(this, observableSource);
    }

    public final <E> Single<T> takeUntil(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "other is null");
        return new SingleTakeUntil(this, moy0Var);
    }

    public static <T> Flowable<T> concatDelayError(moy0 moy0Var, int i) {
        return Flowable.F(moy0Var).p(Functions.a, true, i);
    }

    public static <T> Flowable<T> concatEager(Iterable<? extends SingleSource<? extends T>> iterable, int i) {
        return Flowable.E(iterable).o(SingleInternalHelper.b(), false, i, 1);
    }

    public static <T> Flowable<T> concatEagerDelayError(Iterable<? extends SingleSource<? extends T>> iterable, int i) {
        return Flowable.E(iterable).o(SingleInternalHelper.b(), true, i, 1);
    }

    public static <T> Single<T> fromMaybe(MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        return new MaybeToSingle(maybeSource, null);
    }

    public static Single<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.b);
    }

    public final Single<Boolean> contains(Object obj) {
        return contains(obj, ObjectHelper.a);
    }

    public final <R> Single<R> flatMap(Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new SingleFlatMap(this, function);
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, scheduler, null);
    }

    public static <T> Flowable<T> concatEager(moy0 moy0Var) {
        Flowable flowableF = Flowable.F(moy0Var);
        Function functionB = SingleInternalHelper.b();
        int i = Flowable.a;
        return flowableF.n(functionB, i, i);
    }

    public static <T> Flowable<T> concatEagerDelayError(moy0 moy0Var) {
        Flowable flowableF = Flowable.F(moy0Var);
        Function functionB = SingleInternalHelper.b();
        int i = Flowable.a;
        return flowableF.o(functionB, true, i, i);
    }

    public final <U> Single<T> delaySubscription(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "subscriptionIndicator is null");
        return new SingleDelayWithPublisher(this, moy0Var);
    }

    public final <E> Single<T> takeUntil(SingleSource<? extends E> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return takeUntil(new SingleToFlowable(singleSource));
    }

    public final Single<Timed<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Schedulers.b);
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler, SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "fallback is null");
        return timeout0(j, timeUnit, scheduler, singleSource);
    }

    public final Single<Timed<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Schedulers.b);
    }

    public final <R> Single<R> flatMap(Function<? super T, ? extends SingleSource<? extends R>> function, Function<? super Throwable, ? extends SingleSource<? extends R>> function2) {
        Objects.requireNonNull(function, "onSuccessMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        return new SingleFlatMapNotification(this, function, function2);
    }

    public final Single<T> delaySubscription(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(Observable.timer(j, timeUnit, scheduler));
    }

    public final Single<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, Schedulers.b, null);
    }

    public static <T> Flowable<T> concatEager(moy0 moy0Var, int i) {
        return Flowable.F(moy0Var).n(SingleInternalHelper.b(), i, 1);
    }

    public static <T> Flowable<T> concatEagerDelayError(moy0 moy0Var, int i) {
        return Flowable.F(moy0Var).o(SingleInternalHelper.b(), true, i, 1);
    }

    public final Single<Timed<T>> timeInterval(Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    public final Single<Timed<T>> timestamp(Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    public static <T, U> Single<T> using(Supplier<U> supplier, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer) {
        return using(supplier, function, consumer, true);
    }

    public final Single<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, Schedulers.b, z);
    }

    public final Single<Timed<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, Schedulers.b);
    }

    public final Single<Timed<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, Schedulers.b);
    }

    public static <T> Single<T> fromFuture(Future<? extends T> future) {
        int i = Flowable.a;
        Objects.requireNonNull(future, "future is null");
        return toSingle(new FlowableFromFuture(future, 0L, (TimeUnit) null));
    }

    public final Flowable<T> startWith(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return Flowable.k(wrap(singleSource).toFlowable(), toFlowable());
    }

    public final Single<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    public final Single<T> retry(long j) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        return toSingle(flowable.R(j, Functions.h));
    }

    public final void blockingSubscribe(Consumer<? super T> consumer) {
        blockingSubscribe(consumer, Functions.e);
    }

    public final Single<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.b, false);
    }

    public final Flowable<T> startWith(MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return Flowable.k(Maybe.o(maybeSource).m(), toFlowable());
    }

    public final void blockingSubscribe() {
        blockingSubscribe(Functions.d, Functions.e);
    }

    public final Observable<T> startWith(ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return Observable.wrap(observableSource).concatWith(toObservable());
    }

    public final void blockingSubscribe(SingleObserver<? super T> singleObserver) {
        Objects.requireNonNull(singleObserver, "observer is null");
        BlockingDisposableMultiObserver blockingDisposableMultiObserver = new BlockingDisposableMultiObserver();
        singleObserver.onSubscribe(blockingDisposableMultiObserver);
        subscribe((SingleObserver) blockingDisposableMultiObserver);
        blockingDisposableMultiObserver.a(singleObserver);
    }

    public final Single<T> retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        Flowable<T> flowable = toFlowable();
        flowable.getClass();
        Objects.requireNonNull(biPredicate, "predicate is null");
        return toSingle(new FlowableRetryBiPredicate(flowable, biPredicate));
    }

    public final Flowable<T> startWith(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "other is null");
        return toFlowable().T(moy0Var);
    }

    public final Single<T> retry(long j, Predicate<? super Throwable> predicate) {
        return toSingle(toFlowable().R(j, predicate));
    }

    public final Single<T> retry(Predicate<? super Throwable> predicate) {
        return toSingle(toFlowable().R(Long.MAX_VALUE, predicate));
    }

    public static <T> Observable<T> concat(ObservableSource<? extends SingleSource<? extends T>> observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return new ObservableConcatMapSingle(2, observableSource, Functions.a, ErrorMode.a);
    }

    public final Disposable subscribe(BiConsumer<? super T, ? super Throwable> biConsumer) {
        Objects.requireNonNull(biConsumer, "onCallback is null");
        BiConsumerSingleObserver biConsumerSingleObserver = new BiConsumerSingleObserver(biConsumer);
        subscribe((SingleObserver) biConsumerSingleObserver);
        return biConsumerSingleObserver;
    }

    public static <T> Flowable<T> merge(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "sources is null");
        return new FlowableFlatMapSinglePublisher(moy0Var, Functions.a, false);
    }

    public static <T> Flowable<T> mergeDelayError(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "sources is null");
        return new FlowableFlatMapSinglePublisher(moy0Var, Functions.a, true);
    }

    public static <T> Flowable<T> concat(moy0 moy0Var) {
        return concat(moy0Var, 2);
    }

    public static <T> Flowable<T> concat(moy0 moy0Var, int i) {
        Objects.requireNonNull(moy0Var, "sources is null");
        ObjectHelper.a(i, "prefetch");
        return new FlowableConcatMapSinglePublisher(moy0Var, Functions.a, i);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.f);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(consumer, consumer2);
        subscribe(consumerSingleObserver);
        return consumerSingleObserver;
    }

    public static <T> Single<T> merge(SingleSource<? extends SingleSource<? extends T>> singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return new SingleFlatMap(singleSource, Functions.a);
    }

    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        return Flowable.D(singleSource, singleSource2).C(Functions.a, true, Integer.MAX_VALUE);
    }

    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        return Flowable.D(singleSource, singleSource2).p(Functions.a, false, 2);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, DisposableContainer disposableContainer) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseMultiObserver disposableAutoReleaseMultiObserver = new DisposableAutoReleaseMultiObserver(consumer, consumer2, Functions.c, disposableContainer);
        disposableContainer.b(disposableAutoReleaseMultiObserver);
        subscribe((SingleObserver) disposableAutoReleaseMultiObserver);
        return disposableAutoReleaseMultiObserver;
    }

    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        return Flowable.D(singleSource, singleSource2).C(Functions.a, false, Integer.MAX_VALUE);
    }

    public static <T> Flowable<T> mergeDelayError(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        return Flowable.D(singleSource, singleSource2, singleSource3).C(Functions.a, true, Integer.MAX_VALUE);
    }

    public static <T> Flowable<T> concat(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        return Flowable.D(singleSource, singleSource2, singleSource3).p(Functions.a, false, 2);
    }

    public static <T> Flowable<T> merge(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        return Flowable.D(singleSource, singleSource2, singleSource3).C(Functions.a, false, Integer.MAX_VALUE);
    }

    public final Disposable subscribe() {
        return subscribe(Functions.d, Functions.f);
    }

    public static <T> Flowable<T> mergeDelayError(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.E(iterable).C(Functions.a, true, Integer.MAX_VALUE);
    }

    public static <T> Flowable<T> concat(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.E(iterable).p(Functions.a, false, 2);
    }

    public static <T> Flowable<T> merge(Iterable<? extends SingleSource<? extends T>> iterable) {
        return Flowable.E(iterable).C(Functions.a, false, Integer.MAX_VALUE);
    }

    public static <T1, T2, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.p(biFunction), singleSource, singleSource2);
    }

    public static <T1, T2, T3, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(function3, "zipper is null");
        return zipArray(Functions.q(function3), singleSource, singleSource2, singleSource3);
    }

    public static <T1, T2, T3, T4, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(function4, "zipper is null");
        return zipArray(Functions.r(function4), singleSource, singleSource2, singleSource3, singleSource4);
    }

    public static <T1, T2, T3, T4, T5, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(function5, "zipper is null");
        return zipArray(Functions.s(function5), singleSource, singleSource2, singleSource3, singleSource4, singleSource5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(singleSource6, "source6 is null");
        Objects.requireNonNull(function6, "zipper is null");
        return zipArray(Functions.t(function6), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(singleSource6, "source6 is null");
        Objects.requireNonNull(singleSource7, "source7 is null");
        Objects.requireNonNull(function7, "zipper is null");
        return zipArray(Functions.u(function7), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, SingleSource<? extends T7> singleSource7, SingleSource<? extends T8> singleSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(singleSource, "source1 is null");
        Objects.requireNonNull(singleSource2, "source2 is null");
        Objects.requireNonNull(singleSource3, "source3 is null");
        Objects.requireNonNull(singleSource4, "source4 is null");
        Objects.requireNonNull(singleSource5, "source5 is null");
        Objects.requireNonNull(singleSource6, "source6 is null");
        Objects.requireNonNull(singleSource7, "source7 is null");
        Objects.requireNonNull(singleSource8, "source8 is null");
        Objects.requireNonNull(function8, "zipper is null");
        return zipArray(Functions.v(function8), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8);
    }

    public static <T, R> Single<R> zip(Iterable<? extends SingleSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return new SingleZipIterable(iterable, function);
    }
}
