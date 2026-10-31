package com.spotify.mobius.android;

import p.hac0;
import p.iac0;
import p.k8c0;
import p.n5q0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class MutableLiveQueue$LifecycleObserverHelper implements hac0 {
    public final /* synthetic */ MutableLiveQueue a;

    public MutableLiveQueue$LifecycleObserverHelper(MutableLiveQueue mutableLiveQueue) {
        this.a = mutableLiveQueue;
    }

    @n5q0(k8c0.ON_ANY)
    public void onAny(iac0 iac0Var, k8c0 k8c0Var) {
        MutableLiveQueue mutableLiveQueue = this.a;
        int i = MutableLiveQueue.1.a[k8c0Var.ordinal()];
        if (i == 1) {
            synchronized (mutableLiveQueue.a) {
                mutableLiveQueue.f = false;
                mutableLiveQueue.d();
            }
            return;
        }
        if (i == 2) {
            synchronized (mutableLiveQueue.a) {
                mutableLiveQueue.f = true;
            }
        } else {
            if (i != 3) {
                return;
            }
            synchronized (mutableLiveQueue.a) {
                mutableLiveQueue.b();
            }
        }
    }
}
