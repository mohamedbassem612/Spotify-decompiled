package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yc4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new wb4(this, (byte) 12));

    public yc4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        yc4 yc4Var = (yc4) this.d.getValue();
        return yc4Var != null ? yc4Var.a() : this.a;
    }

    public final boolean b() {
        yc4 yc4Var = (yc4) this.d.getValue();
        return yc4Var != null ? yc4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_suggestion_framework", "android-device-predictability-lifecycle", a()), new fpb("enable_suggestion_lifecycle_logging", "android-device-predictability-lifecycle", b()));
    }
}
