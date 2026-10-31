package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import p.qau;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class ControllerStateCreated<M, E, F> extends ControllerStateBase<M, E> {
    public final MobiusLoopController b;
    public final Connection c;
    public Object d;

    public ControllerStateCreated(MobiusLoopController mobiusLoopController, Connection connection, Object obj) {
        this.b = mobiusLoopController;
        this.c = connection;
        this.d = obj;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final void c() {
        this.c.dispose();
        MobiusLoopController mobiusLoopController = this.b;
        Object obj = this.d;
        synchronized (mobiusLoopController) {
            mobiusLoopController.e = new ControllerStateInit(mobiusLoopController, obj);
        }
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final Object e() {
        return this.d;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final void f(qau qauVar) {
        this.d = qauVar;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final void g() {
        MobiusLoopController mobiusLoopController = this.b;
        Connection connection = this.c;
        Object obj = this.d;
        synchronized (mobiusLoopController) {
            final ControllerStateRunning controllerStateRunning = new ControllerStateRunning(mobiusLoopController, connection, mobiusLoopController.a, obj, mobiusLoopController.c);
            mobiusLoopController.e = controllerStateRunning;
            controllerStateRunning.d.b(new Consumer<Object>() { // from class: com.spotify.mobius.ControllerStateRunning.1
                @Override // com.spotify.mobius.functions.Consumer
                public final void accept(final Object obj2) {
                    final MobiusLoopController mobiusLoopController2 = (MobiusLoopController) ControllerStateRunning.this.b;
                    mobiusLoopController2.d.post(new Runnable() { // from class: com.spotify.mobius.MobiusLoopController.1
                        public final /* synthetic */ Object a;

                        public AnonymousClass1() {
                            obj = obj2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MobiusLoopController.this.e.i(obj);
                        }
                    });
                }
            });
        }
    }
}
