package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zc4 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new wb4(this, (byte) 13));

    public zc4(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        zc4 zc4Var = (zc4) this.c.getValue();
        return zc4Var != null ? zc4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("cooldown_ms", "android-device-predictability-nudge", a(), 0, 86400000));
    }
}
