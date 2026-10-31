package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f391 implements suk {
    public static final PlayOrigin a;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("media-session");
        a690 a690Var = b690.a;
        a = builder.referrerIdentifier("app_integration").build();
    }

    @Override // p.suk
    public final boolean b(String str) {
        return "com.skmusic".equals(str);
    }

    @Override // p.suk
    public final PlayOrigin c(String str) {
        return a;
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return new m210(22, "", (String) null, (String) null, "app_to_app", "app", "skmusic", "cactus jack", str2, "media_session", str);
    }
}
