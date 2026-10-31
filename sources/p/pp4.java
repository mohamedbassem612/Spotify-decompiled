package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new lp4(this, (byte) 3));

    public pp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        pp4 pp4Var = (pp4) this.c.getValue();
        return pp4Var != null ? pp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("header_progress_bar_enabled", "android-list-ux-platform-consumers-likedsongs-headermetadata", a()));
    }
}
