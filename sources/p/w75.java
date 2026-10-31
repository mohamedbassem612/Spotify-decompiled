package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w75 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public w75(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new f55(this, (byte) 24));
    }

    public final boolean a() {
        w75 w75Var = (w75) this.f.getValue();
        return w75Var != null ? w75Var.a() : this.a;
    }

    public final boolean b() {
        w75 w75Var = (w75) this.f.getValue();
        return w75Var != null ? w75Var.b() : this.b;
    }

    public final boolean c() {
        w75 w75Var = (w75) this.f.getValue();
        return w75Var != null ? w75Var.c() : this.c;
    }

    public final boolean d() {
        w75 w75Var = (w75) this.f.getValue();
        return w75Var != null ? w75Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_time_measurements", "android-watchfeed-carousel", a()), new fpb("enabled_delayed_video_playback", "android-watchfeed-carousel", b()), new fpb("load_video_when_focused", "android-watchfeed-carousel", c()), new fpb("npv_scroll_watchfeed_carousel_entrypoint_enabled", "android-watchfeed-carousel", d()));
    }

    public w75(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
