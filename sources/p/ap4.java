package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ap4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new zn4(this, (byte) 19));

    public ap4(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        ap4 ap4Var = (ap4) this.c.getValue();
        return ap4Var != null ? ap4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("default_minimum_visible_chips_required", "android-list-ux-platform-chips-impl", a(), 1, 5));
    }
}
