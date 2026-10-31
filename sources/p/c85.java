package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.websocket.esperanto.proto.EsWebsocketConnectRequest;
import com.spotify.connectivity.websocket.esperanto.proto.EsWebsocketDisconnect;
import com.spotify.connectivity.websocket.esperanto.proto.EsWebsocketSendRequest;
import com.spotify.esperanto.esperanto.ServiceBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c85 implements ServiceBase {
    public final azp0 a;
    public final q8n b;
    public final Scheduler c;
    public final String d;
    public volatile ig01 e;

    public c85(azp0 azp0Var, q8n q8nVar, Scheduler scheduler, ajg ajgVar) {
        String strE = ((zym0) ajgVar).e();
        this.a = azp0Var;
        this.b = q8nVar;
        this.c = scheduler;
        this.d = strE;
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Single callSingle(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.connectivity.websocket.esperanto.proto.WebSocketClient")) {
            throw new RuntimeException(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.websocket.esperanto.proto.WebSocketClient]"));
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Observable callStream(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.connectivity.websocket.esperanto.proto.WebSocketClient")) {
            jah.g(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.websocket.esperanto.proto.WebSocketClient]"));
            return null;
        }
        if (!str2.equals("connect")) {
            jah.g(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
            return null;
        }
        EsWebsocketConnectRequest.WebSocketConnectRequest webSocketConnectRequestP = EsWebsocketConnectRequest.WebSocketConnectRequest.p(bArr);
        webSocketConnectRequestP.getClass();
        Logger.g("[WebSocket] Connecting to: %s", webSocketConnectRequestP.getUrl());
        return yoi1.i(x4p1.h(o4p1.r(h4p1.g(new c6(this, webSocketConnectRequestP, (lnm) null, (byte) 29)), this.b), new rf2((byte) 3)), o6x.a).observeOn(this.c).map(jcx0.Y0);
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final byte[] callSync(String str, String str2, byte[] bArr) {
        EsWebsocketSendRequest.WebSocketSendResponse webSocketSendResponseBuild;
        EsWebsocketSendRequest.WebSocketSendResponse webSocketSendResponseBuild2;
        if (!str.equals("spotify.connectivity.websocket.esperanto.proto.WebSocketClient")) {
            jah.g(f4i1.f("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.websocket.esperanto.proto.WebSocketClient]"));
            return null;
        }
        if (str2.equals("sendText")) {
            EsWebsocketSendRequest.WebSocketSendTextRequest webSocketSendTextRequestO = EsWebsocketSendRequest.WebSocketSendTextRequest.o(bArr);
            webSocketSendTextRequestO.getClass();
            ig01 ig01Var = this.e;
            if (ig01Var == null) {
                zsz zszVarN = EsWebsocketSendRequest.WebSocketSendResponse.n();
                zszVarN.n(false);
                webSocketSendResponseBuild2 = zszVarN.build();
            } else {
                String strN = webSocketSendTextRequestO.n();
                rhc rhcVar = new rhc(ryn1.m(strN));
                rhcVar.c = strN;
                boolean zF = ig01Var.f(1, rhcVar);
                zsz zszVarN2 = EsWebsocketSendRequest.WebSocketSendResponse.n();
                zszVarN2.n(zF);
                webSocketSendResponseBuild2 = zszVarN2.build();
            }
            return webSocketSendResponseBuild2.toByteArray();
        }
        if (!str2.equals("sendBinary")) {
            if (!str2.equals("disconnect")) {
                jah.g(cy30.p("Attempted to access unknown method. [", str, ":", str2, "]"));
                return null;
            }
            EsWebsocketDisconnect.WebSocketDisconnectRequest.n(bArr).getClass();
            try {
                ig01 ig01Var2 = this.e;
                if (ig01Var2 != null) {
                    ig01Var2.b(1000, "disconnect requested");
                }
                return EsWebsocketDisconnect.WebSocketDisconnectResponse.n().build().toByteArray();
            } finally {
                this.e = null;
            }
        }
        EsWebsocketSendRequest.WebSocketSendBinaryRequest webSocketSendBinaryRequestO = EsWebsocketSendRequest.WebSocketSendBinaryRequest.o(bArr);
        webSocketSendBinaryRequestO.getClass();
        ig01 ig01Var3 = this.e;
        if (ig01Var3 == null) {
            zsz zszVarN3 = EsWebsocketSendRequest.WebSocketSendResponse.n();
            zszVarN3.n(false);
            webSocketSendResponseBuild = zszVarN3.build();
        } else {
            byte[] bArrT = webSocketSendBinaryRequestO.n().t();
            byte[] bArrCopyOf = Arrays.copyOf(bArrT, bArrT.length);
            boolean zF2 = ig01Var3.f(2, new rhc(Arrays.copyOf(bArrCopyOf, bArrCopyOf.length)));
            zsz zszVarN4 = EsWebsocketSendRequest.WebSocketSendResponse.n();
            zszVarN4.n(zF2);
            webSocketSendResponseBuild = zszVarN4.build();
        }
        return webSocketSendResponseBuild.toByteArray();
    }

    @Override // com.spotify.esperanto.esperanto.ServiceBase
    public final String getName() {
        return "spotify.connectivity.websocket.esperanto.proto.WebSocketClient";
    }
}
