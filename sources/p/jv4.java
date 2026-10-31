package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jv4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c;

    public jv4(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
        this.c = new idd1(new fv4(this, (byte) 3));
    }

    public final int a() {
        jv4 jv4Var = (jv4) this.c.getValue();
        return jv4Var != null ? jv4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("widget_async_acc_policy_timeout_ms", "android-nowplaying-scroll", a(), 10, 5000));
    }

    public jv4(luk lukVar) {
        this(2000, lukVar);
    }
}
