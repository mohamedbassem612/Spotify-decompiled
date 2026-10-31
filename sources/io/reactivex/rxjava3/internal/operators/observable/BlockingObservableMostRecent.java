package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BlockingObservableMostRecent<T> implements Iterable<T> {
    public final Observable a;
    public final Object b;

    public static final class MostRecentObserver<T> extends DefaultObserver<T> {
        public volatile Object b;

        public final class MostRecentIterator implements Iterator<T> {
            public Object a;

            public MostRecentIterator() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                Object obj = MostRecentObserver.this.b;
                this.a = obj;
                return !NotificationLite.g(obj);
            }

            @Override // java.util.Iterator
            public final Object next() {
                try {
                    Object obj = this.a;
                    if (obj == null) {
                        obj = MostRecentObserver.this.b;
                        this.a = obj;
                    }
                    if (NotificationLite.g(obj)) {
                        throw new NoSuchElementException();
                    }
                    boolean zH = NotificationLite.h(this.a);
                    Object obj2 = this.a;
                    if (zH) {
                        throw ExceptionHelper.f(NotificationLite.f(obj2));
                    }
                    this.a = null;
                    return obj2;
                } catch (Throwable th) {
                    this.a = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public final void onComplete() {
            this.b = NotificationLite.a;
        }

        public final void onError(Throwable th) {
            this.b = NotificationLite.e(th);
        }

        public final void onNext(Object obj) {
            this.b = obj;
        }
    }

    public BlockingObservableMostRecent(Observable observable, Object obj) {
        this.a = observable;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Object obj = this.b;
        MostRecentObserver mostRecentObserver = new MostRecentObserver();
        mostRecentObserver.b = obj;
        this.a.subscribe(mostRecentObserver);
        return new MostRecentObserver.MostRecentIterator();
    }
}
