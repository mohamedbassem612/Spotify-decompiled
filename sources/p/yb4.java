package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yb4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 1));

    public yb4(int i, lw21 lw21Var) {
        this.a = i;
        this.b = lw21Var;
    }

    public final int a() {
        yb4 yb4Var = (yb4) this.c.getValue();
        return yb4Var != null ? yb4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("debounce_interval_ms", "android-crash-reporting-process-state-summary", a(), 0, 60000));
    }
}
