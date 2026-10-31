package p;

import com.spotify.listeningactivity.v1.SubscribePresenceRequest;
import com.spotify.listeningactivity.v1.UserActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lfd0 {
    public final lmy0 a;
    public final bed0 b;
    public final nfa0 c;

    public lfd0(lmy0 lmy0Var, bed0 bed0Var, nfa0 nfa0Var) {
        this.a = lmy0Var;
        this.b = bed0Var;
        this.c = nfa0Var;
    }

    public static SubscribePresenceRequest a(String str) {
        com.spotify.listeningactivity.v1.a aVarO = SubscribePresenceRequest.o();
        com.spotify.listeningactivity.v1.b bVarN = SubscribePresenceRequest.PusherChannel.n();
        bVarN.n(str);
        aVarO.n(bVarN.build());
        return (SubscribePresenceRequest) aVarO.build();
    }

    public static ucd0 b(UserActivity userActivity) {
        String username = userActivity.getUsername();
        Long tcd0Var = null;
        if (userActivity.o()) {
            tcd0Var = new tcd0(userActivity.n().hasTimestamp() ? Long.valueOf((userActivity.n().q().q() * 1000) + ((long) (userActivity.n().q().p() / 1000000))) : null, userActivity.n().getEntityUri(), userActivity.n().r() ? userActivity.n().n() : null, userActivity.n().p());
        }
        return new ucd0(username, tcd0Var);
    }
}
