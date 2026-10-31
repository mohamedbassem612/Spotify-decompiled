package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s54 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 22));

    public s54(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        s54 s54Var = (s54) this.c.getValue();
        return s54Var != null ? s54Var.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("feature_enabled", "android-audiobookpremium-listening-hours-request", a()));
    }
}
