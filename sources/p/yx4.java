package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yx4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 3));

    public yx4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        yx4 yx4Var = (yx4) this.c.getValue();
        return yx4Var != null ? yx4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("reorder_playlist_labels_enabled", "android-playlistediting-properties", a()));
    }
}
