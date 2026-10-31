package p;

import com.spotify.voiceassistants.playermodels.PlayIntent;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jya implements amk1 {
    public static final Map b = sqg0.J(new mmr0[]{new mmr0(new roa0("com.samsung.android.bixby.service"), new jya("com.samsung.android.bixby.service")), new mmr0(new roa0("com.samsung.android.bixby.agent"), new jya("com.samsung.android.bixby.agent"))});
    public final String a;

    public jya(String str) {
        this.a = str;
    }

    public final m210 a() {
        return new m210(278, "voice_assistant", (String) null, (String) null, "app_to_app", "app", "samsung", "bixby", (String) null, "media_session", this.a);
    }

    public final String b(PlayIntent playIntent) {
        return "SAMSUNG_BIXBY";
    }
}
