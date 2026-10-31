package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rl4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new gk4(this, (byte) 13));

    public rl4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        rl4 rl4Var = (rl4) this.c.getValue();
        return rl4Var != null ? rl4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_safe_search", "android-libs-ads-browser", a()));
    }
}
