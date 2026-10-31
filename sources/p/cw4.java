package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cw4 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new fv4(this, 15));

    public cw4(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        cw4 cw4Var = (cw4) this.c.getValue();
        return cw4Var != null ? cw4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("allow_unauthenticated_search", "android-oem-integrations-xiaomi-unauth-properties-service", a()));
    }
}
