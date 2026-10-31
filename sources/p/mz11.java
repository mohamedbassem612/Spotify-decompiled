package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mz11 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new vwz0(this, (byte) 23));

    public mz11(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        mz11 mz11Var = (mz11) this.c.getValue();
        return mz11Var != null ? mz11Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_quasar_background_fetch", "remote-config-fetching", a()));
    }
}
