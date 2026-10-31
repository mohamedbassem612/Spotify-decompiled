package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsRequest;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$GetSettingsResponse;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p4u0 {
    public final agc0 a;
    public final v3u0 b;

    public p4u0(agc0 agc0Var, v3u0 v3u0Var) {
        this.a = agc0Var;
        this.b = v3u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        n4u0 n4u0Var;
        if (onmVar instanceof n4u0) {
            n4u0Var = (n4u0) onmVar;
            int i = n4u0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n4u0Var.c = i - Integer.MIN_VALUE;
            } else {
                n4u0Var = new n4u0(this, onmVar);
            }
        } else {
            n4u0Var = new n4u0(this, onmVar);
        }
        Object objJ = n4u0Var.a;
        int i2 = n4u0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            g4u0 g4u0VarQ = PlaybackSettingsEsperantoService$GetSettingsRequest.q();
            g4u0VarQ.r(c4u0.DISABLE_SMART_SHUFFLE);
            g4u0VarQ.s(true);
            Single map = this.b.callSingle("spotify.playback_settings.esperanto.proto.PlaybackSettings", "GetSettings", (PlaybackSettingsEsperantoService$GetSettingsRequest) g4u0VarQ.build()).map(mif1.n1);
            n4u0Var.c = 1;
            objJ = fc11.j(map, n4u0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        PlaybackSettingsEsperantoService$GetSettingsResponse playbackSettingsEsperantoService$GetSettingsResponse = (PlaybackSettingsEsperantoService$GetSettingsResponse) objJ;
        if (playbackSettingsEsperantoService$GetSettingsResponse.q() && playbackSettingsEsperantoService$GetSettingsResponse.p().u()) {
            return yah0.m(playbackSettingsEsperantoService$GetSettingsResponse.p().q());
        }
        return null;
    }
}
