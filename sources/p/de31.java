package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class de31 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new g521(this, (byte) 12));

    public de31(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        de31 de31Var = (de31) this.c.getValue();
        return de31Var != null ? de31Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("on_demand_cap_reached", "rewardedad", a()));
    }
}
