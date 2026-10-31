package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vn4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 26));

    public vn4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        vn4 vn4Var = (vn4) this.c.getValue();
        return vn4Var != null ? vn4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_on_demand_sharing", "android-libs-on-demand-sharing", a()));
    }
}
