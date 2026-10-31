package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new lp4(this, (byte) 25));

    public mq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        mq4 mq4Var = (mq4) this.c.getValue();
        return mq4Var != null ? mq4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("disable_incoming_lens", "android-list-ux-platform-consumers-wrapped-sharing-preloader", a()));
    }
}
