package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vg4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new cg4(this, (byte) 12));

    public vg4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        vg4 vg4Var = (vg4) this.c.getValue();
        return vg4Var != null ? vg4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("continue_listening_section_enabled", "android-feature-new-episodes", a()));
    }
}
