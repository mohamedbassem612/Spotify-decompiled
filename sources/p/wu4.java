package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wu4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, 21));

    public wu4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        wu4 wu4Var = (wu4) this.c.getValue();
        return wu4Var != null ? wu4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_for_all_chaptered_content_types", "android-nowplaying-elements-entitysegments", a()));
    }
}
