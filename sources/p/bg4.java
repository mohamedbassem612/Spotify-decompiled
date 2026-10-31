package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bg4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public bg4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new pe4(this, (byte) 29));
    }

    public final boolean a() {
        bg4 bg4Var = (bg4) this.c.getValue();
        return bg4Var != null ? bg4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("experimental_episode_consumption_state_label_enabled", "android-feature-episode-subtitle-builder", a()));
    }

    public bg4(luk lukVar) {
        this(false, lukVar);
    }
}
