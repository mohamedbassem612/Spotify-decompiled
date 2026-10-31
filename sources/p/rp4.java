package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rp4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public rp4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new lp4(this, (byte) 5));
    }

    public final boolean a() {
        rp4 rp4Var = (rp4) this.d.getValue();
        return rp4Var != null ? rp4Var.a() : this.a;
    }

    public final boolean b() {
        rp4 rp4Var = (rp4) this.d.getValue();
        return rp4Var != null ? rp4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_filter_chips_chip_bar_action", "android-list-ux-platform-consumers-listenlater-shared", a()), new fpb("generic_items_count_enabled", "android-list-ux-platform-consumers-listenlater-shared", b())});
    }

    public rp4(luk lukVar) {
        this(false, false, lukVar);
    }
}
