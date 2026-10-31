package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g95 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f85(this, (byte) 13));

    public g95(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        g95 g95Var = (g95) this.c.getValue();
        return g95Var != null ? g95Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_add_to_playlist_for_albums", "android-yourlibrary-contextmenuusecases", a()));
    }
}
