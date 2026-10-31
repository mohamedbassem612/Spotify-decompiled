package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public cp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 21));
    }

    public final boolean a() {
        cp4 cp4Var = (cp4) this.c.getValue();
        return cp4Var != null ? cp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("recently_added_blue_dot_enabled", "android-list-ux-platform-consumers-advanced-curation-rows-mediaoverlay", a()));
    }

    public cp4(luk lukVar) {
        this(false, lukVar);
    }
}
