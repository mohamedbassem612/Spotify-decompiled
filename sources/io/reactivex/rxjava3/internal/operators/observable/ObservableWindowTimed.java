package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableWindowTimed<T> extends AbstractObservableWithUpstream<T, Observable<T>> {
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final long f;
    public final int g;
    public final boolean h;

    public static abstract class AbstractWindowObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile boolean X;
        public final Observer a;
        public final long c;
        public final TimeUnit d;
        public final int e;
        public long f;
        public volatile boolean g;
        public Throwable h;
        public Disposable i;
        public final MpscLinkedQueue b = new MpscLinkedQueue();
        public final AtomicBoolean t = new AtomicBoolean();
        public final AtomicInteger Y = new AtomicInteger(1);

        public AbstractWindowObserver(Observer observer, long j, TimeUnit timeUnit, int i) {
            this.a = observer;
            this.c = j;
            this.d = timeUnit;
            this.e = i;
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public final void dispose() {
            if (this.t.compareAndSet(false, true)) {
                f();
            }
        }

        public final void f() {
            if (this.Y.decrementAndGet() == 0) {
                a();
                this.i.dispose();
                this.X = true;
                c();
            }
        }

        public final boolean isDisposed() {
            return this.t.get();
        }

        public final void onComplete() {
            this.g = true;
            c();
        }

        public final void onError(Throwable th) {
            this.h = th;
            this.g = true;
            c();
        }

        public final void onNext(Object obj) {
            this.b.offer(obj);
            c();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.i, disposable)) {
                this.i = disposable;
                this.a.onSubscribe(this);
                b();
            }
        }

        public void run() {
            f();
        }
    }

    public static final class WindowExactBoundedObserver<T> extends AbstractWindowObserver<T> implements Runnable {
        public final boolean N0;
        public final long O0;
        public final Scheduler.Worker P0;
        public long Q0;
        public UnicastSubject R0;
        public final SequentialDisposable S0;
        public final Scheduler Z;

        public static final class WindowBoundaryRunnable implements Runnable {
            public final WindowExactBoundedObserver a;
            public final long b;

            public WindowBoundaryRunnable(WindowExactBoundedObserver windowExactBoundedObserver, long j) {
                this.a = windowExactBoundedObserver;
                this.b = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindowExactBoundedObserver windowExactBoundedObserver = this.a;
                windowExactBoundedObserver.b.offer(this);
                windowExactBoundedObserver.c();
            }
        }

        public WindowExactBoundedObserver(int i, long j, long j2, Observer observer, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
            super(observer, j, timeUnit, i);
            this.Z = scheduler;
            this.O0 = j2;
            this.N0 = z;
            if (z) {
                this.P0 = scheduler.b();
            } else {
                this.P0 = null;
            }
            this.S0 = new SequentialDisposable();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void a() {
            this.S0.dispose();
            Scheduler.Worker worker = this.P0;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void b() {
            if (this.t.get()) {
                return;
            }
            this.f = 1L;
            this.Y.getAndIncrement();
            UnicastSubject unicastSubjectF = UnicastSubject.f(this.e, this);
            this.R0 = unicastSubjectF;
            ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
            this.a.onNext(observableWindowSubscribeIntercept);
            WindowBoundaryRunnable windowBoundaryRunnable = new WindowBoundaryRunnable(this, 1L);
            boolean z = this.N0;
            SequentialDisposable sequentialDisposable = this.S0;
            if (z) {
                long j = this.c;
                Disposable disposableC = this.P0.c(windowBoundaryRunnable, j, j, this.d);
                sequentialDisposable.getClass();
                DisposableHelper.c(sequentialDisposable, disposableC);
            } else {
                long j2 = this.c;
                Disposable disposableE = this.Z.e(windowBoundaryRunnable, j2, j2, this.d);
                sequentialDisposable.getClass();
                DisposableHelper.c(sequentialDisposable, disposableE);
            }
            if (observableWindowSubscribeIntercept.a()) {
                this.R0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.b;
            Observer observer = this.a;
            UnicastSubject unicastSubjectG = this.R0;
            int iAddAndGet = 1;
            while (true) {
                if (this.X) {
                    mpscLinkedQueue.clear();
                    unicastSubjectG = null;
                    this.R0 = null;
                } else {
                    boolean z = this.g;
                    Object objPoll = mpscLinkedQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.h;
                        if (th != null) {
                            if (unicastSubjectG != null) {
                                unicastSubjectG.onError(th);
                            }
                            observer.onError(th);
                        } else {
                            if (unicastSubjectG != null) {
                                unicastSubjectG.onComplete();
                            }
                            observer.onComplete();
                        }
                        a();
                        this.X = true;
                    } else if (!z2) {
                        if (objPoll instanceof WindowBoundaryRunnable) {
                            if (((WindowBoundaryRunnable) objPoll).b == this.f || !this.N0) {
                                this.Q0 = 0L;
                                unicastSubjectG = g(unicastSubjectG);
                            }
                        } else if (unicastSubjectG != null) {
                            unicastSubjectG.onNext(objPoll);
                            long j = this.Q0 + 1;
                            if (j == this.O0) {
                                this.Q0 = 0L;
                                unicastSubjectG = g(unicastSubjectG);
                            } else {
                                this.Q0 = j;
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final UnicastSubject g(UnicastSubject unicastSubject) {
            if (unicastSubject != null) {
                unicastSubject.onComplete();
                unicastSubject = null;
            }
            if (this.t.get()) {
                a();
                return unicastSubject;
            }
            long j = this.f + 1;
            this.f = j;
            this.Y.getAndIncrement();
            UnicastSubject unicastSubjectF = UnicastSubject.f(this.e, this);
            this.R0 = unicastSubjectF;
            ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
            this.a.onNext(observableWindowSubscribeIntercept);
            if (this.N0) {
                WindowBoundaryRunnable windowBoundaryRunnable = new WindowBoundaryRunnable(this, j);
                long j2 = this.c;
                Disposable disposableC = this.P0.c(windowBoundaryRunnable, j2, j2, this.d);
                SequentialDisposable sequentialDisposable = this.S0;
                sequentialDisposable.getClass();
                DisposableHelper.f(sequentialDisposable, disposableC);
            }
            if (observableWindowSubscribeIntercept.a()) {
                unicastSubjectF.onComplete();
            }
            return unicastSubjectF;
        }
    }

    public static final class WindowExactUnboundedObserver<T> extends AbstractWindowObserver<T> implements Runnable {
        public static final Object Q0 = new Object();
        public UnicastSubject N0;
        public final SequentialDisposable O0;
        public final Runnable P0;
        public final Scheduler Z;

        public final class WindowRunnable implements Runnable {
            public WindowRunnable() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindowExactUnboundedObserver.this.f();
            }
        }

        public WindowExactUnboundedObserver(Observer observer, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(observer, j, timeUnit, i);
            this.Z = scheduler;
            this.O0 = new SequentialDisposable();
            this.P0 = new WindowRunnable();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void a() {
            this.O0.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void b() {
            if (this.t.get()) {
                return;
            }
            this.Y.getAndIncrement();
            UnicastSubject unicastSubjectF = UnicastSubject.f(this.e, this.P0);
            this.N0 = unicastSubjectF;
            this.f = 1L;
            ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
            this.a.onNext(observableWindowSubscribeIntercept);
            long j = this.c;
            Disposable disposableE = this.Z.e(this, j, j, this.d);
            SequentialDisposable sequentialDisposable = this.O0;
            sequentialDisposable.getClass();
            DisposableHelper.c(sequentialDisposable, disposableE);
            if (observableWindowSubscribeIntercept.a()) {
                this.N0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.b;
            Observer observer = this.a;
            UnicastSubject unicastSubjectF = this.N0;
            int iAddAndGet = 1;
            while (true) {
                if (this.X) {
                    mpscLinkedQueue.clear();
                    this.N0 = null;
                    unicastSubjectF = null;
                } else {
                    boolean z = this.g;
                    Object objPoll = mpscLinkedQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.h;
                        if (th != null) {
                            if (unicastSubjectF != null) {
                                unicastSubjectF.onError(th);
                            }
                            observer.onError(th);
                        } else {
                            if (unicastSubjectF != null) {
                                unicastSubjectF.onComplete();
                            }
                            observer.onComplete();
                        }
                        a();
                        this.X = true;
                    } else if (!z2) {
                        if (objPoll == Q0) {
                            if (unicastSubjectF != null) {
                                unicastSubjectF.onComplete();
                                this.N0 = null;
                                unicastSubjectF = null;
                            }
                            if (this.t.get()) {
                                this.O0.dispose();
                            } else {
                                this.f++;
                                this.Y.getAndIncrement();
                                unicastSubjectF = UnicastSubject.f(this.e, this.P0);
                                this.N0 = unicastSubjectF;
                                ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
                                observer.onNext(observableWindowSubscribeIntercept);
                                if (observableWindowSubscribeIntercept.a()) {
                                    unicastSubjectF.onComplete();
                                }
                            }
                        } else if (unicastSubjectF != null) {
                            unicastSubjectF.onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver, java.lang.Runnable
        public final void run() {
            this.b.offer(Q0);
            c();
        }
    }

    public static final class WindowSkipObserver<T> extends AbstractWindowObserver<T> implements Runnable {
        public static final Object P0 = new Object();
        public static final Object Q0 = new Object();
        public final Scheduler.Worker N0;
        public final LinkedList O0;
        public final long Z;

        public static final class WindowBoundaryRunnable implements Runnable {
            public final WindowSkipObserver a;
            public final boolean b;

            public WindowBoundaryRunnable(WindowSkipObserver windowSkipObserver, boolean z) {
                this.a = windowSkipObserver;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindowSkipObserver windowSkipObserver = this.a;
                windowSkipObserver.b.offer(this.b ? WindowSkipObserver.P0 : WindowSkipObserver.Q0);
                windowSkipObserver.c();
            }
        }

        public WindowSkipObserver(Observer observer, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker, int i) {
            super(observer, j, timeUnit, i);
            this.Z = j2;
            this.N0 = worker;
            this.O0 = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void a() {
            this.N0.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void b() {
            if (this.t.get()) {
                return;
            }
            this.f = 1L;
            this.Y.getAndIncrement();
            UnicastSubject unicastSubjectF = UnicastSubject.f(this.e, this);
            LinkedList linkedList = this.O0;
            linkedList.add(unicastSubjectF);
            ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
            this.a.onNext(observableWindowSubscribeIntercept);
            this.N0.b(new WindowBoundaryRunnable(this, false), this.c, this.d);
            WindowBoundaryRunnable windowBoundaryRunnable = new WindowBoundaryRunnable(this, true);
            long j = this.Z;
            this.N0.c(windowBoundaryRunnable, j, j, this.d);
            if (observableWindowSubscribeIntercept.a()) {
                unicastSubjectF.onComplete();
                linkedList.remove(unicastSubjectF);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.AbstractWindowObserver
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.b;
            Observer observer = this.a;
            LinkedList linkedList = this.O0;
            int iAddAndGet = 1;
            while (true) {
                if (this.X) {
                    mpscLinkedQueue.clear();
                    linkedList.clear();
                } else {
                    boolean z = this.g;
                    Object objPoll = mpscLinkedQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.h;
                        if (th != null) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((UnicastSubject) it.next()).onError(th);
                            }
                            observer.onError(th);
                        } else {
                            Iterator it2 = linkedList.iterator();
                            while (it2.hasNext()) {
                                ((UnicastSubject) it2.next()).onComplete();
                            }
                            observer.onComplete();
                        }
                        a();
                        this.X = true;
                    } else if (!z2) {
                        if (objPoll == P0) {
                            if (!this.t.get()) {
                                this.f++;
                                this.Y.getAndIncrement();
                                UnicastSubject unicastSubjectF = UnicastSubject.f(this.e, this);
                                linkedList.add(unicastSubjectF);
                                ObservableWindowSubscribeIntercept observableWindowSubscribeIntercept = new ObservableWindowSubscribeIntercept(unicastSubjectF);
                                observer.onNext(observableWindowSubscribeIntercept);
                                this.N0.b(new WindowBoundaryRunnable(this, false), this.c, this.d);
                                if (observableWindowSubscribeIntercept.a()) {
                                    unicastSubjectF.onComplete();
                                }
                            }
                        } else if (objPoll != Q0) {
                            Iterator it3 = linkedList.iterator();
                            while (it3.hasNext()) {
                                ((UnicastSubject) it3.next()).onNext(objPoll);
                            }
                        } else if (!linkedList.isEmpty()) {
                            ((UnicastSubject) linkedList.remove(0)).onComplete();
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public ObservableWindowTimed(Observable observable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(observable);
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = j3;
        this.g = i;
        this.h = z;
    }

    public final void subscribeActual(Observer observer) {
        long j = this.b;
        long j2 = this.c;
        ObservableSource observableSource = ((AbstractObservableWithUpstream) this).a;
        if (j != j2) {
            observableSource.subscribe(new WindowSkipObserver(observer, this.b, this.c, this.d, this.e.b(), this.g));
        } else if (this.f == Long.MAX_VALUE) {
            observableSource.subscribe(new WindowExactUnboundedObserver(observer, this.b, this.d, this.e, this.g));
        } else {
            observableSource.subscribe(new WindowExactBoundedObserver(this.g, this.b, this.f, observer, this.e, this.d, this.h));
        }
    }
}
