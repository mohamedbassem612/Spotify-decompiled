package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;
import p.xcg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableFromStream<T> extends Observable<T> {
    public final Stream a;

    public static final class StreamDisposable<T> implements QueueDisposable<T> {
        public final Observer a;
        public Iterator b;
        public AutoCloseable c;
        public volatile boolean d;
        public boolean e;
        public boolean f;

        public StreamDisposable(Observer observer, Iterator it, AutoCloseable autoCloseable) {
            this.a = observer;
            this.b = it;
            this.c = autoCloseable;
        }

        public final int a(int i) {
            this.f = true;
            return 1;
        }

        public final void b() {
            if (this.f) {
                return;
            }
            Iterator it = this.b;
            Observer observer = this.a;
            while (!this.d) {
                try {
                    Object next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator.next returned a null value");
                    if (!this.d) {
                        observer.onNext(next);
                        if (!this.d) {
                            try {
                                if (!it.hasNext()) {
                                    observer.onComplete();
                                    this.d = true;
                                }
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                observer.onError(th);
                                this.d = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    observer.onError(th2);
                    this.d = true;
                }
            }
            clear();
        }

        public final void clear() {
            this.b = null;
            AutoCloseable autoCloseable = this.c;
            this.c = null;
            if (autoCloseable != null) {
                try {
                    xcg1.l(autoCloseable);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        public void dispose() {
            this.d = true;
            b();
        }

        public boolean isDisposed() {
            return this.d;
        }

        public final boolean isEmpty() {
            Iterator it = this.b;
            if (it == null) {
                return true;
            }
            if (!this.e || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final Object poll() {
            Iterator it = this.b;
            if (it == null) {
                return null;
            }
            if (!this.e) {
                this.e = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            Object next = this.b.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }
    }

    public ObservableFromStream(Stream stream) {
        this.a = stream;
    }

    public static void a(Observer observer, Stream stream) {
        try {
            Iterator<T> it = stream.iterator();
            if (it.hasNext()) {
                StreamDisposable streamDisposable = new StreamDisposable(observer, it, stream);
                observer.onSubscribe(streamDisposable);
                streamDisposable.b();
            } else {
                EmptyDisposable.b(observer);
                try {
                    xcg1.l(stream);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            EmptyDisposable.c(th2, observer);
            try {
                xcg1.l(stream);
            } catch (Throwable th3) {
                Exceptions.a(th3);
                RxJavaPlugins.b(th3);
            }
        }
    }

    public final void subscribeActual(Observer observer) {
        a(observer, this.a);
    }
}
