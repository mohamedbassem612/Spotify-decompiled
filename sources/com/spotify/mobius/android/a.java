package com.spotify.mobius.android;

import com.spotify.mobius.functions.Consumer;
import java.util.LinkedList;
import p.rjp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class a implements Consumer {
    public final /* synthetic */ MobiusLoopViewModel a;

    public final void accept(final Object obj) {
        final MutableLiveQueue mutableLiveQueue = this.a.c;
        synchronized (mutableLiveQueue.a) {
            try {
                if (!mutableLiveQueue.f) {
                    final byte b = 0;
                    mutableLiveQueue.b.post(new Runnable() { // from class: com.spotify.mobius.android.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (b) {
                                case 0:
                                    MutableLiveQueue mutableLiveQueue2 = mutableLiveQueue;
                                    Object obj2 = obj;
                                    synchronized (mutableLiveQueue2.a) {
                                        try {
                                            rjp0 rjp0Var = mutableLiveQueue2.d;
                                            if (rjp0Var != null) {
                                                rjp0Var.b(obj2);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    return;
                                default:
                                    MutableLiveQueue mutableLiveQueue3 = mutableLiveQueue;
                                    LinkedList linkedList = (LinkedList) obj;
                                    synchronized (mutableLiveQueue3.a) {
                                        try {
                                            rjp0 rjp0Var2 = mutableLiveQueue3.e;
                                            if (rjp0Var2 != null) {
                                                rjp0Var2.b(linkedList);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    return;
                            }
                        }
                    });
                } else if (!mutableLiveQueue.c.offer(obj)) {
                    throw new IllegalStateException("Maximum effect queue size (" + mutableLiveQueue.c.size() + ") exceeded when posting: " + obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
