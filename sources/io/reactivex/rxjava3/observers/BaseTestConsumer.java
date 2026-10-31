package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import io.reactivex.rxjava3.observers.BaseTestConsumer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> {
    public boolean d;
    public final VolatileSizeArrayList b = new VolatileSizeArrayList();
    public final VolatileSizeArrayList c = new VolatileSizeArrayList();
    public final CountDownLatch a = new CountDownLatch(1);
}
