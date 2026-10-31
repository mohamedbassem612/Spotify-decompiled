package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ReplaySubject$UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplaySubject.ReplayBuffer<T> {
    public final ArrayList a = new ArrayList(1);
    public volatile boolean b;
    public volatile int c;

    public final void a(Object obj) {
        this.a.add(obj);
        this.c++;
        this.b = true;
    }

    public final void add(Object obj) {
        this.a.add(obj);
        this.c++;
    }

    public final void b(ReplaySubject.ReplayDisposable replayDisposable) {
        int iIntValue;
        int i;
        if (replayDisposable.getAndIncrement() != 0) {
            return;
        }
        ArrayList arrayList = this.a;
        Observer observer = replayDisposable.a;
        Integer num = (Integer) replayDisposable.c;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
            replayDisposable.c = 0;
        }
        int iAddAndGet = 1;
        while (!replayDisposable.d) {
            int i2 = this.c;
            while (i2 != iIntValue) {
                if (replayDisposable.d) {
                    replayDisposable.c = null;
                    return;
                }
                Object obj = arrayList.get(iIntValue);
                if (this.b && (i = iIntValue + 1) == i2 && i == (i2 = this.c)) {
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
                iIntValue++;
            }
            if (iIntValue == this.c) {
                replayDisposable.c = Integer.valueOf(iIntValue);
                iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        replayDisposable.c = null;
    }
}
