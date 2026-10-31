package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.QueueDrainObserver;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractObservableWithUpstream<T, U> {
    public final ObservableSource b;
    public final Supplier c;

    public static final class BufferBoundaryObserver<T, U extends Collection<? super T>, B> extends DisposableObserver<B> {
        public final BufferExactBoundaryObserver b;

        public BufferBoundaryObserver(BufferExactBoundaryObserver bufferExactBoundaryObserver) {
            this.b = bufferExactBoundaryObserver;
        }

        public final void onComplete() {
            this.b.onComplete();
        }

        public final void onError(Throwable th) {
            this.b.onError(th);
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
        public final void onNext(Object obj) {
            BufferExactBoundaryObserver bufferExactBoundaryObserver = this.b;
            bufferExactBoundaryObserver.getClass();
            try {
                Object obj2 = bufferExactBoundaryObserver.f.get();
                Objects.requireNonNull(obj2, "The buffer supplied is null");
                Collection collection = (Collection) obj2;
                synchronized (bufferExactBoundaryObserver) {
                    try {
                        Object obj3 = bufferExactBoundaryObserver.t;
                        if (obj3 == null) {
                            return;
                        }
                        bufferExactBoundaryObserver.t = collection;
                        bufferExactBoundaryObserver.c(obj3, bufferExactBoundaryObserver);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                bufferExactBoundaryObserver.dispose();
                bufferExactBoundaryObserver.b.onError(th2);
            }
        }
    }

    public static final class BufferExactBoundaryObserver<T, U extends Collection<? super T>, B> extends QueueDrainObserver<T, U, U> implements Observer<T>, Disposable {
        public final Supplier f;
        public final ObservableSource g;
        public Disposable h;
        public Disposable i;
        public Collection t;

        public BufferExactBoundaryObserver(SerializedObserver serializedObserver, Supplier supplier, ObservableSource observableSource) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f = supplier;
            this.g = observableSource;
        }

        public void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.i.dispose();
            this.h.dispose();
            if (b()) {
                this.c.clear();
            }
        }

        public boolean isDisposed() {
            return this.d;
        }

        public final void onComplete() {
            synchronized (this) {
                try {
                    Collection collection = this.t;
                    if (collection == null) {
                        return;
                    }
                    this.t = null;
                    this.c.offer(collection);
                    this.e = true;
                    if (b()) {
                        QueueDrainHelper.c(this.c, this.b, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void onError(Throwable th) {
            dispose();
            this.b.onError(th);
        }

        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.t;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.h, disposable)) {
                this.h = disposable;
                try {
                    Object obj = this.f.get();
                    Objects.requireNonNull(obj, "The buffer supplied is null");
                    this.t = (Collection) obj;
                    BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(this);
                    this.i = bufferBoundaryObserver;
                    this.b.onSubscribe(this);
                    if (this.d) {
                        return;
                    }
                    this.g.subscribe(bufferBoundaryObserver);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    this.d = true;
                    disposable.dispose();
                    EmptyDisposable.c(th, this.b);
                }
            }
        }
    }

    public ObservableBufferExactBoundary(Observable observable, ObservableSource observableSource, Supplier supplier) {
        super(observable);
        this.b = observableSource;
        this.c = supplier;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new BufferExactBoundaryObserver(new SerializedObserver(observer), this.c, this.b));
    }
}
