package p;

import android.net.Uri;
import com.spotify.voiceassistants.playermodels.PlayIntent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qz40 implements amk1 {
    public final String a;

    public qz40(String str) {
        this.a = str;
    }

    public final m210 a() {
        return new m210(278, "voice_assistant", (String) null, (String) null, "app_to_app", "app", "google", "google_assistant", (String) null, "media_session", this.a);
    }

    public final String b(PlayIntent playIntent) {
        Uri uri = playIntent.getUri();
        return (u890.j(uri.getQueryParameter("utm_source"), "google") && u890.j(uri.getQueryParameter("utm_medium"), "gemini")) ? "GEMINI" : "ANDROID_GOOGLE_ASSISTANT";
    }
}
