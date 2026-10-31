package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b25 implements pdy0 {
    public final boolean a;
    public final tgp0 b;
    public final luk c;
    public final idd1 d;
    public final idd1 e;

    public b25(boolean z, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = tgp0Var;
        this.c = lukVar;
        this.d = new idd1(new a25(this, (byte) 1));
        this.e = new idd1(new a25(this, (byte) 0));
    }

    public final boolean a() {
        b25 b25Var = (b25) this.e.getValue();
        return b25Var != null ? b25Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("show_cache_limit_item", "android-storage-settings-cachelimit", a()));
    }

    public b25(tgp0 tgp0Var, luk lukVar) {
        this(false, tgp0Var, lukVar);
    }
}
