package p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tdu0 {
    public static final int a(PlayerState playerState) {
        t380 t380VarReasons;
        Restrictions.RestrictionReasons restrictionReasons = (Restrictions.RestrictionReasons) playerState.restrictions().disallowSignals().get("switch-to-video");
        if (restrictionReasons != null && (t380VarReasons = restrictionReasons.reasons()) != null) {
            if (t380VarReasons.contains("disallowed_by_account_manager")) {
                return 2;
            }
            if (t380VarReasons.contains("disallowed_by_user_setting:music-video-disabled")) {
                return 3;
            }
            if (t380VarReasons.contains("disallowed_by_user_setting:other-video-disabled")) {
                return 4;
            }
            if (t380VarReasons.contains("not_supported_by_device")) {
                return 1;
            }
        }
        return 0;
    }
}
