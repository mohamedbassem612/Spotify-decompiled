package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cx4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public cx4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new fv4(this, (byte) 23));
    }

    public final boolean a() {
        cx4 cx4Var = (cx4) this.c.getValue();
        return cx4Var != null ? cx4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("show_permissions_enabled", "android-permissions-permissionsesperanto", a()));
    }

    public cx4(luk lukVar) {
        this(false, lukVar);
    }
}
