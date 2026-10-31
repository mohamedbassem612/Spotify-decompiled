package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kd4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 18));

    public kd4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        kd4 kd4Var = (kd4) this.c.getValue();
        return kd4Var != null ? kd4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("settings_enabled", "android-devicelocation-consent-impl", a()));
    }
}
