package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fd4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 16));

    public fd4(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        fd4 fd4Var = (fd4) this.c.getValue();
        return fd4Var != null ? fd4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("container_ready_timeout_ms", "android-device-predictability-surfaces-smartcontrolnudge", a(), 0, 2000));
    }
}
