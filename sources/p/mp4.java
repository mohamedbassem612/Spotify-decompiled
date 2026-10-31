package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new lp4(this, 0));

    public mp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        mp4 mp4Var = (mp4) this.c.getValue();
        return mp4Var != null ? mp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("with_play_trait", "android-list-ux-platform-consumers-episode-configurations-itemmetadataextension", a()));
    }
}
