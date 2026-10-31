package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u450 implements suk {
    public static final PlayOrigin a;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("google-clock");
        a690 a690Var = b690.a;
        a = builder.referrerIdentifier("google-clock").build();
    }

    @Override // p.suk
    public final boolean b(String str) {
        return "com.google.android.deskclock".equals(str);
    }

    @Override // p.suk
    public final PlayOrigin c(String str) {
        return a;
    }

    @Override // p.suk
    public final fzc e() {
        return fzc.g;
    }

    @Override // p.suk
    public final String f() {
        return "spotify_media_browser_root_wakeup";
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return new m210(22, "Clock", (String) null, (String) null, "app_to_app", "app", "google", "google clock", str2, "media_session", str);
    }
}
