package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new om4(this, (byte) 5));

    public vm4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        vm4 vm4Var = (vm4) this.e.getValue();
        return vm4Var != null ? vm4Var.a() : this.a;
    }

    public final boolean b() {
        vm4 vm4Var = (vm4) this.e.getValue();
        return vm4Var != null ? vm4Var.b() : this.b;
    }

    public final boolean c() {
        vm4 vm4Var = (vm4) this.e.getValue();
        return vm4Var != null ? vm4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_music_videos_track_reporting", "android-libs-newplaying-default-mode", a()), new fpb("enable_playback_control_switcher", "android-libs-newplaying-default-mode", b()), new fpb("use_element_api", "android-libs-newplaying-default-mode", c())});
    }
}
