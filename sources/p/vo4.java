package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vo4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new zn4(this, (byte) 14));

    public vo4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        vo4 vo4Var = (vo4) this.c.getValue();
        return vo4Var != null ? vo4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("albums_in_playlists_enabled", "android-list-platform-albums-in-playlists", a()));
    }
}
