package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ff4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new pe4(this, (byte) 13));

    public ff4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ff4 ff4Var = (ff4) this.c.getValue();
        return ff4Var != null ? ff4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("group_blends_enabled", "android-feature-blend-invitation", a()));
    }
}
