package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fh4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new cg4(this, (byte) 18));

    public fh4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        fh4 fh4Var = (fh4) this.c.getValue();
        return fh4Var != null ? fh4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_queue_peek_on_add", "android-feature-nowplaying-queue-navigation", a()));
    }
}
