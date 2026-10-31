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
import io.reactivex.rxjava3.internal.jdk8.ObservableCollectWithCollectorSingle;
import io.reactivex.rxjava3.internal.jdk8.ObservableFirstStageObserver;
import io.reactivex.rxjava3.internal.jdk8.ObservableFlatMapStream;
import io.reactivex.rxjava3.internal.jdk8.ObservableFromCompletionStage;
import io.reactivex.rxjava3.internal.jdk8.ObservableFromStream;
import io.reactivex.rxjava3.internal.jdk8.ObservableLastStageObserver;
import io.reactivex.rxjava3.internal.jdk8.ObservableMapOptional;
import io.reactivex.rxjava3.internal.jdk8.ObservableSingleStageObserver;
import io.reactivex.rxjava3.internal.observers.BlockingFirstObserver;
import io.reactivex.rxjava3.internal.observers.BlockingLastObserver;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.observers.DisposableAutoReleaseObserver;
import io.reactivex.rxjava3.internal.observers.ForEachWhileObserver;
import io.reactivex.rxjava3.internal.observers.FutureObserver;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapMaybe;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapCompletable;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.rxjava3.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableLatest;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableMostRecent;
import io.reactivex.rxjava3.internal.operators.observable.BlockingObservableNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAllSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAmb;
import io.reactivex.rxjava3.internal.operators.observable.ObservableAnySingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBlockingSubscribe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBuffer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferExactBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableBufferTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCache;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCollectSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatMapScheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCountSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDebounce;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDefer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDelay;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDelaySubscriptionOther;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDematerialize;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDetach;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDistinct;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoAfterNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoFinally;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableError;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFilter;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFlattenIterable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromAction;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromArray;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromCallable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromFuture;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromIterable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromRunnable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromSupplier;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromUnsafeSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGenerate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGroupBy;
import io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.rxjava3.internal.operators.observable.ObservableHide;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIgnoreElements;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableInternalHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableInterval;
import io.reactivex.rxjava3.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJoin;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJust;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLastMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLastSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableLift;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMapNotification;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMaterialize;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableNever;
import io.reactivex.rxjava3.internal.operators.observable.ObservableObserveOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.rxjava3.internal.operators.observable.ObservableOnErrorReturn;
import io.reactivex.rxjava3.internal.operators.observable.ObservablePublish;
import io.reactivex.rxjava3.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRange;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRangeLong;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceSeedSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReduceWithSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeat;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.rxjava3.internal.operators.observable.ObservableReplay;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScan;
import io.reactivex.rxjava3.internal.operators.observable.ObservableScanSeed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSerialized;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkip;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipLast;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSkipWhile;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSwitchIfEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLast;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLastOne;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeUntilPredicate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTakeWhile;
import io.reactivex.rxjava3.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeInterval;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeout;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableToListSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableUsing;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindow;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowBoundary;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowBoundarySelector;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.rxjava3.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.rxjava3.internal.operators.observable.ObservableZip;
import io.reactivex.rxjava3.internal.operators.observable.ObservableZipIterable;
import io.reactivex.rxjava3.internal.operators.single.SingleToObservable;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.HashMapSupplier;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.observables.GroupedObservable;
import io.reactivex.rxjava3.observers.SafeObserver;
import io.reactivex.rxjava3.observers.TestObserver;
import io.reactivex.rxjava3.operators.ScalarSupplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import p.cfm0;
import p.eg;
import p.f4i1;
import p.hhg1;
import p.l1d;
import p.moy0;
import p.n6;
import p.vfp0;
import p.wfp0;
import rxdogtag2.m;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Observable<T> implements ObservableSource<T> {
    public static <T> Observable<T> amb(Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return new ObservableAmb(null, iterable);
    }

    @SafeVarargs
    public static <T> Observable<T> ambArray(ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        int length = observableSourceArr.length;
        if (length == 0) {
            return empty();
        }
        return length == 1 ? wrap(observableSourceArr[0]) : new ObservableAmb(observableSourceArr, null);
    }

    public static int bufferSize() {
        return Flowable.a;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(observableSource9, "source9 is null");
        Objects.requireNonNull(function9, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9}, Functions.w(function9), bufferSize());
    }

    public static <T, R> Observable<R> combineLatestArray(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableCombineLatest(observableSourceArr, null, function, i << 1, false);
    }

    public static <T, R> Observable<R> combineLatestArrayDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.a(i, "bufferSize");
        return observableSourceArr.length == 0 ? empty() : new ObservableCombineLatest(observableSourceArr, null, function, i << 1, true);
    }

    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableCombineLatest(null, iterable, function, i << 1, true);
    }

    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return concatArray(observableSource, observableSource2, observableSource3, observableSource4);
    }

    @SafeVarargs
    public static <T> Observable<T> concatArray(ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        if (observableSourceArr.length == 1) {
            return wrap(observableSourceArr[0]);
        }
        return new ObservableConcatMap(bufferSize(), fromArray(observableSourceArr), Functions.a, ErrorMode.b);
    }

    @SafeVarargs
    public static <T> Observable<T> concatArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : concatDelayError(fromArray(observableSourceArr));
    }

    @SafeVarargs
    public static <T> Observable<T> concatArrayEager(ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEager(bufferSize(), bufferSize(), observableSourceArr);
    }

    @SafeVarargs
    public static <T> Observable<T> concatArrayEagerDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), observableSourceArr);
    }

    public static <T> Observable<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i, boolean z) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.a(i, "bufferSize is null");
        return new ObservableConcatMap(i, observableSource, Functions.a, z ? ErrorMode.c : ErrorMode.b);
    }

    public static <T> Observable<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> Observable<T> concatEagerDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return concatEagerDelayError(iterable, bufferSize(), bufferSize());
    }

    public static <T> Observable<T> create(ObservableOnSubscribe<T> observableOnSubscribe) {
        Objects.requireNonNull(observableOnSubscribe, "source is null");
        return new ObservableCreate(observableOnSubscribe);
    }

    public static <T> Observable<T> defer(Supplier<? extends ObservableSource<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new ObservableDefer(supplier);
    }

    private Observable<T> doOnEach(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onAfterTerminate is null");
        return new ObservableDoOnEach(this, consumer, consumer2, action, action2);
    }

    public static <T> Observable<T> empty() {
        return ObservableEmpty.a;
    }

    public static <T> Observable<T> error(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return error((Supplier<? extends Throwable>) Functions.h(th));
    }

    public static <T> Observable<T> fromAction(Action action) {
        Objects.requireNonNull(action, "action is null");
        return new ObservableFromAction(action);
    }

    @SafeVarargs
    public static <T> Observable<T> fromArray(T... tArr) {
        Objects.requireNonNull(tArr, "items is null");
        if (tArr.length == 0) {
            return empty();
        }
        return tArr.length == 1 ? just(tArr[0]) : new ObservableFromArray(tArr);
    }

    public static <T> Observable<T> fromCallable(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return new ObservableFromCallable(callable);
    }

    public static <T> Observable<T> fromCompletable(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return new ObservableFromCompletable(completableSource);
    }

    public static <T> Observable<T> fromCompletionStage(CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return new ObservableFromCompletionStage(completionStage);
    }

    public static <T> Observable<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return new ObservableFromFuture(future, j, timeUnit);
    }

    public static <T> Observable<T> fromIterable(Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new ObservableFromIterable(iterable);
    }

    public static <T> Observable<T> fromMaybe(MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        return new MaybeToObservable(maybeSource);
    }

    public static <T> Observable<T> fromOptional(Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (Observable) optional.map(new vfp0()).orElseGet(new wfp0());
    }

    public static <T> Observable<T> fromPublisher(moy0 moy0Var) {
        Objects.requireNonNull(moy0Var, "publisher is null");
        return new ObservableFromPublisher(moy0Var);
    }

    public static <T> Observable<T> fromRunnable(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new ObservableFromRunnable(runnable);
    }

    public static <T> Observable<T> fromSingle(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return new SingleToObservable(singleSource);
    }

    public static <T> Observable<T> fromStream(Stream<T> stream) {
        Objects.requireNonNull(stream, "stream is null");
        return new ObservableFromStream(stream);
    }

    public static <T> Observable<T> fromSupplier(Supplier<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new ObservableFromSupplier(supplier);
    }

    public static <T, S> Observable<T> generate(Supplier<S> supplier, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        Objects.requireNonNull(supplier, "initialState is null");
        Objects.requireNonNull(biFunction, "generator is null");
        Objects.requireNonNull(consumer, "disposeState is null");
        return new ObservableGenerate(supplier, biFunction, consumer);
    }

    public static Observable<Long> interval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableInterval(Math.max(0L, j), Math.max(0L, j2), timeUnit, scheduler);
    }

    public static Observable<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        if (j2 < 0) {
            hhg1.n(l1d.l(j2, "count >= 0 required but it was "));
            return null;
        }
        if (j2 == 0) {
            return empty().delay(j3, timeUnit, scheduler);
        }
        long j5 = (j2 - 1) + j;
        if (j > 0 && j5 < 0) {
            hhg1.n("Overflow! start + count is bigger than Long.MAX_VALUE");
            return null;
        }
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableIntervalRange(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, scheduler);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        Objects.requireNonNull(t7, "item7 is null");
        Objects.requireNonNull(t8, "item8 is null");
        Objects.requireNonNull(t9, "item9 is null");
        Objects.requireNonNull(t10, "item10 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.a, false, 4);
    }

    @SafeVarargs
    public static <T> Observable<T> mergeArray(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.a, false, i, i2);
    }

    @SafeVarargs
    public static <T> Observable<T> mergeArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.a, true, observableSourceArr.length);
    }

    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.a, true, 4);
    }

    public static <T> Observable<T> never() {
        return ObservableNever.a;
    }

    public static Observable<Integer> range(int i, int i2) {
        if (i2 < 0) {
            hhg1.n(f4i1.c(i2, "count >= 0 required but it was "));
            return null;
        }
        if (i2 == 0) {
            return empty();
        }
        if (i2 == 1) {
            return just(Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
            return new ObservableRange(i, i2);
        }
        hhg1.n("Integer overflow");
        return null;
    }

    public static Observable<Long> rangeLong(long j, long j2) {
        if (j2 < 0) {
            hhg1.n(l1d.l(j2, "count >= 0 required but it was "));
            return null;
        }
        if (j2 == 0) {
            return empty();
        }
        if (j2 == 1) {
            return just(Long.valueOf(j));
        }
        long j3 = (j2 - 1) + j;
        if (j <= 0 || j3 >= 0) {
            return new ObservableRangeLong(j, j2);
        }
        hhg1.n("Overflow! start + count is bigger than Long.MAX_VALUE");
        return null;
    }

    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biPredicate, "isEqual is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableSequenceEqualSingle(observableSource, observableSource2, biPredicate, i);
    }

    public static <T> Observable<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableSwitchMap(observableSource, Functions.a, i, false);
    }

    public static <T> Observable<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableSwitchMap(observableSource, Functions.a, i, true);
    }

    private Observable<T> timeout0(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableTimeoutTimed(this, j, timeUnit, scheduler, observableSource);
    }

    public static Observable<Long> timer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableTimer(Math.max(j, 0L), timeUnit, scheduler);
    }

    public static <T> Observable<T> unsafeCreate(ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "onSubscribe is null");
        if (!(observableSource instanceof Observable)) {
            return new ObservableFromUnsafeSource(observableSource);
        }
        hhg1.n("unsafeCreate(Observable) should be upgraded");
        return null;
    }

    public static <T, D> Observable<T> using(Supplier<? extends D> supplier, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z) {
        Objects.requireNonNull(supplier, "resourceSupplier is null");
        Objects.requireNonNull(function, "sourceSupplier is null");
        Objects.requireNonNull(consumer, "resourceCleanup is null");
        return new ObservableUsing(supplier, function, consumer, z);
    }

    public static <T> Observable<T> wrap(ObservableSource<T> observableSource) {
        Objects.requireNonNull(observableSource, "source is null");
        return observableSource instanceof Observable ? (Observable) observableSource : new ObservableFromUnsafeSource(observableSource);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(observableSource9, "source9 is null");
        Objects.requireNonNull(function9, "zipper is null");
        return zipArray(Functions.w(function9), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }

    @SafeVarargs
    public static <T, R> Observable<R> zipArray(Function<? super Object[], ? extends R> function, boolean z, int i, ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(function, "zipper is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableZip(observableSourceArr, null, function, i, z);
    }

    public final Single<Boolean> all(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new ObservableAllSingle(this, predicate);
    }

    public final Observable<T> ambWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return ambArray(this, observableSource);
    }

    public final Single<Boolean> any(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new ObservableAnySingle(this, predicate);
    }

    public final T blockingFirst(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T t2 = (T) blockingFirstObserver.a();
        return t2 != null ? t2 : t;
    }

    public final void blockingForEach(Consumer<? super T> consumer, int i) {
        Objects.requireNonNull(consumer, "onNext is null");
        Iterator<T> it = blockingIterable(i).iterator();
        while (it.hasNext()) {
            try {
                consumer.accept(it.next());
            } catch (Throwable th) {
                Exceptions.a(th);
                ((Disposable) it).dispose();
                throw ExceptionHelper.f(th);
            }
        }
    }

    public final Iterable<T> blockingIterable(int i) {
        ObjectHelper.a(i, "capacityHint");
        return new BlockingObservableIterable(this, i);
    }

    public final T blockingLast(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        BlockingLastObserver blockingLastObserver = new BlockingLastObserver();
        subscribe((Observer) blockingLastObserver);
        T t2 = (T) blockingLastObserver.a();
        return t2 != null ? t2 : t;
    }

    public final Iterable<T> blockingLatest() {
        return new BlockingObservableLatest(this);
    }

    public final Iterable<T> blockingMostRecent(T t) {
        Objects.requireNonNull(t, "initialItem is null");
        return new BlockingObservableMostRecent(this, t);
    }

    public final Iterable<T> blockingNext() {
        return new BlockingObservableNext(this);
    }

    public final T blockingSingle() {
        Maybe<T> maybeSingleElement = singleElement();
        maybeSingleElement.getClass();
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        maybeSingleElement.subscribe(blockingMultiObserver);
        T t = (T) blockingMultiObserver.b();
        if (t != null) {
            return t;
        }
        hhg1.k();
        return null;
    }

    public final Stream<T> blockingStream(int i) {
        Iterator<T> it = blockingIterable(i).iterator();
        Stream stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
        Disposable disposable = (Disposable) it;
        disposable.getClass();
        return (Stream) stream.onClose(new n6(disposable, (byte) 10));
    }

    public final void blockingSubscribe(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        ObservableBlockingSubscribe.subscribe(this, observer);
    }

    public final <U extends Collection<? super T>> Observable<U> buffer(long j, TimeUnit timeUnit, Scheduler scheduler, int i, Supplier<U> supplier, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        ObjectHelper.a(i, "count");
        return new ObservableBufferTimed(this, j, j, timeUnit, scheduler, supplier, i, z);
    }

    public final Observable<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final Observable<T> cacheWithInitialCapacity(int i) {
        ObjectHelper.a(i, "initialCapacity");
        return new ObservableCache(this, i);
    }

    public final <U> Observable<U> cast(Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (Observable<U>) map(Functions.b(cls));
    }

    public final <U> Single<U> collect(Supplier<? extends U> supplier, BiConsumer<? super U, ? super T> biConsumer) {
        Objects.requireNonNull(supplier, "initialItemSupplier is null");
        Objects.requireNonNull(biConsumer, "collector is null");
        return new ObservableCollectSingle(this, supplier, biConsumer);
    }

    public final <U> Single<U> collectInto(U u, BiConsumer<? super U, ? super T> biConsumer) {
        Objects.requireNonNull(u, "initialItem is null");
        return collect(Functions.h(u), biConsumer);
    }

    public final <R> Observable<R> compose(ObservableTransformer<? super T, ? extends R> observableTransformer) {
        Objects.requireNonNull(observableTransformer, "composer is null");
        return wrap(observableTransformer.apply(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new ObservableConcatMap(i, this, function, ErrorMode.a);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.a(obj, function);
    }

    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "capacityHint");
        return new ObservableConcatMapCompletable(this, function, ErrorMode.a, i);
    }

    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableConcatMapCompletable(this, function, z ? ErrorMode.c : ErrorMode.b, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new ObservableConcatMap(i, this, function, z ? ErrorMode.c : ErrorMode.b);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.a(obj, function);
    }

    public final <R> Observable<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function, int i, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "maxConcurrency");
        ObjectHelper.a(i2, "bufferSize");
        return new ObservableConcatMapEager(this, function, ErrorMode.a, i, i2);
    }

    public final <R> Observable<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "maxConcurrency");
        ObjectHelper.a(i2, "bufferSize");
        return new ObservableConcatMapEager(this, function, z ? ErrorMode.c : ErrorMode.b, i, i2);
    }

    public final <U> Observable<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableFlattenIterable(this, function);
    }

    public final <R> Observable<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableConcatMapMaybe(this, function, ErrorMode.a, i);
    }

    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableConcatMapMaybe(this, function, z ? ErrorMode.c : ErrorMode.b, i);
    }

    public final <R> Observable<R> concatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableConcatMapSingle(i, this, function, ErrorMode.a);
    }

    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableConcatMapSingle(i, this, function, z ? ErrorMode.c : ErrorMode.b);
    }

    public final <R> Observable<R> concatMapStream(Function<? super T, ? extends Stream<? extends R>> function) {
        return flatMapStream(function);
    }

    public final Observable<T> concatWith(SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return new ObservableConcatWithSingle(this, singleSource);
    }

    public final Single<Boolean> contains(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return any(Functions.e(obj));
    }

    public final Single<Long> count() {
        return new ObservableCountSingle(this);
    }

    public final Observable<T> debounce(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableDebounceTimed(this, j, timeUnit, scheduler);
    }

    public final Observable<T> defaultIfEmpty(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    public final Observable<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableDelay(this, j, timeUnit, scheduler, z);
    }

    public final <U> Observable<T> delaySubscription(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "subscriptionIndicator is null");
        return new ObservableDelaySubscriptionOther(this, observableSource);
    }

    public final <R> Observable<R> dematerialize(Function<? super T, Notification<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return new ObservableDematerialize(this, function);
    }

    public final <K> Observable<T> distinct(Function<? super T, K> function, Supplier<? extends Collection<? super K>> supplier) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        return new ObservableDistinct(this, function, supplier);
    }

    public final <K> Observable<T> distinctUntilChanged(Function<? super T, K> function) {
        Objects.requireNonNull(function, "keySelector is null");
        return new ObservableDistinctUntilChanged(this, function, ObjectHelper.a);
    }

    public final Observable<T> doAfterNext(Consumer<? super T> consumer) {
        Objects.requireNonNull(consumer, "onAfterNext is null");
        return new ObservableDoAfterNext(this, consumer);
    }

    public final Observable<T> doAfterTerminate(Action action) {
        Objects.requireNonNull(action, "onAfterTerminate is null");
        Consumer<? super T> consumer = Functions.d;
        return doOnEach(consumer, consumer, Functions.c, action);
    }

    public final Observable<T> doFinally(Action action) {
        Objects.requireNonNull(action, "onFinally is null");
        return new ObservableDoFinally(this, action);
    }

    public final Observable<T> doOnComplete(Action action) {
        Consumer<? super T> consumer = Functions.d;
        return doOnEach(consumer, consumer, action, Functions.c);
    }

    public final Observable<T> doOnDispose(Action action) {
        return doOnLifecycle(Functions.d, action);
    }

    public final Observable<T> doOnError(Consumer<? super Throwable> consumer) {
        Consumer<? super T> consumer2 = Functions.d;
        Action action = Functions.c;
        return doOnEach(consumer2, consumer, action, action);
    }

    public final Observable<T> doOnLifecycle(Consumer<? super Disposable> consumer, Action action) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(action, "onDispose is null");
        return new ObservableDoOnLifecycle(this, consumer, action);
    }

    public final Observable<T> doOnNext(Consumer<? super T> consumer) {
        Consumer<? super Throwable> consumer2 = Functions.d;
        Action action = Functions.c;
        return doOnEach(consumer, consumer2, action, action);
    }

    public final Observable<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        return doOnLifecycle(consumer, Functions.c);
    }

    public final Observable<T> doOnTerminate(Action action) {
        Objects.requireNonNull(action, "onTerminate is null");
        return doOnEach(Functions.d, Functions.a(action), action, Functions.c);
    }

    public final Single<T> elementAt(long j, T t) {
        if (j >= 0) {
            Objects.requireNonNull(t, "defaultItem is null");
            return new ObservableElementAtSingle(this, j, t);
        }
        eg.g(l1d.l(j, "index >= 0 required but it was "));
        return null;
    }

    public final Single<T> elementAtOrError(long j) {
        if (j >= 0) {
            return new ObservableElementAtSingle(this, j, null);
        }
        eg.g(l1d.l(j, "index >= 0 required but it was "));
        return null;
    }

    public final Observable<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new ObservableFilter(this, predicate);
    }

    public final Single<T> first(T t) {
        return elementAt(0L, t);
    }

    public final Maybe<T> firstElement() {
        return elementAt(0L);
    }

    public final Single<T> firstOrError() {
        return elementAtOrError(0L);
    }

    public final CompletionStage<T> firstOrErrorStage() {
        return (CompletionStage) subscribeWith(new ObservableFirstStageObserver((Object) null, false));
    }

    public final CompletionStage<T> firstStage(T t) {
        return (CompletionStage) subscribeWith(new ObservableFirstStageObserver(t, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "maxConcurrency");
        ObjectHelper.a(i2, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new ObservableFlatMap(this, function, z, i, i2);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.a(obj, function);
    }

    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function, boolean z) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableFlatMapCompletableCompletable(this, function, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> Observable<V> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return (Observable<V>) flatMap(ObservableInternalHelper.a(function), biFunction, false, bufferSize(), bufferSize());
    }

    public final <R> Observable<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableFlatMapMaybe(this, function, z);
    }

    public final <R> Observable<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableFlatMapSingle(this, function, z);
    }

    public final <R> Observable<R> flatMapStream(Function<? super T, ? extends Stream<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableFlatMapStream(this, function);
    }

    public final Disposable forEach(Consumer<? super T> consumer) {
        return subscribe(consumer);
    }

    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer, Action action) {
        Objects.requireNonNull(predicate, "onNext is null");
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver(predicate, consumer, action);
        subscribe((Observer) forEachWhileObserver);
        return forEachWhileObserver;
    }

    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z, int i) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableGroupBy(this, function, function2, i, z);
    }

    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> groupJoin(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super Observable<TRight>, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(function, "leftEnd is null");
        Objects.requireNonNull(function2, "rightEnd is null");
        Objects.requireNonNull(biFunction, "resultSelector is null");
        return new ObservableGroupJoin(this, observableSource, function, function2, biFunction);
    }

    public final Observable<T> hide() {
        return new ObservableHide(this);
    }

    public final Completable ignoreElements() {
        return new ObservableIgnoreElementsCompletable(this);
    }

    public final Single<Boolean> isEmpty() {
        return all(Functions.i);
    }

    public final <TRight, TLeftEnd, TRightEnd, R> Observable<R> join(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super TRight, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(function, "leftEnd is null");
        Objects.requireNonNull(function2, "rightEnd is null");
        Objects.requireNonNull(biFunction, "resultSelector is null");
        return new ObservableJoin(this, observableSource, function, function2, biFunction);
    }

    public final Single<T> last(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        return new ObservableLastSingle(this, t);
    }

    public final Maybe<T> lastElement() {
        return new ObservableLastMaybe(this);
    }

    public final Single<T> lastOrError() {
        return new ObservableLastSingle(this, (Object) null);
    }

    public final CompletionStage<T> lastOrErrorStage() {
        return (CompletionStage) subscribeWith(new ObservableLastStageObserver((Object) null, false));
    }

    public final CompletionStage<T> lastStage(T t) {
        return (CompletionStage) subscribeWith(new ObservableLastStageObserver(t, true));
    }

    public final <R> Observable<R> lift(ObservableOperator<? extends R, ? super T> observableOperator) {
        Objects.requireNonNull(observableOperator, "lifter is null");
        return new ObservableLift(this);
    }

    public final <R> Observable<R> map(Function<? super T, ? extends R> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableMap(this, function);
    }

    public final <R> Observable<R> mapOptional(Function<? super T, Optional<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableMapOptional(this, function);
    }

    public final Observable<Notification<T>> materialize() {
        return new ObservableMaterialize(this);
    }

    public final Observable<T> mergeWith(SingleSource<? extends T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return new ObservableMergeWithSingle(this, singleSource);
    }

    public final Observable<T> observeOn(Scheduler scheduler, boolean z, int i) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableObserveOn(this, scheduler, z, i);
    }

    public final <U> Observable<U> ofType(Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return filter(Functions.f(cls)).cast(cls);
    }

    public final Observable<T> onErrorComplete(Predicate<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new ObservableOnErrorComplete(this, predicate);
    }

    public final Observable<T> onErrorResumeNext(Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return new ObservableOnErrorNext(this, function);
    }

    public final Observable<T> onErrorResumeWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return onErrorResumeNext(Functions.g(observableSource));
    }

    public final Observable<T> onErrorReturn(Function<? super Throwable, ? extends T> function) {
        Objects.requireNonNull(function, "itemSupplier is null");
        return new ObservableOnErrorReturn(this, function);
    }

    public final Observable<T> onErrorReturnItem(T t) {
        Objects.requireNonNull(t, "item is null");
        return onErrorReturn(Functions.g(t));
    }

    public final Observable<T> onTerminateDetach() {
        return new ObservableDetach(this);
    }

    public final <R> Observable<R> publish(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return new ObservablePublishSelector(this, function);
    }

    public final <R> Single<R> reduce(R r, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(r, "seed is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return new ObservableReduceSeedSingle(this, r, biFunction);
    }

    public final <R> Single<R> reduceWith(Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "seedSupplier is null");
        Objects.requireNonNull(biFunction, "reducer is null");
        return new ObservableReduceWithSingle(this, supplier, biFunction);
    }

    public final Observable<T> repeat(long j) {
        if (j >= 0) {
            return j == 0 ? empty() : new ObservableRepeat(this, j);
        }
        hhg1.n(l1d.l(j, "times >= 0 required but it was "));
        return null;
    }

    public final Observable<T> repeatUntil(BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return new ObservableRepeatUntil(this, booleanSupplier);
    }

    public final Observable<T> repeatWhen(Function<? super Observable<Object>, ? extends ObservableSource<?>> function) {
        Objects.requireNonNull(function, "handler is null");
        return new ObservableRepeatWhen(this, function);
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.a(i, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.k(function, ObservableInternalHelper.g(i, j, this, scheduler, timeUnit, false));
    }

    public final Observable<T> retry(long j, Predicate<? super Throwable> predicate) {
        if (j >= 0) {
            Objects.requireNonNull(predicate, "predicate is null");
            return new ObservableRetryPredicate(this, j, predicate);
        }
        hhg1.n(l1d.l(j, "times >= 0 required but it was "));
        return null;
    }

    public final Observable<T> retryUntil(BooleanSupplier booleanSupplier) {
        Objects.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.n(booleanSupplier));
    }

    public final Observable<T> retryWhen(Function<? super Observable<Throwable>, ? extends ObservableSource<?>> function) {
        Objects.requireNonNull(function, "handler is null");
        return new ObservableRetryWhen(this, function);
    }

    public final void safeSubscribe(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        if (observer instanceof SafeObserver) {
            subscribe(observer);
        } else {
            subscribe((Observer) new SafeObserver(observer));
        }
    }

    public final Observable<T> sample(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableSampleTimed(this, j, timeUnit, scheduler, false);
    }

    public final <R> Observable<R> scan(R r, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(r, "initialValue is null");
        return scanWith(Functions.h(r), biFunction);
    }

    public final <R> Observable<R> scanWith(Supplier<R> supplier, BiFunction<R, ? super T, R> biFunction) {
        Objects.requireNonNull(supplier, "seedSupplier is null");
        Objects.requireNonNull(biFunction, "accumulator is null");
        return new ObservableScanSeed(this, supplier, biFunction);
    }

    public final Observable<T> serialize() {
        return new ObservableSerialized(this);
    }

    public final Observable<T> share() {
        return publish().f();
    }

    public final Single<T> single(T t) {
        Objects.requireNonNull(t, "defaultItem is null");
        return new ObservableSingleSingle(this, t);
    }

    public final Maybe<T> singleElement() {
        return new ObservableSingleMaybe(this);
    }

    public final Single<T> singleOrError() {
        return new ObservableSingleSingle(this, null);
    }

    public final CompletionStage<T> singleOrErrorStage() {
        return (CompletionStage) subscribeWith(new ObservableSingleStageObserver((Object) null, false));
    }

    public final CompletionStage<T> singleStage(T t) {
        return (CompletionStage) subscribeWith(new ObservableSingleStageObserver(t, true));
    }

    public final Observable<T> skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : new ObservableSkip(this, j);
        }
        hhg1.n(l1d.l(j, "count >= 0 expected but it was "));
        return null;
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableSkipLastTimed(i << 1, j, this, scheduler, timeUnit, z);
    }

    public final <U> Observable<T> skipUntil(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return new ObservableSkipUntil(this, observableSource);
    }

    public final Observable<T> skipWhile(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new ObservableSkipWhile(this, predicate);
    }

    public final Observable<T> sorted(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList().toObservable().map(Functions.i(comparator)).flatMapIterable(Functions.a);
    }

    public final Observable<T> startWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return concatArray(observableSource, this);
    }

    @SafeVarargs
    public final Observable<T> startWithArray(T... tArr) {
        Observable observableFromArray = fromArray(tArr);
        return observableFromArray == empty() ? this : concatArray(observableFromArray, this);
    }

    public final Observable<T> startWithItem(T t) {
        return concatArray(just(t), this);
    }

    public final Observable<T> startWithIterable(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    public final void subscribe(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            m mVar = RxJavaPlugins.d;
            if (mVar != null) {
                try {
                    observer = (Observer) mVar.apply(this, observer);
                } catch (Throwable th) {
                    throw ExceptionHelper.f(th);
                }
            }
            Objects.requireNonNull(observer, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(observer);
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

    public abstract void subscribeActual(Observer<? super T> observer);

    public final Observable<T> subscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableSubscribeOn(this, scheduler);
    }

    public final <E extends Observer<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final Observable<T> switchIfEmpty(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return new ObservableSwitchIfEmpty(this, observableSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new ObservableSwitchMap(this, function, i, false);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.a(obj, function);
    }

    public final Completable switchMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableSwitchMapCompletable(this, function, false);
    }

    public final Completable switchMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableSwitchMapCompletable(this, function, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        if (!(this instanceof ScalarSupplier)) {
            return new ObservableSwitchMap(this, function, i, true);
        }
        Object obj = ((ScalarSupplier) this).get();
        return obj == null ? empty() : ObservableScalarXMap.a(obj, function);
    }

    public final <R> Observable<R> switchMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableSwitchMapMaybe(this, function, false);
    }

    public final <R> Observable<R> switchMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableSwitchMapMaybe(this, function, true);
    }

    public final <R> Observable<R> switchMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableSwitchMapSingle(this, function, false);
    }

    public final <R> Observable<R> switchMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableSwitchMapSingle(this, function, true);
    }

    public final Observable<T> take(long j) {
        if (j >= 0) {
            return new ObservableTake(this, j);
        }
        hhg1.n(l1d.l(j, "count >= 0 required but it was "));
        return null;
    }

    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.a(i, "bufferSize");
        if (j >= 0) {
            return new ObservableTakeLastTimed(this, j, j2, timeUnit, scheduler, i, z);
        }
        hhg1.n(l1d.l(j, "count >= 0 required but it was "));
        return null;
    }

    public final <U> Observable<T> takeUntil(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return new ObservableTakeUntil(this, observableSource);
    }

    public final Observable<T> takeWhile(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new ObservableTakeWhile(this, predicate);
    }

    public final TestObserver<T> test(boolean z) {
        TestObserver<T> testObserver = new TestObserver<>();
        if (z) {
            testObserver.dispose();
        }
        subscribe((Observer) testObserver);
        return testObserver;
    }

    public final Observable<T> throttleFirst(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableThrottleFirstTimed(this, j, timeUnit, scheduler);
    }

    public final Observable<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableThrottleLatest(this, j, timeUnit, scheduler, z);
    }

    public final Observable<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final Observable<Timed<T>> timeInterval(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableTimeInterval(this, timeUnit, scheduler);
    }

    public final Observable<T> timeout(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return timeout0(j, timeUnit, observableSource, Schedulers.b);
    }

    public final Observable<Timed<T>> timestamp(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return (Observable<Timed<T>>) map(Functions.o(timeUnit, scheduler));
    }

    public final <R> R to(ObservableConverter<T, ? extends R> observableConverter) {
        Objects.requireNonNull(observableConverter, "converter is null");
        cfm0.j(observableConverter);
        throw null;
    }

    public final Flowable<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        Objects.requireNonNull(backpressureStrategy, "strategy is null");
        FlowableFromObservable flowableFromObservable = new FlowableFromObservable(this);
        int iOrdinal = backpressureStrategy.ordinal();
        if (iOrdinal == 0) {
            return flowableFromObservable;
        }
        if (iOrdinal == 1) {
            return new FlowableOnBackpressureError(flowableFromObservable);
        }
        if (iOrdinal == 3) {
            return new FlowableOnBackpressureDrop(flowableFromObservable);
        }
        if (iOrdinal == 4) {
            return new FlowableOnBackpressureLatest(flowableFromObservable);
        }
        int i = Flowable.a;
        ObjectHelper.a(i, "capacity");
        return new FlowableOnBackpressureBuffer(flowableFromObservable, i, Functions.c);
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureObserver());
    }

    public final Single<List<T>> toList(int i) {
        ObjectHelper.a(i, "capacityHint");
        return new ObservableToListSingle(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<? extends Map<K, V>> supplier) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        Objects.requireNonNull(supplier, "mapSupplier is null");
        return (Single<Map<K, V>>) collect(supplier, Functions.y(function, function2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<? extends Map<K, Collection<V>>> supplier, Function<? super K, ? extends Collection<? super V>> function3) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        Objects.requireNonNull(supplier, "mapSupplier is null");
        Objects.requireNonNull(function3, "collectionFactory is null");
        return (Single<Map<K, Collection<V>>>) collect(supplier, Functions.z(function, function2, function3));
    }

    public final Single<List<T>> toSortedList(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList().map(Functions.i(comparator));
    }

    public final Observable<T> unsubscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableUnsubscribeOn(this, scheduler);
    }

    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, int i) {
        ObjectHelper.b(j, "timespan");
        ObjectHelper.b(j2, "timeskip");
        ObjectHelper.a(i, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return new ObservableWindowTimed(this, j, j2, timeUnit, scheduler, Long.MAX_VALUE, i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, T4, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, ObservableSource<T4> observableSource4, Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function5, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, Functions.s(function5));
    }

    public final <U, R> Observable<R> zipWith(Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(iterable, "other is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return new ObservableZipIterable(this, iterable, biFunction);
    }

    public final Observable<T> throttleLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return sample(j, timeUnit, scheduler);
    }

    public final Observable<T> throttleWithTimeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return debounce(j, timeUnit, scheduler);
    }

    public final void blockingSubscribe(Consumer<? super T> consumer) {
        ObservableBlockingSubscribe.subscribe(this, consumer, Functions.f, Functions.c);
    }

    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        ObservableBlockingSubscribe.subscribe(this, consumer, consumer2, Functions.c);
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        ObservableBlockingSubscribe.subscribe(this, consumer, consumer2, action);
    }

    public final Observable<T> concatWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return concat(this, observableSource);
    }

    public final Observable<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, Schedulers.b);
    }

    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function, false);
    }

    public final <R> Observable<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function, false);
    }

    public final <R> Observable<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return flatMapSingle(function, false);
    }

    public final Observable<T> mergeWith(ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return merge(this, observableSource);
    }

    public final Observable<T> onErrorComplete() {
        return onErrorComplete(Functions.h);
    }

    public final ConnectableObservable<T> publish() {
        return new ObservablePublish(this);
    }

    public final Observable<T> takeUntil(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate, "stopPredicate is null");
        return new ObservableTakeUntilPredicate(this, predicate);
    }

    public final Single<List<T>> toList() {
        return toList(16);
    }

    @SafeVarargs
    public static <T> Observable<T> mergeArray(ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.a, observableSourceArr.length);
    }

    public final void blockingSubscribe() {
        ObservableBlockingSubscribe.subscribe(this);
    }

    public final <U extends Collection<? super T>> Single<U> toList(Supplier<U> supplier) {
        Objects.requireNonNull(supplier, "collectionSupplier is null");
        return new ObservableToListSingle(this, supplier);
    }

    @SafeVarargs
    public static <T> Observable<T> concatArrayEager(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(Functions.a, false, i, i2);
    }

    @SafeVarargs
    public static <T> Observable<T> concatArrayEagerDelayError(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(Functions.a, true, i, i2);
    }

    public static <T> Observable<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.a, false, i, i2);
    }

    public static <T> Observable<T> concatEagerDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(Functions.a, true, i, i2);
    }

    @SafeVarargs
    public static <T> Observable<T> mergeArrayDelayError(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(Functions.a, true, i, i2);
    }

    public final Observable<T> concatWith(MaybeSource<? extends T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return new ObservableConcatWithMaybe(this, maybeSource);
    }

    public final Observable<T> delaySubscription(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(timer(j, timeUnit, scheduler));
    }

    public final Observable<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.a);
    }

    public final Observable<T> mergeWith(MaybeSource<? extends T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return new ObservableMergeWithMaybe(this, maybeSource);
    }

    public static <T> Observable<T> error(Supplier<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return new ObservableError(supplier);
    }

    public final Observable<T> scan(BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "accumulator is null");
        return new ObservableScan(this, biFunction);
    }

    public final TestObserver<T> test() {
        TestObserver<T> testObserver = new TestObserver<>();
        subscribe((Observer) testObserver);
        return testObserver;
    }

    public final Observable<T> concatWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return new ObservableConcatWithCompletable(this, completableSource);
    }

    public final Observable<T> distinctUntilChanged(BiPredicate<? super T, ? super T> biPredicate) {
        Objects.requireNonNull(biPredicate, "comparer is null");
        return new ObservableDistinctUntilChanged(this, Functions.a, biPredicate);
    }

    public final Observable<T> mergeWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return new ObservableMergeWithCompletable(this, completableSource);
    }

    public static <T> Observable<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatEager(observableSource, bufferSize(), bufferSize());
    }

    public static <T> Observable<T> concatEagerDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatEagerDelayError(observableSource, bufferSize(), bufferSize());
    }

    public static <T> Observable<T> fromFuture(Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return new ObservableFromFuture(future, 0L, (TimeUnit) null);
    }

    public final <R, A> Single<R> collect(Collector<? super T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return new ObservableCollectWithCollectorSingle(this, collector);
    }

    public final <K> Observable<T> distinct(Function<? super T, K> function) {
        return distinct(function, Functions.d());
    }

    public final Observable<T> observeOn(Scheduler scheduler, boolean z) {
        return observeOn(scheduler, z, bufferSize());
    }

    public final Maybe<T> reduce(BiFunction<T, T, T> biFunction) {
        Objects.requireNonNull(biFunction, "reducer is null");
        return new ObservableReduceMaybe(this, biFunction);
    }

    public final Observable<Timed<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Schedulers.b);
    }

    public final <V> Observable<T> timeout(Function<? super T, ? extends ObservableSource<V>> function) {
        return timeout0(null, function, null);
    }

    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        return zip(this, observableSource, biFunction);
    }

    public static <T> Observable<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i, int i2) {
        return wrap(observableSource).concatMapEager(Functions.a, i, i2);
    }

    public static <T> Observable<T> concatEagerDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i, int i2) {
        return wrap(observableSource).concatMapEagerDelayError(Functions.a, true, i, i2);
    }

    public final Observable<T> distinct() {
        return distinct(Functions.a, Functions.d());
    }

    public final Observable<T> observeOn(Scheduler scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    public final <V> Observable<T> timeout(Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return timeout0(null, function, observableSource);
    }

    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletable(function, 2);
    }

    public final <R> Observable<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybe(function, 2);
    }

    public final <R> Observable<R> concatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingle(function, 2);
    }

    public final Single<List<T>> toSortedList() {
        return toSortedList(Functions.j());
    }

    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z) {
        return zip(this, observableSource, biFunction, z);
    }

    public static <T> Observable<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNext(observableSource, bufferSize());
    }

    public static <T> Observable<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return switchOnNextDelayError(observableSource, bufferSize());
    }

    public final Observable<T> startWith(SingleSource<T> singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return concat(Single.wrap(singleSource).toObservable(), this);
    }

    public final Observable<Timed<T>> timeInterval(Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    public final Observable<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, null, Schedulers.b);
    }

    public final Observable<Timed<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Schedulers.b);
    }

    public final Single<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList(i).map(Functions.i(comparator));
    }

    public final <U, R> Observable<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i) {
        return zip(this, observableSource, biFunction, z, i);
    }

    public final <U> Observable<T> debounce(Function<? super T, ? extends ObservableSource<U>> function) {
        Objects.requireNonNull(function, "debounceIndicator is null");
        return new ObservableDebounce(this, function);
    }

    public final Observable<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, Schedulers.b);
    }

    public final Observable<Timed<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, Schedulers.b);
    }

    public static <T> Observable<T> generate(Consumer<Emitter<T>> consumer) {
        Objects.requireNonNull(consumer, "generator is null");
        return generate(Functions.j, ObservableInternalHelper.l(consumer), Functions.d);
    }

    private <U, V> Observable<T> timeout0(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(function, "itemTimeoutIndicator is null");
        return new ObservableTimeout(this, observableSource, function, observableSource2);
    }

    public static <T, D> Observable<T> using(Supplier<? extends D> supplier, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer) {
        return using(supplier, function, consumer, true);
    }

    public final T blockingFirst() {
        BlockingFirstObserver blockingFirstObserver = new BlockingFirstObserver();
        subscribe(blockingFirstObserver);
        T t = (T) blockingFirstObserver.a();
        if (t != null) {
            return t;
        }
        hhg1.k();
        return null;
    }

    public final T blockingLast() {
        BlockingLastObserver blockingLastObserver = new BlockingLastObserver();
        subscribe((Observer) blockingLastObserver);
        T t = (T) blockingLastObserver.a();
        if (t != null) {
            return t;
        }
        hhg1.k();
        return null;
    }

    public final Observable<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, Schedulers.b, z);
    }

    public final Observable<T> sample(long j, TimeUnit timeUnit, boolean z) {
        return sample(j, timeUnit, Schedulers.b, z);
    }

    public final Observable<T> startWith(MaybeSource<T> maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return concat(Maybe.o(maybeSource).n(), this);
    }

    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, boolean z) {
        return throttleLatest(j, timeUnit, Schedulers.b, z);
    }

    public final Observable<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler, ObservableSource<? extends T> observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return timeout0(j, timeUnit, observableSource, scheduler);
    }

    public final Single<List<T>> toSortedList(int i) {
        return toSortedList(Functions.j(), i);
    }

    public static Observable<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, Schedulers.b);
    }

    public final Observable<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, Schedulers.b);
    }

    public final Observable<Timed<T>> timestamp(Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function, boolean z) {
        return concatMapCompletableDelayError(function, z, 2);
    }

    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        return concatMapMaybeDelayError(function, z, 2);
    }

    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        return concatMapSingleDelayError(function, z, 2);
    }

    public final <U> Observable<T> delay(Function<? super T, ? extends ObservableSource<U>> function) {
        Objects.requireNonNull(function, "itemDelayIndicator is null");
        return (Observable<T>) flatMap(ObservableInternalHelper.c(function));
    }

    public final Observable<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, Schedulers.b);
    }

    public final Observable<T> startWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return concat(Completable.y(completableSource).w(), this);
    }

    public final Observable<T> take(long j, TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return throttleLatest(j, timeUnit, scheduler, false);
    }

    public final Observable<T> timeout(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j, timeUnit, null, scheduler);
    }

    public final Observable<Timed<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, Schedulers.b);
    }

    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletableDelayError(function, true, 2);
    }

    public final <R> Observable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybeDelayError(function, true, 2);
    }

    public final <R> Observable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingleDelayError(function, true, 2);
    }

    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer) {
        return forEachWhile(predicate, consumer, Functions.c);
    }

    public final Observable<T> take(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return takeUntil(timer(j, timeUnit, scheduler));
    }

    public final Observable<T> throttleLatest(long j, TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, Schedulers.b, false);
    }

    public final <U, V> Observable<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        Objects.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        return timeout0(observableSource, function, null);
    }

    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        Objects.requireNonNull(function, "keySelector is null");
        Objects.requireNonNull(function2, "valueSelector is null");
        return (Single<Map<K, V>>) collect(HashMapSupplier.a, Functions.y(function, function2));
    }

    public static <T> Observable<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concatDelayError(observableSource, bufferSize(), true);
    }

    public final Observable<T> delay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    public final Disposable forEachWhile(Predicate<? super T> predicate) {
        return forEachWhile(predicate, Functions.f, Functions.c);
    }

    public final Observable<T> sample(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableSampleTimed(this, j, timeUnit, scheduler, z);
    }

    public static <T> Observable<T> concatDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T, S> Observable<T> generate(Supplier<S> supplier, BiConsumer<S, Emitter<T>> biConsumer) {
        Objects.requireNonNull(biConsumer, "generator is null");
        return generate(supplier, ObservableInternalHelper.k(biConsumer), Functions.d);
    }

    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, int i) {
        return sequenceEqual(observableSource, observableSource2, ObjectHelper.a, i);
    }

    public final Observable<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, Schedulers.b, false);
    }

    public final <K> Observable<GroupedObservable<K, T>> groupBy(Function<? super T, ? extends K> function, boolean z) {
        return (Observable<GroupedObservable<K, T>>) groupBy(function, Functions.a, z, bufferSize());
    }

    public final Observable<T> skip(long j, TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    public final <U, V> Observable<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        Objects.requireNonNull(observableSource2, "fallback is null");
        return timeout0(observableSource, function, observableSource2);
    }

    public static <T, R> Observable<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(iterable, function, bufferSize());
    }

    public final T blockingSingle(T t) {
        return single(t).blockingGet();
    }

    public final <R> Observable<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapEager(function, Integer.MAX_VALUE, bufferSize());
    }

    public final Observable<T> skip(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return skipUntil(timer(j, timeUnit, scheduler));
    }

    public final <K> Single<Map<K, T>> toMap(Function<? super T, ? extends K> function) {
        Objects.requireNonNull(function, "keySelector is null");
        return (Single<Map<K, T>>) collect(HashMapSupplier.a, Functions.x(function));
    }

    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
        return sequenceEqual(observableSource, observableSource2, biPredicate, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <U, V> Observable<T> delay(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        return delaySubscription(observableSource).delay(function);
    }

    public final Maybe<T> elementAt(long j) {
        if (j >= 0) {
            return new ObservableElementAtMaybe(this, j);
        }
        eg.g(l1d.l(j, "index >= 0 required but it was "));
        return null;
    }

    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return groupBy(function, function2, false, bufferSize());
    }

    public final Observable<T> retry(long j) {
        return retry(j, Functions.h);
    }

    public final <U> Observable<T> sample(ObservableSource<U> observableSource) {
        Objects.requireNonNull(observableSource, "sampler is null");
        return new ObservableSampleWithObservable(this, observableSource, false);
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit, boolean z) {
        return skipLast(j, timeUnit, Schedulers.d, z, bufferSize());
    }

    public final Observable<T> sorted() {
        return toList().toObservable().map(Functions.i(Functions.j())).flatMapIterable(Functions.a);
    }

    public static Observable<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, Schedulers.b);
    }

    public static <T> Single<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        return sequenceEqual(observableSource, observableSource2, ObjectHelper.a, bufferSize());
    }

    public final <K, V> Observable<GroupedObservable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z) {
        return groupBy(function, function2, z, bufferSize());
    }

    public final <K> Single<Map<K, Collection<T>>> toMultimap(Function<? super T, ? extends K> function) {
        return (Single<Map<K, Collection<T>>>) toMultimap(function, Functions.a, HashMapSupplier.a, ArrayListSupplier.a);
    }

    public static <T, S> Observable<T> generate(Supplier<S> supplier, BiConsumer<S, Emitter<T>> biConsumer, Consumer<? super S> consumer) {
        Objects.requireNonNull(biConsumer, "generator is null");
        return generate(supplier, ObservableInternalHelper.k(biConsumer), consumer);
    }

    public final <U> Observable<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        Objects.requireNonNull(function, "mapper is null");
        return new ObservableFlattenIterable(this, function);
    }

    public final <K> Observable<GroupedObservable<K, T>> groupBy(Function<? super T, ? extends K> function) {
        return (Observable<GroupedObservable<K, T>>) groupBy(function, Functions.a, false, bufferSize());
    }

    public final Observable<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final Observable<T> retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        Objects.requireNonNull(biPredicate, "predicate is null");
        return new ObservableRetryBiPredicate(this, biPredicate);
    }

    public final <U> Observable<T> sample(ObservableSource<U> observableSource, boolean z) {
        Objects.requireNonNull(observableSource, "sampler is null");
        return new ObservableSampleWithObservable(this, observableSource, z);
    }

    public final Observable<T> skipLast(int i) {
        if (i >= 0) {
            return i == 0 ? this : new ObservableSkipLast(this, i);
        }
        hhg1.n(f4i1.c(i, "count >= 0 required but it was "));
        return null;
    }

    public static Observable<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, Schedulers.b);
    }

    public final Observable<T> doOnEach(Consumer<? super Notification<T>> consumer) {
        Objects.requireNonNull(consumer, "onNotification is null");
        return doOnEach(Functions.m(consumer), Functions.l(consumer), Functions.k(consumer), Functions.c);
    }

    public static <T, S> Observable<T> generate(Supplier<S> supplier, BiFunction<S, Emitter<T>, S> biFunction) {
        return generate(supplier, biFunction, Functions.d);
    }

    public final Observable<T> retry() {
        return retry(Long.MAX_VALUE, Functions.h);
    }

    public static Observable<Long> interval(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return interval(j, j, timeUnit, scheduler);
    }

    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return toMultimap(function, function2, HashMapSupplier.a, ArrayListSupplier.a);
    }

    public final <R> Observable<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return concatMapEagerDelayError(function, z, Integer.MAX_VALUE, bufferSize());
    }

    public final Observable<T> retry(Predicate<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return skipLast(j, timeUnit, scheduler, false, bufferSize());
    }

    public static <T, R> Observable<R> combineLatestArray(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return combineLatestArray(observableSourceArr, function, bufferSize());
    }

    public static <T, R> Observable<R> combineLatestArrayDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return combineLatestArrayDelayError(observableSourceArr, function, bufferSize());
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i, long j, TimeUnit timeUnit) {
        return replay(function, i, j, timeUnit, Schedulers.b);
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        return skipLast(j, timeUnit, scheduler, z, bufferSize());
    }

    public final Stream<T> blockingStream() {
        return blockingStream(bufferSize());
    }

    public final Observable<T> doOnEach(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        return doOnEach(ObservableInternalHelper.f(observer), ObservableInternalHelper.e(observer), ObservableInternalHelper.d(observer), Functions.c);
    }

    public final Observable<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, Schedulers.d, false, bufferSize());
    }

    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<Map<K, Collection<V>>> supplier) {
        return toMultimap(function, function2, supplier, ArrayListSupplier.a);
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit) {
        return replay(function, j, timeUnit, Schedulers.b);
    }

    public final Observable<List<T>> buffer(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return (Observable<List<T>>) buffer(j, j2, timeUnit, scheduler, ArrayListSupplier.a);
    }

    public final ConnectableObservable<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, Schedulers.b);
    }

    public final <R> Observable<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMap(function, bufferSize());
    }

    public final <R> Observable<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMapDelayError(function, bufferSize());
    }

    public static <T> Observable<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return concat(observableSource, bufferSize());
    }

    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return (Observable<List<T>>) buffer(j, timeUnit, scheduler, Integer.MAX_VALUE, ArrayListSupplier.a, false);
    }

    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMap(function, 2);
    }

    public static <T> Observable<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableConcatMap(i, observableSource, Functions.a, ErrorMode.a);
    }

    public final <R> Observable<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i, Scheduler scheduler) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableConcatMapScheduler(this, function, i, ErrorMode.a, scheduler);
    }

    public final ConnectableObservable<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, Schedulers.b);
    }

    public final void blockingForEach(Consumer<? super T> consumer) {
        blockingForEach(consumer, bufferSize());
    }

    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return (Observable<List<T>>) buffer(j, timeUnit, scheduler, i, ArrayListSupplier.a, false);
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        Objects.requireNonNull(function, "selector is null");
        return ObservableReplay.k(function, ObservableInternalHelper.h(this));
    }

    public final <B> Observable<List<T>> buffer(ObservableSource<B> observableSource) {
        return (Observable<List<T>>) buffer((ObservableSource) observableSource, (Supplier) ArrayListSupplier.a);
    }

    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapDelayError(function, true, bufferSize());
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.a(i, "bufferSize");
        return ObservableReplay.k(function, ObservableInternalHelper.i(this, i, false));
    }

    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return concatArray(observableSource, observableSource2);
    }

    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.a);
    }

    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(Functions.a, true, i, i2);
    }

    public final <TOpening, TClosing> Observable<List<T>> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function) {
        return (Observable<List<T>>) buffer(observableSource, function, ArrayListSupplier.a);
    }

    public final <R> Observable<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i, Scheduler scheduler) {
        Objects.requireNonNull(function, "mapper is null");
        ObjectHelper.a(i, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableConcatMapScheduler(this, function, i, z ? ErrorMode.c : ErrorMode.b, scheduler);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, Schedulers.b, Long.MAX_VALUE, false);
    }

    public final Observable<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return (Observable<List<T>>) buffer(j, j2, timeUnit, Schedulers.b, ArrayListSupplier.a);
    }

    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return flatMap(function, z, Integer.MAX_VALUE);
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i, boolean z) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.a(i, "bufferSize");
        return ObservableReplay.k(function, ObservableInternalHelper.i(this, i, z));
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, Schedulers.d, false, bufferSize());
    }

    public static <T> Observable<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return concatArray(observableSource, observableSource2, observableSource3);
    }

    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(Functions.a, i);
    }

    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(Functions.a, true, i);
    }

    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i) {
        return flatMap(function, z, i, bufferSize());
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, Schedulers.b, j2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, Function3<? super T, ? super T1, ? super T2, R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(function3, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2}, Functions.q(function3));
    }

    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return flatMap((Function) function, false);
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit, boolean z) {
        return takeLast(j, timeUnit, Schedulers.d, z, bufferSize());
    }

    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, Schedulers.b, Integer.MAX_VALUE);
    }

    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Supplier<? extends ObservableSource<? extends R>> supplier) {
        Objects.requireNonNull(function, "onNextMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        Objects.requireNonNull(supplier, "onCompleteSupplier is null");
        return merge((ObservableSource) new ObservableMapNotification(this, function, function2, supplier));
    }

    public final ConnectableObservable<T> replay() {
        return ObservableReplay.j(this, ObservableReplay.e);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, long j2, boolean z) {
        return window(j, timeUnit, Schedulers.b, j2, z);
    }

    public static <T> Observable<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return new ObservableFlatMap(observableSource, Functions.a, false, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return new ObservableFlatMap(observableSource, Functions.a, true, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, int i, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(function, "selector is null");
        ObjectHelper.a(i, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.k(function, ObservableInternalHelper.g(i, j, this, scheduler, timeUnit, z));
    }

    public final Observable<T> takeLast(int i) {
        if (i < 0) {
            hhg1.n(f4i1.c(i, "count >= 0 required but it was "));
            return null;
        }
        if (i == 0) {
            return new ObservableIgnoreElements(this);
        }
        if (i == 1) {
            return new ObservableTakeLastOne(this);
        }
        return new ObservableTakeLast(this, i);
    }

    public static <T> Observable<T> concat(Iterable<? extends ObservableSource<? extends T>> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.a, false, bufferSize());
    }

    public final Observable<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, Schedulers.b, i);
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.f, Functions.c);
    }

    public final Observable<Observable<T>> window(long j) {
        return window(j, j, bufferSize());
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.c);
    }

    public final Observable<Observable<T>> window(long j, long j2) {
        return window(j, j2, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T1, T2, T3, R> Observable<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, Function4<? super T, ? super T1, ? super T2, ? super T3, R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return withLatestFrom((ObservableSource<?>[]) new ObservableSource[]{observableSource, observableSource2, observableSource3}, Functions.r(function4));
    }

    public final Observable<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<Throwable, ? extends ObservableSource<? extends R>> function2, Supplier<? extends ObservableSource<? extends R>> supplier, int i) {
        Objects.requireNonNull(function, "onNextMapper is null");
        Objects.requireNonNull(function2, "onErrorMapper is null");
        Objects.requireNonNull(supplier, "onCompleteSupplier is null");
        return merge((ObservableSource) new ObservableMapNotification(this, function, function2, supplier), i);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, action, Functions.d);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    public final Observable<Observable<T>> window(long j, long j2, int i) {
        ObjectHelper.b(j, "count");
        ObjectHelper.b(j2, "skip");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableWindow(this, j, j2, i);
    }

    public static <T> Observable<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.a(i, "maxConcurrency");
        return new ObservableFlatMap(observableSource, Functions.a, false, i, bufferSize());
    }

    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        ObjectHelper.a(i, "maxConcurrency");
        return new ObservableFlatMap(observableSource, Functions.a, true, i, bufferSize());
    }

    public final <U extends Collection<? super T>> Observable<U> buffer(int i, int i2, Supplier<U> supplier) {
        ObjectHelper.a(i, "count");
        ObjectHelper.a(i2, "skip");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return new ObservableBuffer(this, i, i2, supplier);
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.k(function, ObservableInternalHelper.j(this, j, timeUnit, scheduler, false));
    }

    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j, j2, timeUnit, scheduler, false, bufferSize());
    }

    public static <T> Observable<T> just(T t, T t2) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        return fromArray(t, t2);
    }

    public final <R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        return flatMap((Function) function, false, i, bufferSize());
    }

    public final Observable<T> takeLast(long j, long j2, TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, Schedulers.d, false, bufferSize());
    }

    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j, j2, timeUnit, scheduler, bufferSize());
    }

    public final <U extends Collection<? super T>> Observable<U> buffer(int i, Supplier<U> supplier) {
        return buffer(i, i, supplier);
    }

    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return flatMap(function, biFunction, false, bufferSize(), bufferSize());
    }

    public final Observable<Observable<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, Schedulers.b, bufferSize());
    }

    public final <U, R> Observable<R> withLatestFrom(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return new ObservableWithLatestFrom(this, biFunction, observableSource);
    }

    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(Functions.a, false, 2);
    }

    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap(Functions.a, true, 2);
    }

    public final <U extends Collection<? super T>> Observable<U> buffer(long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Supplier<U> supplier) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return new ObservableBufferTimed(this, j, j2, timeUnit, scheduler, supplier, Integer.MAX_VALUE, false);
    }

    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z) {
        return flatMap(function, biFunction, z, bufferSize(), bufferSize());
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j, timeUnit, scheduler, false, bufferSize());
    }

    public static <T> Observable<T> just(T t, T t2, T t3) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        return fromArray(t, t2, t3);
    }

    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i) {
        return flatMap(function, biFunction, z, i, bufferSize());
    }

    public final <R> Observable<R> replay(Function<? super Observable<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(function, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.k(function, ObservableInternalHelper.j(this, j, timeUnit, scheduler, z));
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, DisposableContainer disposableContainer) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseObserver disposableAutoReleaseObserver = new DisposableAutoReleaseObserver(consumer, consumer2, action, disposableContainer);
        disposableContainer.b(disposableAutoReleaseObserver);
        subscribe((Observer) disposableAutoReleaseObserver);
        return disposableAutoReleaseObserver;
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        return takeLast(j, timeUnit, scheduler, z, bufferSize());
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j, timeUnit, scheduler, Long.MAX_VALUE, false);
    }

    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i, int i2) {
        Objects.requireNonNull(function, "mapper is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return flatMap(ObservableInternalHelper.b(function, biFunction), z, i, i2);
    }

    public final Observable<T> takeLast(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        return takeLast(Long.MAX_VALUE, j, timeUnit, scheduler, z, i);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2) {
        return window(j, timeUnit, scheduler, j2, false);
    }

    public final <R> Observable<R> withLatestFrom(ObservableSource<?>[] observableSourceArr, Function<? super Object[], R> function) {
        Objects.requireNonNull(observableSourceArr, "others is null");
        Objects.requireNonNull(function, "combiner is null");
        return new ObservableWithLatestFromMany(this, observableSourceArr, function);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2, boolean z) {
        return window(j, timeUnit, scheduler, j2, z, bufferSize());
    }

    public final Observable<List<T>> buffer(int i, int i2) {
        return (Observable<List<T>>) buffer(i, i2, ArrayListSupplier.a);
    }

    public final Observable<Observable<T>> window(long j, TimeUnit timeUnit, Scheduler scheduler, long j2, boolean z, int i) {
        ObjectHelper.a(i, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.b(j2, "count");
        return new ObservableWindowTimed(this, j, j, timeUnit, scheduler, j2, i, z);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        return fromArray(t, t2, t3, t4);
    }

    public static <T> Observable<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.a, false, 3);
    }

    public static <T> Observable<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.a, true, 3);
    }

    public final <U, R> Observable<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, int i) {
        return flatMap(function, biFunction, false, i, bufferSize());
    }

    public final ConnectableObservable<T> replay(int i) {
        ObjectHelper.a(i, "bufferSize");
        return ObservableReplay.i(this, i, false);
    }

    public final <R> Observable<R> withLatestFrom(Iterable<? extends ObservableSource<?>> iterable, Function<? super Object[], R> function) {
        Objects.requireNonNull(iterable, "others is null");
        Objects.requireNonNull(function, "combiner is null");
        return new ObservableWithLatestFromMany(this, iterable, function);
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> Observable<U> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function, Supplier<U> supplier) {
        Objects.requireNonNull(observableSource, "openingIndicator is null");
        Objects.requireNonNull(function, "closingIndicator is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return new ObservableBufferBoundary(this, observableSource, function, supplier);
    }

    public final ConnectableObservable<T> replay(int i, boolean z) {
        ObjectHelper.a(i, "bufferSize");
        return ObservableReplay.i(this, i, z);
    }

    public final Disposable subscribe() {
        return subscribe(Functions.d, Functions.f, Functions.c);
    }

    public final ConnectableObservable<T> replay(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.a(i, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.h(i, j, this, scheduler, timeUnit, false);
    }

    public final <B> Observable<Observable<T>> window(ObservableSource<B> observableSource) {
        return window(observableSource, bufferSize());
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        return fromArray(t, t2, t3, t4, t5);
    }

    public final <B> Observable<List<T>> buffer(ObservableSource<B> observableSource, int i) {
        ObjectHelper.a(i, "initialCapacity");
        return (Observable<List<T>>) buffer(observableSource, Functions.c(i));
    }

    public final <B> Observable<Observable<T>> window(ObservableSource<B> observableSource, int i) {
        Objects.requireNonNull(observableSource, "boundaryIndicator is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableWindowBoundary(this, observableSource, i);
    }

    public static <T> Observable<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(Functions.a, false, i, i2);
    }

    public static <T> Observable<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.a, true);
    }

    public final <B, U extends Collection<? super T>> Observable<U> buffer(ObservableSource<B> observableSource, Supplier<U> supplier) {
        Objects.requireNonNull(observableSource, "boundaryIndicator is null");
        Objects.requireNonNull(supplier, "bufferSupplier is null");
        return new ObservableBufferExactBoundary(this, observableSource, supplier);
    }

    public final ConnectableObservable<T> replay(int i, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        ObjectHelper.a(i, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.h(i, j, this, scheduler, timeUnit, z);
    }

    public final <U, V> Observable<Observable<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function) {
        return window(observableSource, function, bufferSize());
    }

    public final <U, V> Observable<Observable<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function, int i) {
        Objects.requireNonNull(observableSource, "openingIndicator is null");
        Objects.requireNonNull(function, "closingIndicator is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableWindowBoundarySelector(this, observableSource, function, i);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        return fromArray(t, t2, t3, t4, t5, t6);
    }

    public final ConnectableObservable<T> replay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.h(Integer.MAX_VALUE, j, this, scheduler, timeUnit, false);
    }

    public final ConnectableObservable<T> replay(long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ObservableReplay.h(Integer.MAX_VALUE, j, this, scheduler, timeUnit, z);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        Objects.requireNonNull(t7, "item7 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    public static Observable<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return intervalRange(j, j2, j3, j4, timeUnit, Schedulers.b);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        Objects.requireNonNull(t7, "item7 is null");
        Objects.requireNonNull(t8, "item8 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(function, "combiner is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableCombineLatest(null, iterable, function, i << 1, false);
    }

    public static <T, R> Observable<R> zip(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, boolean z, int i) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        ObjectHelper.a(i, "bufferSize");
        return new ObservableZip(null, iterable, function, i, z);
    }

    public static <T1, T2, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2}, Functions.p(biFunction), bufferSize());
    }

    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.p(biFunction), false, bufferSize(), observableSource, observableSource2);
    }

    public static <T> Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        Objects.requireNonNull(t, "item1 is null");
        Objects.requireNonNull(t2, "item2 is null");
        Objects.requireNonNull(t3, "item3 is null");
        Objects.requireNonNull(t4, "item4 is null");
        Objects.requireNonNull(t5, "item5 is null");
        Objects.requireNonNull(t6, "item6 is null");
        Objects.requireNonNull(t7, "item7 is null");
        Objects.requireNonNull(t8, "item8 is null");
        Objects.requireNonNull(t9, "item9 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    public static <T1, T2, T3, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function3, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3}, Functions.q(function3), bufferSize());
    }

    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.p(biFunction), z, bufferSize(), observableSource, observableSource2);
    }

    public static <T1, T2, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z, int i) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(biFunction, "zipper is null");
        return zipArray(Functions.p(biFunction), z, i, observableSource, observableSource2);
    }

    public static <T1, T2, T3, T4, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function4, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, Functions.r(function4), bufferSize());
    }

    public static <T> Observable<T> just(T t) {
        Objects.requireNonNull(t, "item is null");
        return new ObservableJust(t);
    }

    public static <T1, T2, T3, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(function3, "zipper is null");
        return zipArray(Functions.q(function3), false, bufferSize(), observableSource, observableSource2, observableSource3);
    }

    public static <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(function5, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5}, Functions.s(function5), bufferSize());
    }

    public static <T1, T2, T3, T4, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(function4, "zipper is null");
        return zipArray(Functions.r(function4), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(function6, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6}, Functions.t(function6), bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(function5, "zipper is null");
        return zipArray(Functions.s(function5), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(function7, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7}, Functions.u(function7), bufferSize());
    }

    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(function6, "zipper is null");
        return zipArray(Functions.t(function6), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(function7, "zipper is null");
        return zipArray(Functions.u(function7), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(function8, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8}, Functions.v(function8), bufferSize());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(function8, "zipper is null");
        return zipArray(Functions.v(function8), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatest(iterable, function, bufferSize());
    }

    public static <T, R> Observable<R> zip(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        Objects.requireNonNull(function, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return new ObservableZip(null, iterable, function, bufferSize(), false);
    }
}
