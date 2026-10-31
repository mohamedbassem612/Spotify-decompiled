package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e85 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f55(this, (byte) 29));

    public e85(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        e85 e85Var = (e85) this.c.getValue();
        return e85Var != null ? e85Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_lazy_preloading", "android-webview-startup", a()));
    }
}
