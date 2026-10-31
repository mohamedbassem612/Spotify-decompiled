package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public bp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 20));
    }

    public final boolean a() {
        bp4 bp4Var = (bp4) this.c.getValue();
        return bp4Var != null ? bp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("advanced_curation_enabled", "android-list-ux-platform-consumers-advanced-curation", a()));
    }

    public bp4(luk lukVar) {
        this(false, lukVar);
    }
}
