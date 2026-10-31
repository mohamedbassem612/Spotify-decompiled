package p;

import com.spotify.player.model.PlayOrigin;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bv91 implements suk {
    public static final Set a = f46.S0(new String[]{"com.snap.specs.app.master", "com.snap.specs.app.alpha", "com.snap.specs.app.dev"});
    public static final PlayOrigin b;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("media-session");
        a690 a690Var = b690.a;
        b = builder.referrerIdentifier("app_integration").build();
    }

    @Override // p.suk
    public final Set a() {
        return dm61.y0(uxh0.b, f46.S0(new kxh0[]{kxh0.X, kxh0.Y}));
    }

    @Override // p.suk
    public final boolean b(String str) {
        return a.contains(str);
    }

    @Override // p.suk
    public final PlayOrigin c(String str) {
        return b;
    }

    @Override // p.suk
    public final fzc e() {
        return fzc.i;
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return new m210(22, "", (String) null, (String) null, "app_to_app", "app", "snap", "Snap Specs", str2, "media_session", str);
    }

    @Override // p.suk
    public final hf61 j() {
        return hf61.t;
    }
}
