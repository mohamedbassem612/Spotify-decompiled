package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uc4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 10));

    public uc4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        uc4 uc4Var = (uc4) this.c.getValue();
        return uc4Var != null ? uc4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("gpu_probe_enabled", "android-device-info-device-report-impl", a()));
    }
}
