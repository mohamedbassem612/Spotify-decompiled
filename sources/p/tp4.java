package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new lp4(this, (byte) 7));

    public tp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        tp4 tp4Var = (tp4) this.c.getValue();
        return tp4Var != null ? tp4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("automix_track_order_context_menu_enabled", "android-list-ux-platform-consumers-mixing-contextmenuitems-automix", a()));
    }
}
