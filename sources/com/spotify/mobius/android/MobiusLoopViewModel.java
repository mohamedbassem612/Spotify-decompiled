package com.spotify.mobius.android;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.functions.Function;
import java.util.concurrent.atomic.AtomicBoolean;
import p.m6k0;
import p.ms20;
import p.xbk1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class MobiusLoopViewModel<M, E, F, V> extends xbk1 {
    public final ObservableMutableLiveData b;
    public final MutableLiveQueue c;
    public final MobiusLoop d;
    public final Object e;
    public final AtomicBoolean f;

    public MobiusLoopViewModel(Function function, Object obj, Init init, MainThreadWorkRunner mainThreadWorkRunner) {
        m6k0 m6k0Var = new m6k0(function, (byte) 4);
        this.b = new ObservableMutableLiveData();
        this.f = new AtomicBoolean(true);
        this.c = new MutableLiveQueue(mainThreadWorkRunner);
        MobiusLoop.Factory factoryA = m6k0Var.a(new a(this));
        First firstE0 = init.e0(obj);
        MobiusLoop mobiusLoopA = factoryA.a(firstE0.d(), firstE0.a());
        this.d = mobiusLoopA;
        this.e = firstE0.d();
        mobiusLoopA.b(new ms20(this, (byte) 1));
    }

    public static MobiusLoopViewModel T(Function function, Object obj, Init init) {
        return new MobiusLoopViewModel(function, obj, init, MainThreadWorkRunner.a());
    }

    public final void S() {
        W();
        this.f.set(false);
        this.d.dispose();
    }

    public final void U(Object obj) {
        if (this.f.get()) {
            this.d.a(obj);
        }
    }

    public final Object V() {
        Object obj = this.d.i;
        return obj != null ? obj : this.e;
    }

    public void W() {
    }
}
