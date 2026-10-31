package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rx4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 29));

    public rx4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        rx4 rx4Var = (rx4) this.c.getValue();
        return rx4Var != null ? rx4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("can_send_message", "android-playlist-collaboration-playlist-participants-contextmenu", a()));
    }
}
