package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fy4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 10));

    public fy4(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        fy4 fy4Var = (fy4) this.c.getValue();
        return fy4Var != null ? fy4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("show_auto_download_tooltip_max_count", "android-podcastexperience-autodownloadtooltipimpl", a(), 0, 100000));
    }
}
