package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class li4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 10));

    public li4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        li4 li4Var = (li4) this.c.getValue();
        return li4Var != null ? li4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("spoton_feature_enabled", "android-feature-spoton", a()));
    }
}
