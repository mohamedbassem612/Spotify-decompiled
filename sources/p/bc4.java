package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bc4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 4));

    public bc4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        bc4 bc4Var = (bc4) this.c.getValue();
        return bc4Var != null ? bc4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("disable_share_while_eligibility_pending", "android-creativeworkelements-shareimpl", a()));
    }
}
