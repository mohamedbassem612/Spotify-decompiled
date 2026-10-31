package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import p.gnc1;
import p.pze0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
final class MaybeFlattenStreamAsFlowable$FlattenStreamMultiObserver<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T>, SingleObserver<T> {
    public final gnc1 a;
    public final Function b;
    public final AtomicLong c = new AtomicLong();
    public Disposable d;
    public volatile Iterator e;
    public Stream f;
    public boolean g;
    public volatile boolean h;
    public boolean i;
    public long t;

    public MaybeFlattenStreamAsFlowable$FlattenStreamMultiObserver(gnc1 gnc1Var, Function function) {
        this.a = gnc1Var;
        this.b = function;
    }

    public final int a(int i) {
        this.i = true;
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        gnc1 gnc1Var = this.a;
        long j = this.t;
        long j2 = this.c.get();
        Iterator it = this.e;
        int iAddAndGet = 1;
        while (true) {
            if (this.h) {
                clear();
            } else if (this.i) {
                if (it != null) {
                    gnc1Var.onNext((Object) null);
                    gnc1Var.onComplete();
                }
            } else if (it != null && j != j2) {
                try {
                    Object next = it.next();
                    if (!this.h) {
                        gnc1Var.onNext(next);
                        j++;
                        if (!this.h) {
                            try {
                                boolean zHasNext = it.hasNext();
                                if (!this.h && !zHasNext) {
                                    gnc1Var.onComplete();
                                    this.h = true;
                                }
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                gnc1Var.onError(th);
                                this.h = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    gnc1Var.onError(th2);
                    this.h = true;
                }
            }
            this.t = j;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            j2 = this.c.get();
            if (it == null) {
                it = this.e;
            }
        }
    }

    public final void cancel() {
        this.h = true;
        this.d.dispose();
        if (this.i) {
            return;
        }
        b();
    }

    public final void clear() {
        this.e = null;
        Stream stream = this.f;
        this.f = null;
        if (stream != null) {
            try {
                pze0.n(stream);
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }
    }

    public final boolean isEmpty() {
        Iterator it = this.e;
        if (it == null) {
            return true;
        }
        if (!this.g || it.hasNext()) {
            return false;
        }
        clear();
        return true;
    }

    public final void onComplete() {
        this.a.onComplete();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.d, disposable)) {
            this.d = disposable;
            this.a.onSubscribe(this);
        }
    }

    public final void onSuccess(Object obj) {
        try {
            Object objApply = this.b.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null Stream");
            Stream stream = (Stream) objApply;
            Iterator<T> it = stream.iterator();
            if (it.hasNext()) {
                this.e = it;
                this.f = stream;
                b();
            } else {
                this.a.onComplete();
                try {
                    pze0.n(stream);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            this.a.onError(th2);
        }
    }

    public final Object poll() {
        Iterator it = this.e;
        if (it == null) {
            return null;
        }
        if (!this.g) {
            this.g = true;
        } else if (!it.hasNext()) {
            clear();
            return null;
        }
        return it.next();
    }

    public final void request(long j) {
        if (SubscriptionHelper.e(j)) {
            BackpressureHelper.a(this.c, j);
            b();
        }
    }
}
