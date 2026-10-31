package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ObservableInternalHelper {

    public static final class BufferedReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        public final Observable a;
        public final int b;
        public final boolean c;

        public BufferedReplaySupplier(Observable observable, int i, boolean z) {
            this.a = observable;
            this.b = i;
            this.c = z;
        }

        public final Object get() {
            return this.a.replay(this.b, this.c);
        }
    }

    public static final class BufferedTimedReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        public final Observable a;
        public final int b;
        public final long c;
        public final TimeUnit d;
        public final Scheduler e;
        public final boolean f;

        public BufferedTimedReplaySupplier(int i, long j, Observable observable, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
            this.a = observable;
            this.b = i;
            this.c = j;
            this.d = timeUnit;
            this.e = scheduler;
            this.f = z;
        }

        public final Object get() {
            return this.a.replay(this.b, this.c, this.d, this.e, this.f);
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        public final Function a;

        public FlatMapIntoIterable(Function function) {
            this.a = function;
        }

        public final Object apply(Object obj) {
            Object objApply = this.a.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null Iterable");
            return new ObservableFromIterable((Iterable) objApply);
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        public final BiFunction a;
        public final Object b;

        public FlatMapWithCombinerInner(Object obj, BiFunction biFunction) {
            this.a = biFunction;
            this.b = obj;
        }

        public final Object apply(Object obj) {
            return this.a.apply(this.b, obj);
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        public final BiFunction a;
        public final Function b;

        public FlatMapWithCombinerOuter(Function function, BiFunction biFunction) {
            this.a = biFunction;
            this.b = function;
        }

        public final Object apply(Object obj) {
            Object objApply = this.b.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
            return new ObservableMap((ObservableSource) objApply, new FlatMapWithCombinerInner(obj, this.a));
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        public final Function a;

        public ItemDelayFunction(Function function) {
            this.a = function;
        }

        public final Object apply(Object obj) {
            Object objApply = this.a.apply(obj);
            Objects.requireNonNull(objApply, "The itemDelay returned a null ObservableSource");
            return new ObservableTake((ObservableSource) objApply, 1L).map(Functions.g(obj)).defaultIfEmpty(obj);
        }
    }

    public static final class ObserverOnComplete<T> implements Action {
        public final Observer a;

        public ObserverOnComplete(Observer observer) {
            this.a = observer;
        }

        public final void run() {
            this.a.onComplete();
        }
    }

    public static final class ObserverOnError<T> implements Consumer<Throwable> {
        public final Observer a;

        public ObserverOnError(Observer observer) {
            this.a = observer;
        }

        public final void accept(Object obj) {
            this.a.onError((Throwable) obj);
        }
    }

    public static final class ObserverOnNext<T> implements Consumer<T> {
        public final Observer a;

        public ObserverOnNext(Observer observer) {
            this.a = observer;
        }

        public final void accept(Object obj) {
            this.a.onNext(obj);
        }
    }

    public static final class ReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        public final Observable a;

        public ReplaySupplier(Observable observable) {
            this.a = observable;
        }

        public final Object get() {
            return this.a.replay();
        }
    }

    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        public final BiConsumer a;

        public SimpleBiGenerator(BiConsumer biConsumer) {
            this.a = biConsumer;
        }

        public final Object apply(Object obj, Object obj2) {
            this.a.accept(obj, (Emitter) obj2);
            return obj;
        }
    }

    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        public final Consumer a;

        public SimpleGenerator(Consumer consumer) {
            this.a = consumer;
        }

        public final Object apply(Object obj, Object obj2) {
            this.a.accept((Emitter) obj2);
            return obj;
        }
    }

    public static final class TimedReplayCallable<T> implements Supplier<ConnectableObservable<T>> {
        public final Observable a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler d;
        public final boolean e;

        public TimedReplayCallable(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
            this.a = observable;
            this.b = j;
            this.c = timeUnit;
            this.d = scheduler;
            this.e = z;
        }

        public final Object get() {
            return this.a.replay(this.b, this.c, this.d, this.e);
        }
    }

    public static Function a(Function function) {
        return new FlatMapIntoIterable(function);
    }

    public static Function b(Function function, BiFunction biFunction) {
        return new FlatMapWithCombinerOuter(function, biFunction);
    }

    public static Function c(Function function) {
        return new ItemDelayFunction(function);
    }

    public static Action d(Observer observer) {
        return new ObserverOnComplete(observer);
    }

    public static Consumer e(Observer observer) {
        return new ObserverOnError(observer);
    }

    public static Consumer f(Observer observer) {
        return new ObserverOnNext(observer);
    }

    public static Supplier g(int i, long j, Observable observable, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
        return new BufferedTimedReplaySupplier(i, j, observable, scheduler, timeUnit, z);
    }

    public static Supplier h(Observable observable) {
        return new ReplaySupplier(observable);
    }

    public static Supplier i(Observable observable, int i, boolean z) {
        return new BufferedReplaySupplier(observable, i, z);
    }

    public static Supplier j(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        return new TimedReplayCallable(observable, j, timeUnit, scheduler, z);
    }

    public static BiFunction k(BiConsumer biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static BiFunction l(Consumer consumer) {
        return new SimpleGenerator(consumer);
    }
}
