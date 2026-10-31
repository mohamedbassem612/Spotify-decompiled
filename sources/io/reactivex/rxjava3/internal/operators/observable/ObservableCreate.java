package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableCreate<T> extends Observable<T> {
    public final ObservableOnSubscribe a;

    public static final class CreateEmitter<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {
        public final Observer a;

        public CreateEmitter(Observer observer) {
            this.a = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter, io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter, io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.a.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter, io.reactivex.rxjava3.core.Emitter
        public final void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            RxJavaPlugins.b(th);
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter, io.reactivex.rxjava3.core.Emitter
        public void onNext(T t) {
            if (t == null) {
                onError(ExceptionHelper.b("onNext called with a null value."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.a.onNext(t);
            }
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final ObservableEmitter serialize() {
            return new SerializedEmitter(this);
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public void setCancellable(Cancellable cancellable) {
            DisposableHelper.f(this, new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final void setDisposable(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return gvg.h(CreateEmitter.class.getSimpleName(), "{", super.toString(), "}");
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final boolean tryOnError(Throwable th) {
            if (th == null) {
                th = ExceptionHelper.b("onError called with a null Throwable.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.a.onError(th);
                return true;
            } finally {
                dispose();
            }
        }
    }

    public ObservableCreate(ObservableOnSubscribe observableOnSubscribe) {
        this.a = observableOnSubscribe;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.onSubscribe(createEmitter);
        try {
            this.a.subscribe(createEmitter);
        } catch (Throwable th) {
            Exceptions.a(th);
            createEmitter.onError(th);
        }
    }
}
