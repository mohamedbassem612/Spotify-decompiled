package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s9v0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public s9v0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new z6v0(this, (byte) 3));
    }

    public final boolean a() {
        s9v0 s9v0Var = (s9v0) this.c.getValue();
        return s9v0Var != null ? s9v0Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("content_agnostic_show_menu_loader_enabled", "podcast-ui-platform-contextmenuimpl", a()));
    }

    public s9v0(luk lukVar) {
        this(false, lukVar);
    }
}
