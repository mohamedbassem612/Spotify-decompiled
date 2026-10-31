package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pt4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new rq4(this, (byte) 28));

    public pt4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        pt4 pt4Var = (pt4) this.c.getValue();
        return pt4Var != null ? pt4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("mup_notification_v2_enabled", "android-multi-user-plan-verification-verification-notification-banner", a()));
    }
}
