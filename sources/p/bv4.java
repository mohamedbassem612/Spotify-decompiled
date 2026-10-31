package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bv4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, 26));

    public bv4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        bv4 bv4Var = (bv4) this.c.getValue();
        return bv4Var != null ? bv4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("should_use_vit_to_show_thumbnail", "android-nowplaying-elements-video", a()));
    }
}
