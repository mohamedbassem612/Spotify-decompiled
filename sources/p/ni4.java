package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ni4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public ni4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new sh4(this, (byte) 12));
    }

    public final boolean a() {
        ni4 ni4Var = (ni4) this.c.getValue();
        return ni4Var != null ? ni4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("side_drawer_entry_point_enabled", "android-feature-taste-profile-side-drawer", a()));
    }

    public ni4(luk lukVar) {
        this(false, lukVar);
    }
}
