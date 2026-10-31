package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m94 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c;

    public m94(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
        this.c = new idd1(new u74(this, (byte) 16));
    }

    public final int a() {
        m94 m94Var = (m94) this.c.getValue();
        return m94Var != null ? m94Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("diagnostics_detail_log_limit", "android-collection-offlinesyncnotification", a(), 0, 100));
    }

    public m94(luk lukVar) {
        this(24, lukVar);
    }
}
