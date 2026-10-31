package p;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mn91 {
    public static final Map c;
    public final Context a;
    public final ut71 b;

    static {
        nbc nbcVar = bma1.b;
        c = sqg0.J(oqn1.n(eo91.c, nbcVar.u("smart_shuffle_playlist_onboarding_shown")), oqn1.n(do91.c, nbcVar.u("liked_songs_smart_shuffle_onboarding_tooltip_shown")));
    }

    public mn91(Context context, ut71 ut71Var) {
        this.a = context;
        this.b = ut71Var;
    }
}
