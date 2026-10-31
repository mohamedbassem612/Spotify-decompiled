package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rv4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 10));

    public rv4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        rv4 rv4Var = (rv4) this.c.getValue();
        return rv4Var != null ? rv4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_playback_control_switcher", "android-nowplayingmini-reinventfreemode", a()));
    }
}
