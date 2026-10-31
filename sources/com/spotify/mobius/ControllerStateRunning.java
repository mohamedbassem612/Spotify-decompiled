package com.spotify.mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class ControllerStateRunning<M, E, F> extends ControllerStateBase<M, E> {
    public final ControllerActions b;
    public final Connection c;
    public final MobiusLoop d;
    public final Object e;

    public ControllerStateRunning(MobiusLoopController mobiusLoopController, Connection connection, MobiusLoop.Factory factory, Object obj, Init init) {
        this.b = mobiusLoopController;
        this.c = connection;
        if (init == null) {
            this.d = ((Mobius.Builder) factory).g(obj);
            this.e = obj;
            return;
        }
        First firstE0 = init.e0(obj);
        Object obj2 = ((AutoValue_First) firstE0).a;
        AutoValue_First autoValue_First = (AutoValue_First) firstE0;
        this.d = ((Mobius.Builder) factory).a(obj2, autoValue_First.b);
        this.e = autoValue_First.a;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final String a() {
        return "running";
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final void d(Object obj) {
        this.d.a(obj);
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final Object e() {
        Object obj = this.d.i;
        return obj != null ? obj : this.e;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final void h() {
        this.d.dispose();
        Object obj = this.d.i;
        ControllerActions controllerActions = this.b;
        Connection connection = this.c;
        MobiusLoopController mobiusLoopController = (MobiusLoopController) controllerActions;
        synchronized (mobiusLoopController) {
            if (obj == null) {
                try {
                    obj = mobiusLoopController.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mobiusLoopController.e = new ControllerStateCreated(mobiusLoopController, connection, obj);
        }
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final void i(Object obj) {
        this.c.accept(obj);
    }
}
