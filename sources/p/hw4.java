package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hw4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public hw4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new fv4(this, (byte) 18));
    }

    public final boolean a() {
        hw4 hw4Var = (hw4) this.c.getValue();
        return hw4Var != null ? hw4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("edge_to_edge_enabled_by_default_in_page_activity", "android-page-activity", a()));
    }

    public hw4(luk lukVar) {
        this(false, lukVar);
    }
}
