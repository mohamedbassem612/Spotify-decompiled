package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cn4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public cn4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new om4(this, (byte) 12));
    }

    public final boolean a() {
        cn4 cn4Var = (cn4) this.f.getValue();
        return cn4Var != null ? cn4Var.a() : this.a;
    }

    public final boolean b() {
        cn4 cn4Var = (cn4) this.f.getValue();
        return cn4Var != null ? cn4Var.b() : this.b;
    }

    public final boolean c() {
        cn4 cn4Var = (cn4) this.f.getValue();
        return cn4Var != null ? cn4Var.c() : this.c;
    }

    public final boolean d() {
        cn4 cn4Var = (cn4) this.f.getValue();
        return cn4Var != null ? cn4Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("allow_in_free_tier", "android-libs-nowplaying-elements-audiovideotransition", a()), new fpb("audio_switch_button_animated_for_music_videos", "android-libs-nowplaying-elements-audiovideotransition", b()), new fpb("is_managed_account_setting_enabled", "android-libs-nowplaying-elements-audiovideotransition", c()), new fpb("is_video_manifest_prefetch_restart_enabled", "android-libs-nowplaying-elements-audiovideotransition", d())});
    }

    public cn4(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
