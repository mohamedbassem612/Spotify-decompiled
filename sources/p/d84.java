package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d84 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public d84(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new u74(this, (byte) 1));
    }

    public final boolean a() {
        d84 d84Var = (d84) this.c.getValue();
        return d84Var != null ? d84Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_playback_settings_gapless", "android-boombox-settings-gapless", a()));
    }

    public d84(luk lukVar) {
        this(true, lukVar);
    }
}
