package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class av4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public av4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new st4(this, (byte) 25));
    }

    public final boolean a() {
        av4 av4Var = (av4) this.c.getValue();
        return av4Var != null ? av4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("require_current_share_eligibility", "android-nowplaying-elements-share", a()));
    }

    public av4(luk lukVar) {
        this(false, lukVar);
    }
}
