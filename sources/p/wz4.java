package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wz4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public wz4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new uz4(this, (byte) 1));
    }

    public final boolean a() {
        wz4 wz4Var = (wz4) this.c.getValue();
        return wz4Var != null ? wz4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("button_highlight_border_enabled", "android-recaps", a()));
    }

    public wz4(luk lukVar) {
        this(false, lukVar);
    }
}
