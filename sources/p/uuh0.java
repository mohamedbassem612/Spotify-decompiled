package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uuh0 implements suk {
    public static final PlayOrigin a;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("media-resumption");
        a690 a690Var = b690.a;
        a = builder.referrerIdentifier("media-resumption").build();
    }

    @Override // p.suk
    public final boolean b(String str) {
        return str.equals("com.android.systemui.recent");
    }

    @Override // p.suk
    public final PlayOrigin c(String str) {
        return a;
    }

    @Override // p.suk
    public final vsr0 d(String str, uic uicVar) {
        return new vsr0("spotify_root_media_resumption");
    }

    @Override // p.suk
    public final String f() {
        return "spotify_root_media_resumption";
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return new m210(438, "media_resumption", (String) null, (String) null, "app_to_app", (String) null, "google", (String) null, (String) null, "media_session", str);
    }
}
