package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m85 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f85(this, (byte) 5));

    public m85(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        m85 m85Var = (m85) this.c.getValue();
        return m85Var != null ? m85Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("cancellation_cleanup_on_main_thread", "android-widgets-mediabrowserdatasource", a()));
    }
}
