package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wy4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public wy4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new sx4(this, (byte) 16));
    }

    public final boolean a() {
        wy4 wy4Var = (wy4) this.c.getValue();
        return wy4Var != null ? wy4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_compact_upsell", "android-premiumdestination-settings-gopremium-impl", a()));
    }

    public wy4(luk lukVar) {
        this(false, lukVar);
    }
}
