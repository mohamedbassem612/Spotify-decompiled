package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n85 implements pdy0 {
    public final boolean a;
    public final feh1 b;
    public final idd1 c = new idd1(new f85(this, (byte) 6));

    public n85(boolean z, xz11 xz11Var) {
        this.a = z;
        this.b = xz11Var;
    }

    public final boolean a() {
        n85 n85Var = (n85) this.c.getValue();
        return n85Var != null ? n85Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("is_miui_widget_enabled", "android-widgets-miuidynamicnpvwidget", a()));
    }
}
