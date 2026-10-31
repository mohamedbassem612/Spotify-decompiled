package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BlockingObservableLatest<T> implements Iterable<T> {
    public final Observable a;

    public static final class BlockingObservableLatestIterator<T> extends DisposableObserver<Notification<T>> implements Iterator<T> {
        public Notification b;
        public final Semaphore c = new Semaphore(0);
        public final AtomicReference d = new AtomicReference();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Notification notification = this.b;
            if (notification != null && NotificationLite.h(notification.a)) {
                throw ExceptionHelper.f(this.b.c());
            }
            if (this.b == null) {
                try {
                    this.c.acquire();
                    Notification notification2 = (Notification) this.d.getAndSet(null);
                    this.b = notification2;
                    if (NotificationLite.h(notification2.a)) {
                        throw ExceptionHelper.f(notification2.c());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.b = Notification.a(e);
                    throw ExceptionHelper.f(e);
                }
            }
            return this.b.e();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                hhg1.k();
                return null;
            }
            Object objD = this.b.d();
            this.b = null;
            return objD;
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            RxJavaPlugins.b(th);
        }

        public final void onNext(Object obj) {
            if (this.d.getAndSet((Notification) obj) == null) {
                this.c.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public BlockingObservableLatest(Observable observable) {
        this.a = observable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        BlockingObservableLatestIterator blockingObservableLatestIterator = new BlockingObservableLatestIterator();
        Observable.wrap(this.a).materialize().subscribe(blockingObservableLatestIterator);
        return blockingObservableLatestIterator;
    }
}
