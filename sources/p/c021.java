package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c021 implements pdy0 {
    public final int a;
    public final idd1 b = new idd1(new opg(this, (byte) 15));

    public c021(int i, int i2) {
        this.a = i;
    }

    public final int a() {
        c021 c021Var = (c021) this.b.getValue();
        return c021Var != null ? c021Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("reconnect_throttle_seconds", "remote-configuration-client-android", a(), 1, 36000));
    }
}
