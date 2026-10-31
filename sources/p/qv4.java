package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qv4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 9));

    public qv4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        qv4 qv4Var = (qv4) this.c.getValue();
        return qv4Var != null ? qv4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_playback_control_switcher", "android-nowplayingmini-defaultmode", a()));
    }
}
