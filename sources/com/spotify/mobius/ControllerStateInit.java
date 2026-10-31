package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;
import p.qau;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class ControllerStateInit<M, E, F> extends ControllerStateBase<M, E> {
    public final MobiusLoopController b;
    public Object c;

    public ControllerStateInit(MobiusLoopController mobiusLoopController, Object obj) {
        this.b = mobiusLoopController;
        this.c = obj;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final String a() {
        return "init";
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final void b(Connectable connectable) {
        final MobiusLoopController mobiusLoopController = this.b;
        Object obj = this.c;
        mobiusLoopController.getClass();
        Preconditions.b(connectable);
        Connection connectionL = new DiscardAfterDisposeConnectable(connectable).L(new Consumer<Object>() { // from class: com.spotify.mobius.MobiusLoopController.2
            public AnonymousClass2() {
            }

            @Override // com.spotify.mobius.functions.Consumer
            public final void accept(Object obj2) {
                MobiusLoopController.this.e.d(obj2);
            }
        });
        synchronized (mobiusLoopController) {
            if (obj == null) {
                try {
                    obj = mobiusLoopController.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mobiusLoopController.e = new ControllerStateCreated(mobiusLoopController, connectionL, obj);
        }
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final Object e() {
        return this.c;
    }

    @Override // com.spotify.mobius.ControllerStateBase
    public final void f(qau qauVar) {
        this.c = qauVar;
    }
}
