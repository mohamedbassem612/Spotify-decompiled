package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableGenerate<T, S> extends Observable<T> {
    public final Supplier a;
    public final BiFunction b;
    public final Consumer c;

    public static final class GeneratorDisposable<T, S> implements Emitter<T>, Disposable {
        public final Observer a;
        public final Consumer b;
        public Object c;
        public volatile boolean d;
        public boolean e;
        public boolean f;

        public GeneratorDisposable(Observer observer, BiFunction biFunction, Consumer consumer, Object obj) {
            this.a = observer;
            this.b = consumer;
            this.c = obj;
        }

        public final void a(Object obj) {
            try {
                this.b.accept(obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }

        public void dispose() {
            this.d = true;
        }

        public boolean isDisposed() {
            return this.d;
        }

        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
                return;
            }
            if (th == null) {
                th = ExceptionHelper.b("onError called with a null Throwable.");
            }
            this.e = true;
            this.a.onError(th);
        }

        public void onNext(T t) {
            if (this.e) {
                return;
            }
            if (this.f) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(ExceptionHelper.b("onNext called with a null value."));
            } else {
                this.f = true;
                this.a.onNext(t);
            }
        }
    }

    public ObservableGenerate(Supplier supplier, BiFunction biFunction, Consumer consumer) {
        this.a = supplier;
        this.b = biFunction;
        this.c = consumer;
    }

    public final void subscribeActual(Observer observer) {
        try {
            Object obj = this.a.get();
            BiFunction biFunction = this.b;
            GeneratorDisposable generatorDisposable = new GeneratorDisposable(observer, biFunction, this.c, obj);
            observer.onSubscribe(generatorDisposable);
            Object objApply = generatorDisposable.c;
            if (generatorDisposable.d) {
                generatorDisposable.c = null;
                generatorDisposable.a(objApply);
                return;
            }
            while (!generatorDisposable.d) {
                generatorDisposable.f = false;
                try {
                    objApply = biFunction.apply(objApply, generatorDisposable);
                    if (generatorDisposable.e) {
                        generatorDisposable.d = true;
                        generatorDisposable.c = null;
                        generatorDisposable.a(objApply);
                        return;
                    }
                } catch (Throwable th) {
                    Exceptions.a(th);
                    generatorDisposable.c = null;
                    generatorDisposable.d = true;
                    generatorDisposable.onError(th);
                    generatorDisposable.a(objApply);
                    return;
                }
            }
            generatorDisposable.c = null;
            generatorDisposable.a(objApply);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            EmptyDisposable.c(th2, observer);
        }
    }
}
