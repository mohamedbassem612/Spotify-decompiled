package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ppy0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public ppy0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new l5v0(this, (byte) 5));
    }

    public static ppy0 c(aey0 aey0Var) {
        return new ppy0(aey0Var.c("puffin-core:allow_externalization", false), null);
    }

    public final boolean b() {
        ppy0 ppy0Var = (ppy0) this.c.getValue();
        return ppy0Var != null ? ppy0Var.b() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("allow_externalization", "puffin-core", b()));
    }

    public ppy0(luk lukVar) {
        this(false, lukVar);
    }
}
