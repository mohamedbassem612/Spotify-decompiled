package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class za4 implements pdy0 {
    public final int a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new u74(this, (byte) 19));

    public za4(int i, int i2, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = lukVar;
    }

    public final int a() {
        za4 za4Var = (za4) this.d.getValue();
        return za4Var != null ? za4Var.a() : this.a;
    }

    public final int b() {
        za4 za4Var = (za4) this.d.getValue();
        return za4Var != null ? za4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("connect_discovery_timeout_seconds", "android-connect-appletv", a(), 10, 120), new fpb("pin_submission_timeout_seconds", "android-connect-appletv", b(), 10, 120)});
    }
}
