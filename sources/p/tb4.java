package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tb4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public tb4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new u74(this, (byte) 27));
    }

    public final boolean a() {
        tb4 tb4Var = (tb4) this.c.getValue();
        return tb4Var != null ? tb4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("premium_upsell_panel_enabled", "android-context-menu", a()));
    }

    public tb4(luk lukVar) {
        this(false, lukVar);
    }
}
