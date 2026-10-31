package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;
import p.pze0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
final class MaybeFlattenStreamAsObservable$FlattenStreamMultiObserver<T, R> extends BasicIntQueueDisposable<R> implements MaybeObserver<T>, SingleObserver<T> {
    public final Observer a;
    public final Function b;
    public Disposable c;
    public volatile Iterator d;
    public Stream e;
    public boolean f;
    public volatile boolean g;
    public boolean h;

    public MaybeFlattenStreamAsObservable$FlattenStreamMultiObserver(Observer observer, Function function) {
        this.a = observer;
        this.b = function;
    }

    public final int a(int i) {
        this.h = true;
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        Observer observer = this.a;
        Iterator it = this.d;
        int iAddAndGet = 1;
        while (true) {
            if (this.g) {
                clear();
            } else if (this.h) {
                observer.onNext((Object) null);
                observer.onComplete();
            } else {
                try {
                    Object next = it.next();
                    if (!this.g) {
                        observer.onNext(next);
                        if (!this.g) {
                            try {
                                boolean zHasNext = it.hasNext();
                                if (!this.g && !zHasNext) {
                                    observer.onComplete();
                                    this.g = true;
                                }
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                observer.onError(th);
                                this.g = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    observer.onError(th2);
                    this.g = true;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public final void clear() {
        this.d = null;
        Stream stream = this.e;
        this.e = null;
        if (stream != null) {
            try {
                pze0.n(stream);
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }
    }

    public void dispose() {
        this.g = true;
        this.c.dispose();
        if (this.h) {
            return;
        }
        b();
    }

    public boolean isDisposed() {
        return this.g;
    }

    public final boolean isEmpty() {
        Iterator it = this.d;
        if (it == null) {
            return true;
        }
        if (!this.f || it.hasNext()) {
            return false;
        }
        clear();
        return true;
    }

    public final void onComplete() {
        this.a.onComplete();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.c, disposable)) {
            this.c = disposable;
            this.a.onSubscribe(this);
        }
    }

    public final void onSuccess(Object obj) {
        try {
            Object objApply = this.b.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null Stream");
            Stream stream = (Stream) objApply;
            Iterator<T> it = stream.iterator();
            if (it.hasNext()) {
                this.d = it;
                this.e = stream;
                b();
            } else {
                this.a.onComplete();
                try {
                    pze0.n(stream);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            this.a.onError(th2);
        }
    }

    public final Object poll() {
        Iterator it = this.d;
        if (it == null) {
            return null;
        }
        if (!this.f) {
            this.f = true;
        } else if (!it.hasNext()) {
            clear();
            return null;
        }
        return it.next();
    }
}
