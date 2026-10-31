package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v350 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x350 b;

    public /* synthetic */ v350(x350 x350Var, byte b) {
        this.a = b;
        this.b = x350Var;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Logger.b("[LiveSharing] Live-sharing terminated.", new Object[0]);
                x350 x350Var = this.b;
                x350Var.e = null;
                x350Var.d(dsd0.a);
                return;
            default:
                x350 x350Var2 = this.b;
                synchronized (x350Var2) {
                    try {
                        if (x350Var2.h) {
                            try {
                                Logger.b("[LiveSharing] Unregistering meeting status listener.", new Object[0]);
                                ((j02) x350Var2.b.get()).unregisterMeetingStatusListener(x350Var2.a);
                            } catch (IllegalStateException e) {
                                x350Var2.c("[LiveSharing] Unregistering", e);
                            }
                            x350Var2.h = false;
                        }
                    } catch (Throwable th) {
                        x350Var2.h = false;
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
