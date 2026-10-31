package p;

import com.spotify.player.model.PlayOrigin;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lc9 implements uxh0 {
    public static final List d = p7h.M(new String[]{"com.android.bluetooth", "com.google.android.bluetooth"});
    public static final PlayOrigin e;
    public final c8q c;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("avrcp");
        a690 a690Var = b690.a;
        e = builder.referrerIdentifier("avrcp").build();
    }

    public lc9(c8q c8qVar) {
        this.c = c8qVar;
    }

    public final m210 a(String str) {
        pbq pbqVar = new pbq("avrcp");
        pbqVar.t0(str);
        pbqVar.s0("media_session");
        pbqVar.u0("bluetooth");
        return pbqVar.v();
    }

    public final boolean b(String str) {
        return d.contains(str);
    }

    public final lxh0 c(x610 x610Var, int i) {
        return this.c.b(x610Var, e, i);
    }
}
