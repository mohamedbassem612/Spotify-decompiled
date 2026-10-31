package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h15 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public h15(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new uz4(this, (byte) 18));
    }

    public final boolean a() {
        h15 h15Var = (h15) this.c.getValue();
        return h15Var != null ? h15Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("show_remote_device_subject", "android-settings-section-volumecontrols", a()));
    }

    public h15(luk lukVar) {
        this(false, lukVar);
    }
}
