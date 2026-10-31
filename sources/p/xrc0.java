package p;

import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface xrc0 {
    static Object b(xrc0 xrc0Var, String str, trc0 trc0Var, EsPreparePlayOptions.PreparePlayOptions preparePlayOptions, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, EsPlayOptions.PlayOptions playOptions, Map map, EsLoggingParams.LoggingParams loggingParams, ayc0 ayc0Var, lnm lnmVar, int i) {
        trc0 trc0Var2;
        if ((i & 2) != 0) {
            trc0Var2 = new trc0(null, null, null, false, null, null, null, 0, null, 511);
        } else {
            trc0Var2 = trc0Var;
        }
        EsPreparePlayOptions.PreparePlayOptions preparePlayOptionsP = (i & 4) != 0 ? EsPreparePlayOptions.PreparePlayOptions.p() : preparePlayOptions;
        rsc0 rsc0Var = (rsc0) xrc0Var;
        return c921.H(rsc0Var.c, new isc0(loggingParams, str, rsc0Var, (i & 32) != 0 ? b7x.a : map, trc0Var2, esPlayOrigin$PlayOrigin, (i & 16) != 0 ? EsPlayOptions.PlayOptions.n() : playOptions, preparePlayOptionsP, (i & 128) != 0 ? null : ayc0Var, (lnm) null), lnmVar);
    }
}
