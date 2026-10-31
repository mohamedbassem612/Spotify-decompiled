package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableReplay$UnboundedReplayBuffer<T> extends ArrayList<Object> implements ObservableReplay.ReplayBuffer<T> {
    public volatile int a;

    public ObservableReplay$UnboundedReplayBuffer() {
        super(16);
    }

    public final void b() {
        add(NotificationLite.a);
        this.a++;
    }

    public final void d(Throwable th) {
        add(NotificationLite.e(th));
        this.a++;
    }

    public final void e(Object obj) {
        add(obj);
        this.a++;
    }

    public final void i(ObservableReplay.InnerDisposable innerDisposable) {
        if (innerDisposable.getAndIncrement() != 0) {
            return;
        }
        Observer observer = innerDisposable.b;
        int iAddAndGet = 1;
        while (!innerDisposable.isDisposed()) {
            int i = this.a;
            Integer num = (Integer) innerDisposable.c;
            int iIntValue = num != null ? num.intValue() : 0;
            while (iIntValue < i) {
                if (NotificationLite.a(observer, get(iIntValue)) || innerDisposable.isDisposed()) {
                    return;
                } else {
                    iIntValue++;
                }
            }
            innerDisposable.c = Integer.valueOf(iIntValue);
            iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }
}
