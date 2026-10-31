package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class an4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 10));

    public an4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        an4 an4Var = (an4) this.c.getValue();
        return an4Var != null ? an4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("playback_quality_on_context_menu", "android-libs-nowplaying-commonviews", a()));
    }
}
