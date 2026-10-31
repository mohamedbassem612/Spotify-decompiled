package com.spotify.mobius.android;

import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import p.iac0;
import p.rjp0;
import p.w8c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MutableLiveQueue<T> implements LiveQueue<T> {
    public final MainThreadWorkRunner b;
    public final Object a = new Object();
    public rjp0 d = null;
    public rjp0 e = null;
    public boolean f = true;
    public final ArrayBlockingQueue c = new ArrayBlockingQueue(100);

    public MutableLiveQueue(MainThreadWorkRunner mainThreadWorkRunner) {
        this.b = mainThreadWorkRunner;
    }

    @Override // com.spotify.mobius.android.LiveQueue
    public final void a(iac0 iac0Var, rjp0 rjp0Var, rjp0 rjp0Var2) {
        if (iac0Var.getLifecycle().b() == w8c0.a) {
            return;
        }
        synchronized (this.a) {
            this.d = rjp0Var;
            this.e = rjp0Var2;
            this.f = true;
            iac0Var.getLifecycle().a(new LifecycleObserverHelper(this));
        }
    }

    @Override // com.spotify.mobius.android.LiveQueue
    public final void b() {
        synchronized (this.a) {
            this.d = null;
            this.e = null;
            this.f = true;
            this.c.clear();
        }
    }

    @Override // com.spotify.mobius.android.LiveQueue
    public final void c(iac0 iac0Var, rjp0 rjp0Var) {
        a(iac0Var, rjp0Var, null);
    }

    public final void d() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.a) {
            if (!this.f && this.e != null && !this.c.isEmpty()) {
                this.c.drainTo(linkedList);
                this.b.post(new b(this, linkedList, (byte) 1));
            }
        }
    }
}
