package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uq4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new rq4(this, (byte) 2));

    public uq4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        uq4 uq4Var = (uq4) this.c.getValue();
        return uq4Var != null ? uq4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("preview_ended_upsell_enabled", "android-liveroom-preview-ended-events-service", a()));
    }
}
