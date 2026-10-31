package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n44 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 0));

    public n44(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        n44 n44Var = (n44) this.c.getValue();
        return n44Var != null ? n44Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("in_app_ad_settings_enabled", "android-adsdisplay-settings", a()));
    }
}
