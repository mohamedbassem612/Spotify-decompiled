package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ui4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new sh4(this, (byte) 18));

    public ui4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ui4 ui4Var = (ui4) this.c.getValue();
        return ui4Var != null ? ui4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("auto_open_on_first_eligible", "android-feature-unboxing-hub", a()));
    }
}
