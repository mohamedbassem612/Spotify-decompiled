package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class NotificationLite$DisposableNotification implements Serializable {
    public final Disposable a;

    public NotificationLite$DisposableNotification(Disposable disposable) {
        this.a = disposable;
    }

    public final String toString() {
        return "NotificationLite.Disposable[" + this.a + "]";
    }
}
