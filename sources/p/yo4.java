package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yo4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new zn4(this, (byte) 17));

    public yo4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        yo4 yo4Var = (yo4) this.c.getValue();
        return yo4Var != null ? yo4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("deduplicate_state_updates_enabled", "android-list-platform-player-impl", a()));
    }
}
