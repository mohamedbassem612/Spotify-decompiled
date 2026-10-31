package p;

import android.os.Bundle;
import com.spotify.player.model.PlayOrigin;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hc9 implements suk {
    public final lc9 a;

    public hc9(lc9 lc9Var) {
        this.a = lc9Var;
    }

    @Override // p.suk
    public final Set a() {
        return uxh0.b;
    }

    @Override // p.suk
    public final boolean b(String str) {
        return lc9.d.contains(str);
    }

    @Override // p.suk
    public final PlayOrigin c(String str) {
        List list = lc9.d;
        return lc9.e;
    }

    @Override // p.suk
    public final fzc e() {
        return fzc.d;
    }

    @Override // p.suk
    public final String f() {
        return "spotify_media_browser_root_avrcp";
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return this.a.a(str);
    }

    @Override // p.suk
    public final tn31 k(String str, tn31 tn31Var) {
        return new tn31("empty", (String) null, (String) null, false, false, (t380) null, (Bundle) null, 254);
    }
}
