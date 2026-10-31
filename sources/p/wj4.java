package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wj4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public wj4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new sh4(this, (byte) 28));
    }

    public final boolean a() {
        wj4 wj4Var = (wj4) this.c.getValue();
        return wj4Var != null ? wj4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_play_full_song_context_menu_item", "android-gated-content-flags", a()));
    }

    public wj4(luk lukVar) {
        this(false, lukVar);
    }
}
