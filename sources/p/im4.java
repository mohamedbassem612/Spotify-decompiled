package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class im4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new gk4(this, (byte) 26));

    public im4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        im4 im4Var = (im4) this.c.getValue();
        return im4Var != null ? im4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_haptic_feedback_on_heart", "android-libs-encore-consumer-entrypoint", a()));
    }
}
