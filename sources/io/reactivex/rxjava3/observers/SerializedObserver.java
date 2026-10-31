package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {
    public final Observer a;
    public Disposable b;
    public boolean c;
    public AppendOnlyLinkedArrayList d;
    public volatile boolean e;

    public SerializedObserver(Observer observer) {
        this.a = observer;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.e = true;
        this.b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.c) {
                    this.e = true;
                    this.c = true;
                    this.a.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.b(NotificationLite.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (this.e) {
            RxJavaPlugins.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    if (this.c) {
                        this.e = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a[0] = NotificationLite.e(th);
                        return;
                    }
                    this.e = true;
                    this.c = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.b(th);
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        Object[] objArr;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.dispose();
            onError(ExceptionHelper.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.b(obj);
                    return;
                }
                this.c = true;
                this.a.onNext(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.d;
                            if (appendOnlyLinkedArrayList2 == null) {
                                this.c = false;
                                return;
                            }
                            this.d = null;
                            Observer observer = this.a;
                            for (Object[] objArr2 = appendOnlyLinkedArrayList2.a; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (NotificationLite.c(observer, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.b, disposable)) {
            this.b = disposable;
            this.a.onSubscribe(this);
        }
    }
}
