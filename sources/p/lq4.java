package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public lq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new lp4(this, (byte) 24));
    }

    public final boolean a() {
        lq4 lq4Var = (lq4) this.c.getValue();
        return lq4Var != null ? lq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("entity_page_enabled", "android-list-ux-platform-consumers-trending-near-you-shared", a()));
    }

    public lq4(luk lukVar) {
        this(false, lukVar);
    }
}
