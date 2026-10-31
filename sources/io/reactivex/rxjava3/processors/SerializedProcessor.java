package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class SerializedProcessor<T> extends FlowableProcessor<T> {
    public final UnicastProcessor b;
    public boolean c;
    public AppendOnlyLinkedArrayList d;
    public volatile boolean e;

    public SerializedProcessor(UnicastProcessor unicastProcessor) {
        this.b = unicastProcessor;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(gnc1Var);
    }

    public final void e0() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.d;
                    if (appendOnlyLinkedArrayList == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            appendOnlyLinkedArrayList.a(this.b);
        }
    }

    @Override // p.gnc1
    public final void onComplete() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                if (!this.c) {
                    this.c = true;
                    this.b.onComplete();
                    return;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.d = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.b(NotificationLite.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        if (this.e) {
            RxJavaPlugins.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    this.e = true;
                    if (this.c) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a[0] = NotificationLite.e(th);
                        return;
                    }
                    this.c = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.b(th);
                } else {
                    this.b.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.c) {
                    this.c = true;
                    this.b.onNext(obj);
                    e0();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.b(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        if (this.c) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.d = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.b(NotificationLite.i(pnc1Var));
                            return;
                        }
                        this.c = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            pnc1Var.cancel();
        } else {
            this.b.onSubscribe(pnc1Var);
            e0();
        }
    }
}
