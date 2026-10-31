package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hz4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 23));

    public hz4(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        hz4 hz4Var = (hz4) this.c.getValue();
        return hz4Var != null ? hz4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("update_version", "android-puffin-auto-updating", a(), 0, Integer.MAX_VALUE));
    }
}
