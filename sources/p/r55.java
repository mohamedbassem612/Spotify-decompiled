package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r55 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f55(this, (byte) 11));

    public r55(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        r55 r55Var = (r55) this.c.getValue();
        return r55Var != null ? r55Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("preserve_resumed_overlay_activity", "android-ubi-page-view-observer", a()));
    }
}
