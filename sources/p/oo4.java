package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oo4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new zn4(this, (byte) 10));

    public oo4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        oo4 oo4Var = (oo4) this.c.getValue();
        return oo4Var != null ? oo4Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("enable_debug_logging", "android-libs-social-radar", a()));
    }
}
