package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t15 implements pdy0 {
    public final boolean a;
    public final tgp0 b;
    public final luk c;
    public final idd1 d;
    public final idd1 e;

    public t15(boolean z, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = tgp0Var;
        this.c = lukVar;
        this.d = new idd1(new s15(this, (byte) 1));
        this.e = new idd1(new s15(this, (byte) 0));
    }

    public final boolean a() {
        t15 t15Var = (t15) this.e.getValue();
        return t15Var != null ? t15Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("settings_item_visible", "android-shuffle-settings-algorithm", a()));
    }

    public t15(tgp0 tgp0Var, luk lukVar) {
        this(false, tgp0Var, lukVar);
    }
}
