package p;

import android.content.Context;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tev implements j02 {
    public static final tev a = new tev();

    public final p02 newSessionBuilder(u02 u02Var) {
        return new pob((byte) 8, false);
    }

    public final void registerMeetingStatusListener(Context context, zii0 zii0Var, Optional optional) {
        n57.e("\n            registerMeetingStatusListener was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
    }

    public final void unregisterMeetingStatusListener(Context context) {
        n57.e("\n            unregisterMeetingStatusListener was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
    }
}
