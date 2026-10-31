package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.observers.CallbackCompletableObserver;
import io.reactivex.rxjava3.internal.observers.DisposableAutoReleaseMultiObserver;
import io.reactivex.rxjava3.internal.observers.EmptyCompletableObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableConcatArray;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromSingle;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromUnsafeSource;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeArray;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeIterable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.completable.CompletableResumeNext;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTimeout;
import io.reactivex.rxjava3.internal.operators.completable.CompletableTimer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToFlowable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToObservable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import io.reactivex.rxjava3.internal.operators.mixed.CompletableAndThenObservable;
import io.reactivex.rxjava3.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import rxdogtag2.m;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Completable implements CompletableSource {
    public static Completable f(CompletableSource... completableSourceArr) {
        if (completableSourceArr.length == 0) {
            return CompletableEmpty.a;
        }
        return completableSourceArr.length == 1 ? y(completableSourceArr[0]) : new CompletableConcatArray(completableSourceArr);
    }

    public static CompletableError j(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new CompletableError(th);
    }

    public static CompletableFromSingle k(Single single) {
        Objects.requireNonNull(single, "single is null");
        return new CompletableFromSingle(single);
    }

    public static CompletableMergeIterable l(Iterable iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return new CompletableMergeIterable(iterable);
    }

    public static Completable m(CompletableSource... completableSourceArr) {
        if (completableSourceArr.length == 0) {
            return CompletableEmpty.a;
        }
        return completableSourceArr.length == 1 ? y(completableSourceArr[0]) : new CompletableMergeArray(completableSourceArr);
    }

    public static CompletableTimer u(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new CompletableTimer(j, timeUnit, scheduler);
    }

    public static Completable y(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "source is null");
        return completableSource instanceof Completable ? (Completable) completableSource : new CompletableFromUnsafeSource(completableSource);
    }

    public final CompletableAndThenCompletable c(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "next is null");
        return new CompletableAndThenCompletable(this, completableSource);
    }

    public final CompletableAndThenObservable d(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "next is null");
        return new CompletableAndThenObservable(this, observableSource);
    }

    public final SingleDelayWithCompletable e(SingleSource singleSource) {
        Objects.requireNonNull(singleSource, "next is null");
        return new SingleDelayWithCompletable(singleSource, this);
    }

    public final CompletablePeek g(Action action) {
        Consumer consumer = Functions.d;
        Action action2 = Functions.c;
        return i(consumer, consumer, action, action2, action2, action2);
    }

    public final CompletablePeek h(Consumer consumer) {
        Consumer consumer2 = Functions.d;
        Action action = Functions.c;
        return i(consumer2, consumer, action, action, action, action);
    }

    public final CompletablePeek i(Consumer consumer, Consumer consumer2, Action action, Action action2, Action action3, Action action4) {
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(action2, "onTerminate is null");
        Objects.requireNonNull(action3, "onAfterTerminate is null");
        Objects.requireNonNull(action4, "onDispose is null");
        return new CompletablePeek(this, consumer, consumer2, action, action2, action3, action4);
    }

    public final CompletableObserveOn n(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new CompletableObserveOn(this, scheduler);
    }

    public final CompletableOnErrorComplete o(Predicate predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return new CompletableOnErrorComplete(this, predicate);
    }

    public final CompletableResumeNext p(Function function) {
        Objects.requireNonNull(function, "fallbackSupplier is null");
        return new CompletableResumeNext(this, function);
    }

    public final Completable q(Completable completable) {
        Objects.requireNonNull(completable, "other is null");
        return f(completable, this);
    }

    public void r(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(EmptyDisposable.a);
        completableObserver.onComplete();
    }

    public final CompletableSubscribeOn s(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new CompletableSubscribeOn(this, scheduler);
    }

    @Override // io.reactivex.rxjava3.core.CompletableSource
    public final void subscribe(CompletableObserver completableObserver) {
        Objects.requireNonNull(completableObserver, "observer is null");
        try {
            m mVar = RxJavaPlugins.f;
            if (mVar != null) {
                try {
                    completableObserver = (CompletableObserver) mVar.apply(this, completableObserver);
                } catch (Throwable th) {
                    throw ExceptionHelper.f(th);
                }
            }
            Objects.requireNonNull(completableObserver, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            r(completableObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final CompletableTimeout t(long j, TimeUnit timeUnit, Scheduler scheduler, CompletableError completableError) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new CompletableTimeout(this, j, timeUnit, scheduler, completableError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable v() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).b() : new CompletableToFlowable(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable w() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).a() : new CompletableToObservable(this);
    }

    public final CompletableToSingle x(Object obj) {
        Objects.requireNonNull(obj, "completionValue is null");
        return new CompletableToSingle(this, null, obj);
    }

    public final Disposable subscribe() {
        EmptyCompletableObserver emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    public final Disposable subscribe(Action action, Consumer<? super Throwable> consumer) {
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver(consumer, action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    public final Disposable subscribe(Action action, Consumer<? super Throwable> consumer, DisposableContainer disposableContainer) {
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(consumer, "onError is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseMultiObserver disposableAutoReleaseMultiObserver = new DisposableAutoReleaseMultiObserver(Functions.d, consumer, action, disposableContainer);
        disposableContainer.b(disposableAutoReleaseMultiObserver);
        subscribe((CompletableObserver) disposableAutoReleaseMultiObserver);
        return disposableAutoReleaseMultiObserver;
    }

    public final Disposable subscribe(Action action) {
        return subscribe(action, Functions.f);
    }
}
