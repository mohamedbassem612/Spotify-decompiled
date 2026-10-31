package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dy4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public dy4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new sx4(this, (byte) 8));
    }

    public final boolean a() {
        dy4 dy4Var = (dy4) this.c.getValue();
        return dy4Var != null ? dy4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("stop_player_on_context_end_enabled", "android-podcast-player", a()));
    }

    public dy4(luk lukVar) {
        this(false, lukVar);
    }
}
