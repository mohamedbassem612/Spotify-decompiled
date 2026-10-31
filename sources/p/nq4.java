package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new lp4(this, (byte) 26));

    public nq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        nq4 nq4Var = (nq4) this.c.getValue();
        return nq4Var != null ? nq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("hack_use_carefully_may_be_removed_at_any_time_determine_number_of_header_actions_based_on_resources", "android-list-ux-platform-header-common-impl", a()));
    }
}
