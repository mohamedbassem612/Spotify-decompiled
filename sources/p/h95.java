package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h95 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public h95(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new f85(this, (byte) 14));
    }

    public final boolean a() {
        h95 h95Var = (h95) this.c.getValue();
        return h95Var != null ? h95Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("import_notifications_enabled", "android-yourlibrary-importnotifications", a()));
    }

    public h95(luk lukVar) {
        this(false, lukVar);
    }
}
