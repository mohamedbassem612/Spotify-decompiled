package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xp4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public xp4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new lp4(this, (byte) 11));
    }

    public final boolean a() {
        xp4 xp4Var = (xp4) this.e.getValue();
        return xp4Var != null ? xp4Var.a() : this.a;
    }

    public final boolean b() {
        xp4 xp4Var = (xp4) this.e.getValue();
        return xp4Var != null ? xp4Var.b() : this.b;
    }

    public final boolean c() {
        xp4 xp4Var = (xp4) this.e.getValue();
        return xp4Var != null ? xp4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("chip_bar_action_enabled", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", a()), new fpb("chips_section_enabled", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", b()), new fpb("prompt_chip_enabled", "android-list-ux-platform-consumers-sessioncontrol-sections-chips", c())});
    }

    public xp4(luk lukVar) {
        this(false, true, false, lukVar);
    }
}
