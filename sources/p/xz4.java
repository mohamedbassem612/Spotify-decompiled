package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xz4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public xz4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new uz4(this, (byte) 2));
    }

    public final boolean a() {
        xz4 xz4Var = (xz4) this.c.getValue();
        return xz4Var != null ? xz4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("show_track_exclude_menu_item", "android-recommendations-contextmenuimpl", a()));
    }

    public xz4(luk lukVar) {
        this(false, lukVar);
    }
}
