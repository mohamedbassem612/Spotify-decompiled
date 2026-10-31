package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zb4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 2));

    public zb4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        zb4 zb4Var = (zb4) this.c.getValue();
        return zb4Var != null ? zb4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enabled", "android-creative-work-encore-dialogs", a()));
    }
}
