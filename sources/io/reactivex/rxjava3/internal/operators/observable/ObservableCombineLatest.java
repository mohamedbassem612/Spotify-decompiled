package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {
    public final ObservableSource[] a;
    public final Iterable b;
    public final Function c;
    public final int d;
    public final boolean e;

    public static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        public final LatestCoordinator a;
        public final int b;

        public CombinerObserver(LatestCoordinator latestCoordinator, int i) {
            this.a = latestCoordinator;
            this.b = i;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            LatestCoordinator latestCoordinator = this.a;
            int i = this.b;
            synchronized (latestCoordinator) {
                try {
                    Object[] objArr = latestCoordinator.d;
                    if (objArr == null) {
                        return;
                    }
                    boolean z = objArr[i] == null;
                    if (z) {
                        latestCoordinator.h = true;
                    } else {
                        int i2 = latestCoordinator.X + 1;
                        latestCoordinator.X = i2;
                        if (i2 == objArr.length) {
                            latestCoordinator.h = true;
                        }
                    }
                    if (z) {
                        latestCoordinator.a();
                    }
                    latestCoordinator.c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x002b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001a, B:18:0x0023, B:21:0x002d, B:20:0x002b), top: B:29:0x0012 }] */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            LatestCoordinator latestCoordinator = this.a;
            int i = this.b;
            if (latestCoordinator.i.a(th)) {
                boolean z = true;
                if (latestCoordinator.f) {
                    synchronized (latestCoordinator) {
                        try {
                            Object[] objArr = latestCoordinator.d;
                            if (objArr == null) {
                                return;
                            }
                            boolean z2 = objArr[i] == null;
                            if (z2) {
                                latestCoordinator.h = true;
                            } else {
                                int i2 = latestCoordinator.X + 1;
                                latestCoordinator.X = i2;
                                if (i2 == objArr.length) {
                                    latestCoordinator.h = true;
                                }
                            }
                            z = z2;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (z) {
                    latestCoordinator.a();
                }
                latestCoordinator.c();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            boolean z;
            LatestCoordinator latestCoordinator = this.a;
            int i = this.b;
            synchronized (latestCoordinator) {
                try {
                    Object[] objArr = latestCoordinator.d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj2 = objArr[i];
                    int i2 = latestCoordinator.t;
                    if (obj2 == null) {
                        i2++;
                        latestCoordinator.t = i2;
                    }
                    objArr[i] = obj;
                    if (i2 == objArr.length) {
                        latestCoordinator.e.offer(objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        latestCoordinator.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }
    }

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        public int X;
        public final Observer a;
        public final Function b;
        public final CombinerObserver[] c;
        public Object[] d;
        public final SpscLinkedArrayQueue e;
        public final boolean f;
        public volatile boolean g;
        public volatile boolean h;
        public final AtomicThrowable i = new AtomicThrowable();
        public int t;

        public LatestCoordinator(int i, int i2, Observer observer, Function function, boolean z) {
            this.a = observer;
            this.b = function;
            this.f = z;
            this.d = new Object[i];
            CombinerObserver[] combinerObserverArr = new CombinerObserver[i];
            for (int i3 = 0; i3 < i; i3++) {
                combinerObserverArr[i3] = new CombinerObserver(this, i3);
            }
            this.c = combinerObserverArr;
            this.e = new SpscLinkedArrayQueue(i2);
        }

        public final void a() {
            for (CombinerObserver combinerObserver : this.c) {
                combinerObserver.getClass();
                DisposableHelper.a(combinerObserver);
            }
        }

        public final void b(SpscLinkedArrayQueue spscLinkedArrayQueue) {
            synchronized (this) {
                this.d = null;
            }
            spscLinkedArrayQueue.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.e;
            Observer observer = this.a;
            boolean z = this.f;
            int iAddAndGet = 1;
            while (!this.g) {
                if (!z && this.i.get() != null) {
                    a();
                    b(spscLinkedArrayQueue);
                    this.i.d(observer);
                    return;
                }
                boolean z2 = this.h;
                Object[] objArr = (Object[]) spscLinkedArrayQueue.poll();
                boolean z3 = objArr == null;
                if (z2 && z3) {
                    b(spscLinkedArrayQueue);
                    this.i.d(observer);
                    return;
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        Object objApply = this.b.apply(objArr);
                        Objects.requireNonNull(objApply, "The combiner returned a null value");
                        observer.onNext(objApply);
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        this.i.a(th);
                        a();
                        b(spscLinkedArrayQueue);
                        this.i.d(observer);
                        return;
                    }
                }
            }
            b(spscLinkedArrayQueue);
            this.i.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            a();
            c();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.g;
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr) {
            CombinerObserver[] combinerObserverArr = this.c;
            int length = combinerObserverArr.length;
            this.a.onSubscribe(this);
            for (int i = 0; i < length && !this.h && !this.g; i++) {
                observableSourceArr[i].subscribe(combinerObserverArr[i]);
            }
        }
    }

    public ObservableCombineLatest(ObservableSource[] observableSourceArr, Iterable iterable, Function function, int i, boolean z) {
        this.a = observableSourceArr;
        this.b = iterable;
        this.c = function;
        this.d = i;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.a;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                length = 0;
                for (ObservableSource<? extends T> observableSource : this.b) {
                    if (length == observableSourceArr.length) {
                        ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                        System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                        observableSourceArr = observableSourceArr2;
                    }
                    int i = length + 1;
                    Objects.requireNonNull(observableSource, "The Iterator returned a null ObservableSource");
                    observableSourceArr[length] = observableSource;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                EmptyDisposable.c(th, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        int i2 = length;
        if (i2 == 0) {
            EmptyDisposable.b(observer);
            return;
        }
        new LatestCoordinator(i2, this.d, observer, this.c, this.e).subscribe(observableSourceArr);
    }
}
