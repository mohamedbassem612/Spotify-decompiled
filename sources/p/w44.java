package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w44 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 8));

    public w44(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        w44 w44Var = (w44) this.c.getValue();
        return w44Var != null ? w44Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("is_branch_initialisation_enabled", "android-allboarding-branch", a()));
    }
}
