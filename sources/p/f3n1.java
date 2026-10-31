package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f3n1 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new yrm1(this, (byte) 7));

    public f3n1(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        f3n1 f3n1Var = (f3n1) this.c.getValue();
        return f3n1Var != null ? f3n1Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("full_tree_move_structure", "yourlibrary-messaging-page", a()));
    }
}
