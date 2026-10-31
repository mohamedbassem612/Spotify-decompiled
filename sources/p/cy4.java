package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cy4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public cy4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new sx4(this, (byte) 7));
    }

    public final boolean a() {
        cy4 cy4Var = (cy4) this.c.getValue();
        return cy4Var != null ? cy4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_page_api", "android-podcast-interactivity-reactions-bottom-sheet-impl", a()));
    }

    public cy4(luk lukVar) {
        this(false, lukVar);
    }
}
