package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t85 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c;

    public t85(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
        this.c = new idd1(new f85(this, (byte) 11));
    }

    public final int a() {
        t85 t85Var = (t85) this.c.getValue();
        return t85Var != null ? t85Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("update_period_minutes", "android-widgets-widgetbackgroundupdates", a(), 0, Integer.MAX_VALUE));
    }

    public t85(luk lukVar) {
        this(0, lukVar);
    }
}
