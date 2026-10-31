package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, pnc1 {
    public final gnc1 a;
    public pnc1 b;
    public boolean c;
    public AppendOnlyLinkedArrayList d;
    public volatile boolean e;

    public SerializedSubscriber(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    @Override // p.pnc1
    public final void cancel() {
        this.b.cancel();
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
                if (!this.c) {
                    this.e = true;
                    this.c = true;
                    this.a.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.b(NotificationLite.a);
                }
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
                    if (this.c) {
                        this.e = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.a[0] = NotificationLite.e(th);
                        return;
                    }
                    this.e = true;
                    this.c = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.b(th);
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.cancel();
            onError(ExceptionHelper.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.d;
                    if (appendOnlyLinkedArrayList2 == null) {
                        appendOnlyLinkedArrayList2 = new AppendOnlyLinkedArrayList();
                        this.d = appendOnlyLinkedArrayList2;
                    }
                    appendOnlyLinkedArrayList2.b(obj);
                    return;
                }
                this.c = true;
                this.a.onNext(obj);
                do {
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
                } while (!appendOnlyLinkedArrayList.a(this.a));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.f(this.b, pnc1Var)) {
            this.b = pnc1Var;
            this.a.onSubscribe(this);
        }
    }

    @Override // p.pnc1
    public final void request(long j) {
        this.b.request(j);
    }
}
