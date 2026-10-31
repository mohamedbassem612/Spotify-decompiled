package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p.f4i1;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();
    public final Runnable a;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.a = runnable;
        lazySet(0, disposableContainer);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == e) {
                return;
            }
            if (obj == c) {
                future.cancel(false);
                return;
            } else if (obj == d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = e;
            if (obj6 == obj || obj6 == (obj4 = c) || obj6 == (obj5 = d)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).c(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == b || obj == e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = d;
        Object obj4 = c;
        Object obj5 = b;
        Object obj6 = e;
        lazySet(2, Thread.currentThread());
        try {
            this.a.run();
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((DisposableContainer) obj7).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    break;
                }
            } while (!compareAndSet(1, obj2, obj6));
            lazySet(2, null);
        } catch (Throwable th) {
            try {
                RxJavaPlugins.b(th);
                throw th;
            } catch (Throwable th2) {
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((DisposableContainer) obj8).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                lazySet(2, null);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String strG;
        Object obj = get(1);
        if (obj == e) {
            strG = "Finished";
        } else if (obj == c) {
            strG = "Disposed(Sync)";
        } else if (obj == d) {
            strG = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            strG = obj2 == null ? "Waiting" : gvg.g(obj2, "Running on ");
        }
        return f4i1.f("ScheduledRunnable[", strG, "]");
    }
}
