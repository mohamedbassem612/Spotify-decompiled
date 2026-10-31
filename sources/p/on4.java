package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class on4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 20));

    public on4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        on4 on4Var = (on4) this.c.getValue();
        return on4Var != null ? on4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("scope_carousel_holders_to_mode_page", "android-libs-nowplaying-endless-feed-mode", a()));
    }
}
