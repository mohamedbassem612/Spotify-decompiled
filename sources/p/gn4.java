package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gn4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new om4(this, (byte) 15));

    public gn4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        gn4 gn4Var = (gn4) this.c.getValue();
        return gn4Var != null ? gn4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("lazy_child_elements_enabled", "android-libs-nowplaying-elements-playbackcontrolswitcher", a()));
    }
}
