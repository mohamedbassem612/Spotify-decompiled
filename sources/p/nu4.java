package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nu4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public nu4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new st4(this, (byte) 16));
    }

    public final boolean a() {
        nu4 nu4Var = (nu4) this.c.getValue();
        return nu4Var != null ? nu4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("clear_new_episode_push_on_play", "android-newepisodes-newepisodepushremoval", a()));
    }

    public nu4(luk lukVar) {
        this(false, lukVar);
    }
}
