package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {
    public final Observable a;
    public final int b;

    public static final class BlockingObservableIterator<T> extends AtomicReference<Disposable> implements Observer<T>, Iterator<T>, Disposable {
        public final SpscLinkedArrayQueue a;
        public final ReentrantLock b;
        public final Condition c;
        public volatile boolean d;
        public volatile Throwable e;

        public BlockingObservableIterator(int i) {
            this.a = new SpscLinkedArrayQueue(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.b = reentrantLock;
            this.c = reentrantLock.newCondition();
        }

        public final void a() {
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                this.c.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        public void dispose() {
            DisposableHelper.a(this);
            a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.d;
                boolean zIsEmpty = this.a.isEmpty();
                if (z) {
                    Throwable th = this.e;
                    if (th != null) {
                        throw ExceptionHelper.f(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    this.b.lock();
                    while (!this.d && this.a.isEmpty() && !isDisposed()) {
                        try {
                            this.c.await();
                        } catch (Throwable th2) {
                            this.b.unlock();
                            throw th2;
                        }
                    }
                    this.b.unlock();
                } catch (InterruptedException e) {
                    DisposableHelper.a(this);
                    a();
                    throw ExceptionHelper.f(e);
                }
            }
            Throwable th3 = this.e;
            if (th3 == null) {
                return false;
            }
            throw ExceptionHelper.f(th3);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                return this.a.poll();
            }
            hhg1.k();
            return null;
        }

        public final void onComplete() {
            this.d = true;
            a();
        }

        public final void onError(Throwable th) {
            this.e = th;
            this.d = true;
            a();
        }

        public final void onNext(Object obj) {
            this.a.offer(obj);
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public BlockingObservableIterable(Observable observable, int i) {
        this.a = observable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.b);
        this.a.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }
}
