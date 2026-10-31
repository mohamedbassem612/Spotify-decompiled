package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ah4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new cg4(this, (byte) 16));

    public ah4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        ah4 ah4Var = (ah4) this.d.getValue();
        return ah4Var != null ? ah4Var.a() : this.a;
    }

    public final boolean b() {
        ah4 ah4Var = (ah4) this.d.getValue();
        return ah4Var != null ? ah4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_display_mode_state", "android-feature-nowplaying", a()), new fpb("extended_lifecycle", "android-feature-nowplaying", b())});
    }
}
