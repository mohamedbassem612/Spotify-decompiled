package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new om4(this, (byte) 6));

    public wm4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        wm4 wm4Var = (wm4) this.d.getValue();
        return wm4Var != null ? wm4Var.a() : this.a;
    }

    public final boolean b() {
        wm4 wm4Var = (wm4) this.d.getValue();
        return wm4Var != null ? wm4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("skip_next_trigger_enabled", "android-libs-newplaying-feedback-mode", a()), new fpb("use_element_api", "android-libs-newplaying-feedback-mode", b())});
    }
}
