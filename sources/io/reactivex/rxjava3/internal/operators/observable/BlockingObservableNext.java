package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BlockingObservableNext<T> implements Iterable<T> {
    public final Observable a;

    public static final class NextIterator<T> implements Iterator<T> {
        public final NextObserver a;
        public final Observable b;
        public Object c;
        public boolean d = true;
        public boolean e = true;
        public Throwable f;
        public boolean g;

        public NextIterator(Observable observable, NextObserver nextObserver) {
            this.b = observable;
            this.a = nextObserver;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th = this.f;
            if (th != null) {
                throw ExceptionHelper.f(th);
            }
            if (!this.d) {
                return false;
            }
            if (!this.e) {
                return true;
            }
            NextObserver nextObserver = this.a;
            AtomicInteger atomicInteger = nextObserver.c;
            if (!this.g) {
                this.g = true;
                atomicInteger.set(1);
                new ObservableMaterialize((ObservableSource) this.b).subscribe(nextObserver);
            }
            try {
                atomicInteger.set(1);
                Notification notification = (Notification) nextObserver.b.take();
                if (notification.e()) {
                    this.e = false;
                    this.c = notification.d();
                    return true;
                }
                this.d = false;
                if (notification.a == null) {
                    return false;
                }
                Throwable thC = notification.c();
                this.f = thC;
                throw ExceptionHelper.f(thC);
            } catch (InterruptedException e) {
                nextObserver.dispose();
                this.f = e;
                throw ExceptionHelper.f(e);
            }
        }

        @Override // java.util.Iterator
        public final Object next() {
            Throwable th = this.f;
            if (th != null) {
                throw ExceptionHelper.f(th);
            }
            if (hasNext()) {
                this.e = true;
                return this.c;
            }
            bhn0.t("No more elements");
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public static final class NextObserver<T> extends DisposableObserver<Notification<T>> {
        public final ArrayBlockingQueue b = new ArrayBlockingQueue(1);
        public final AtomicInteger c = new AtomicInteger();

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            RxJavaPlugins.b(th);
        }

        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.c.getAndSet(0) != 1 && notification.e()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.b;
                if (arrayBlockingQueue.offer(notification)) {
                    return;
                }
                Notification notification2 = (Notification) arrayBlockingQueue.poll();
                if (notification2 != null && !notification2.e()) {
                    notification = notification2;
                }
            }
        }
    }

    public BlockingObservableNext(Observable observable) {
        this.a = observable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new NextIterator(this.a, new NextObserver());
    }
}
