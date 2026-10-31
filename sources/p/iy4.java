package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iy4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new sx4(this, (byte) 13));

    public iy4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        iy4 iy4Var = (iy4) this.d.getValue();
        return iy4Var != null ? iy4Var.a() : this.a;
    }

    public final boolean b() {
        iy4 iy4Var = (iy4) this.d.getValue();
        return iy4Var != null ? iy4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_speed_control_page", "android-podcastplaybackspeed-bottom-sheet", a()), new fpb("enable_speed_shortcuts_v2", "android-podcastplaybackspeed-bottom-sheet", b())});
    }
}
