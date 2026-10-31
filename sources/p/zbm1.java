package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zbm1 {
    public static final Set c = f46.S0(new String[]{"spotify:watch-feed:wrapped-artist-clips", "spotify:watch-feed:wrapped-podcast-clips", "spotify:watch-feed:wrapped-author-clips"});
    public final wjq0 a;
    public final boolean b;

    public zbm1(String str, wjq0 wjq0Var) {
        this.a = wjq0Var;
        this.b = c.contains(ihc1.Y0(str, '?'));
    }
}
