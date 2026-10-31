package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.operators.QueueDisposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EmptyDisposable implements QueueDisposable<Object> {
    public static final EmptyDisposable a;
    public static final EmptyDisposable b;
    public static final /* synthetic */ EmptyDisposable[] c;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        a = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        b = emptyDisposable2;
        c = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    public static void b(Observer observer) {
        observer.onSubscribe(a);
        observer.onComplete();
    }

    public static void c(Throwable th, Observer observer) {
        observer.onSubscribe(a);
        observer.onError(th);
    }

    public static void f(Throwable th, SingleObserver singleObserver) {
        singleObserver.onSubscribe(a);
        singleObserver.onError(th);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) c.clone();
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    public final int a(int i) {
        return 2;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this == a;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        return null;
    }
}
