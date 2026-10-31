package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rn4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 23));

    public rn4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        rn4 rn4Var = (rn4) this.c.getValue();
        return rn4Var != null ? rn4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("music_npv_leavebehinds_enabled", "android-libs-nowplaying-scroll-widgets-podcast-sponsors", a()));
    }
}
