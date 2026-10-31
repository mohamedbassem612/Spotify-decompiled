package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vh4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g;

    public vh4(int i, luk lukVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = lukVar;
        this.g = new idd1(new sh4(this, (byte) 2));
    }

    public final boolean a() {
        vh4 vh4Var = (vh4) this.g.getValue();
        return vh4Var != null ? vh4Var.a() : this.a;
    }

    public final int b() {
        vh4 vh4Var = (vh4) this.g.getValue();
        return vh4Var != null ? vh4Var.b() : this.b;
    }

    public final boolean c() {
        vh4 vh4Var = (vh4) this.g.getValue();
        return vh4Var != null ? vh4Var.c() : this.c;
    }

    public final boolean d() {
        vh4 vh4Var = (vh4) this.g.getValue();
        return vh4Var != null ? vh4Var.d() : this.d;
    }

    public final boolean e() {
        vh4 vh4Var = (vh4) this.g.getValue();
        return vh4Var != null ? vh4Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("artificial_delay_enabled", "android-feature-recents-config", a()), new fpb("decorator_timeout_override_ms", "android-feature-recents-config", b(), 0, 30000), new fpb("force_music_episode_content_type", "android-feature-recents-config", c()), new fpb("sponsorship_label_enabled", "android-feature-recents-config", d()), new fpb("swipe_to_queue_enabled", "android-feature-recents-config", e()));
    }

    public vh4(luk lukVar) {
        this(0, lukVar, false, false, false, false);
    }
}
