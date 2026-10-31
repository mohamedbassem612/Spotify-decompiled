package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l85 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f85(this, (byte) 4));

    public l85(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        l85 l85Var = (l85) this.c.getValue();
        return l85Var != null ? l85Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("campaign_enabled", "android-widgets-dynamicnpvwidget-wrapped", a()));
    }
}
