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
import io.reactivex.rxjava3.internal.observers.DisposableAutoReleaseMultiObserver;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeJust;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.maybe.MaybePeek;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeTimer;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToObservable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeUnsafeCreate;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import rxdogtag2.m;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    public static MaybeJust e(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new MaybeJust(obj);
    }

    public static MaybeTimer l(long j, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new MaybeTimer(Math.max(0L, j), timeUnit, scheduler);
    }

    public static Maybe o(MaybeSource maybeSource) {
        if (maybeSource instanceof Maybe) {
            return (Maybe) maybeSource;
        }
        Objects.requireNonNull(maybeSource, "source is null");
        return new MaybeUnsafeCreate(maybeSource);
    }

    public final MaybePeek c(Consumer consumer) {
        Consumer consumer2 = Functions.d;
        Action action = Functions.c;
        return new MaybePeek(this, consumer2, consumer2, consumer, action, action, action);
    }

    public final MaybePeek d(Consumer consumer) {
        Consumer consumer2 = Functions.d;
        Action action = Functions.c;
        return new MaybePeek(this, consumer2, consumer, consumer2, action, action, action);
    }

    public final MaybeMap f(Function function) {
        Objects.requireNonNull(function, "mapper is null");
        return new MaybeMap(this, function);
    }

    public final MaybeObserveOn g(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new MaybeObserveOn(this, scheduler);
    }

    public final Maybe h() {
        Predicate predicate = Functions.h;
        Objects.requireNonNull(predicate, "predicate is null");
        return new MaybeOnErrorComplete(this, predicate);
    }

    public void i(MaybeObserver maybeObserver) {
        maybeObserver.onSubscribe(EmptyDisposable.a);
        maybeObserver.onComplete();
    }

    public final MaybeSubscribeOn j(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new MaybeSubscribeOn(this, scheduler);
    }

    public final MaybeSwitchIfEmptySingle k(Single single) {
        Objects.requireNonNull(single, "other is null");
        return new MaybeSwitchIfEmptySingle(this, single);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable m() {
        return this instanceof FuseToFlowable ? ((FuseToFlowable) this).b() : new MaybeToFlowable(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable n() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).a() : new MaybeToObservable(this);
    }

    @Override // io.reactivex.rxjava3.core.MaybeSource
    public final void subscribe(MaybeObserver<? super T> maybeObserver) {
        Objects.requireNonNull(maybeObserver, "observer is null");
        m mVar = RxJavaPlugins.c;
        if (mVar != null) {
            try {
                maybeObserver = (MaybeObserver) mVar.apply(this, maybeObserver);
            } catch (Throwable th) {
                throw ExceptionHelper.f(th);
            }
        }
        Objects.requireNonNull(maybeObserver, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            i(maybeObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            Exceptions.a(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.f, Functions.c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.c);
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        MaybeCallbackObserver maybeCallbackObserver = new MaybeCallbackObserver(consumer, consumer2, action);
        subscribe(maybeCallbackObserver);
        return maybeCallbackObserver;
    }

    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, DisposableContainer disposableContainer) {
        Objects.requireNonNull(consumer, "onSuccess is null");
        Objects.requireNonNull(consumer2, "onError is null");
        Objects.requireNonNull(action, "onComplete is null");
        Objects.requireNonNull(disposableContainer, "container is null");
        DisposableAutoReleaseMultiObserver disposableAutoReleaseMultiObserver = new DisposableAutoReleaseMultiObserver(consumer, consumer2, action, disposableContainer);
        disposableContainer.b(disposableAutoReleaseMultiObserver);
        subscribe((MaybeObserver) disposableAutoReleaseMultiObserver);
        return disposableAutoReleaseMultiObserver;
    }

    public final Disposable subscribe() {
        return subscribe(Functions.d, Functions.f, Functions.c);
    }
}
