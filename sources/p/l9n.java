package p;

import com.spotify.voiceassistants.playermodels.PlayIntent;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l9n implements amk1 {
    public static final Map b = sqg0.J(new mmr0[]{new mmr0(new roa0("com.microsoft.cortana"), new l9n("com.microsoft.cortana")), new mmr0(new roa0("com.microsoft.cortana.wip"), new l9n("com.microsoft.cortana.wip")), new mmr0(new roa0("com.microsoft.cortana.daily"), new l9n("com.microsoft.cortana.daily"))});
    public final String a;

    public l9n(String str) {
        this.a = str;
    }

    public final m210 a() {
        return new m210(278, "voice_assistant", (String) null, (String) null, "app_to_app", "app", "microsoft", "cortana", (String) null, "media_session", this.a);
    }

    public final String b(PlayIntent playIntent) {
        return "CORTANA";
    }
}
