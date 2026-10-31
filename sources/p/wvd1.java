package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wvd1 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fjc1(this, (byte) 13));

    public wvd1(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        wvd1 wvd1Var = (wvd1) this.c.getValue();
        return wvd1Var != null ? wvd1Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("is_edit_taste_profile_context_menu_enabled", "tasteprofile-contextmenu", a()));
    }
}
