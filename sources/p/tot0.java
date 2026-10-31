package p;

import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class tot0 {
    public static final EsPlayOrigin.PlayOrigin a(PlayOrigin playOrigin) {
        zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
        zpzVarY.s(playOrigin.featureIdentifier());
        zpzVarY.t(playOrigin.featureVersion());
        zpzVarY.w(playOrigin.viewUri());
        zpzVarY.r(playOrigin.externalReferrer());
        zpzVarY.u(playOrigin.referrerIdentifier());
        zpzVarY.q(playOrigin.deviceIdentifier());
        zpzVarY.v(playOrigin.restrictionIdentifier());
        zpzVarY.n(playOrigin.featureClasses());
        return zpzVarY.build();
    }
}
