package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ep4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new zn4(this, (byte) 23));

    public ep4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ep4 ep4Var = (ep4) this.c.getValue();
        return ep4Var != null ? ep4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enabled", "android-list-ux-platform-consumers-audiobook-listcomponents-playableaudiobooklens", a()));
    }
}
