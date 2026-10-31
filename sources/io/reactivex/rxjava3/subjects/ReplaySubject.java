package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.i3a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ReplaySubject<T> extends Subject<T> {
    public static final ReplayDisposable[] d = new ReplayDisposable[0];
    public static final ReplayDisposable[] e = new ReplayDisposable[0];
    public static final Object[] f = new Object[0];
    public final ReplayBuffer a;
    public final AtomicReference b = new AtomicReference(d);
    public boolean c;

    public static final class Node<T> extends AtomicReference<Node<T>> {
        public final Object a;

        public Node(Object obj) {
            this.a = obj;
        }
    }

    public interface ReplayBuffer<T> {
        void a(Object obj);

        void add(Object obj);

        void b(ReplayDisposable replayDisposable);

        boolean compareAndSet(Object obj, Object obj2);
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {
        public final Observer a;
        public final ReplaySubject b;
        public Serializable c;
        public volatile boolean d;

        public ReplayDisposable(Observer observer, ReplaySubject replaySubject) {
            this.a = observer;
            this.b = replaySubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.h(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d;
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
        public final short a;
        public int b;
        public volatile Node c;
        public Node d;
        public volatile boolean e;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeBoundReplayBuffer(int i) {
            this.a = i;
            Node node = new Node(null);
            this.d = node;
            this.c = node;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public final void a(Object obj) {
            Node node = new Node(obj);
            Node node2 = this.d;
            this.d = node;
            this.b++;
            node2.lazySet(node);
            Node node3 = this.c;
            if (node3.a != null) {
                Node node4 = new Node(null);
                node4.lazySet(node3.get());
                this.c = node4;
            }
            this.e = true;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public final void add(Object obj) {
            Node node = new Node(obj);
            Node node2 = this.d;
            this.d = node;
            this.b++;
            node2.set(node);
            int i = this.b;
            if (i > this.a) {
                this.b = i - 1;
                this.c = this.c.get();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.ReplayBuffer
        public final void b(ReplayDisposable replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer observer = replayDisposable.a;
            Node<T> node = (Node) replayDisposable.c;
            if (node == null) {
                node = this.c;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.d) {
                Node<T> node2 = node.get();
                if (node2 != null) {
                    Object obj = node2.a;
                    if (this.e && node2.get() == null) {
                        if (NotificationLite.g(obj)) {
                            observer.onComplete();
                        } else {
                            observer.onError(NotificationLite.f(obj));
                        }
                        replayDisposable.c = null;
                        replayDisposable.d = true;
                        return;
                    }
                    observer.onNext(obj);
                    node = node2;
                } else if (node.get() != null) {
                    continue;
                } else {
                    replayDisposable.c = node;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.c = null;
        }
    }

    public ReplaySubject(ReplayBuffer replayBuffer) {
        this.a = replayBuffer;
    }

    public static ReplaySubject f() {
        ObjectHelper.a(1, "capacityHint");
        return new ReplaySubject(new UnboundedReplayBuffer());
    }

    public static ReplaySubject g(int i) {
        ObjectHelper.a(i, "maxSize");
        return new ReplaySubject(new SizeBoundReplayBuffer(i));
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    public final boolean a() {
        return ((ReplayDisposable[]) this.b.get()).length != 0;
    }

    public final void h(ReplayDisposable replayDisposable) {
        AtomicReference atomicReference;
        ReplayDisposable[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            atomicReference = this.b;
            replayDisposableArr = (ReplayDisposable[]) atomicReference.get();
            if (replayDisposableArr == e || replayDisposableArr == (replayDisposableArr2 = d)) {
                return;
            }
            int length = replayDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replayDisposableArr[i] == replayDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                replayDisposableArr2 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, i);
                System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr2, i, (length - i) - 1);
            }
        } while (!i3a.p(atomicReference, replayDisposableArr, replayDisposableArr2));
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (this.c) {
            return;
        }
        this.c = true;
        ReplayBuffer replayBuffer = this.a;
        NotificationLite notificationLite = NotificationLite.a;
        replayBuffer.a(notificationLite);
        replayBuffer.compareAndSet(null, notificationLite);
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.b.getAndSet(e)) {
            replayBuffer.b(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (this.c) {
            RxJavaPlugins.b(th);
            return;
        }
        this.c = true;
        Object objE = NotificationLite.e(th);
        ReplayBuffer replayBuffer = this.a;
        replayBuffer.a(objE);
        replayBuffer.compareAndSet(null, objE);
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.b.getAndSet(e)) {
            replayBuffer.b(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.c(obj, "onNext called with a null value.");
        if (this.c) {
            return;
        }
        ReplayBuffer replayBuffer = this.a;
        replayBuffer.add(obj);
        for (ReplayDisposable replayDisposable : (ReplayDisposable[]) this.b.get()) {
            replayBuffer.b(replayDisposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (this.c) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ReplayDisposable[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.onSubscribe(replayDisposable);
        AtomicReference atomicReference = this.b;
        do {
            replayDisposableArr = (ReplayDisposable[]) atomicReference.get();
            if (replayDisposableArr != e) {
                int length = replayDisposableArr.length;
                replayDisposableArr2 = new ReplayDisposable[length + 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
                replayDisposableArr2[length] = replayDisposable;
            }
            this.a.b(replayDisposable);
        } while (!i3a.p(atomicReference, replayDisposableArr, replayDisposableArr2));
        if (replayDisposable.d) {
            h(replayDisposable);
            return;
        }
        this.a.b(replayDisposable);
    }
}
