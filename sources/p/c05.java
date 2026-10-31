package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c05 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public c05(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new uz4(this, (byte) 6));
    }

    public final boolean a() {
        c05 c05Var = (c05) this.c.getValue();
        return c05Var != null ? c05Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("ad_unlocked_on_demand_enabled", "android-reinvent-free-ad-unlock-eligibility-impl", a()));
    }

    public c05(luk lukVar) {
        this(false, lukVar);
    }
}
