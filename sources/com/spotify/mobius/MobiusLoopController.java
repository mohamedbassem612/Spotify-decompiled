package com.spotify.mobius;

import com.spotify.mobius.internal_util.Preconditions;
import com.spotify.mobius.runners.WorkRunner;
import p.qau;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class MobiusLoopController<M, E, F> implements MobiusLoop.Controller<M, E>, ControllerActions<M, E> {
    public final MobiusLoop.Factory a;
    public final Object b;
    public final Init c;
    public final WorkRunner d;
    public ControllerStateBase e;

    public MobiusLoopController(MobiusLoop.Factory factory, Object obj, Init init, WorkRunner workRunner) {
        Preconditions.b(factory);
        this.a = factory;
        Preconditions.b(obj);
        this.b = obj;
        if (init == null) {
            init = null;
        } else if (factory instanceof Mobius.Builder) {
            init = new LoggingInit(init, ((Mobius.Builder) factory).g);
        }
        this.c = init;
        this.d = workRunner;
        synchronized (this) {
            this.e = new ControllerStateInit(this, obj);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized Object a() {
        return this.e.e();
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized void b(qau qauVar) {
        this.e.f(qauVar);
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized void c(Connectable connectable) {
        ControllerStateBase controllerStateBase = this.e;
        Preconditions.b(connectable);
        controllerStateBase.b(connectable);
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized void disconnect() {
        this.e.c();
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized boolean isRunning() {
        ControllerStateBase controllerStateBase;
        controllerStateBase = this.e;
        controllerStateBase.getClass();
        return controllerStateBase instanceof ControllerStateRunning;
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized void start() {
        this.e.g();
    }

    @Override // com.spotify.mobius.MobiusLoop.Controller
    public final synchronized void stop() {
        this.e.h();
    }
}
