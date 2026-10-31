package p;

import com.spotify.voiceassistants.playermodels.PlayIntent;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bij0 implements amk1 {
    public static final Map b = sqg0.J(new mmr0[]{new mmr0(new roa0("com.facebook.stella"), new bij0("com.facebook.stella")), new mmr0(new roa0("com.facebook.stella_debug"), new bij0("com.facebook.stella_debug"))});
    public final String a;

    public bij0(String str) {
        this.a = str;
    }

    public final m210 a() {
        return new m210(278, "voice_assistant", (String) null, (String) null, "app_to_app", "app", "Meta", "stella", (String) null, "media_session", this.a);
    }

    public final String b(PlayIntent playIntent) {
        return "META_RB";
    }
}
