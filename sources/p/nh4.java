package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nh4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new cg4(this, (byte) 26));

    public nh4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        nh4 nh4Var = (nh4) this.c.getValue();
        return nh4Var != null ? nh4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("esperanto_enabled", "android-feature-podcast-show-cosmos", a()));
    }
}
