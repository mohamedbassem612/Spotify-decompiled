package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v8r0 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new gyq0(this, 12));

    public v8r0(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        v8r0 v8r0Var = (v8r0) this.c.getValue();
        return v8r0Var != null ? v8r0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("haptic_time_offset_threshold_seconds", "page-match-outbound-scanning", a(), 1, 3600));
    }
}
