package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s85 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public s85(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new f85(this, (byte) 10));
    }

    public final boolean a() {
        s85 s85Var = (s85) this.c.getValue();
        return s85Var != null ? s85Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("is_playback_attribution_enabled", "android-widgets-widget-attribution-impl", a()));
    }

    public s85(luk lukVar) {
        this(false, lukVar);
    }
}
