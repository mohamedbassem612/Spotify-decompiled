package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class atg0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new tzf0(this, (byte) 17));

    public atg0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        atg0 atg0Var = (atg0) this.c.getValue();
        return atg0Var != null ? atg0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_show_esperanto_endpoint", "markasplayedpage", a()));
    }
}
