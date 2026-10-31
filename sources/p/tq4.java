package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new rq4(this, (byte) 1));

    public tq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        tq4 tq4Var = (tq4) this.c.getValue();
        return tq4Var != null ? tq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("listening_party_preview_attachment_enabled", "android-liveroom-nowplayingbar-attachment", a()));
    }
}
