package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class an3 {
    public final kly0 a;

    public an3(caq caqVar) {
        this.a = caqVar;
    }

    public final Intent a(Context context, EntryPoint entryPoint) {
        if (!((ul4) this.a.get()).h()) {
            int i = AllboardingActivity.l1;
            return x2g0.z(context, entryPoint);
        }
        return ud20.e(context, "spotify:internal:allboarding:origin:" + entryPoint.getUriSegment());
    }
}
