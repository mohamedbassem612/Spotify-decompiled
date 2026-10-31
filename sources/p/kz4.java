package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kz4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public kz4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new sx4(this, (byte) 24));
    }

    public final boolean a() {
        kz4 kz4Var = (kz4) this.e.getValue();
        return kz4Var != null ? kz4Var.a() : this.a;
    }

    public final boolean b() {
        kz4 kz4Var = (kz4) this.e.getValue();
        return kz4Var != null ? kz4Var.b() : this.b;
    }

    public final boolean c() {
        kz4 kz4Var = (kz4) this.e.getValue();
        return kz4Var != null ? kz4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("gbb_upsells_enabled", "android-quality-settings", a()), new fpb("petrel_ui_enabled", "android-quality-settings", b()), new fpb("use_playback_settings_audio_quality", "android-quality-settings", c())});
    }

    public kz4(luk lukVar) {
        this(false, false, false, lukVar);
    }
}
