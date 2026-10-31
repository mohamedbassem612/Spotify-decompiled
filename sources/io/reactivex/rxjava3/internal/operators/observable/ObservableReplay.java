package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.dv20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableReplay<T> extends ConnectableObservable<T> {
    public static final UnBoundedFactory e = new UnBoundedFactory();
    public final Observable a;
    public final AtomicReference b;
    public final BufferSupplier c;
    public final ObservableSource d;

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        public Node a;
        public int b;
        public final boolean c;

        public BoundedReplayBuffer(boolean z) {
            this.c = z;
            Node node = new Node(null);
            this.a = node;
            set(node);
        }

        public Object a(Object obj) {
            return obj;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void b() {
            Node node = new Node(a(NotificationLite.a));
            this.a.set(node);
            this.a = node;
            this.b++;
            j();
        }

        public Node c() {
            return get();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void d(Throwable th) {
            Node node = new Node(a(NotificationLite.e(th)));
            this.a.set(node);
            this.a = node;
            this.b++;
            j();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void e(Object obj) {
            Node node = new Node(a(obj));
            this.a.set(node);
            this.a = node;
            this.b++;
            h();
        }

        public Object f(Object obj) {
            return obj;
        }

        public final void g(Node node) {
            if (this.c) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                node = node2;
            }
            set(node);
        }

        public abstract void h();

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void i(InnerDisposable innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                Node nodeC = (Node) innerDisposable.c;
                if (nodeC == null) {
                    nodeC = c();
                    innerDisposable.c = nodeC;
                }
                while (true) {
                    if (innerDisposable.isDisposed()) {
                        innerDisposable.c = null;
                        return;
                    }
                    Node node = nodeC.get();
                    if (node != null) {
                        if (NotificationLite.a(innerDisposable.b, f(node.a))) {
                            innerDisposable.c = null;
                            return;
                        }
                        nodeC = node;
                    }
                }
                innerDisposable.c = nodeC;
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void j() {
            Node node = get();
            if (node.a != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }
    }

    public interface BufferSupplier<T> {
        ReplayBuffer call();
    }

    public static final class InnerDisposable<T> extends AtomicInteger implements Disposable {
        public final ReplayObserver a;
        public final Observer b;
        public Serializable c;
        public volatile boolean d;

        public InnerDisposable(ReplayObserver replayObserver, Observer observer) {
            this.a = replayObserver;
            this.b = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.a(this);
            this.c = null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d;
        }
    }

    public static final class Node extends AtomicReference<Node> {
        public final Object a;

        public Node(Object obj) {
            this.a = obj;
        }
    }

    public interface ReplayBuffer<T> {
        void b();

        void d(Throwable th);

        void e(Object obj);

        void i(InnerDisposable innerDisposable);
    }

    public static final class ReplayBufferSupplier<T> implements BufferSupplier<T> {
        public final int a;
        public final boolean b;

        public ReplayBufferSupplier(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BufferSupplier
        public final ReplayBuffer call() {
            return new SizeBoundReplayBuffer(this.a, this.b);
        }
    }

    public static final class ReplayObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        public static final InnerDisposable[] f = new InnerDisposable[0];
        public static final InnerDisposable[] g = new InnerDisposable[0];
        public final ReplayBuffer a;
        public boolean b;
        public final AtomicReference c = new AtomicReference(f);
        public final AtomicBoolean d = new AtomicBoolean();
        public final AtomicReference e;

        public ReplayObserver(ReplayBuffer replayBuffer, AtomicReference atomicReference) {
            this.a = replayBuffer;
            this.e = atomicReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(InnerDisposable innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            while (true) {
                AtomicReference atomicReference = this.c;
                InnerDisposable[] innerDisposableArr2 = (InnerDisposable[]) atomicReference.get();
                int length = innerDisposableArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerDisposableArr2[i].equals(innerDisposable)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr = f;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr2, 0, innerDisposableArr3, 0, i);
                    System.arraycopy(innerDisposableArr2, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr = innerDisposableArr3;
                }
                while (!atomicReference.compareAndSet(innerDisposableArr2, innerDisposableArr)) {
                    if (atomicReference.get() != innerDisposableArr2) {
                    }
                }
                return;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            AtomicReference atomicReference;
            this.c.set(g);
            do {
                atomicReference = this.e;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c.get() == g;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            ReplayBuffer replayBuffer = this.a;
            replayBuffer.b();
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.c.getAndSet(g)) {
                replayBuffer.i(innerDisposable);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.b(th);
                return;
            }
            this.b = true;
            ReplayBuffer replayBuffer = this.a;
            replayBuffer.d(th);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.c.getAndSet(g)) {
                replayBuffer.i(innerDisposable);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.b) {
                return;
            }
            ReplayBuffer replayBuffer = this.a;
            replayBuffer.e(obj);
            for (InnerDisposable innerDisposable : (InnerDisposable[]) this.c.get()) {
                replayBuffer.i(innerDisposable);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.g(this, disposable)) {
                for (InnerDisposable innerDisposable : (InnerDisposable[]) this.c.get()) {
                    this.a.i(innerDisposable);
                }
            }
        }
    }

    public static final class ReplaySource<T> implements ObservableSource<T> {
        public final AtomicReference a;
        public final BufferSupplier b;

        public ReplaySource(AtomicReference atomicReference, BufferSupplier bufferSupplier) {
            this.a = atomicReference;
            this.b = bufferSupplier;
        }

        @Override // io.reactivex.rxjava3.core.ObservableSource
        public void subscribe(Observer<? super T> observer) {
            ReplayObserver replayObserver;
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            loop0: while (true) {
                AtomicReference atomicReference = this.a;
                replayObserver = (ReplayObserver) atomicReference.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver replayObserver2 = new ReplayObserver(this.b.call(), atomicReference);
                do {
                    if (atomicReference.compareAndSet(null, replayObserver2)) {
                        replayObserver = replayObserver2;
                        break loop0;
                    }
                } while (atomicReference.get() == null);
            }
            InnerDisposable innerDisposable = new InnerDisposable(replayObserver, observer);
            observer.onSubscribe(innerDisposable);
            AtomicReference atomicReference2 = replayObserver.c;
            do {
                innerDisposableArr = (InnerDisposable[]) atomicReference2.get();
                if (innerDisposableArr == ReplayObserver.g) {
                    break;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!dv20.o(atomicReference2, innerDisposableArr, innerDisposableArr2));
            if (innerDisposable.isDisposed()) {
                replayObserver.a(innerDisposable);
            } else {
                replayObserver.a.i(innerDisposable);
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        public final int d;

        public SizeBoundReplayBuffer(int i, boolean z) {
            super(z);
            this.d = i;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public final void h() {
            if (this.b > this.d) {
                Node node = get().get();
                this.b--;
                g(node);
            }
        }
    }

    public static final class UnBoundedFactory implements BufferSupplier<Object> {
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableReplay.BufferSupplier
        public final ReplayBuffer call() {
            return new UnboundedReplayBuffer();
        }
    }

    public ObservableReplay(ObservableSource observableSource, Observable observable, AtomicReference atomicReference, BufferSupplier bufferSupplier) {
        this.d = observableSource;
        this.a = observable;
        this.b = atomicReference;
        this.c = bufferSupplier;
    }

    public static ObservableReplay h(int i, long j, Observable observable, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
        return j(observable, new ScheduledReplaySupplier(i, j, timeUnit, scheduler, z));
    }

    public static ObservableReplay i(Observable observable, int i, boolean z) {
        return i == Integer.MAX_VALUE ? j(observable, e) : j(observable, new ReplayBufferSupplier(i, z));
    }

    public static ObservableReplay j(Observable observable, BufferSupplier bufferSupplier) {
        AtomicReference atomicReference = new AtomicReference();
        return new ObservableReplay(new ReplaySource(atomicReference, bufferSupplier), observable, atomicReference, bufferSupplier);
    }

    public static Observable k(Function function, Supplier supplier) {
        return new MulticastReplay(function, supplier);
    }

    @Override // io.reactivex.rxjava3.observables.ConnectableObservable
    public final void c(Consumer consumer) {
        ReplayObserver replayObserver;
        loop0: while (true) {
            AtomicReference atomicReference = this.b;
            replayObserver = (ReplayObserver) atomicReference.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            ReplayObserver replayObserver2 = new ReplayObserver(this.c.call(), atomicReference);
            do {
                if (atomicReference.compareAndSet(replayObserver, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break loop0;
                }
            } while (atomicReference.get() == replayObserver);
        }
        AtomicBoolean atomicBoolean = replayObserver.d;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            consumer.accept(replayObserver);
            if (z) {
                this.a.subscribe(replayObserver);
            }
        } catch (Throwable th) {
            Exceptions.a(th);
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            Exceptions.a(th);
            throw ExceptionHelper.f(th);
        }
    }

    @Override // io.reactivex.rxjava3.observables.ConnectableObservable
    public final void g() {
        AtomicReference atomicReference = this.b;
        ReplayObserver replayObserver = (ReplayObserver) atomicReference.get();
        if (replayObserver == null || !replayObserver.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(replayObserver, null) && atomicReference.get() == replayObserver) {
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.d.subscribe(observer);
    }
}
