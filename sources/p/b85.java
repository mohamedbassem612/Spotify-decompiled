package p;

import android.os.SystemClock;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.websocket.esperanto.proto.EsWebsocketEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b85 extends bmq0 {
    public final /* synthetic */ ssw0 b;

    public b85(ssw0 ssw0Var) {
        this.b = ssw0Var;
    }

    public final void N(int i, String str) {
        ssw0 ssw0Var = this.b;
        Logger.g("[WebSocket] Socket closed, code=%d reason=%s", new Object[]{Integer.valueOf(i), str});
        try {
            ysz yszVarN = EsWebsocketEvent.WebSocketEvent.n();
            yszVarN.r();
            ilo1.E(yszVarN.build(), ssw0Var);
        } catch (Throwable unused) {
            ssw0Var.H((Throwable) null);
        }
    }

    public final void P(Throwable th, ry21 ry21Var) {
        ssw0 ssw0Var = this.b;
        Logger.h(th, "[WebSocket] Socket connection failed.", new Object[0]);
        xsz xszVar = (ry21Var == null || ry21Var.d != 401) ? xsz.kTransportFailure : xsz.kWsUpgradeUnauthorized;
        try {
            ysz yszVarN = EsWebsocketEvent.WebSocketEvent.n();
            yszVarN.s(xszVar);
            ilo1.E(yszVarN.build(), ssw0Var);
        } finally {
            ssw0Var.H(th);
        }
    }

    public final void Q(String str) {
        ssw0 ssw0Var = this.b;
        try {
            ysz yszVarN = EsWebsocketEvent.WebSocketEvent.n();
            yszVarN.u(str);
            yszVarN.t(SystemClock.elapsedRealtime());
            ilo1.E(yszVarN.build(), ssw0Var);
        } catch (Throwable unused) {
            ssw0Var.H((Throwable) null);
        }
    }

    public final void R(rhc rhcVar) {
        ssw0 ssw0Var = this.b;
        try {
            ysz yszVarN = EsWebsocketEvent.WebSocketEvent.n();
            byte[] bArrQ = rhcVar.q();
            yszVarN.n(phc.e(0, bArrQ, bArrQ.length));
            ilo1.E(yszVarN.build(), ssw0Var);
        } catch (Throwable unused) {
            ssw0Var.H((Throwable) null);
        }
    }

    public final void S(ig01 ig01Var, ry21 ry21Var) {
        ssw0 ssw0Var = this.b;
        Logger.g("[WebSocket] Socket opened.", new Object[0]);
        try {
            ysz yszVarN = EsWebsocketEvent.WebSocketEvent.n();
            yszVarN.q();
            ilo1.E(yszVarN.build(), ssw0Var);
        } catch (Throwable unused) {
            ssw0Var.H((Throwable) null);
        }
    }
}
