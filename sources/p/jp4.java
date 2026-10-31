package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public jp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 28));
    }

    public final boolean a() {
        jp4 jp4Var = (jp4) this.c.getValue();
        return jp4Var != null ? jp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_filter_chips_chip_bar_action", "android-list-ux-platform-consumers-clips-shared", a()));
    }

    public jp4(luk lukVar) {
        this(false, lukVar);
    }
}
