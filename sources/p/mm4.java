package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mm4 implements pdy0 {
    public final int a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new gk4(this, (byte) 28));

    public mm4(int i, int i2, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = lukVar;
    }

    public final int a() {
        mm4 mm4Var = (mm4) this.d.getValue();
        return mm4Var != null ? mm4Var.a() : this.a;
    }

    public final int b() {
        mm4 mm4Var = (mm4) this.d.getValue();
        return mm4Var != null ? mm4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("interact_signal_confirmation_timeout_ms", "android-libs-endless-player", a(), 0, 5000), new fpb("jump_signal_confirmation_timeout_ms", "android-libs-endless-player", b(), 0, 5000));
    }
}
