package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t44 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 6));

    public t44(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        t44 t44Var = (t44) this.c.getValue();
        return t44Var != null ? t44Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("usage_limits_bottom_sheet_enabled", "android-aishared", a()));
    }
}
