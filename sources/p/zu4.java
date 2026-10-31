package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zu4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, (byte) 24));

    public zu4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        zu4 zu4Var = (zu4) this.c.getValue();
        return zu4Var != null ? zu4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("fix_seek_gesture_event_ordering", "android-nowplaying-elements-segmentedseekbar", a()));
    }
}
