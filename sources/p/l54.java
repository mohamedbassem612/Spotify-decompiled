package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l54 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 17));

    public l54(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        l54 l54Var = (l54) this.c.getValue();
        return l54Var != null ? l54Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("oboe_ducking_coordination_kill_switch", "android-audio-focus-coreinternal", a()));
    }
}
