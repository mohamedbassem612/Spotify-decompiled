package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x3n0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new zem0(this, (byte) 13));

    public x3n0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        x3n0 x3n0Var = (x3n0) this.c.getValue();
        return x3n0Var != null ? x3n0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("unified_subtitles_selection_enabled", "music-libs-video", a()));
    }
}
