package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vj4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 27));

    public vj4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        vj4 vj4Var = (vj4) this.c.getValue();
        return vj4Var != null ? vj4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("should_show_premium_badge", "android-freetier-experiments", a()));
    }
}
