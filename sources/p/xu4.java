package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xu4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, (byte) 22));

    public xu4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        xu4 xu4Var = (xu4) this.c.getValue();
        return xu4Var != null ? xu4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("is_promo_indicator_enabled", "android-nowplaying-elements-promotionalindicator", a()));
    }
}
