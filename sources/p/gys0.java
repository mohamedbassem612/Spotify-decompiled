package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gys0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new kks0(this, (byte) 2));

    public gys0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        gys0 gys0Var = (gys0) this.c.getValue();
        return gys0Var != null ? gys0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("replace_go_to_settings_with_close", "pigeon-onboarding", a()));
    }
}
