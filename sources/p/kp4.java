package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public kp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new zn4(this, (byte) 29));
    }

    public final boolean a() {
        kp4 kp4Var = (kp4) this.c.getValue();
        return kp4Var != null ? kp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("editor_attribution_enabled", "android-list-ux-platform-consumers-editorial-shared", a()));
    }

    public kp4(luk lukVar) {
        this(false, lukVar);
    }
}
