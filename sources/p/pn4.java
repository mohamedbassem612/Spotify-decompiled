package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pn4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new om4(this, (byte) 21));

    public pn4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        pn4 pn4Var = (pn4) this.d.getValue();
        return pn4Var != null ? pn4Var.a() : this.a;
    }

    public final boolean b() {
        pn4 pn4Var = (pn4) this.d.getValue();
        return pn4Var != null ? pn4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_playback_control_switcher", "android-libs-nowplaying-free-tier-mode", a()), new fpb("use_element_api", "android-libs-nowplaying-free-tier-mode", b())});
    }
}
