package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a54 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 10));

    public a54(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        a54 a54Var = (a54) this.c.getValue();
        return a54Var != null ? a54Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("unified_toolbar_action_style_enabled", "android-app-music-toolbar", a()));
    }
}
