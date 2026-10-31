package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cf4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public cf4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new pe4(this, (byte) 10));
    }

    public final boolean a() {
        cf4 cf4Var = (cf4) this.c.getValue();
        return cf4Var != null ? cf4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_visual_identity_trait", "android-feature-album-context-menu", a()));
    }

    public cf4(luk lukVar) {
        this(false, lukVar);
    }
}
