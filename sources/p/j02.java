package p;

import android.content.Context;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface j02 {
    p02 newSessionBuilder(u02 u02Var);

    void registerMeetingStatusListener(Context context, zii0 zii0Var, Optional optional);

    void unregisterMeetingStatusListener(Context context);
}
