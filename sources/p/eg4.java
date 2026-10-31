package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eg4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public eg4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new cg4(this, (byte) 1));
    }

    public final boolean a() {
        eg4 eg4Var = (eg4) this.c.getValue();
        return eg4Var != null ? eg4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_free_on_demand_experiment", "android-feature-freeondemand", a()));
    }

    public eg4(luk lukVar) {
        this(false, lukVar);
    }
}
