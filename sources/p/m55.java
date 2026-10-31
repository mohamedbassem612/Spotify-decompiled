package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m55 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f55(this, (byte) 6));

    public m55(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        m55 m55Var = (m55) this.c.getValue();
        return m55Var != null ? m55Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("is_dwell_time_logging_disabled", "android-ubi-dwell-time-logger-impl", a()));
    }
}
