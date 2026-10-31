package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new zn4(this, (byte) 25));

    public gp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        gp4 gp4Var = (gp4) this.c.getValue();
        return gp4Var != null ? gp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("use_play_state_from_list", "android-list-ux-platform-consumers-audiobook-rows-audiobook", a()));
    }
}
