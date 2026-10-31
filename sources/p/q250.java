package p;

import com.spotify.voiceassistants.playermodels.PlayIntent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q250 implements amk1 {
    public final /* synthetic */ byte a;

    public final m210 a() {
        switch (this.a) {
            case 0:
                return new m210(22, "voice_assistant", (String) null, (String) null, "app_to_app", "app", "google", "google_assistant", "driving_mode", "media_session", "com.google.android.googlequicksearchbox");
            default:
                return new m210(22, "voice_assistant", (String) null, (String) null, "app_to_app", "app", "google", "google_assistant", "smart_space", "media_session", "com.google.android.googlequicksearchbox");
        }
    }

    public final String b(PlayIntent playIntent) {
        switch (this.a) {
        }
        return "ANDROID_GOOGLE_ASSISTANT";
    }
}
