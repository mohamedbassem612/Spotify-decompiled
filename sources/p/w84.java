package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w84 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public w84(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new u74(this, (byte) 10));
    }

    public final boolean a() {
        w84 w84Var = (w84) this.c.getValue();
        return w84Var != null ? w84Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("keep_screen_awake_enabled", "android-car-mobile-car-feature-availability", a()));
    }

    public w84(luk lukVar) {
        this(true, lukVar);
    }
}
