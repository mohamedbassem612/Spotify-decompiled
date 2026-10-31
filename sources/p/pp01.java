package p;

import com.spotify.esperanto.esperanto.CoroutineClientBase;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksRequest;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pp01 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(GetRecentlyPlayedTracksRequest getRecentlyPlayedTracksRequest, onm onmVar) {
        op01 op01Var;
        if (onmVar instanceof op01) {
            op01Var = (op01) onmVar;
            int i = op01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                op01Var.c = i - Integer.MIN_VALUE;
            } else {
                op01Var = new op01(this, onmVar);
            }
        } else {
            op01Var = new op01(this, onmVar);
        }
        Object objCallSingle = op01Var.a;
        int i2 = op01Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            op01Var.c = 1;
            objCallSingle = callSingle("spotify.recently_played_esperanto.proto.RecentlyPlayedService", "Tracks", getRecentlyPlayedTracksRequest, op01Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return GetRecentlyPlayedTracksResponse.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
