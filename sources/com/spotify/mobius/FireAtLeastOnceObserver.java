package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class FireAtLeastOnceObserver<V> implements Consumer<V> {
    public final Consumer a;
    public volatile boolean b = false;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicReference d = new AtomicReference(null);
    public final AtomicBoolean e = new AtomicBoolean(false);

    public FireAtLeastOnceObserver(Consumer consumer) {
        this.a = consumer;
    }

    public final void a() {
        if (!this.e.compareAndSet(false, true)) {
            return;
        }
        if (!this.b) {
            this.b = true;
            AtomicReference atomicReference = (AtomicReference) this.d.get();
            if (atomicReference != null) {
                this.a.accept(atomicReference.get());
            }
        }
        while (true) {
            try {
                Object objPoll = this.c.poll();
                if (objPoll != null) {
                    this.a.accept(objPoll);
                } else {
                    this.e.set(false);
                    if (this.c.isEmpty() || !this.e.compareAndSet(false, true)) {
                        return;
                    }
                }
            } catch (Throwable th) {
                this.e.set(false);
                if (!this.c.isEmpty()) {
                    this.e.compareAndSet(false, true);
                }
                throw th;
            }
        }
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.c.add(obj);
        a();
    }
}
