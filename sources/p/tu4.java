package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tu4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, (byte) 18));

    public tu4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        tu4 tu4Var = (tu4) this.c.getValue();
        return tu4Var != null ? tu4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("initially_hide_overlay_in_auto_hide_mode", "android-nowplaying-connectables", a()));
    }
}
