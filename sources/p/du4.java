package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class du4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public du4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new st4(this, (byte) 8));
    }

    public final boolean a() {
        du4 du4Var = (du4) this.c.getValue();
        return du4Var != null ? du4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("see_all_button", "android-music-videos-artist", a()));
    }

    public du4(luk lukVar) {
        this(false, lukVar);
    }
}
