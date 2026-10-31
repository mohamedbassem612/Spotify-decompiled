package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s84 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 8));

    public s84(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        s84 s84Var = (s84) this.c.getValue();
        return s84Var != null ? s84Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_frame_profiler_overlay", "android-campaigns-frameprofiler", a()));
    }
}
