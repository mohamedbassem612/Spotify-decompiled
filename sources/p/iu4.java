package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iu4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, (byte) 13));

    public iu4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        iu4 iu4Var = (iu4) this.c.getValue();
        return iu4Var != null ? iu4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_offline_listening_device_limit_text", "android-musicappplatform-offlineerrors", a()));
    }
}
