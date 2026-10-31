package p;

import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;
import com.spotify.player.model.PauseResumeOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class jas0 {
    public static final EsPauseresumeOrigin$PauseResumeOrigin a(PauseResumeOrigin pauseResumeOrigin) {
        spz spzVarN = EsPauseresumeOrigin$PauseResumeOrigin.n();
        spzVarN.n(pauseResumeOrigin.featureIdentifier());
        return (EsPauseresumeOrigin$PauseResumeOrigin) spzVarN.build();
    }
}
