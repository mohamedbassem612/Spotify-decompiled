package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ut4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, (byte) 1));

    public ut4(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        ut4 ut4Var = (ut4) this.c.getValue();
        return ut4Var != null ? ut4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("settlement_notification_delay_seconds", "android-music-app-platform-app-readiness", a(), 0, 30));
    }
}
