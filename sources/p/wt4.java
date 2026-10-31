package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wt4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public wt4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new st4(this, (byte) 3));
    }

    public final boolean a() {
        wt4 wt4Var = (wt4) this.c.getValue();
        return wt4Var != null ? wt4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_entrypoint_section", "android-music-guesser", a()));
    }

    public wt4(luk lukVar) {
        this(true, lukVar);
    }
}
