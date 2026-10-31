package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m05 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 15));

    public m05(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        m05 m05Var = (m05) this.c.getValue();
        return m05Var != null ? m05Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_notifying_wearos_watch", "android-remotedownloads-page", a()));
    }
}
