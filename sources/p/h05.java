package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h05 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 10));

    public h05(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        h05 h05Var = (h05) this.c.getValue();
        return h05Var != null ? h05Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("shadow_load_skip_next_enabled", "android-reinventfree-nowplayingapi", a()));
    }
}
