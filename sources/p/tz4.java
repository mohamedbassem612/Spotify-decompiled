package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tz4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sx4(this, (byte) 29));

    public tz4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        tz4 tz4Var = (tz4) this.c.getValue();
        return tz4Var != null ? tz4Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("use_shared_reachability", "android-reachability", a()));
    }
}
