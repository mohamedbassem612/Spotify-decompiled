package p;

import com.spotify.player.model.PlayOrigin;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface uxh0 {
    public static final PlayOrigin a;
    public static final Set b;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("media-session");
        a690 a690Var = b690.a;
        a = builder.referrerIdentifier("app_integration").build();
        b = dm61.z0(kxh0.c, kxh0.b, kxh0.a, kxh0.h, kxh0.i, kxh0.e, kxh0.d, kxh0.t, kxh0.g, kxh0.N0, kxh0.Z);
    }

    m210 a(String str);

    boolean b(String str);

    lxh0 c(x610 x610Var, int i);
}
