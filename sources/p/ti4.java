package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ti4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 17));

    public ti4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ti4 ti4Var = (ti4) this.c.getValue();
        return ti4Var != null ? ti4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_multi_pane", "android-feature-unboxing-hub-impl", a()));
    }
}
