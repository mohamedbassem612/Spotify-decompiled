package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xy4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 17));

    public xy4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        xy4 xy4Var = (xy4) this.c.getValue();
        return xy4Var != null ? xy4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_permission_dialog_on_presave", "android-prerelease-card-now-playing-widget", a()));
    }
}
