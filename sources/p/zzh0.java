package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zzh0 extends Handler {
    public final v1k a;

    public zzh0(Looper looper, v1k v1kVar) {
        super(looper);
        this.a = v1kVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ixh0 ixh0Var = (ixh0) message.obj;
        v1k v1kVar = this.a;
        if (v1kVar.u(ixh0Var)) {
            hxh0 hxh0Var = ixh0Var.e;
            hxh0Var.getClass();
            hxh0Var.onDisconnected();
            v1kVar.D(ixh0Var);
        }
    }
}
