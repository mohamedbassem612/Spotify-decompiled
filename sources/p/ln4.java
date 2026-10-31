package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ln4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 18));

    public ln4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ln4 ln4Var = (ln4) this.c.getValue();
        return ln4Var != null ? ln4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_queued_badge", "android-libs-nowplaying-elements-trackinfo", a()));
    }
}
