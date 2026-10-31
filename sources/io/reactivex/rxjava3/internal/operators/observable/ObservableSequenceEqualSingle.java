package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {
    public final ObservableSource a;
    public final ObservableSource b;
    public final BiPredicate c;
    public final int d;

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        public final SingleObserver a;
        public final BiPredicate b;
        public final ArrayCompositeDisposable c = new ArrayCompositeDisposable(2);
        public final ObservableSource d;
        public final ObservableSource e;
        public final EqualObserver[] f;
        public volatile boolean g;
        public Object h;
        public Object i;

        public EqualCoordinator(SingleObserver singleObserver, int i, ObservableSource observableSource, ObservableSource observableSource2, BiPredicate biPredicate) {
            this.a = singleObserver;
            this.d = observableSource;
            this.e = observableSource2;
            this.b = biPredicate;
            this.f = new EqualObserver[]{new EqualObserver(this, 0, i), new EqualObserver(this, 1, i)};
        }

        public final void a() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            EqualObserver[] equalObserverArr = this.f;
            EqualObserver equalObserver = equalObserverArr[0];
            SpscLinkedArrayQueue spscLinkedArrayQueue = equalObserver.b;
            EqualObserver equalObserver2 = equalObserverArr[1];
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = equalObserver2.b;
            int iAddAndGet = 1;
            while (!this.g) {
                boolean z = equalObserver.d;
                if (z && (th2 = equalObserver.e) != null) {
                    this.g = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.a.onError(th2);
                    return;
                }
                boolean z2 = equalObserver2.d;
                if (z2 && (th = equalObserver2.e) != null) {
                    this.g = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.a.onError(th);
                    return;
                }
                Object objPoll = this.h;
                if (objPoll == null) {
                    objPoll = spscLinkedArrayQueue.poll();
                    this.h = objPoll;
                }
                boolean z3 = objPoll == null;
                Object objPoll2 = this.i;
                if (objPoll2 == null) {
                    objPoll2 = spscLinkedArrayQueue2.poll();
                    this.i = objPoll2;
                }
                boolean z4 = objPoll2 == null;
                if (z && z2 && z3 && z4) {
                    this.a.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z && z2 && z3 != z4) {
                    this.g = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.a.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        if (!this.b.test(this.h, objPoll2)) {
                            this.g = true;
                            spscLinkedArrayQueue.clear();
                            spscLinkedArrayQueue2.clear();
                            this.a.onSuccess(Boolean.FALSE);
                            return;
                        }
                        this.h = null;
                        this.i = null;
                    } catch (Throwable th3) {
                        Exceptions.a(th3);
                        this.g = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.a.onError(th3);
                        return;
                    }
                }
                if (z3 || z4) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        public void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.c.dispose();
            if (getAndIncrement() == 0) {
                EqualObserver[] equalObserverArr = this.f;
                equalObserverArr[0].b.clear();
                equalObserverArr[1].b.clear();
            }
        }

        public boolean isDisposed() {
            return this.g;
        }

        public void subscribe() {
            EqualObserver[] equalObserverArr = this.f;
            this.d.subscribe(equalObserverArr[0]);
            this.e.subscribe(equalObserverArr[1]);
        }
    }

    public static final class EqualObserver<T> implements Observer<T> {
        public final EqualCoordinator a;
        public final SpscLinkedArrayQueue b;
        public final boolean c;
        public volatile boolean d;
        public Throwable e;

        /* JADX WARN: Multi-variable type inference failed */
        public EqualObserver(EqualCoordinator equalCoordinator, int i, int i2) {
            this.a = equalCoordinator;
            this.c = i;
            this.b = new SpscLinkedArrayQueue(i2);
        }

        public final void onComplete() {
            this.d = true;
            this.a.a();
        }

        public final void onError(Throwable th) {
            this.e = th;
            this.d = true;
            this.a.a();
        }

        public final void onNext(Object obj) {
            this.b.offer(obj);
            this.a.a();
        }

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
        public final void onSubscribe(Disposable disposable) {
            this.a.c.a(this.c ? 1 : 0, disposable);
        }
    }

    public ObservableSequenceEqualSingle(ObservableSource observableSource, ObservableSource observableSource2, BiPredicate biPredicate, int i) {
        this.a = observableSource;
        this.b = observableSource2;
        this.c = biPredicate;
        this.d = i;
    }

    public final Observable a() {
        return new ObservableSequenceEqual(this.a, this.b, this.c, this.d);
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver, this.d, this.a, this.b, this.c);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }
}
