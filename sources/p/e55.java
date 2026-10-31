package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e55 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public e55(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new k25(this, (byte) 29));
    }

    public final boolean a() {
        e55 e55Var = (e55) this.c.getValue();
        return e55Var != null ? e55Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("track_context_menu_page_api_enabled", "android-track-contextmenuimpl", a()));
    }

    public e55(luk lukVar) {
        this(false, lukVar);
    }
}
