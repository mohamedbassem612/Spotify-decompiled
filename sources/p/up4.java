package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class up4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public up4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 8));
    }

    public final boolean a() {
        up4 up4Var = (up4) this.c.getValue();
        return up4Var != null ? up4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_filter_chips_chip_bar_action", "android-list-ux-platform-consumers-offlinebackup-shared", a()));
    }

    public up4(luk lukVar) {
        this(false, lukVar);
    }
}
