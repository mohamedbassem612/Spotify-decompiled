package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vy4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public vy4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new sx4(this, (byte) 15));
    }

    public final boolean a() {
        vy4 vy4Var = (vy4) this.c.getValue();
        return vy4Var != null ? vy4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_premium_value", "android-premium-value", a()));
    }

    public vy4(luk lukVar) {
        this(false, lukVar);
    }
}
