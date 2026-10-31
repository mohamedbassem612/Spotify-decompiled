package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yp4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public yp4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new lp4(this, (byte) 12));
    }

    public final boolean a() {
        yp4 yp4Var = (yp4) this.d.getValue();
        return yp4Var != null ? yp4Var.a() : this.a;
    }

    public final boolean b() {
        yp4 yp4Var = (yp4) this.d.getValue();
        return yp4Var != null ? yp4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("modify_prompt_enabled", "android-list-ux-platform-consumers-sessioncontrol-shared", a()), new fpb("video_chip_bar_action_enabled", "android-list-ux-platform-consumers-sessioncontrol-shared", b())});
    }

    public yp4(luk lukVar) {
        this(false, false, lukVar);
    }
}
