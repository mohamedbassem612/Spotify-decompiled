package p;

import com.spotify.voiceassistants.playermodels.PlayIntent;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ii3 implements amk1 {
    public static final Map b = sqg0.J(new mmr0[]{new mmr0(new roa0("com.amazon.dee.app"), new ii3("com.amazon.dee.app")), new mmr0(new roa0("com.amazon.dee.app.beta"), new ii3("com.amazon.dee.app.beta")), new mmr0(new roa0("com.amazon.aca"), new ii3("com.amazon.aca")), new mmr0(new roa0("com.amazon.alexa.multimodal.lyra"), new ii3("com.amazon.alexa.multimodal.lyra")), new mmr0(new roa0("com.amazon.alexa.multimodal.gemini"), new ii3("com.amazon.alexa.multimodal.gemini")), new mmr0(new roa0("amazon.speech.sim"), new ii3("amazon.speech.sim"))});
    public final String a;

    public ii3(String str) {
        this.a = str;
    }

    public final m210 a() {
        return new m210(278, "voice_assistant", (String) null, (String) null, "app_to_app", "app", "amazon", "alexa", (String) null, "media_session", this.a);
    }

    public final String b(PlayIntent playIntent) {
        return "ANDROID_ALEXA";
    }
}
