package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class uu60 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final b a(ezc ezcVar, p5a0 p5a0Var, oea0 oea0Var, q8n q8nVar) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {ezcVar, rqt0.u(new x72(new any(d5p1.h(p5a0Var.c), (byte) 18), (byte) 23)), new tf2(oea0Var.a.a("social-connect/v1/join_request_updates", new ft30(1, oea0Var, oea0.class, "parseJoinRequestStatusMessage", "parseJoinRequestStatusMessage(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/jam/internal/socialconnect/models/JoinRequestStatusUpdate;", 0, (byte) 21)), (byte) 10)};
        companion.getClass();
        return new b(q8nVar, mr20VarArr);
    }
}
