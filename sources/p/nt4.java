package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nt4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new rq4(this, (byte) 26));

    public nt4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        nt4 nt4Var = (nt4) this.c.getValue();
        return nt4Var != null ? nt4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("mup_onboarding_v2_enabled", "android-multi-user-plan-verification-verification-code-onboarding", a()));
    }
}
