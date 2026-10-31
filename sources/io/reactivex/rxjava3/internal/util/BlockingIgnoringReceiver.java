package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BlockingIgnoringReceiver extends CountDownLatch implements Consumer<Throwable>, Action {
    public Throwable a;

    public BlockingIgnoringReceiver() {
        super(1);
    }

    public final void accept(Object obj) {
        this.a = (Throwable) obj;
        countDown();
    }

    public final void run() {
        countDown();
    }
}
