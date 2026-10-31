package p;

import android.os.Bundle;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n64 implements suk {
    public final c74 a;

    public n64(c74 c74Var) {
        this.a = c74Var;
    }

    @Override // p.suk
    public final boolean b(String str) {
        return str.equals("com.google.android.projection.gearhead") || str.equals("com.spotify.auto.mediatest");
    }

    @Override // p.suk
    public final PlayOrigin c(String str) {
        PlayOrigin playOrigin = c74.e;
        return c74.e;
    }

    @Override // p.suk
    public final fzc e() {
        return fzc.b;
    }

    @Override // p.suk
    public final String f() {
        return "spotify_media_browser_root_android_auto";
    }

    @Override // p.suk
    public final m4e0 getExtras() {
        m4e0 m4e0Var = new m4e0((byte) 6);
        Bundle bundle = (Bundle) m4e0Var.b;
        bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 1);
        bundle.putBoolean("android.media.browse.AUTO_TABS_OPT_IN_HINT", true);
        return m4e0Var;
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return this.a.a(str);
    }

    @Override // p.suk
    public final hf61 j() {
        return hf61.b;
    }

    @Override // p.suk
    public final tn31 k(String str, tn31 tn31Var) {
        return new tn31("automotive", (String) null, (String) null, false, false, b74.A, (Bundle) null, 174);
    }
}
