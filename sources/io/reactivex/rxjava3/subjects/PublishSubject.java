package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p.i3a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PublishSubject<T> extends Subject<T> {
    public static final PublishDisposable[] c = new PublishDisposable[0];
    public static final PublishDisposable[] d = new PublishDisposable[0];
    public final AtomicReference a = new AtomicReference(d);
    public Throwable b;

    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        public final Observer a;
        public final PublishSubject b;

        public PublishDisposable(Observer observer, PublishSubject publishSubject) {
            this.a = observer;
            this.b = publishSubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.b.f(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    public final boolean a() {
        return ((PublishDisposable[]) this.a.get()).length != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            PublishDisposable[] publishDisposableArr2 = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr2 == c || publishDisposableArr2 == (publishDisposableArr = d)) {
                return;
            }
            int length = publishDisposableArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr2[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishDisposableArr = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr2, 0, publishDisposableArr, 0, i);
                System.arraycopy(publishDisposableArr2, i + 1, publishDisposableArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(publishDisposableArr2, publishDisposableArr)) {
                if (atomicReference.get() != publishDisposableArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            return;
        }
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (!publishDisposable.get()) {
                publishDisposable.a.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            RxJavaPlugins.b(th);
            return;
        }
        this.b = th;
        for (PublishDisposable publishDisposable : (PublishDisposable[]) atomicReference.getAndSet(obj2)) {
            if (publishDisposable.get()) {
                RxJavaPlugins.b(th);
            } else {
                publishDisposable.a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.c(obj, "onNext called with a null value.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.a.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.a.onNext(obj);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (this.a.get() == c) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        AtomicReference atomicReference;
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        do {
            atomicReference = this.a;
            publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == c) {
                Throwable th = this.b;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!i3a.p(atomicReference, publishDisposableArr, publishDisposableArr2));
        if (publishDisposable.isDisposed()) {
            f(publishDisposable);
        }
    }
}
