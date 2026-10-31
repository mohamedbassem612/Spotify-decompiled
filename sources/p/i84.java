package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i84 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public i84(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new u74(this, (byte) 3));
    }

    public final boolean a() {
        i84 i84Var = (i84) this.c.getValue();
        return i84Var != null ? i84Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("undo_snackbar_enabled", "android-byom-coordinatorimpl", a()));
    }

    public i84(luk lukVar) {
        this(false, lukVar);
    }
}
