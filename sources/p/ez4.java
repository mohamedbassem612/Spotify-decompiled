package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ez4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 21));

    public ez4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ez4 ez4Var = (ez4) this.c.getValue();
        return ez4Var != null ? ez4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("contextual_page_enabled", "android-promptedplaylists-ai-disclosure-sheet", a()));
    }
}
