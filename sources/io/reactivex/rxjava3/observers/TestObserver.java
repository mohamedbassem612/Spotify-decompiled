package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, Disposable, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {
    public final AtomicReference f = new AtomicReference();
    public final Observer e = EmptyObserver.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmptyObserver implements Observer<Object> {
        public static final EmptyObserver a;
        public static final /* synthetic */ EmptyObserver[] b;

        static {
            EmptyObserver emptyObserver = new EmptyObserver("INSTANCE", 0);
            a = emptyObserver;
            b = new EmptyObserver[]{emptyObserver};
        }

        public static EmptyObserver valueOf(String str) {
            return (EmptyObserver) Enum.valueOf(EmptyObserver.class, str);
        }

        public static EmptyObserver[] values() {
            return (EmptyObserver[]) b.clone();
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
        }

        public final void onNext(Object obj) {
        }

        public final void onSubscribe(Disposable disposable) {
        }
    }

    public final void dispose() {
        DisposableHelper.a(this.f);
    }

    public final boolean isDisposed() {
        return DisposableHelper.b((Disposable) this.f.get());
    }

    public final void onComplete() {
        CountDownLatch countDownLatch = this.a;
        if (!this.d) {
            this.d = true;
            if (this.f.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.e.onComplete();
        } finally {
            countDownLatch.countDown();
        }
    }

    public final void onError(Throwable th) {
        CountDownLatch countDownLatch = this.a;
        boolean z = this.d;
        VolatileSizeArrayList volatileSizeArrayList = this.c;
        if (!z) {
            this.d = true;
            if (this.f.get() == null) {
                volatileSizeArrayList.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th == null) {
                volatileSizeArrayList.add(new NullPointerException("onError received a null Throwable"));
            } else {
                volatileSizeArrayList.add(th);
            }
            this.e.onError(th);
        } finally {
            countDownLatch.countDown();
        }
    }

    public final void onNext(Object obj) {
        boolean z = this.d;
        VolatileSizeArrayList volatileSizeArrayList = this.c;
        if (!z) {
            this.d = true;
            if (this.f.get() == null) {
                volatileSizeArrayList.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.b.add(obj);
        if (obj == null) {
            volatileSizeArrayList.add(new NullPointerException("onNext received a null value"));
        }
        this.e.onNext(obj);
    }

    public final void onSubscribe(Disposable disposable) {
        AtomicReference atomicReference;
        Thread.currentThread();
        VolatileSizeArrayList volatileSizeArrayList = this.c;
        if (disposable == null) {
            volatileSizeArrayList.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        do {
            atomicReference = this.f;
            if (atomicReference.compareAndSet(null, disposable)) {
                this.e.onSubscribe(disposable);
                return;
            }
        } while (atomicReference.get() == null);
        disposable.dispose();
        if (atomicReference.get() != DisposableHelper.a) {
            volatileSizeArrayList.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
        }
    }

    public final void onSuccess(Object obj) {
        onNext(obj);
        onComplete();
    }
}
